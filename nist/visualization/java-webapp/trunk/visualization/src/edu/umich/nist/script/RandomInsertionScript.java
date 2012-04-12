/**
 * 
 */
package edu.umich.nist.script;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.umich.nist.SenStore;
import edu.umich.senstore.Float32Signal;
import edu.umich.senstore.SensorType;

/**
 * @author bippy
 *
 */
public class RandomInsertionScript {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.registerShutdownHook();
        
        SenStore senStore = (SenStore) context.getBean("senStore");
        
        long sensorID = senStore.createSensor("SenStore Test 1", SensorType.SensorTypeACCELEROMETER);
        System.out.println("Sensor: " + sensorID);
        long accelSignalID = senStore.createAccelerometerSignal(sensorID);
        System.out.println("Accel ID: " + accelSignalID);
        
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 50; ++i) {
            senStore.addTenRandomDataPoints(accelSignalID);
        }
        
        long stopTime = System.currentTimeMillis();
        System.out.println("Inserting 5000 cycles took " + (stopTime - startTime) + "ms.");
        
        Float32Signal signal = senStore.getSignalData(accelSignalID, 0, System.currentTimeMillis());

        System.out.print("  Data: ");

        for (float datum : signal.data) {
            System.out.print(datum + " ");
        }
        System.out.println();

        System.out.print("  Time: ");
        for (double time : signal.t) {
            System.out.print(time + " ");
        }
        System.out.println();
        
        System.out.println("Done!");
        System.exit(0);
    }
}
