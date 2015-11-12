package net.is_bg.mon.wsclient.studentdata;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlElement;

import net.is_bg.mon.wsclient.studentdata.XmlMapperMonStudentImageData;


class XmlMapperMonHighSchoolImageStudent {

	private String QUERY = "";
	private String A = "";
	private String B = "";
	private String C = "";
	private String D = "";
	private String E = "";
	private String F = "";
	private String G = "";
	private String H = "";
	private String I = "";
	private String J = "";
	private XmlMapperMonStudentImageData K = new  XmlMapperMonStudentImageData();
	
	XmlMapperMonHighSchoolImageStudent(){
		
	}
	
	XmlMapperMonHighSchoolImageStudent(HashMap<String, ValueDescription> map){
		ValueDescription entry;
		entry = map.get("QUERY"); setQUERY(entry.getDesccription());
		entry = map.get("A"); setA(entry.getDesccription());
		entry = map.get("B"); setB(entry.getDesccription());
		entry = map.get("C"); setC(entry.getDesccription());
		entry = map.get("D"); setD(entry.getDesccription());
		entry = map.get("E"); setE(entry.getDesccription());
		entry = map.get("F"); setF(entry.getDesccription());
		entry = map.get("G"); setG(entry.getDesccription());
		entry = map.get("H"); setH(entry.getDesccription());
		entry = map.get("I"); setI(entry.getDesccription());
		entry = map.get("J"); setJ(entry.getDesccription());
	}
	
	@XmlElement(name="A")
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	@XmlElement(name="B")
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	@XmlElement(name="C")
	public String getC() {
		return C;
	}
	@XmlElement(name="D")
	public String getD() {
		return D;
	}
	@XmlElement(name="E")
	public String getE() {
		return E;
	}
	@XmlElement(name="F")
	public String getF() {
		return F;
	}
	@XmlElement(name="G")
	public String getG() {
		return G;
	}
	@XmlElement(name="H")
	public String getH() {
		return H;
	}
	@XmlElement(name="I")
	public String getI() {
		return I;
	}
	@XmlElement(name="J")
	public String getJ() {
		return J;
	}
	@XmlElement(name="QUERY")
	public String getQUERY() {
		return QUERY;
	}
	public void setQUERY(String qUERY) {
		QUERY = qUERY;
	}
	@XmlElement(name="K")
	public XmlMapperMonStudentImageData getK() {
		return K;
	}
	public void setK(XmlMapperMonStudentImageData k) {
		K = k;
	}
	public void setC(String c) {
		C = c;
	}
	public void setD(String d) {
		D = d;
	}
	public void setE(String e) {
		E = e;
	}
	public void setF(String f) {
		F = f;
	}
	public void setG(String g) {
		G = g;
	}
	public void setH(String h) {
		H = h;
	}
	public void setI(String i) {
		I = i;
	}
	public void setJ(String j) {
		J = j;
	}
	
}
