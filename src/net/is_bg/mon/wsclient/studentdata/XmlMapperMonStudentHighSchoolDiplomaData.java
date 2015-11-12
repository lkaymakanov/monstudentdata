package net.is_bg.mon.wsclient.studentdata;

import java.io.Serializable;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student")
class XmlMapperMonStudentHighSchoolDiplomaData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -564175994430063948L;
	private String A;
	private String B;
	private String C;
	private String D;
	private String E;
	private String F;
	private String G;
	private String H;
	private String I;
	private String J;
	private String K;
	private String L;
	private String M;
	private String N;
	private String O;
	private String P;
	private String Q;
	private String R;
	private String S;
	private String T;
	private String U;
	private String V;
	private String W;
	private String X;
	private String Y;
	private String Z;
	
	private String AA;
	private String AB;
	private String AC;
	private String AD;
	private String AE;
	private String AF;
	private String AG;
	private String AH;
	private String AI;
	private String AJ;
	private String AK;
	private String AL;
	private String AM;
	private String AN;
	private String AO;
	private String AP;
	private String AQ;
	private String AR;
	private String AS;
	private String AT;
	private String AU;
	private String AV;
	private String AW;
	private String AX;
	private String AY;
	private String AZ;

/*	private String BA;
	private String BB;
	private String BC;
	private String BD;
	private String BE;*/
	
	XmlMapperMonStudentHighSchoolDiplomaData(){
		
	}
	
	
	XmlMapperMonStudentHighSchoolDiplomaData(HashMap<String, ValueDescription> map){
		ValueDescription entry;
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
		entry = map.get("K"); setK(entry.getDesccription());
		entry = map.get("L"); setL(entry.getDesccription());
		entry = map.get("M"); setM(entry.getDesccription());
		entry = map.get("N"); setN(entry.getDesccription());
		entry = map.get("O"); setO(entry.getDesccription());
		entry = map.get("P"); setP(entry.getDesccription());
		entry = map.get("Q"); setQ(entry.getDesccription());
		entry = map.get("R"); setR(entry.getDesccription());
		entry = map.get("S"); setS(entry.getDesccription());
		entry = map.get("T"); setT(entry.getDesccription());
		entry = map.get("U"); setU(entry.getDesccription());
		entry = map.get("V"); setV(entry.getDesccription());
		entry = map.get("W"); setW(entry.getDesccription());
		entry = map.get("X"); setX(entry.getDesccription());
		entry = map.get("Y"); setY(entry.getDesccription());
		entry = map.get("Z"); setZ(entry.getDesccription());
		
		entry = map.get("AA"); setAA(entry.getDesccription());
		entry = map.get("AB"); setAB(entry.getDesccription());
		entry = map.get("AC"); setAC(entry.getDesccription());
		entry = map.get("AD"); setAD(entry.getDesccription());
		entry = map.get("AE"); setAE(entry.getDesccription());
		entry = map.get("AF"); setAF(entry.getDesccription());
		entry = map.get("AG"); setAG(entry.getDesccription());
		entry = map.get("AH"); setAH(entry.getDesccription());
		entry = map.get("AI"); setAI(entry.getDesccription());
		entry = map.get("AJ"); setAJ(entry.getDesccription());
		entry = map.get("AK"); setAK(entry.getDesccription());
		entry = map.get("AL"); setAL(entry.getDesccription());
		entry = map.get("AM"); setAM(entry.getDesccription());
		entry = map.get("AN"); setAN(entry.getDesccription());
		entry = map.get("AO"); setAO(entry.getDesccription());
		entry = map.get("AP"); setAP(entry.getDesccription());
		entry = map.get("AQ"); setAQ(entry.getDesccription());
		entry = map.get("AR"); setAR(entry.getDesccription());
		entry = map.get("AS"); setAS(entry.getDesccription());
		entry = map.get("AT"); setAT(entry.getDesccription());
		entry = map.get("AU"); setAU(entry.getDesccription());
		entry = map.get("AV"); setAV(entry.getDesccription());
		entry = map.get("AW"); setAW(entry.getDesccription());
		entry = map.get("AX"); setAX(entry.getDesccription());
		entry = map.get("AY"); setAY(entry.getDesccription());
		entry = map.get("AZ"); setAZ(entry.getDesccription());
		
		/*entry = map.get("BA"); setBA(entry.getDesccription());
		entry = map.get("BB"); setBB(entry.getDesccription());
		entry = map.get("BC"); setBC(entry.getDesccription());
		entry = map.get("BD"); setBD(entry.getDesccription());
		entry = map.get("BE"); setBE(entry.getDesccription());*/
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
	@XmlElement(name="K")
	public String getK() {
		return K;
	}
	@XmlElement(name="L")
	public String getL() {
		return L;
	}
	@XmlElement(name="M")
	public String getM() {
		return M;
	}
	@XmlElement(name="N")
	public String getN() {
		return N;
	}
	@XmlElement(name="O")
	public String getO() {
		return O;
	}
	@XmlElement(name="P")
	public String getP() {
		return P;
	}
	@XmlElement(name="Q")
	public String getQ() {
		return Q;
	}
	@XmlElement(name="R")
	public String getR() {
		return R;
	}
	@XmlElement(name="S")
	public String getS() {
		return S;
	}
	@XmlElement(name="T")
	public String getT() {
		return T;
	}
	@XmlElement(name="U")
	public String getU() {
		return U;
	}
	@XmlElement(name="V")
	public String getV() {
		return V;
	}
	@XmlElement(name="W")
	public String getW() {
		return W;
	}
	@XmlElement(name="X")
	public String getX() {
		return X;
	}
	@XmlElement(name="Y")
	public String getY() {
		return Y;
	}
	@XmlElement(name="Z")
	public String getZ() {
		return Z;
	}
	@XmlElement(name="AA")
	public String getAA() {
		return AA;
	}
	@XmlElement(name="AB")
	public String getAB() {
		return AB;
	}
	@XmlElement(name="AC")
	public String getAC() {
		return AC;
	}
	@XmlElement(name="AD")
	public String getAD() {
		return AD;
	}
	@XmlElement(name="AE")
	public String getAE() {
		return AE;
	}
	@XmlElement(name="AF")
	public String getAF() {
		return AF;
	}
	@XmlElement(name="AG")
	public String getAG() {
		return AG;
	}
	@XmlElement(name="AH")
	public String getAH() {
		return AH;
	}
	@XmlElement(name="AI")
	public String getAI() {
		return AI;
	}
	@XmlElement(name="AJ")
	public String getAJ() {
		return AJ;
	}
	@XmlElement(name="AK")
	public String getAK() {
		return AK;
	}
	@XmlElement(name="AL")
	public String getAL() {
		return AL;
	}
	@XmlElement(name="AM")
	public String getAM() {
		return AM;
	}
	@XmlElement(name="AN")
	public String getAN() {
		return AN;
	}
	@XmlElement(name="AO")
	public String getAO() {
		return AO;
	}
	@XmlElement(name="AP")
	public String getAP() {
		return AP;
	}
	@XmlElement(name="AQ")
	public String getAQ() {
		return AQ;
	}
	@XmlElement(name="AR")
	public String getAR() {
		return AR;
	}
	@XmlElement(name="AS")
	public String getAS() {
		return AS;
	}
	@XmlElement(name="AT")
	public String getAT() {
		return AT;
	}
	@XmlElement(name="AU")
	public String getAU() {
		return AU;
	}
	@XmlElement(name="AV")
	public String getAV() {
		return AV;
	}
	@XmlElement(name="AW")
	public String getAW() {
		return AW;
	}
	@XmlElement(name="AX")
	public String getAX() {
		return AX;
	}
	@XmlElement(name="AY")
	public String getAY() {
		return AY;
	}
	@XmlElement(name="AZ")
	public String getAZ() {
		return AZ;
	}
	/*@XmlElement(name="BA")
	public String getBA() {
		return BA;
	}
	@XmlElement(name="BB")
	public String getBB() {
		return BB;
	}
	@XmlElement(name="BC")
	public String getBC() {
		return BC;
	}
	@XmlElement(name="BD")
	public String getBD() {
		return BD;
	}
	@XmlElement(name="BE")
	public String getBE() {
		return BE;
	}*/
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
	public void setK(String k) {
		K = k;
	}
	public void setL(String l) {
		L = l;
	}
	public void setM(String m) {
		M = m;
	}
	public void setN(String n) {
		N = n;
	}
	public void setO(String o) {
		O = o;
	}
	public void setP(String p) {
		P = p;
	}
	public void setQ(String q) {
		Q = q;
	}
	public void setR(String r) {
		R = r;
	}
	public void setS(String s) {
		S = s;
	}
	public void setT(String t) {
		T = t;
	}
	public void setU(String u) {
		U = u;
	}
	public void setV(String v) {
		V = v;
	}
	public void setW(String w) {
		W = w;
	}
	public void setX(String x) {
		X = x;
	}
	public void setY(String y) {
		Y = y;
	}
	public void setZ(String z) {
		Z = z;
	}
	public void setAA(String aA) {
		AA = aA;
	}
	public void setAB(String aB) {
		AB = aB;
	}
	public void setAC(String aC) {
		AC = aC;
	}
	public void setAD(String aD) {
		AD = aD;
	}
	public void setAE(String aE) {
		AE = aE;
	}
	public void setAF(String aF) {
		AF = aF;
	}
	public void setAG(String aG) {
		AG = aG;
	}
	public void setAH(String aH) {
		AH = aH;
	}
	public void setAI(String aI) {
		AI = aI;
	}
	public void setAJ(String aJ) {
		AJ = aJ;
	}
	public void setAK(String aK) {
		AK = aK;
	}
	public void setAL(String aL) {
		AL = aL;
	}
	public void setAM(String aM) {
		AM = aM;
	}
	public void setAN(String aN) {
		AN = aN;
	}
	public void setAO(String aO) {
		AO = aO;
	}
	public void setAP(String aP) {
		AP = aP;
	}
	public void setAQ(String aQ) {
		AQ = aQ;
	}
	public void setAR(String aR) {
		AR = aR;
	}
	public void setAS(String aS) {
		AS = aS;
	}
	public void setAT(String aT) {
		AT = aT;
	}
	public void setAU(String aU) {
		AU = aU;
	}
	public void setAV(String aV) {
		AV = aV;
	}
	public void setAW(String aW) {
		AW = aW;
	}
	public void setAX(String aX) {
		AX = aX;
	}
	public void setAY(String aY) {
		AY = aY;
	}
	public void setAZ(String aZ) {
		AZ = aZ;
	}
	/*public void setBA(String bA) {
		BA = bA;
	}
	public void setBB(String bB) {
		BB = bB;
	}
	public void setBC(String bC) {
		BC = bC;
	}
	public void setBD(String bD) {
		BD = bD;
	}
	public void setBE(String bE) {
		BE = bE;
	}*/
	
}
