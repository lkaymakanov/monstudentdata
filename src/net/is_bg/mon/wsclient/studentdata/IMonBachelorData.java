package net.is_bg.mon.wsclient.studentdata;

import java.util.List;

/**
 * Interface representing Bachelor data from MON WS siutable for process!!!
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
 *
 */
public interface IMonBachelorData extends IMonStudentCommon {
	
	boolean isValidData();
	
	/***
	 * QUERY - Query idn!!!
	 * @return
	 */
	String getQuery();
	
	/**
	 *  A Вътрешен идентификационен номер
	 * @return
	 */
	String getInCode();
	
	/**
	 * B Код на университета издал дипломата
	 * @return
	 */
	String getUniCode();
	
	/***
	 * C Наименование на университета издал дипломата
	 */
	String getUniName();
	
	/**
	 * D Имена на студента
	 */
	String getStudentName();
	
	/**
	 *E ЕГН на студента
	 */
	String getIdn();
	
	/**
	 * F ЛИН на студента (ако има)
	 * @return
	 */
	String getLin();
	
	/***
	 * G ОКС
	 */
	String getOks();
	
	/***
	 * H Наименование на област на образование
	 */
	String getProvinceName();
	
	/**
	 * I Наименование на ПН (професионално направление)
	 */
	String getDirectionName();
	
	/**
	 * J Наименование на специалността
	 */
	String getSpecialityName();
	
	/**
	 * K Код на типа документ
	 */
	String getDocCode();
	
	
	/**
	 * L Наименование на издадения документ
	 */
	String getDocName();
	
	
	/**
	 * M Булево поле – 0 документът е оригинал, 1 – документът е дубликат
	 */
	boolean isOriginalal();
	

	/***
	 * Images for diploma!!!
	 * @return
	 */
	public List<MonImage> getImages();
}
