package net.is_bg.mon.wsclient.studentdata;

import java.util.List;



/**
 * Interface representing images for student high school diploma!!!
 * @author lubo
 *
 */
public interface IMonStudentHighSchoolImagesData extends IMonStudentCommon {

	/**
	 * True if data is valid, otherwise false
	 * @return
	 */
	public boolean isValidData();
	
	
	/**
	 * Егн на ученика от входната заявка!  QUERY
	 * @return
	 */
	public String getQuery();

	/**
	 * Егн на ученика! A
	 * @return
	 */
	public String getEin();
	
	
	/**
	 * Егн на ученика! B
	 * @return
	 */
	public String getVclNumberText();
	
	/**
	 * Име на ученика! C
	 * @return
	 */
	public String getStudentFirstName();
	
	/**
	 * Презиме на ученика! D
	 * @return
	 */
	public String getStudentMidName();
	
	/**
	 * Фамилия на ученика! E
	 * @return
	 */
	public String getStudentSirname();
	
	
	/**
	 * Код на училището, в което е завършено средното образование по стандарта на МОН! F
	 * @return
	 */
	public String getSchoolCode();
	
	
	/**
	 * Наименование на училището, в което е завършено средното образование! G
	 * @return
	 */
	public String getSchoolName();
	
	
	/**
	 * EKATTE! H
	 */
	public String getProvinceCode();
	
	
	/***
	 * intDocId! I
	 * @return
	 */
	public String getDocId();
	
	
	/**
	 * Година на завършване на средното образование! J
	 * @return
	 */
	public long getGraduateYear();
	
	
	/**
	 * Images for diploma!!!! K
	 * @return
	 */
	public List<MonImage> getImages();
	
}
