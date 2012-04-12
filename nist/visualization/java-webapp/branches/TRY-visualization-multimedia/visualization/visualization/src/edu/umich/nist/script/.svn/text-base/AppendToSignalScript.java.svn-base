/**
 * 
 */
package edu.umich.nist.script;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.umich.nist.SenStore;
import edu.umich.senstore.AccelMeasPrx;
import edu.umich.senstore.SenStoreMngrPrxHelper;
import edu.umich.senstore.SensorType;

/**
 * @author bippy
 *
 */
public class AppendToSignalScript {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.registerShutdownHook();
        
        SenStoreMngrPrxHelper manager = (SenStoreMngrPrxHelper) context.getBean("senStoreManager");
        SenStore senStore = (SenStore) context.getBean("senStore");
        
        long sensorID = senStore.createSensor("SenStore Test Big 1", SensorType.SensorTypeACCELEROMETER);
        System.out.println("Sensor: " + sensorID);
        long accelSignalID = senStore.createAccelerometerSignal(sensorID);
        System.out.println("Accel ID: " + accelSignalID);
        
        AccelMeasPrx proxy = manager.getAccelMeas(accelSignalID);

        long milliseconds = System.currentTimeMillis();
        double currentTime = (double) milliseconds / 1000;
        
        double time[] = new double[5000];
        for (int i = 0; i < time.length; ++i) {
            time[i] = currentTime + (0.001 * i);
        }
        float data[] = new float[5000 * 3];
        
        long startTime = System.currentTimeMillis();

        proxy.appendToSignal(time, data);

        long stopTime = System.currentTimeMillis();
        System.out.println("Inserting 5000 cycles took " + (stopTime - startTime) + "ms.");
        
        System.out.println("Done!");
        System.exit(0);
    }
}
