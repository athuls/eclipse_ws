/**
 * 
 */
package edu.umich.nist.script;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.umich.senstore.DaqUnitChannelFields;
import edu.umich.senstore.DaqUnitChannelPrx;
import edu.umich.senstore.SenStoreMngrPrxHelper;

/**
 * @author bippy
 *
 */
public class DaqChannelListScript {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.registerShutdownHook();
        
        SenStoreMngrPrxHelper manager = (SenStoreMngrPrxHelper) context.getBean("senStoreManager");

        long[] channelIDs = manager.getDaqUnitChannelIds();
        for (long channelID : channelIDs) {
            DaqUnitChannelPrx channelProxy = manager.getDaqUnitChannel(channelID);
            DaqUnitChannelFields fields = channelProxy.getFields();
            System.out.println(fields.id + ". Unit: " + fields.mUnit + ", Number: " + fields.mNumber);
            System.out.println(" Unit identifier: "
                    + manager.getDaqUnit(fields.mUnit).getFields().mIdentifier);
        }

        System.out.println("Done!");
        System.exit(0);
    }
}
