package approximateApproach;
/*Given 4 points on the bridge, determine the origin of the bridge. Further given any region of interest
 * by the inspector, return all the nodes within the bounding box/region of interest*/

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Random;

import WeibullCDF.CDF_Weibull2;

public class ApproximateErrorAnalysis extends ApproximateAlgorithm 
{
	double range,discreteStep, lambda;
	int beta, total_samples; //used for error sampling
	Random generator;
	BufferedWriter out;
	
	public ApproximateErrorAnalysis(double[] pt1, double[] pt2, double[] pt3, double[] pt4, double[] pt5, double[] pt6, double[] pt7, double[] pt8) throws IOException
	{
		
		super(pt1,pt2,pt3,pt4, pt5, pt6, pt7, pt8);
		
		range=5;	//default is 5
		discreteStep=0.1;	//default=0.1
		lambda=1/1.5;	//default=1/1.5
		beta=2;	//default=2
		total_samples=100;	//default=100
		generator=new Random();//initialize random number generator
	}
	
	
	double return_area(int i)
	{
		return Math.floor((total_samples*(CDF_Weibull2.w2cdf(lambda,beta,(discreteStep*(i+1))))));
	}
	
	double error_sampler(int numCall)
	{
		double sample_dist=100;
		double i1, i2;
		for(int i=0;i<range/discreteStep;i++)
		{
	
			if(i==0)
			{	i1=0;
				i2=return_area(0)-1;
			}
			else
			{	i1=return_area(i-1);
				i2=return_area(i)-1;
			}
			if(i2>i1)
			{
				if(numCall>=i1 && numCall<=i2)
				{
					sample_dist=(i*discreteStep)+(discreteStep/2);
					break;
				}
			}
			else
			{
				if(numCall>=i2 && numCall<=i1)
				{
					sample_dist=(i*discreteStep)+(discreteStep/2);
					break;
				}
			}
		}
		return sample_dist;
	}

	double[] error_inspectorposition(int count) throws IOException
	{
		double[] scaling={0,0,0}, temp;
		temp=computeScalingFactors();
		for(int i=0;i<3;i++)
			scaling[i]=1/temp[i];
		
		double[] errorGPS={0,0,0};
		double distance_error=error_sampler(count);
	
		System.out.print(count);
		System.out.print(" ");
		System.out.println(distance_error);
		
		double angle=generator.nextDouble()*360.0;
		errorGPS[0]=distance_error*Math.cos(angle)*scaling[0];
		errorGPS[1]=distance_error*Math.sin(angle)*scaling[1];
		errorGPS[2]=0;	//altitude error is 0
		
		System.out.println(errorGPS[0] + " " + errorGPS[1]+ " " + errorGPS[2]);
		return errorGPS;
	}
	
	public static void main(String args[]) throws IOException
	{
		int count_error=0;	//variable to keep track of error f
		
		Random gen_angle=new Random();
		
		ApproximateErrorAnalysis sel=new ApproximateErrorAnalysis(Config.getGPSPoint1(), Config.getGPSPoint2(), Config.getGPSPoint3(), Config.getGPSPoint4(), Config.getBFRPoint1(), Config.getBFRPoint2(), Config.getBFRPoint3(), Config.getBFRPoint4());

		//error values
		double[] error_inspectororientation={0,0,0};
		double[] error_GPS;
		//Set orientation of the inspector 
		
		//File handling section 
		while(count_error<sel.total_samples)
		{
			error_GPS=sel.error_inspectorposition(count_error);
						
			for(int j=0;j<3;j++)
				error_inspectororientation[j]=gen_angle.nextDouble()-0.5;	
			
			//Compute Inspector Position Parameters
			InspectorParametersInterface positionParameters=new InspectorParameters(sel.BG, sel.gpsScalingFactors, sel.bridge_origin, error_GPS, error_inspectororientation);
			positionParameters.computeBoundingBoxParameters();
					
			//File handling and bounding box computation section 
			ComputeBoundingBoxInterface boundingBox=new ComputeBoundingBox(positionParameters.getInspectorBFR(), positionParameters.getNearPlane(), positionParameters.getFarPlane(), positionParameters.getViewAngle(), count_error, 0, 0);
			boundingBox.captureNodesInBox();

			count_error++;
		}
		
	}
}