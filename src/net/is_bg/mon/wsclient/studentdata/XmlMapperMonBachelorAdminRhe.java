package net.is_bg.mon.wsclient.studentdata;

import javax.xml.bind.annotation.XmlElement;


class XmlMapperMonBachelorAdminRhe {

	private String QUERY = "QUERY";
	private String A = "A";
	private String B = "B";
	private String C = "C";
	private String D = "D";
	private String E = "E";
	private XmlMapperMonBachelorF F = new  XmlMapperMonBachelorF();
	private String G = "G";
	private String H = "H";
	private String I = "I";
	private String J = "J";
	private String K = "K";
	private String L = "L";
	private String M = "M";
	
	
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
	public XmlMapperMonBachelorF getF() {
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
	
	public void setC(String c) {
		C = c;
	}
	public void setD(String d) {
		D = d;
	}
	public void setE(String e) {
		E = e;
	}
	public void setF(XmlMapperMonBachelorF f) {
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
	@XmlElement(name="K")
	public String getK() {
		return K;
	}
	public void setK(String k) {
		K = k;
	}
	@XmlElement(name="L")
	public String getL() {
		return L;
	}
	public void setL(String l) {
		L = l;
	}
	@XmlElement(name="M")
	public String getM() {
		return M;
	}
	public void setM(String m) {
		M = m;
	}
	
}
