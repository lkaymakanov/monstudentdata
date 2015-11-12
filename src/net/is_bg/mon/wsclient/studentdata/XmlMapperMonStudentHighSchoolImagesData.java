package net.is_bg.mon.wsclient.studentdata;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
class XmlMapperMonStudentHighSchoolImagesData {

	private XmlMapperMonHighSchoolImageStudent student = new XmlMapperMonHighSchoolImageStudent();

	@XmlElement(name="student")
	public XmlMapperMonHighSchoolImageStudent getStudent() {
		return student;
	}

	public void setStudent(XmlMapperMonHighSchoolImageStudent student) {
		this.student = student;
	}
	
}
