package net.is_bg.mon.wsclient.studentdata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import net.is_bg.mon.wsclient.CallMonServices;
import net.is_bg.mon.wsclient.xml.XmlSerialize;
import net.is_bg.util.StringUtils;

class MonBachelorData implements IMonBachelorData{
	
	private String xml;
	private static String xmlStructure;
	private XmlMapperMonBachelorAdminRheData bachelorData;
	private List<MonImage> images = new ArrayList<MonImage>();
	private HashMap<String, ValueDescription> map = new HashMap<String, ValueDescription>();
	
	/***
     * The keys of fields on MON xml result Structure for bachelor diploma!!!
     * @author lubo
     * A Вътрешен идентификационен номер
 B Код на университета издал дипломата
 C Наименование на университета издал дипломата
D Имена на студента
E ЕГН на студента
F ЛИН на студента (ако има)
G ОКС
H Наименование на област на образование
I Наименование на ПН (професионално направление)
J Наименование на специалността
K Код на типа документ
L Наименование на издадения документ
M Булево поле – 0 документът е оригинал, 1 – документът е дубликат
 * @author lubo
     */
    enum MON_FIELD_KEYS{
    	QUERY("QUERY", ""),
    	IN_CODE("A", "Вътрешен идентификационен номер"),  					   //0
		UNI_CODE("B", "Код на университета издал дипломата"),  				   //1
		UNI_NAME("C", "Наименование на университета издал дипломата"),  	   //2
		STUDENT_NAME("D", "Имена на студента"),  					           //3
		IDN("E", "ЕГН на студента"),  					   					   //4
		LIN("F", " ЛИН на студента (ако има)"),   						   	   //5
		OKS("G", "ОКС"),   							   						   //6
		PROVINCE_NAME("H", "Наименование на област на образование"),           //7
		DIRECTION_NAME("I", "Наименование на ПН (професионално направление)"), //8
		SPECIALITY_NAME("J", "Наименование на специалността"),                 //9
		DOC_CODE("K", "Код на типа документ"),      						   //10
		DOC_NAME("L", "Наименование на издадения документе"),								   //11
		ORIGINAL("M", "Булево поле – 0 документът е оригинал, 1 – документът е дубликат");     							   //12
    	
    	private String key;
    	private String description;
    	
    	MON_FIELD_KEYS(String key, String description){
    		this.key = key;
    		this.description = description;
    	}
    };
    
	
	
	private MonBachelorData(String ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException{
		xmlStructure = "";
		initMap();
		xml = CallMonServices.getStudentDataFromLIN_AdminRHE(ein);
		bachelorData = XmlSerialize.xmlToObject(xml, XmlMapperMonBachelorAdminRheData.class);
		loadMap();
		loadImages();
	}
	
	private MonBachelorData(long ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException{
		xmlStructure = "";
		initMap();
		xml = CallMonServices.getStudentDataFromAdminRHE(ein);
		bachelorData = XmlSerialize.xmlToObject(xml, XmlMapperMonBachelorAdminRheData.class);
		loadMap();
		loadImages();
	}

	public static IMonBachelorData getMonBachelorDataAdminRHE(long ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException {
		// TODO Auto-generated method stub
		return new MonBachelorData(ein);
	}

	public static IMonBachelorData getMonBachelorDataLinAdminRHE(String ein) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, JAXBException {
		// TODO Auto-generated method stub
		return new MonBachelorData(ein);
	}
	
	private void initMap(){
		MON_FIELD_KEYS [] arr = MON_FIELD_KEYS.values();
		for(MON_FIELD_KEYS key: arr) map.put(key.key, new ValueDescription(null, key.description));
	}
	
	private void loadMap(){
		XmlMapperMonBachelorAdminRhe student = bachelorData.getBachelor();
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
		//entry = map.get("F");
		//entry.setValue(student.getF());
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
	}


	public String getXml() {
		// TODO Auto-generated method stub
		return xml;
	}
	
	private void loadImages(){
	    XmlMapperMonBachelorImageData idata = 	bachelorData.getBachelor().getF().getImage();
	    
		for(String base64Img: idata.getImages()){
			if(base64Img != null) {
				MonImage image = new MonImage();
				image.fileData = StringUtils.decodeBase64String(base64Img);
				image.fileExtension = idata.getImageType();
				images.add(image);
			}else{
				images.add(null);
			}
		}
		//clear images base64 strings
		idata.setImages(new ArrayList<String>());
	}
	
	

	public ValueDescription getValueDescriptionBykey(String key) {
		// TODO Auto-generated method stub
		return  map.get(key);
	}

	public String getXmlStructure() {
		// TODO Auto-generated method stub
		return xmlStructure;
	}

	public List<MonImage> getImages() {
		return images;
	}

	public String getQuery() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.QUERY.key).value;
	}

	public String getInCode() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.IN_CODE.key).value;
	}

	public String getUniCode() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.UNI_CODE.key).value;
	}

	public String getUniName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.UNI_NAME.key).value;
	}

	public String getStudentName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.STUDENT_NAME.key).value;
	}

	public String getIdn() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.IDN.key).value;
	}

	public String getLin() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.LIN.key).value;
	}

	public String getOks() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.OKS.key).value;
	}

	public String getProvinceName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.PROVINCE_NAME.key).value;
	}

	public String getDirectionName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.DIRECTION_NAME.key).value;
	}

	public String getSpecialityName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.SPECIALITY_NAME.key).value;
	}

	public String getDocCode() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.DOC_CODE.key).value;
	}

	public String getDocName() {
		// TODO Auto-generated method stub
		return map.get(MON_FIELD_KEYS.DOC_NAME.key).value;
	}

	public boolean isOriginalal() {
		// TODO Auto-generated method stub
		return false;
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

	public boolean isValidData() {
		// TODO Auto-generated method stub
		return true;
	}

}
