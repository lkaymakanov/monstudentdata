package net.is_bg.mon.wsclient.studentdata;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import net.is_bg.mon.wsclient.CallMonServices;
import net.is_bg.mon.wsclient.xml.XmlSerialize;

import org.xml.sax.SAXException;


/**
 * Implementation of student diploma data structure!!!!
 * @author lubo
 *
 */
class MonStudentHighSchoolDiplomaData implements IMonStudentHighSchoolDiplomaData{
	
    private HashMap<String, ValueDescription> map = new HashMap<String, ValueDescription>();
    private String xml;
    private static String xmlStructure;
    private XmlMapperMonStudentHighSchoolDiplomaData student;    //the new diploma student structure directly representing the XML object!!!
    
    /***
     * The keys of fields on MON xml result Structure for student diploma!!!
     * @author lubo
     *
     */
    enum MON_FIELD_KEYS{
    	EIN_FROM_REQUEST("A", "Егн"),  					                       //0
		EIN("B", "Егн"),  						 							   //1
		SCHOOL_CODE("C", "Код на училището"),  								   //2
		SCHOOL_NAME("D", "Наименование на училището"),  					   //3
		SCHOOL_CITY("E", "Населено място на училището"),  					   //4
		SCHOOL_PROVINCE("F", "Област на училището"),   						   //5
		SCHOOL_KIND("G", "Вид на училището"),   							   //6
		STUDENT_NAME("H", "Име"),                       					   //7
		STUDENT_MIDNAME("I", "Презиме"),                					   //8
		STUDENT_SIRNAME("J", "Фамилия"),                					   //9
		KIND_DOC("K", "Вид на документа"),      							   //10
		GRAD_YEAR("L", "Година на завършване"),								   //11
		PROFILE("M", "Вид на паралелката"),     							   //12
		DIPLOMA_AVG_MARK("N", "Среден успех"),  							   //13
		DIPLOMA_SERIE("O", "Серия"),            							   //14
		DIPLOMA_NUMBER("P", "Номер на дипломата"), 							   //15
		STATE_EXAM_MARK("Q", "Първи държавен изпит (Бг и литература) оценка"), //16
		SECOND_STATE_EXAM("R", "Втори държавен изпит"), 					   //17
		SECOND_STATE_EXAM_MARK("S", "Втори държавен изпит - оценка"),  		   //18
		BG_LITERATURE_EXAM_MARK("T", "Български език и литература"), 		   //19
		FIRST_FOREIGN_LANG("U", "Първи чужд език"), 						   //20
		FIRST_FOREIGN_LANG_EXAM_MARK("V", "Първи чужд език - оценка"),         //21  
		SECOND_FOREIGN_LANG("W", "Втори чужд език"),  						   //22
		SECOND_FOREIGN_LANG_EXAM_MARK("X", "Втори чужд език - оценка"), 	   //23
		MATHS_EXAM_MARK("Y", "Математика"),  								   //24
		INFORMATICS_EXAM_MARK("Z", "Информатика"), 							   //25
		INFO_TECHNOLOGIES_EXAM_MARK("AA","Информационни технологии"), 		   //26
		HISTORY_CIVILIZATION_EXAM_MARK("AB","История и цивилизация"), 		   //27
		GEOGRAPHY_ECONOMICS_EXAM_MARK("AC","География и икономика"),		   //28
		PSYHOLOGY_LOGIC_EXAM_MARK("AD","Психология и логика"), 				   //29
		LAW_ORDER_EXAM_MARK("AE","Етика и право"),   						   //30
		PHILOSOPHY_EXAM_MARK("AF","Философия"),   							   //31
		WORLD_PERSON_EXAM_MARK("AG","Свят и личност"),  					   //32
		BILOGY_EXAM_MARK("AH","Биология"),   								   //33
		PHYSICS_ASTRONOMY_EXAM_MARK("AI","Физика и астрономия"), 			   //34
		CHEMISTRY_EXAM_MARK("AJ","Химия"), 									   //35
		MUSIC_EXAM_MARK("AK","Mузика"),   									   //36
		ARTS_EXAM_MARK("AL","Изобразително изкуство"),  					   //37
		PHYSICAL_EDUCATION_EXAM_MARK("AM","Физическо възпитание и спорт"),     //38
		AN("AN","AN"),    													   //39
		AO("AO","AN"),    													   //40
		AP("AP","AN"),    													   //41
		AQ("AQ","AQ"),    													   //42
		AR("AR","AR"),    													   //43
		AS("AS","AS"),    													   //44
		AT("AT","AT"),    													   //45
		AU("AU","AU"),    													   //46
		AV("AV","AV"),    												       //47
		AW("AW","AW"),    													   //48
		AX("AX","AX"),    													   //49
		AY("AY","AY"),    													   //50
		AZ("AZ","AZ");    													   //51
    	
    	private String key;
    	private String description;
    	
    	
    	MON_FIELD_KEYS(String key, String description){
    		this.key = key;
    		this.description = description;
    	}
    	
    };
    
    
  
	//constructor
	private MonStudentHighSchoolDiplomaData(long ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException{
		initMap();
		if(xmlStructure == null)xmlStructure = XmlSerialize.objectToXml(new XmlMapperMonStudentHighSchoolDiplomaData(map));
		xml = CallMonServices.getStudentForDiplomaEx(ein);
		student = XmlSerialize.xmlToObject(xml, XmlMapperMonStudentHighSchoolDiplomaData.class);
		loadMap();
		//XmlParser.parse(xml, "student", new  XmlParserMonCallback(map));
	}
	
	public static IMonStudentHighSchoolDiplomaData getStudentHighSchoolDiplomaData(long ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException{
		return new MonStudentHighSchoolDiplomaData(ein);
	}
	
	private void initMap(){
		MON_FIELD_KEYS [] arr = MON_FIELD_KEYS.values();
		for(MON_FIELD_KEYS key: arr) map.put(key.key, new ValueDescription(null, key.description));
	}

	public boolean isValidData() {
		// TODO Auto-generated method stub
		return getEin() != null;
	}

	public String getEinFromQuery() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.EIN_FROM_REQUEST.key).value;
	}

	public String getEin() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.EIN.key).value;
	}

	public String getSchoolCode() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.SCHOOL_CODE.key).value;
	}

	public String getSchoolName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.SCHOOL_NAME.key).value;
	}

	public String getSchoolCityName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.SCHOOL_CITY.key).value;
	}

	public String getSchoolProvinceName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.SCHOOL_PROVINCE.key).value;
	}

	public String getSchoolKind() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.SCHOOL_KIND.key).value;
	}

	public String getStudentFirstName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.STUDENT_NAME.key).value;
	}

	public String getStudentMidName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.STUDENT_MIDNAME.key).value;
	}

	public String getStudentSirname() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.STUDENT_SIRNAME.key).value;
	}

	public KIND_DOC getKindDocument() {
		// TODO Auto-generated method stub
		return KIND_DOC.getKindDoc(map.get(MON_FIELD_KEYS.KIND_DOC.key).value);
	}

	public long getGraduateYear() {
		// TODO Auto-generated method stub
		return Long.valueOf(map.get(MON_FIELD_KEYS.GRAD_YEAR.key).value);
	}

	public String getProfile() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.PROFILE.key).value;
	}

	public BigDecimal getDiplomaAvgMark() {
		// TODO Auto-generated method stub
		return stringToBigDecimal(map.get(MON_FIELD_KEYS.DIPLOMA_AVG_MARK.key).value);
	}

	public String getDiplomaSerie() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.DIPLOMA_SERIE.key).value;
	}

	public String getDiplomaNumber() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.DIPLOMA_NUMBER.key).value;
	}

	public BigDecimal getFirstStateExamMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.STATE_EXAM_MARK.key).value);
	}

	public String getSeconStateExamSubjectName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.SECOND_STATE_EXAM.key).value;
	}

	public BigDecimal getSeconStateExamMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.SECOND_STATE_EXAM_MARK.key).value);
	}

	public BigDecimal getBgLiteratureMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.BG_LITERATURE_EXAM_MARK.key).value);
	}

	public String getFirstForeignLang() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.FIRST_FOREIGN_LANG.key).value;
	}

	public BigDecimal getFirstForeignLangMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.FIRST_FOREIGN_LANG_EXAM_MARK.key).value);
	}

	public String getSecondForeignLang() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.SECOND_FOREIGN_LANG.key).value;
	}

	public BigDecimal getSecondForeignLangMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.SECOND_FOREIGN_LANG_EXAM_MARK.key).value);
	}

	public BigDecimal getMathMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.MATHS_EXAM_MARK.key).value);
	}

	public BigDecimal getInformaticsMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.INFORMATICS_EXAM_MARK.key).value);
	}

	public BigDecimal getInformationTechnologiesMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.INFO_TECHNOLOGIES_EXAM_MARK.key).value);
	}

	public BigDecimal getHistoryAndCivilizationMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.HISTORY_CIVILIZATION_EXAM_MARK.key).value);
	}

	public BigDecimal getGeographyAndEconomyMark() {
		// TODO Auto-generated method stub
		return stringToBigDecimal(map.get(MON_FIELD_KEYS.GEOGRAPHY_ECONOMICS_EXAM_MARK.key).value);
	}

	public BigDecimal getPsychologyAndLogicMark() {
		// TODO Auto-generated method stub
		return stringToBigDecimal(map.get(MON_FIELD_KEYS.PSYHOLOGY_LOGIC_EXAM_MARK.key).value);
	}

	public BigDecimal getEthicsAndLawMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.LAW_ORDER_EXAM_MARK.key).value);
	}

	public BigDecimal getPhilosophyMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.PHILOSOPHY_EXAM_MARK.key).value);
	}

	public BigDecimal getWorldAndPersonMark() {
		// TODO Auto-generated method stub
		return  stringToBigDecimal(map.get(MON_FIELD_KEYS.WORLD_PERSON_EXAM_MARK.key).value);
	}

	public BigDecimal getBiologyMark() {
		// TODO Auto-generated method stub
		return stringToBigDecimal( map.get(MON_FIELD_KEYS.BILOGY_EXAM_MARK.key).value);
	}

	public BigDecimal getPhysicsMark() {
		// TODO Auto-generated method stub
		return stringToBigDecimal( map.get(MON_FIELD_KEYS.PHYSICS_ASTRONOMY_EXAM_MARK.key).value);
	}

	public BigDecimal getChemistryMark() {
		// TODO Auto-generated method stub
		return stringToBigDecimal( map.get(MON_FIELD_KEYS.CHEMISTRY_EXAM_MARK.key).value);
	}

	public BigDecimal getMusicMark() {
		// TODO Auto-generated method stub
		return stringToBigDecimal( map.get(MON_FIELD_KEYS.MUSIC_EXAM_MARK.key).value);
	}

	public BigDecimal getArtsMark() {
		// TODO Auto-generated method stub
		return stringToBigDecimal(  map.get(MON_FIELD_KEYS.ARTS_EXAM_MARK.key).value);
	}

	public BigDecimal getPhysicalEducationMark() {
		// TODO Auto-generated method stub
		return stringToBigDecimal(map.get(MON_FIELD_KEYS.PHYSICAL_EDUCATION_EXAM_MARK.key).value);
	}
	
	private static BigDecimal stringToBigDecimal(String st){
		return BigDecimal.valueOf(Double.valueOf(st.replace(",", ".")));
	}
	
	public String getXml() {
		return xml;
	}
	
	
	public ValueDescription getValueDescriptionBykey(String key){
		return map.get(key);
	}

	private void loadMap(){
	    ValueDescription entry = null;
	    entry = map.get("A");
		entry.setValue(student.getA());
		entry = map.get("B");
		entry.setValue(student.getB());
		entry = map.get("C");
		entry.setValue(student.getC());
		entry = map.get("D");
		entry.setValue(student.getD());
		entry = map.get("E");
		entry.setValue(student.getE());
		entry = map.get("F");
		entry.setValue(student.getF());
		entry = map.get("G");
		entry.setValue(student.getG());
		entry = map.get("H");
		entry.setValue(student.getH());
		entry = map.get("I");
		entry.setValue(student.getI());
		entry = map.get("J");
		entry.setValue(student.getJ());
		entry = map.get("K");
		entry.setValue(student.getK());
		entry = map.get("L");
		entry.setValue(student.getL());
		entry = map.get("M");
		entry.setValue(student.getM());
		entry = map.get("N");
		entry.setValue(student.getN());
		entry = map.get("O");
		entry.setValue(student.getO());
		entry = map.get("P");
		entry.setValue(student.getP());
		entry = map.get("Q");
		entry.setValue(student.getQ());
		entry = map.get("R");
		entry.setValue(student.getR());
		entry = map.get("S");
		entry.setValue(student.getS());
		entry = map.get("T");
		entry.setValue(student.getT());
		entry = map.get("U");
		entry.setValue(student.getU());
		entry = map.get("V");
		entry.setValue(student.getV());
		entry = map.get("W");
		entry.setValue(student.getW());
		entry = map.get("X");
		entry.setValue(student.getX());
		entry = map.get("Y");
		entry.setValue(student.getY());
		entry = map.get("Z");
		entry.setValue(student.getZ());
		entry = map.get("AA");
		entry.setValue(student.getAA());
		entry = map.get("AB");
		entry.setValue(student.getAB());
		entry = map.get("AC");
		entry.setValue(student.getAC());
		entry = map.get("AD");
		entry.setValue(student.getAD());
		entry = map.get("AE");
		entry.setValue(student.getAE());
		entry = map.get("AF");
		entry.setValue(student.getAF());
		entry = map.get("AG");
		entry.setValue(student.getAG());
		entry = map.get("AH");
		entry.setValue(student.getAH());
		entry = map.get("AI");
		entry.setValue(student.getAI());
		entry = map.get("AJ");
		entry.setValue(student.getAJ());
		entry = map.get("AK");
		entry.setValue(student.getAK());
		entry = map.get("AL");
		entry.setValue(student.getAL());
		entry = map.get("AM");
		entry.setValue(student.getAM());
		entry = map.get("AN");
		entry.setValue(student.getAN());
		entry = map.get("AO");
		entry.setValue(student.getAO());
		entry = map.get("AP");
		entry.setValue(student.getAP());
		entry = map.get("AQ");
		entry.setValue(student.getAQ());
		entry = map.get("AR");
		entry.setValue(student.getAR());
		entry = map.get("AS");
		entry.setValue(student.getAS());
		entry = map.get("AT");
		entry.setValue(student.getAT());
		entry = map.get("AU");
		entry.setValue(student.getAU());
		entry = map.get("AV");
		entry.setValue(student.getAV());
		entry = map.get("AW");
		entry.setValue(student.getAW());
		entry = map.get("AX");
		entry.setValue(student.getAX());
		entry = map.get("AY");
		entry.setValue(student.getAY());
		entry = map.get("AZ");
		entry.setValue(student.getAZ());
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(!isValidData()) return "Data for the student is not valid or is not full...";
		String res = "";
		MON_FIELD_KEYS en []  = MON_FIELD_KEYS.values();
		for(MON_FIELD_KEYS v:en){
			ValueDescription vd =  map.get(v.key);
			res +=vd.desccription + ":"+ vd.value +   ", xmlkey - " + v.key+ "\n";
		}
		return res;
	}

	public String getXmlStructure() {
		// TODO Auto-generated method stub
		return xmlStructure;
	}
	
	
	  //the parser of the xml string & filling MonStudentHighSchoolDiplomaData structure
	  /* private class XmlParserMonCallback implements IXmlParserCallback {
	    	private HashMap<String, ValueDescription> resultMap;
	    	
	    	public XmlParserMonCallback(HashMap<String, ValueDescription> resultMap){
	    		this.resultMap = resultMap;
	    	}

	    	public void OnForward(Node node) {
	    		// TODO Auto-generated method stub
	    	}

	    	public void OnReturn(Node node) {
	    		// TODO Auto-generated method stub
	    		//System.out.println("node name: " + node.getNodeName() + " type: " + node.getNodeType() + " value " + node.getNodeValue() );
	    		Node parent = node.getParentNode();
	    		if(parent!=null 
	    				&& node.getNodeType() == Node.TEXT_NODE 
	    				&& node.getNodeValue() != null 
	    				&& !node.getNodeValue().trim().equals("")  
	    				&& parent.getNodeName()!= null ){
	    		  if(resultMap.containsKey(parent.getNodeName())){
	    			  resultMap.get(parent.getNodeName()).setValue(node.getNodeValue());
	    		  }
	    		}
	    	}
	    }*/
		

}
