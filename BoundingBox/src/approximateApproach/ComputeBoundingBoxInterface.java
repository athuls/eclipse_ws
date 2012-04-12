package approximateApproach;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ComputeBoundingBoxInterface {

	boolean checkContainment();
	void captureNodesInBox() throws FileNotFoundException, IOException;
	
}
