package net.is_bg.mon.wsclient;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import net.is_bg.mon.wsclient.stub.WsStub.GetStudentDataFromEGN;
import net.is_bg.mon.wsclient.stub.WsStub.GetStudentDataFromEGNExtended;
import net.is_bg.mon.wsclient.stub.WsStub.GetUniversityStudentDataFromEGN;
import net.is_bg.mon.wsclient.stub.WsnacidStub.GetStudentDataFromEGN_AdminRD;
import net.is_bg.mon.wsclient.stub.WsnacidStub.GetStudentDataFromEGN_AdminRDC;
import net.is_bg.mon.wsclient.stub.WsnacidStub.GetStudentDataFromEGN_AdminRHE;
import net.is_bg.mon.wsclient.stub.WsnacidStub.GetStudentDataFromLIN_AdminRHE;

public class CallMonServices {

	private final static String user = "trumf";
	private final static String pass = "mf1289";
	
	//================================ spravka za danni  ot diplomi za sredno obrazovanie=========================
	private static String getStudentDataForDiploma(long EGN, String user, String pass) throws AxisFault, RemoteException{
		GetStudentDataFromEGN getStudentDataFromEGN8 = new  GetStudentDataFromEGN();
		getStudentDataFromEGN8.setIntStudentID(EGN);
		getStudentDataFromEGN8.setU(user);
		getStudentDataFromEGN8.setP(pass);
		return  MonStubInstance.getMonStub().getStudentDataFromEGN(getStudentDataFromEGN8).getGetStudentDataFromEGNResult().getData();
	}
	
	/**
	 * Get the student data for diploma from MON by student EGN...
	 * @param EGN
	 * @return XML in the following format 
	 * @throws AxisFault
	 * @throws RemoteException
	 */
	public static String getStudentDataForDiploma(long EGN) throws AxisFault, RemoteException{
		return getStudentDataForDiploma(EGN, user, pass);
	}
	
	
	/**
	 * Get the student data from MON by student EGN...More detailed method...
	 * @param EGN
	 * @return
	 * @throws AxisFault
	 * @throws RemoteException
	 */
	public static String getStudentForDiplomaEx(long EGN) throws AxisFault, RemoteException{
		GetStudentDataFromEGNExtended getStudentDataFromEGN8 = new  GetStudentDataFromEGNExtended();
		getStudentDataFromEGN8.setIntStudentID(EGN);
		getStudentDataFromEGN8.setU(user);
		getStudentDataFromEGN8.setP(pass);
		return  MonStubInstance.getMonStub().getStudentDataFromEGNExtended(getStudentDataFromEGN8).getGetStudentDataFromEGNExtendedResult().getData();
	}
	//================================ end of  spravka za danni  ot diplomi za sredno obrazovanie=========================
	
	
	
	
	//================================ danni ot registyr za izobrajeniq na diplomi========================================
	//data from Admin RD register
	/***
	 * This retrieves scanned images for diploma  by student  EGN!
	 * @return
	 * @throws AxisFault 
	 * @throws RemoteException 
	 */
	public static String getStudentDataFromAdminRD(String EGN) throws AxisFault, RemoteException {
		GetStudentDataFromEGN_AdminRD getStudentDataFromEGN_AdminRD = new  GetStudentDataFromEGN_AdminRD();
		getStudentDataFromEGN_AdminRD.setIntStudentID(EGN);
		getStudentDataFromEGN_AdminRD.setU(user);
		getStudentDataFromEGN_AdminRD.setP(pass);
		return MonStubInstance.getWsnacidStub().getStudentDataFromEGN_AdminRD(getStudentDataFromEGN_AdminRD).getGetStudentDataFromEGN_AdminRDResult();
	}
	
	/**
	 * This retrieves scanned images for diploma  by student  EGN!
	 * Data from Admin RDC register
	 * 
	 * @param EGN
	 * @return
	 * @throws AxisFault
	 * @throws RemoteException
	 */
	public static String getStudentDataFromAdminRDC(String EGN) throws AxisFault, RemoteException{
		GetStudentDataFromEGN_AdminRDC getStudentDataFromEGN_AdminRDC = new  GetStudentDataFromEGN_AdminRDC();
		getStudentDataFromEGN_AdminRDC.setIntStudentID(EGN);
		getStudentDataFromEGN_AdminRDC.setU(user);
		getStudentDataFromEGN_AdminRDC.setP(pass);
		return MonStubInstance.getWsnacidStub().getStudentDataFromEGN_AdminRDC(getStudentDataFromEGN_AdminRDC).getGetStudentDataFromEGN_AdminRDCResult();
	}
	
	/**This retrieves scanned images for diploma  by student  EGN!
	 * Data from Admin RHE register
	 * 
	 * @param EGN
	 * @return
	 * @throws AxisFault
	 * @throws RemoteException
	 */
	public static String getStudentDataFromAdminRHE(long EGN) throws AxisFault, RemoteException{
		GetStudentDataFromEGN_AdminRHE getStudentDataFromEGN_AdminRHE = new  GetStudentDataFromEGN_AdminRHE();
		getStudentDataFromEGN_AdminRHE.setIntStudentID(EGN);
		getStudentDataFromEGN_AdminRHE.setU(user);
		getStudentDataFromEGN_AdminRHE.setP(pass);
		return MonStubInstance.getWsnacidStub().getStudentDataFromEGN_AdminRHE(getStudentDataFromEGN_AdminRHE).getGetStudentDataFromEGN_AdminRHEResult();

	}
	
	public static String getStudentDataFromLIN_AdminRHE(String EGN) throws AxisFault, RemoteException{
		GetStudentDataFromLIN_AdminRHE getStudentDataFromLIN_AdminRHE4 = new GetStudentDataFromLIN_AdminRHE();
		getStudentDataFromLIN_AdminRHE4.setIntStudentID(EGN);
		getStudentDataFromLIN_AdminRHE4.setU(user);
		getStudentDataFromLIN_AdminRHE4.setP(pass);
		return MonStubInstance.getWsnacidStub().getStudentDataFromLIN_AdminRHE(getStudentDataFromLIN_AdminRHE4).getGetStudentDataFromLIN_AdminRHEResult();
	}
	//================================end danni ot registyr za izobrajeniq na diplomi =======================================
	
	
	
	
	
	//================================= danni ot registyr na prekusnali studenti i doktoranti ==================================
	/***
	 * Get data for retired student by EGN!
	 * @param EGN
	 * @return
	 * @throws AxisFault
	 * @throws RemoteException
	 */
	public static  String getUniversityStudentData(long EGN) throws AxisFault, RemoteException{
		GetUniversityStudentDataFromEGN getUniversityStudentDataFromEGN = new  GetUniversityStudentDataFromEGN();
		getUniversityStudentDataFromEGN.setIntStudentID(EGN);
		getUniversityStudentDataFromEGN.setU(user);
		getUniversityStudentDataFromEGN.setP(pass);
		return MonStubInstance.getMonStub().getUniversityStudentDataFromEGN(getUniversityStudentDataFromEGN).getGetUniversityStudentDataFromEGNResult().getData();
	}
	
	//============================= end danni registyr na prekusnali studenti i doktoranti ==================================
	
	
	//================================================ data from bachelor register ======================================
	
}
