package net.is_bg.mon.wsclient.studentdata;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import net.is_bg.mon.wsclient.studentdata.IMonStudentHighSchoolDiplomaData;
import net.is_bg.mon.wsclient.studentdata.IMonStudentHighSchoolImagesData;
import net.is_bg.mon.wsclient.studentdata.MonStudentHighSchoolDiplomaData;
import net.is_bg.mon.wsclient.studentdata.MonStudentHighSchoolImagesData;

/**
 * Get student data from MON web service!!!
 * @author lubo
 *
 */
public class MonStudentFacade {
	/**
	 * Retrieves images data for candidate student by ein in format suitable for process
	 * @param ein
	 * @return
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 * @throws JAXBException 
	 * @throws ClassNotFoundException 
	 */
	public static  List<IMonStudentHighSchoolImagesData> getStudentImagesData(String ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException{
		return  MonStudentHighSchoolImagesData.getStudentImagesData(ein);
	}
	
	/**
	 * Retrieves diploma data for candidate student by ein in format suitable for process
	 * @param ein
	 * @return
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws JAXBException 
	 * @throws ClassNotFoundException 
	 */
	public static IMonStudentHighSchoolDiplomaData getStudentHighSchoolDiplomaData(long ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException{
		return   MonStudentHighSchoolDiplomaData.getStudentHighSchoolDiplomaData(ein);
	}
	
	/***
	 * Retrieves data for students graduate from universities!!!!
	 * @return
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws JAXBException 
	 * @throws ClassNotFoundException 
	 */
	public static IMonBachelorData getBachelorDiplomaDataAdminRHE(long ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException{
		return MonBachelorData.getMonBachelorDataAdminRHE(ein);
	}
	
	/***
	 * Retrieves data for students graduate from universities!!!!
	 * @return
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws JAXBException 
	 * @throws ClassNotFoundException 
	 */
	public static IMonBachelorData getBachelorDiplomaDataLIN_AdminRHE(String ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException{
		return MonBachelorData.getMonBachelorDataLinAdminRHE(ein);
	}

}
