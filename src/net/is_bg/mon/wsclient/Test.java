package net.is_bg.mon.wsclient;

import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import net.is_bg.mon.wsclient.studentdata.IMonStudentHighSchoolDiplomaData;
import net.is_bg.mon.wsclient.studentdata.MonStudentFacade;

public class Test {

	public static void main(String [] args) throws ClassNotFoundException, ParserConfigurationException, SAXException, IOException, JAXBException{
		IMonStudentHighSchoolDiplomaData d = MonStudentFacade.getStudentHighSchoolDiplomaData(9806161076l);
		//d.isValidData()
		//d.getBgLiteratureMark();
		System.out.println(d.toString());
	}
}
