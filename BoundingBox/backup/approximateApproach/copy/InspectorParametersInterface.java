package approximateApproach.copy;

public interface InspectorParametersInterface {
	void computeBoundingBoxParameters();
	double[] getBFRCoordinates();
	void computeIGMatrix();
	
	double[] getNearPlane();
	double[] getFarPlane();
	double[] getInspectorBFR();
	double getViewAngle();
}
