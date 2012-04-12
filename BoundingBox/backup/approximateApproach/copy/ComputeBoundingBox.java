package approximateApproach.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Jama.Matrix;

public class ComputeBoundingBox implements ComputeBoundingBoxInterface{

	private double[] m_queryPoint;
	private double[] m_inspectorBFR;
	private double[] m_nearPlane;
	private double[] m_farPlane;
	private double m_viewAngle;
	
	public ComputeBoundingBox(double[] inspectorBFR, double[] nearPlane, double[] farPlane, double viewAngle) {
		// TODO Auto-generated constructor stub
		m_inspectorBFR=inspectorBFR;
		m_nearPlane=nearPlane;
		m_farPlane=farPlane;
		m_viewAngle=viewAngle;
	}
	
	@Override
	public void captureNodesInBox() throws IOException {
		// TODO Auto-generated method stub
		String str;
		Integer object_id;
		
		BufferedReader in = new BufferedReader(new FileReader(Config.getAllNodes()));
		BufferedWriter out = new BufferedWriter(new FileWriter(Config.getBoundedNodes()));
		
		while((str=in.readLine()) != null)
		{		
				String[] temp=str.split("\\s+");
				double query1[]={0,0,0};
				//temp=str.split("\\s+");
				object_id=Integer.parseInt(temp[0]);
				for(int i=1;i<temp.length-1;i++)
				{
					query1[i-1]=Double.parseDouble(temp[i]);									
				}
				m_queryPoint=query1;
				if(checkContainment())
				{
						out.write(Integer.toString(object_id));
						out.write(" ");
						for(int i=0;i<3;i++)
						{	out.write(Double.toString(query1[i]));
							out.write(" ");
						}	
							out.write(" ;\n");
				}
		}
		
		in.close();
		out.close();
	}

	@Override
	public boolean checkContainment() {
		
		//check for containment of query_point in the bounding box
			double[][] temp_I={m_inspectorBFR};	
			double phi;
			double[][] temp_P={m_queryPoint};	//this is in BFR
			double[][] temp_F1={m_nearPlane};	//this is in BFR
			double[][] temp_F2={m_farPlane};	//this is in BFR
			
			/*Matrix M_I=new Matrix(temp_I);
			Matrix M_P=new Matrix(temp_P);
			Matrix M_F1=new Matrix(temp_F1);
			Matrix M_F2=new Matrix(temp_F2);*/
			
			Matrix M_I=new Matrix(new double[][] {m_inspectorBFR});
			Matrix M_P=new Matrix(new double[][] {m_queryPoint});
			Matrix M_F1=new Matrix(new double[][] {m_nearPlane});
			Matrix M_F2=new Matrix(new double[][] {m_farPlane});
			
			//phi=(M_P.minus(M_I).transpose().times(M_F1.minus(M_I)).get(0,0))/((M_P.minus(M_I)).normF()*(M_F1.minus(M_I)).normF());
			phi=(((M_P.minus(M_I).get(0,0))*(M_F1.minus(M_I).get(0,0))) + ((M_P.minus(M_I).get(0,1))*(M_F1.minus(M_I).get(0,1))) + ((M_P.minus(M_I).get(0,2))*(M_F1.minus(M_I).get(0,2))))/((M_P.minus(M_I)).normF()*(M_F1.minus(M_I)).normF());
			if(M_I.minus(M_F1).normF()<=(((M_I.minus(M_P)).normF())*Math.abs(phi)) && ((M_I.minus(M_P).normF())*Math.abs(phi))<=M_I.minus(M_F2).normF() && Math.acos(phi)<=m_viewAngle)
				return true;
			else
				return false;
	}
	
}
