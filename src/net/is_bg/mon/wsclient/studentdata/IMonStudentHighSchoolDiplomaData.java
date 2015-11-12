package net.is_bg.mon.wsclient.studentdata;

import java.math.BigDecimal;


/**
 * Interface representing data from MON Ws for high school diploma!
 * @author lubo
 *
 */
public interface IMonStudentHighSchoolDiplomaData extends IMonStudentCommon {
	
	
	public enum KIND_DOC{
		DOC_NOT_VALID,
		DOC_35,
		DOC_25,
		DOC_60,
		DOC_61,
		DOC_50,
		DOC_51,
		DOC_1,
		DOC_2,
		DOC_3;
		
		public static KIND_DOC getKindDoc(String code){
			if(code == null) return null;
			if(code.equals("35")) return DOC_35;
			if(code.equals("25")) return DOC_25;
			if(code.equals("60")) return DOC_60;
			if(code.equals("61")) return DOC_61;
			if(code.equals("50")) return DOC_50;
			if(code.equals("51")) return DOC_51;
			if(code.equals("1")) return DOC_1;
			if(code.equals("2")) return DOC_2;
			if(code.equals("3")) return DOC_3;
			return null;
		}
	}
	
	
	/**
	 * True if data is valid, otherwise false
	 * @return
	 */
	public boolean isValidData();
	
	
	/**
	 * Егн на ученика от входната заявка!
	 * A
	 * @return
	 */
	public String getEinFromQuery();

	/**
	 * Егн на ученика! B
	 * @return
	 */
	public String getEin();
	
	
	/**
	 * Код на училището, в което е завършено средното образование по стандарта на МОН! C
	 * @return
	 */
	public String getSchoolCode();
	
	
	/**
	 * Наименование на училището, в което е завършено средното образование! D
	 * @return
	 */
	public String getSchoolName();
	
	
	/**
	 * Населено място на училището, в което е завършено средното образование! E
	 * @return
	 */
	public String getSchoolCityName();
	
	
	/**
	 * Област на училището, в което е завършено средното образование! F
	 * @return
	 */
	public String getSchoolProvinceName();
	
	/**
	 * Вид на училището, в което е завършено средното образование (общообразователно, професионално, специално или по изкуствата)! G
	 * @return
	 */
	public String getSchoolKind();
	
	/**
	 * Име на ученика! H
	 * @return
	 */
	public String getStudentFirstName();
	
	/**
	 * Презиме на ученика! I
	 * @return
	 */
	public String getStudentMidName();
	
	/**
	 * Фамилия на ученика! J
	 * @return
	 */
	public String getStudentSirname();
	
	
	/**
	 * Вид на документа за завършено средно образование! К
	 * @return
	 */
	public KIND_DOC getKindDocument();
	
	
	/**
	 * Година на завършване на средното образование! L
	 * @return
	 */
	public long getGraduateYear();
	
	
	/**
	 * Вид на паралелката, в която  ученикът е завършил средното ! M
	 * @return
	 */
	public String getProfile();
	
	
	/**
	 * Среден успех от дипломата за средно образование ! N
	 * @return
	 */
	public BigDecimal getDiplomaAvgMark();
	
	
	/**
	 * Серия на дипломата за средно ! О
	 * @return
	 */
	public String getDiplomaSerie();
	
	
	/**
	 * Номер на дипломата! P
	 * @return
	 */
	public String getDiplomaNumber(); 
	
	//get marks
	
	//=================== only docs 35, 60, 61
	
	/**
	 * Първи държавен изпит (Бг и литература) оценка  !  Q
	 * @return
	 */
	public BigDecimal  getFirstStateExamMark();
	
	/**
	 * Втори държавен изпит предмет ! R
	 * @return
	 */
	public String  getSeconStateExamSubjectName();  
	
	/**
	 * Втори държавен изпит - оценка! S
	 * @return
	 */
	public BigDecimal  getSeconStateExamMark();  
	
	//==================== only docs 35, 60, 61
	
	
	//============= compulsory preparation - ocenki ot zadylhitelna podgotovka
	/**
	 * Български език и литература ! Т 
	 * @return
	 */
	public BigDecimal getBgLiteratureMark();
	
	/**
	 * Първи чужд език име ! U
	 * @return
	 */
	public String getFirstForeignLang();
	
	/**
	 * Първи чужд език - оценка! V
	 * @return
	 */
	public BigDecimal getFirstForeignLangMark();
	
	/**
	 * Втрори чужд език име ! W
	 * @return
	 */
	public String getSecondForeignLang();
	
	/**
	 * Втори чужд език оценка X
	 * @return
	 */
	public BigDecimal getSecondForeignLangMark();
	
	/**
	 * Математика! Y
	 * @return
	 */
	public BigDecimal getMathMark();
	
	/**
	 * информатика! Z
	 * @return
	 */
	public BigDecimal getInformaticsMark();
	
	
	/**
	 * Информационни технологии! AA
	 * @return
	 */
	public BigDecimal getInformationTechnologiesMark();
	
	
	/**
	 * История и цивилизация! AB
	 * @return
	 */
	public BigDecimal getHistoryAndCivilizationMark();
	
	/**
	 * География и икономика! AC
	 * @return
	 */
	public BigDecimal getGeographyAndEconomyMark();
	
	/**
	 * Психология и логика! AD
	 * @return
	 */
	public BigDecimal getPsychologyAndLogicMark();
	
	/**
	 * Етика и право ! AE
	 * @return
	 */
	public BigDecimal getEthicsAndLawMark();
	
	/**
	 * Философия!  AF
	 * @return
	 */
	public BigDecimal getPhilosophyMark();
	
	/**
	 * Свят и личност! AG
	 * @return
	 */
	public BigDecimal getWorldAndPersonMark();
	
	/**
	 * Биология ! AH
	 * @return
	 */
	public BigDecimal getBiologyMark();
	
	/**
	 * Физика и астрономия! AI
	 * @return
	 */
	public BigDecimal getPhysicsMark();
	
	/**
	 *Химия!  AJ
	 * @return
	 */
	public BigDecimal getChemistryMark();
	
	/**
	 * Mузика! AK
	 * @return
	 */
	public BigDecimal getMusicMark();
	 
	/**Изобразително изкуство! AL
	 * @return
	 */
	public BigDecimal getArtsMark();
	
	/**
	 * Физическо възпитание и спорт! AM
	 * @return
	 */
	public BigDecimal getPhysicalEducationMark();
	
	
	//=============end of compulsory preparation - ocenki ot zadylhitelna podgotovka

}
