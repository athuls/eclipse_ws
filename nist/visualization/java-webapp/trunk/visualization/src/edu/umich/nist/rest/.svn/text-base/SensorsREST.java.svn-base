package edu.umich.nist.rest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gson.Gson;

import edu.umich.nist.SenStore;
import edu.umich.senstore.SensorPrx;

/**
 * Servlet implementation class StructuresREST
 */
public class SensorsREST extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    WebApplicationContext context = WebApplicationContextUtils
	            .getWebApplicationContext(this.getServletContext());
	    
	    SenStore senStore = (SenStore) context.getBean("senStore");
	    
	    System.out.println(" Querying Sensors");
	    final SensorPrx[] sensorsPrx = senStore.getSensors();
	    Object[] sensors = new Object[sensorsPrx.length];
	    for (int i = 0; i < sensors.length; ++i) {
	        final SensorPrx sensorPrx = sensorsPrx[i];
	        sensors[i] = new Object() {
	            public long id = sensorPrx.getFields().id;
	            public String type = sensorPrx.getFields().mType.name();
	            public String model = sensorPrx.getFields().mModel;
	            public String identifier = sensorPrx.getFields().mIdentifier;
	        };
	    }
	    System.out.println("  Found " + sensors.length + " sensors");
	    
	    Gson gson = new Gson();
	    response.getWriter().write(gson.toJson(sensors));
	    response.flushBuffer();
	    response.getWriter().close();
	    System.out.println("   Finished writing out GSON");
	    return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		doGet(request, response);
	}
}
