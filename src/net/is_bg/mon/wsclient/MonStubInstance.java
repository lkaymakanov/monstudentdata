 package net.is_bg.mon.wsclient;


import net.is_bg.mon.wsclient.stub.WsStub;
import net.is_bg.mon.wsclient.stub.WsnacidStub;

import org.apache.axis2.AxisFault;






class MonStubInstance {

	private static final String WS_ENDPOINT= "http://www2.mon.bg/ws/ws.asmx";
	private static final String WS_NACID_ENDPOINT = "http://www2.mon.bg/ws_nacid/ws.asmx";
	private static final long   WS_TIMEOUT =  5*60*1000;   //5 minute
	
	/**
	 * Gets the single instance of StubInstance.
	 *
	 * @return single instance of StubInstance
	 * @throws AxisFault the axis fault
	 */
	public static WsStub getMonStub(String ep) throws AxisFault{
		WsStub	stub = new WsStub(ep);
		stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(WS_TIMEOUT);
		return stub;
	}
	
	
	/**
	 * Get stub with default WS_ENDPOINT.
	 * @return
	 * @throws AxisFault
	 */
	public static WsStub getMonStub() throws AxisFault{
		return getMonStub(WS_ENDPOINT);
	}
	
	/**
	 * Gets the single instance of WsnacidStub.
	 * @return
	 * @throws AxisFault 
	 */
	public static WsnacidStub getWsnacidStub() throws AxisFault{
		return getWsnacidStub(WS_NACID_ENDPOINT);
	}
	
	/**
	 *  Gets the single instance of WsnacidStub with default WS_ENDPOINT.
	 * @return
	 * @throws AxisFault 
	 */
	public static WsnacidStub getWsnacidStub(String ep) throws AxisFault{
		WsnacidStub stub = new  WsnacidStub(ep);
		stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(WS_TIMEOUT);
		return stub;
	}
}
