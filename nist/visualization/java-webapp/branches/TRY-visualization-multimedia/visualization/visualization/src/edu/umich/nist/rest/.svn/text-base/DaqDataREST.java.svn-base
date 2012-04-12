package edu.umich.nist.rest;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gson.Gson;

import edu.umich.nist.SenStore;
import edu.umich.senstore.ArraySlice;
import edu.umich.senstore.DaqUnitChannelDataFields;
import edu.umich.senstore.DaqUnitChannelDataPrx;
import edu.umich.senstore.Int32Signal;
import edu.umich.senstore.SenStoreMngrPrxHelper;
import edu.umich.senstore.TimeAxisInfo;

/**
 * Servlet implementation class StructuresREST
 */
public class DaqDataREST extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    WebApplicationContext context = WebApplicationContextUtils
	            .getWebApplicationContext(this.getServletContext());
	    SenStore senStore = (SenStore) context.getBean("senStore");
	    SenStoreMngrPrxHelper manager = (SenStoreMngrPrxHelper) context.getBean("senStoreManager");
	    
//	    long startTimeInMillis = Long.parseLong(request.getParameter("startTimeInMillis"));
//	    System.out.println("Querying from: " + new Date(startTimeInMillis) + " (" + startTimeInMillis + ")");
	    long channelID = Long.parseLong(request.getParameter("channelID"));
//	    System.out.println(" for channel: " + channelID);

	    DaqUnitChannelDataFields prototype = new DaqUnitChannelDataFields();
	    prototype.mChannel = channelID;
	    long[] ids = manager.findEqualDaqUnitChannelData(prototype, new String[] { "Channel" });
	    if (ids.length > 1) {
	        System.out.println("More than 1 signal existed for the channel with id: " + channelID);
	        return;
	    } else if (ids.length == 0) {
	        System.out.println("No signal existed for that channel: " + channelID);
	        return;
	    }
	    
	    DaqUnitChannelDataPrx signal = manager.getDaqUnitChannelData(ids[0]);
	    
	    final Int32Signal signalData = signal.getSignalData(
	            (double) (System.currentTimeMillis() - 5000) / 1000, 0.0001f,
	            (double) System.currentTimeMillis() / 1000,
	                    new ArraySlice[0]);
	    
//	    System.out.println("Found " + signalData.t.length + " times, "
//	            + signalData.data.length + " data points");
//	    for (double time : signalData.t) {
//	        System.out.println(time * 1000);
//	        System.out.println(new Date(Math.round(time * 1000)));
//	    }
	    
	    Object responseObject = null;
	    if (signalData.t.length > 0) {
	        System.out.println("Creating responseObject - "
	                + signalData.t.length + " times, "
	                + signalData.data.length + " data points");
	        responseObject = new DataResponse(
	                Math.round(signalData.t.length > 0 ? signalData.t[0] * 1000 : -1),
	                Math.round(signalData.t.length > 0 ? signalData.t[signalData.t.length - 1] * 1000 : -1),
	                signalData.data);

	        System.out.println("  " + (signalData.t[0] * 1000));
	        System.out.println("  " + (signalData.t[signalData.t.length - 1] * 1000));
	        System.out.println("Start: " + new Date(Math.round(signalData.t.length > 0 ? signalData.t[0] * 1000 : -1)));
	        System.out.println("End: " + new Date(Math.round(signalData.t.length > 0 ? signalData.t[signalData.t.length - 1] * 1000 : -1)));
	    } else {
	        responseObject = false;
	    }

	    
	    
//	    int[] data = senStore.getDaqData(channelID, 0, System.currentTimeMillis());
//	    int[] skippingFirst100 = new int[data.length - 100];
//	    System.arraycopy(data, 100, skippingFirst100, 0, data.length - 100);
	    
	    Gson gson = new Gson();
	    response.getWriter().write(gson.toJson(responseObject));
	    response.flushBuffer();
	    response.getWriter().close();
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
