/**
 * 
 */
package edu.umich.nist.script;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.umich.nist.SenStore;

/**
 * @author bippy
 *
 */
public class GetSignalDataScript {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.registerShutdownHook();

        SenStore senStore = (SenStore) context.getBean("senStore");
        
        long total = 0;
        for (int i = 0; i < 100; ++i) {
            long startTime = System.currentTimeMillis();
            
            senStore.getSignalData(30, 0, startTime);
            
            long stopTime = System.currentTimeMillis();
            
            total += stopTime - startTime;
        }
        
        System.out.println(" Took " + total + "ms to read 5000 cycles 100 times");
        
        System.out.println("Done!");
        System.exit(0);
    }
}
