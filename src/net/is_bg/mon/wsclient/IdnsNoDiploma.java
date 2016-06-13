package net.is_bg.mon.wsclient;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import net.is_bg.mon.wsclient.studentdata.IMonStudentHighSchoolDiplomaData;
import net.is_bg.mon.wsclient.studentdata.IMonStudentHighSchoolImagesData;
import net.is_bg.mon.wsclient.studentdata.MonImage;
import net.is_bg.mon.wsclient.studentdata.MonStudentFacade;
import net.is_bg.util.FileUtil;


public class IdnsNoDiploma {
/*	long [] arr = new long [] {
			434l
	};
	
	private String quote(String s, boolean addComma){
		return "'"+ AppUtil.COALESCE(s, "") + "'" + (addComma ? "," : "");
	}
	
	private String getInsertString(IMonStudentHighSchoolDiplomaData data){
		String sql = " insert into highschool_diploma  (a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p) values (";
		sql+=quote(data.getValueDescriptionBykey("A").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("B").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("C").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("D").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("E").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("F").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("G").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("H").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("I").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("J").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("K").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("L").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("M").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("N").getValue().replace(",", "."), true);
		sql+=quote(data.getValueDescriptionBykey("O").getValue(), true);
		sql+=quote(data.getValueDescriptionBykey("P").getValue(), false);
		return sql+")";
	}
	
	private void execute(String sql){
		System.err.println(sql);
		EntityManager em = AppUtil.getEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();
		if (!entityTransaction.isActive())
		    entityTransaction.begin();
		em.createNativeQuery(sql).executeUpdate();
		entityTransaction.commit();
		
	}*/
	
	
	public static void main(String [] args) throws ClassNotFoundException, JAXBException, IOException, ParserConfigurationException, SAXException{
		//long  studentEIN = 9610070451l;   // 9310292416l;//  9110111892l;
		//String stEinn = String.valueOf(studentEIN);
		
		String saveFilesDir = "C:\\test\\test\\no_diplomas\\";
		String saveFilesDirXmls = "C:\\test\\test\\xmls\\";
		
		String s = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+
		"<response>\n"+
	    "<student>\n"+
	        "<A>Aaaaaa</A>\n"+
	        "<B>Bbbbbb</B>\n"+
	    "</student>\n"+
	    "</response>\n";
		
		String DB_URL =  "jdbc:postgresql://10.240.110.89:5432/TrUniversity";
		String USER = "iuis";
		String PASSWORD = "iuis";
		
		//TestBean t = new TestBean();		
    	//AppUtil.initTestConnecton(DB_URL, USER, PASSWORD);
    	//System.out.println(new Sha512().digest("kp"));
		
		//init db
		String studentEIN = "00000000";// "9612026550";
		
		//System.out.println(XmlSerialize.objectToXml(new Response()));
		//Response r = XmlSerialize.xmlToObject(s, Response.class);
		//IdnsNoDiploma nod = new  IdnsNoDiploma();
		//for(long studentEIN : nod.arr)
		{
			try{
				List<IMonStudentHighSchoolImagesData> data =  MonStudentFacade.getStudentImagesData(studentEIN);
				System.out.println(data);
				//String sql = (nod.getInsertString(data));
				//nod.execute(sql);
				for(IMonStudentHighSchoolImagesData d: data){
					long incNo = d.getGraduateYear();
					
					int i = 1;
					for(MonImage img : d.getImages()){
						FileUtil.saveFileToDisk(saveFilesDir + studentEIN + "_"+ incNo + "_" + i + "_.jpeg", img.getFileData());
						i++;
					}
				}
				//FileUtil.saveFileToDisk(saveFilesDir + studentEIN + "_1.jpeg", data.getImages().get(0).getFileData());
				//FileUtil.saveFileToDisk(saveFilesDir + studentEIN + "_2.jpeg", data.getImages().get(1).getFileData());
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
