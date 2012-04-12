/**
 * 
 */
package edu.umich.nist.script;

import java.io.File;

import dk.ange.octave.OctaveEngine;
import dk.ange.octave.OctaveEngineFactory;
import dk.ange.octave.type.OctaveDouble;

/**
 * @author bippy
 *
 */
public class OctaveTestScript {

    /**
     * @param args
     */
    public static void main(String[] args) {
        OctaveEngine octave = null;
        try {
            OctaveEngineFactory factory = new OctaveEngineFactory();
            factory.setOctaveProgram(new File("/opt/local/bin/octave"));
            octave = factory.getScriptEngine();
            octave.eval("b = 2.5 * 5;");
            OctaveDouble b = octave.get(OctaveDouble.class, "b");
            System.out.println(b.get(1));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { octave.close(); } catch (Exception e) { }
        }
    }

}
