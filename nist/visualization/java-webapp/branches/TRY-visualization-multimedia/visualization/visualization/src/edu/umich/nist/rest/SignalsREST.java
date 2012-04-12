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
import edu.umich.senstore.AccelMeasPrx;

/**
 * Servlet implementation class StructuresREST
 */
public class SignalsREST extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    int sensorID = Integer.parseInt(request.getParameter("sensorID"));
	    
	    WebApplicationContext context = WebApplicationContextUtils
	            .getWebApplicationContext(this.getServletContext());
	    SenStore senStore = (SenStore) context.getBean("senStore");
	    
	    System.out.println(" Querying Signals");
	    final AccelMeasPrx[] signalsPrx = senStore.getAccelerationSignals(sensorID);
	    Object[] signals = new Object[signalsPrx.length];
	    for (int i = 0; i < signals.length; ++i) {
	        final AccelMeasPrx signalPrx = signalsPrx[i];
	        signals[i] = new Object() {
	            public long id = signalPrx.getFields().id;
	            public long sensorID = signalPrx.getFields().mSensor;
	            public String name = signalPrx.getFields().mName;
	            public String description = signalPrx.getFields().mDescription;
	        };
	    }
	    System.out.println("  Found " + signals.length + " signals");
	    
	    Gson gson = new Gson();
	    response.getWriter().write(gson.toJson(signals));
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
