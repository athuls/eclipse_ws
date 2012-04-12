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
public class CreateTestStructureScript {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.registerShutdownHook();

        SenStore senStore = (SenStore) context.getBean("senStore");
        
        long startTime = System.currentTimeMillis();

        senStore.createTestStructure();
        
        long stopTime = System.currentTimeMillis();
        System.out.println("Inserting 250000 node structure took " + (stopTime - startTime) + "ms.");
    }
}
