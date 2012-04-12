package directBFRErrors;
import approximateApproach.*;

public class ConfigErrorAnalysis extends Config{
	
	//Input file with all nodes on the bridge (from database) and output file for storing points in bounding box
	private static final String m_allPositions="/home/athuls89/Desktop/gsra/Fall2011/bridge_model/sparse_model_62/inspector_trail";
	private static final String m_boundedNodes="/home/athuls89/Desktop/gsra/Fall2011/error_files/BFRAnalysis/run0/test_output/output";
	
	private static final String m_uniqueBoundedElements="/home/athuls89/Desktop/gsra/Fall2011/error_files/BFRAnalysis/runNoErrorSurfaceCloud62_vw85";
	private static final String m_visibleElementsFile="/home/athuls89/Desktop/gsra/Fall2011/bridge_model/sparse_model_62/elementVisibility";
	
	public static String getAllPositions(){
		return m_allPositions;
	}
	
	public static String getBoundedNodes(){
		return m_boundedNodes;
	}
	
	public static String getUniqueBoundedElements(){
		return m_uniqueBoundedElements;
	}
	
	public static String getVisibleElementsFile(){
		return m_visibleElementsFile;
	}
		
	
}
