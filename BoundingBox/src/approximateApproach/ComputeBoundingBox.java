package approximateApproach;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import Jama.Matrix;

public class ComputeBoundingBox implements ComputeBoundingBoxInterface{

	private double[] m_queryPoint;
	private double[] m_inspectorBFR;
	private double[] m_nearPlane;
	private double[] m_farPlane;
	private double m_viewAngle;
	private String m_outputElementFile;
	private List<String> nodesList;
	
	static private Hashtable<Integer, Integer> elementNodeCount;
	static private List<String> nodesAboveDeck;
	static private List<String> nodesBelowDeck;

	static{
		String str;
		BufferedReader fileNodesAboveDeck;
		BufferedReader fileNodesBelowDeck;
		BufferedReader fileVisibleEl;
		nodesAboveDeck=new ArrayList<String> ();
		nodesBelowDeck=new ArrayList<String> ();
		elementNodeCount=new Hashtable<Integer, Integer>();
		
		try {
			fileNodesAboveDeck = new BufferedReader(new FileReader(Config.getNodesAboveDeck()));
			fileNodesBelowDeck = new BufferedReader(new FileReader(Config.getNodesBelowDeck()));
			fileVisibleEl = new BufferedReader(new FileReader(Config.getVisibleElementsFile()));
			
			//Iterate over nodes above deck and add to nodesAboveDeck list
			while((str=fileNodesAboveDeck.readLine())!=null){
				nodesAboveDeck.add(str);
				
				String[] temp=str.split("\\s+");
				String element_id=temp[temp.length-1];
				
				if(elementNodeCount.containsKey(Integer.parseInt(element_id)))
					elementNodeCount.put(Integer.parseInt(element_id), (elementNodeCount.get(Integer.parseInt(element_id))+1));
				else
					elementNodeCount.put(Integer.parseInt(element_id), 1);
			}
			
			while((str=fileNodesBelowDeck.readLine())!=null){
				nodesBelowDeck.add(str);
				
				String[] temp=str.split("\\s+");
				String element_id=temp[temp.length-1];
				
				if(elementNodeCount.containsKey(Integer.parseInt(element_id)))
					elementNodeCount.put(Integer.parseInt(element_id), (elementNodeCount.get(Integer.parseInt(element_id))+1));
				else
					elementNodeCount.put(Integer.parseInt(element_id), 1);
			}
			
			fileNodesAboveDeck.close();
			fileNodesBelowDeck.close();
			fileVisibleEl.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public ComputeBoundingBox(double[] inspectorBFR, double[] nearPlane, double[] farPlane, double viewAngle) {
		m_inspectorBFR=inspectorBFR;
		m_nearPlane=nearPlane;
		m_farPlane=farPlane;
		m_viewAngle=viewAngle;
		//m_outputNodeFile=Config.getBoundedNodes();
		m_outputElementFile=Config.getUniqueBoundedElements();
	}
		
	public ComputeBoundingBox(double[] inspectorBFR, double[] nearPlane, double[] farPlane, double viewAngle, int errorCount, int positionCount, int runCount) {
		m_inspectorBFR=inspectorBFR;
		m_nearPlane=nearPlane;
		m_farPlane=farPlane;
		m_viewAngle=viewAngle;
		//m_outputNodeFile=Config.getBoundedNodes().concat(Integer.toString(runCount)+"/position"+Integer.toString(positionCount)+"/"+Integer.toString(errorCount));
		
		//For getting base case results
		//m_outputElementFile=Config.getUniqueBoundedElements().concat(Integer.toString(runCount)+"/position"+Integer.toString(positionCount)+"/"+Integer.toString(errorCount));
		m_outputElementFile=Config.getUniqueBoundedElements().concat(Integer.toString(positionCount)+"/"+Integer.toString(errorCount));
	}
	
	@Override
	public void captureNodesInBox() throws IOException {
		String element_id;
		
		Hashtable<Integer, Integer> hashElements=new Hashtable<Integer, Integer>();
		
		BufferedWriter out_unique_elements=new BufferedWriter(new FileWriter(m_outputElementFile));
		
		if(m_inspectorBFR[2] > (Config.getDeckZPosition()))
			nodesList=nodesAboveDeck;
		else
			nodesList=nodesBelowDeck;
				
		for(int i=0;i<nodesList.size();i++)
		{		
				String[] temp=nodesList.get(i).split("\\s+");
				double query1[]={0,0,0};
				element_id=temp[temp.length-1];
				
				for(int j=1;j<temp.length-1;j++)
				{
					query1[j-1]=Double.parseDouble(temp[j]);									
				}
				
				m_queryPoint=query1;
				if(checkContainment())
				{
						//out.write(Integer.toString(node_id));
												
						if(hashElements.containsKey(Integer.parseInt(element_id)))
							hashElements.put(Integer.parseInt(element_id), (hashElements.get(Integer.parseInt(element_id))+1));		
						else
							hashElements.put(Integer.parseInt(element_id), 1);
						
						/*out.write(" ");
						for(int i=0;i<3;i++)
						{	out.write(Double.toString(query1[i]));
							out.write(" ");
						}	
							out.write(" ;\n");*/
				}
		}
		
		for(Enumeration<Integer> e=hashElements.keys();e.hasMoreElements();){
			Integer tempKey=e.nextElement();
			out_unique_elements.write(tempKey+" "+hashElements.get(tempKey)+" "+(double)((double)hashElements.get(tempKey)/(double)elementNodeCount.get(tempKey))+"\n");
		}
		
		out_unique_elements.close();
	}

	@Override
	public boolean checkContainment() {
		
		//check for containment of query_point in the bounding box
			
			double phi;
			//All points are now in BFR
			Matrix M_I=new Matrix(new double[][] {m_inspectorBFR});
			Matrix M_P=new Matrix(new double[][] {m_queryPoint});
			Matrix M_F1=new Matrix(new double[][] {m_nearPlane});
			Matrix M_F2=new Matrix(new double[][] {m_farPlane});
			
			phi=(((M_P.minus(M_I).get(0,0))*(M_F1.minus(M_I).get(0,0))) + ((M_P.minus(M_I).get(0,1))*(M_F1.minus(M_I).get(0,1))) + ((M_P.minus(M_I).get(0,2))*(M_F1.minus(M_I).get(0,2))))/((M_P.minus(M_I)).normF()*(M_F1.minus(M_I)).normF());
			if(M_I.minus(M_F1).normF()<=(((M_I.minus(M_P)).normF())*Math.abs(phi)) && ((M_I.minus(M_P).normF())*Math.abs(phi))<=M_I.minus(M_F2).normF() && Math.acos(phi)<=m_viewAngle)
				return true;
			else
				return false;
	}
	
}
