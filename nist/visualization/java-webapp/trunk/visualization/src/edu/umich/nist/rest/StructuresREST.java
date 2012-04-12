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
import edu.umich.senstore.StructurePrx;

/**
 * Servlet implementation class StructuresREST
 */
public class StructuresREST extends HttpServlet {
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
	    
	    System.out.println(" Querying Structures");
	    final StructurePrx[] structuresPrx = senStore.getStructures();
	    Object[] structures = new Object[structuresPrx.length];
	    for (int i = 0; i < structures.length; ++i) {
	        final StructurePrx structurePrx = structuresPrx[i];
	        System.out.println(structurePrx.getFields().mDescription);
	        System.out.println(structurePrx.getFields().mName);
	        System.out.println(structurePrx.getFields().mType);
	        structures[i] = new Object() {
	            public long id = structurePrx.getFields().id;
	            public String name = structurePrx.getFields().mName;
	        };
	    }
	    System.out.println("  Found " + structures.length + " structures");
	    
	    Gson gson = new Gson();
	    response.getWriter().write(gson.toJson(structures));
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
