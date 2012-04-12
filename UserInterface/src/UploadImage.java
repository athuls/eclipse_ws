import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Comparator;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class UploadImage {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] argv) throws ClassNotFoundException, SQLException, IOException {
	Class.forName("org.postgresql.Driver");
	Connection conn = DriverManager.getConnection("jdbc:postgresql://panther.eecs.umich.edu:5432/inspection_db", "senstore_admin", "is3vuc5e");
	//File file = new File("/home/athuls89/Desktop/gsra/Winter2012/DSC_0092.JPG");
	File directory = new File("/home/athuls89/Desktop/gsra/Winter2012/Pictures_Ettouney/Pictures");
	File files[]=directory.listFiles();
	Arrays.sort(files,new Comparator(){
		@Override
		public int compare(Object f1, Object f2){
			return ((File)f1).getName().compareTo(((File)f2).getName());
		}
	});
	
	//FileInputStream fis = new FileInputStream(file);
	
	PreparedStatement ps = conn.prepareStatement("INSERT INTO multimedia VALUES (?, ?, ?)");
	int count=1;
	
	for(File file:files){
		System.out.println(file);
		FileInputStream fis = new FileInputStream(file);
		ps.setInt(1, count);
		ps.setBinaryStream(2, fis, (int)file.length());
		ps.setString(3, ".JPG");
		//ps.executeUpdate();
		fis.close();
		count++;
	}
	ps.close();
		
	//Now get back the image
/*	ps = conn.prepareStatement("SELECT multimedia_object FROM multimedia WHERE multimedia_id=?");
	ps.setInt(1, 53);
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
	    byte[] imgBytes = rs.getBytes(1);
	    System.out.println("Got the image");	
	    InputStream inTemp=new ByteArrayInputStream(imgBytes);
	    BufferedImage imageTemp=ImageIO.read(inTemp);
	    showIcon(imageTemp);
	    System.out.println("the size is "+imageTemp.getWidth()+" "+imageTemp.getHeight());
	}
	rs.close();
	ps.close();*/
	}
	
	private static void showIcon(BufferedImage image) {
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon, JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label, "icon", -1);
    }
}
