package net.is_bg.util;




/***
 * Represents a file path & name!!!
 * @author lubo
 *
 */
public class FileHandle {
	String filename = "";
	String filePath = "";
	String fullFileName = "";
	//============================ constructors ====================================
	public FileHandle(String fullFileName){
	    this.fullFileName = fullFileName;
	}
	
	public FileHandle(String filePath, String fileName){
    	this.filePath = filePath;
    	this.filename = fileName;
    	this.fullFileName = filePath + AppConstants.FOLDER_DELIMITER + filename; 
	}
	//============================end of constructors ================================
	
	public static void main(String [] arg){
		FileHandle h = new FileHandle("D:\\mytext.txt");
		//h.getbFileReader();
		FileHandleStreams.getFileWriter(h);
		//h.getFileInStream();
	}

	public String getFilePath() {
		return filePath;
	}

	public String getFullFileName() {
		return fullFileName;
	}
	
	
}
