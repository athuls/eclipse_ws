package directBFRErrors;

public class NearAndFarPlanePoints {
	private double[] m_inspectorInBFR;
	private double m_roll, m_pitch, m_yaw, m_nearDistance, m_farDistance;
	
	public NearAndFarPlanePoints(double[] inspectorPosition, double roll, double pitch, double yaw) {
		m_inspectorInBFR=inspectorPosition;
		m_roll=roll;
		m_pitch=pitch;
		m_yaw=yaw;

		setAngles();
		// TODO Auto-generated constructor stub
	}
	
	void setAngles(){
		m_roll=-Math.PI*(m_roll/180);
		m_pitch=Math.PI*(m_pitch/180);
		m_yaw=Math.PI*(-(m_yaw+52)/180);
	}
	
	double[] getPlanePointInBFR(double distance){
		double[] planePoint={0,0,0};
		planePoint[0]=m_inspectorInBFR[0]+distance*Math.cos(m_pitch)*Math.sin(m_yaw);
		planePoint[1]=m_inspectorInBFR[1]+distance*Math.cos(m_pitch)*Math.cos(m_yaw);
		planePoint[2]=m_inspectorInBFR[2]+distance*Math.sin(m_pitch);
		return planePoint;
	}
	
}
