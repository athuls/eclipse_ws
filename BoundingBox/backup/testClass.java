import java.io.IOException;


public class testClass {
	public static void main(String args[]) throws IOException{
		for (byte b = Byte.MIN_VALUE;
        b < Byte.MAX_VALUE; b++) {
       if (b == 0x90)
           System.out.print("Joy!");
   }

	}
}
