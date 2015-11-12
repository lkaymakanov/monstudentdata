package net.is_bg.mon.wsclient.studentdata;

public interface IMonStudentCommon {

	/**
	 * The xml restult after calling service
	 * @return
	 */
	public String getXml();
	
	/***
	 * Returns the structure of the corresponding XML file!
	 * @return
	 */
	public String getXmlStructure();
	
	public ValueDescription getValueDescriptionBykey(String key);
}
