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
import edu.umich.senstore.DaqUnitChannelPrx;

/**
 * Servlet implementation class StructuresREST
 */
public class ChannelsREST extends HttpServlet {
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
	    
	    long unitID = Long.parseLong(request.getParameter("unitID"));
	    
	    System.out.println(" Querying Channels for unit: " + unitID);
	    final DaqUnitChannelPrx[] channelsPrx = senStore.getChannels(unitID);
	    Object[] channels = new Object[channelsPrx.length];
	    for (int i =0; i < channels.length; ++i) {
	        final DaqUnitChannelPrx channelPrx = channelsPrx[i];
	        channels[i] = new Object() {
	            public short number = channelPrx.getFields().mNumber;
	            public long unitID = channelPrx.getFields().mUnit;
	            public long id = channelPrx.getFields().id;
	        };
	    }
	    System.out.println("  Found " + channels.length + " channels");
	    
	    Gson gson = new Gson();
	    response.getWriter().write(gson.toJson(channels));
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
