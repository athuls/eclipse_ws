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
import edu.umich.senstore.DaqUnitPrx;

/**
 * Servlet implementation class StructuresREST
 */
public class UnitsREST extends HttpServlet {
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
	    
	    System.out.println(" Querying Units");
	    final DaqUnitPrx[] unitsPrx = senStore.getUnits();
	    Object[] units = new Object[unitsPrx.length];
	    for (int i =0; i < units.length; ++i) {
	        final DaqUnitPrx unitPrx = unitsPrx[i];
	        units[i] = new Object() {
	            public String model = unitPrx.getFields().mModel;
	            public String identifier = unitPrx.getFields().mIdentifier;
	            public long id = unitPrx.getFields().id;
	        };
	    }
	    System.out.println("  Found " + units.length + " units");
	    
	    Gson gson = new Gson();
	    response.getWriter().write(gson.toJson(units));
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
