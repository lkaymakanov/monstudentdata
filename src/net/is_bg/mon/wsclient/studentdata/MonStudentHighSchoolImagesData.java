package net.is_bg.mon.wsclient.studentdata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import net.is_bg.mon.wsclient.CallMonServices;
import net.is_bg.mon.wsclient.xml.XmlSerialize;
import net.is_bg.util.StringUtils;

import org.xml.sax.SAXException;

class MonStudentHighSchoolImagesData  implements IMonStudentHighSchoolImagesData{
	
	private HashMap<String, ValueDescription> map  = new HashMap<String, ValueDescription>();
	private String xml;
	private static String xmlStructure = null;
	private List<MonImage> images = new ArrayList<MonImage>();
	private XmlMapperMonStudentHighSchoolImagesData student;
	
	   /***
     * The keys of fields on MON xml result Structure for student dimploma!!!
     * @author lubo
     *
     */
    private enum MON_FIELD_KEYS{
    	QUERY_EIN("QUERY", "Егн"),  					                       //0
		EIN("A", "Егн"),  						 							   //1
		EIN_B("B", "Егн"),  								   				   //2
		STUDENT_NAME("C", "Име"),  					  						   //3
		STUDENT_MIDNAME("D", "Презиме"),                					   //4
		STUDENT_SIRNAME("E", "Фамилия"),                					   //5
		SCHOOL_ID("F", "Идентификатор на училище"),							   //6
		SCHOOL_NAME("G", "Име на училище"),									   //7  
		ЕКАТТЕ("H", "EKATTE"), 												   //8
		DOC_ID("I", "Ид на документ"), 	   									   //9
		GRAD_YEAR("J", "Година на завършване");								   //10
		
    	private String key;
    	private String description;
    	
    	
    	MON_FIELD_KEYS(String key, String description){
    		this.key = key;
    		this.description = description;
    	}
    };
    
    
   
	
	
	private MonStudentHighSchoolImagesData(String ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException{
		initMap();
		if(xmlStructure == null)
		{
			XmlMapperMonStudentHighSchoolImagesData idata = new XmlMapperMonStudentHighSchoolImagesData();
			idata.setStudent(new XmlMapperMonHighSchoolImageStudent(map));
			xmlStructure = XmlSerialize.objectToXml(idata);
		}
		xml = CallMonServices.getStudentDataFromAdminRD(ein);
		student = XmlSerialize.xmlToObject(xml, XmlMapperMonStudentHighSchoolImagesData.class);
		loadMap();
		loadImages();
	}
	
	/***
	 * public static factory method to get images data for student!!!Expose only the interface!!!
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws JAXBException 
	 * @throws ClassNotFoundException 
	 */
	public static IMonStudentHighSchoolImagesData getStudentImagesData(String ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException{
		return new MonStudentHighSchoolImagesData(ein);
	}
	
	
	private void initMap(){
		MON_FIELD_KEYS [] arr = MON_FIELD_KEYS.values();
		for(MON_FIELD_KEYS key: arr) map.put(key.key, new ValueDescription(null, key.description));
	}


	public boolean isValidData() {
		// TODO Auto-generated method stub
		return true;
	}

	public String getQuery() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.QUERY_EIN.key).getValue();
	}

	public String getEin() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.EIN.key).getValue();
	}

	public String getVclNumberText() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.EIN_B.key).getValue();
	}

	public String getStudentFirstName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.STUDENT_NAME.key).getValue();
	}

	public String getStudentMidName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.STUDENT_MIDNAME.key).getValue();
	}

	public String getStudentSirname() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.STUDENT_SIRNAME.key).getValue();
	}

	public String getSchoolCode() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.SCHOOL_ID.key).getValue();
	}

	public String getSchoolName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.SCHOOL_NAME.key).getValue();
	}

	public String getProvinceCode() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.ЕКАТТЕ.key).getValue();
	}

	public String getDocId() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.DOC_ID.key).getValue();
	}

	public long getGraduateYear() {
		// TODO Auto-generated method stub
		return Long.valueOf(map.get(MON_FIELD_KEYS.GRAD_YEAR.key).getValue());
	}

	public List<MonImage> getImages() {
		// TODO Auto-generated method stub
		return images;
	}
	
	public String getXml(){
		return xml;
	}
	
	public ValueDescription getValueDescriptionBykey(String key){
		return map.get(key);
	}
	
	private void loadMap(){
		XmlMapperMonHighSchoolImageStudent students =  student.getStudent();
		ValueDescription entry = null;
		entry = map.get("QUERY");
		entry.setValue(students.getQUERY());
	    entry = map.get("A");
		entry.setValue(students.getA());
		entry = map.get("B");
		entry.setValue(students.getB());
		entry = map.get("C");
		entry.setValue(students.getC());
		entry = map.get("D");
		entry.setValue(students.getD());
		entry = map.get("E");
		entry.setValue(students.getE());
		entry = map.get("F");
		entry.setValue(students.getF());
		entry = map.get("G");
		entry.setValue(students.getG());
		entry = map.get("H");
		entry.setValue(students.getH());
		entry = map.get("I");
		entry.setValue(students.getI());
		entry = map.get("J");
		entry.setValue(students.getJ());
	}
	
	private void loadImages(){
		XmlMapperMonHighSchoolImageStudent students =  student.getStudent();
		for(String base64Img: students.getK().getImages()){
			if(base64Img != null) {
				MonImage image = new MonImage();
				image.fileData = StringUtils.decodeBase64String(base64Img);
				images.add(image);
			}else{
				images.add(null);
			}
		}
		//clear images base64 strings
		students.setK(new XmlMapperMonStudentImageData());
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
	
}
