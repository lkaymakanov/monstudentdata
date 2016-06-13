package net.is_bg.mon.wsclient.studentdata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
class XmlMapperMonStudentHighSchoolImagesData {

	private List<XmlMapperMonHighSchoolImageStudent> student = new ArrayList<XmlMapperMonHighSchoolImageStudent>();

	@XmlElement(name="student")
	public List<XmlMapperMonHighSchoolImageStudent> getStudent() {
		return student;
	}

	public void setStudent(List<XmlMapperMonHighSchoolImageStudent>  student) {
		this.student = student;
	}
	
}
