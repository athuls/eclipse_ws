package approximateApproach.copy;

public class Config {

	//Enter the GPS and bridge coordinates for 4 points on the bridge (used to determine the origin of the bridge
	private static final double[] gpspoint1={-83.346745, 42.018465, 183.2};
	private static final double[] gpspoint2={-83.346513, 42.018149, 183.2};
	private static final double[] gpspoint3={-83.346513, 42.018149, 233.2};
	private static final double[] gpspoint4={-83.345745, 42.018977, 183.2};
	private static final double[] bfrpoint1={10, 0, 0};
	private static final double[] bfrpoint2={50, 0, 0};
	private static final double[] bfrpoint3={50, 0, 50};
	private static final double[] bfrpoint4={0, 100, 0};
	
	//Position of the inspector in GPS
	private static final double[] inspector_position={-83.346581, 42.018851, 178.5};	//this is in GPS
	
	//Orientation of the inspector in GPS
	private static final double[] inspector_orientation={0,6.9157,-208.3507};	//roll, pitch, yaw
	
	//Near and Far plane distance for the inspector
	private static final double[] npd_fpd={19.5168,39.0336};	//npd, fpd
	
	//View angle for the inspector
	private static final double viewAngle=30;
	
	//Input file with all nodes on the bridge (from database) and output file for storing points in bounding box
	private static final String m_allNodes="/home/athuls89/Desktop/result_file";
	private static final String m_boundedNodes="/home/athuls89/Desktop/gsra/result_java_test_8_copy_deletes";
	
	public static double getViewAngle(){
		return viewAngle;
	}
	
	public static String getAllNodes(){
		return m_allNodes;
	}
	
	public static String getBoundedNodes(){
		return m_boundedNodes;
	}
	
	public static double[] getNpdFpd(){
		return npd_fpd;
	}	
	
	public static double[] getInspectorOrientation(){
		return inspector_orientation;
	}
	
	public static double[] getInspectorPosition(){
		return inspector_position;
	}
	
	public static double[] getGPSPoint1(){
		return gpspoint1;
	}
	
	public static double[] getGPSPoint2(){
		return gpspoint2;
	}
	
	public static double[] getGPSPoint3(){
		return gpspoint3;
	}
	
	public static double[] getGPSPoint4(){
		return gpspoint4;
	}
	
	public static double[] getBFRPoint1(){
		return bfrpoint1;
	}
	
	public static double[] getBFRPoint2(){
		return bfrpoint2;
	}
	
	public static double[] getBFRPoint3(){
		return bfrpoint3;
	}
	
	public static double[] getBFRPoint4(){
		return bfrpoint4;
	}
		
	
}
