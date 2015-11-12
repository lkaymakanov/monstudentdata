package net.is_bg.mon.wsclient.studentdata;


/**
 * Represents the byte array of the raw images data received from MON webservice + file extension if any!!!
 * @author lubo
 *
 */
public class MonImage {
	byte [] fileData;
	String  fileExtension = "jpeg";
	
	public byte[] getFileData() {
		return fileData;
	}
	public String getFileExtension() {
		return fileExtension;
	}
	
}
