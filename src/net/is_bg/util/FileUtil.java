package net.is_bg.util;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


public final class FileUtil {

	
	public static void textFileExporter(List<String> list, String path, String filename, 
			String charsetName) throws FileNotFoundException, UnsupportedEncodingException {
		File f = new File(path, filename);
    	FileOutputStream os = new FileOutputStream(f);
    	OutputStreamWriter osw = new OutputStreamWriter(os, charsetName);
    	//BufferedWriter out = new BufferedWriter(osw);

    	try {
	    	for (int i = 0; i < list.size(); i++) {
					osw.write(list.get(i));
					//System.out.println(list.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					osw.flush();
					osw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
		}
	}
	


	public static List<String> strToList(String str) throws IOException{
	    String[] s = str.split("\r\n");
	    List<String> list = new ArrayList<String>();
		try {
		   for (int i = 0; i < s.length; i++) {
			 list.add(s[i] + "\r\n");  
		   }	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	/**
	 * Saves the file to disk!!!!
	 * @param fh
	 * @param data
	 */
	public static void saveFileToDisk(FileHandle fh, byte [] data){
		FileOutputStream fileOut = FileHandleStreams.getFileOutStream(fh, false);
	    try {
			fileOut.write(data, 0, data.length);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			try {
				fileOut.flush();
				fileOut.close();
			}catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
	
	
	
	/**
	 * Saves the file to disk!!!!
	 * @param fh
	 * @param data
	 */
	public static void saveFileToDisk(String fullFileName, byte [] data){
		saveFileToDisk(new FileHandle(fullFileName), data);
	}
	
	
	/***
	 * Delete a file from disk!!!
	 */
	public static void deleteFileFromDisk(FileHandle fh){
		 deleteFileFromDisk(fh.getFullFileName());
	}
	
	
	/***
	 * Delete a file from disk!!!
	 */
	public static void deleteFileFromDisk(String filePath){
		new File(filePath).delete();
	}
	
	
	
	/**
	 * Creates a directory in the base directory if it doesn't exists!!!!
	 * @param base  - path to the base directory !
	 * @param subdir - the name of the directory to be created !
	 */
	public static void createSubDir(String base, String subdir){
		try {
			new FileSaver(base, false, "").createFileDirectory(subdir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	
}


/***
 * Helper 
 * @author lubo
 *
 */
class FileSaver {
	
	protected String rootDirectory = "";
	private String rootDirhlp;
	private String FILE_EXT = ".txt";   //default is text
	private boolean bRelarivePath = true;
	String filePath = "";
	private String folderDelimiter = AppConstants.FOLDER_DELIMITER;
	
	//set the root directory to write in and whether it's absolute path or relative to executable
	public FileSaver(String rootDirPath, boolean brelativePath, String ext){
		this(ext);
		rootDirectory = rootDirPath;
		rootDirhlp = rootDirectory;
		this.bRelarivePath = brelativePath;
	}
	
	//sets file extension
	public FileSaver(String ext){
		if(ext != null)
		FILE_EXT = ext;
		rootDirhlp = rootDirectory;
	}
	
   //create the directory for model
	protected void createDirInRootDir(String dirName) throws IOException{
		if(dirName == null || dirName.equals("")) return;
		
		//do some log here
		/*System.out.println("Entered in create Root Dir ....");
		System.out.println("Dir Name = " + dirName);*/
		
		int ind = dirName.indexOf(folderDelimiter);
		if(ind == -1){  //path found 
			createSubDir(rootDirhlp, dirName);  //create last directory
			rootDirhlp += folderDelimiter + dirName;      //extend path
			return;
		}		
		createSubDir(rootDirhlp, dirName.substring(0, ind));
		rootDirhlp += folderDelimiter + dirName.substring(0, ind);     //extend path
		
		createDirInRootDir(dirName.substring(ind+1));       //call recursively
	}
	
	//create subDir in base path
	private void createSubDir(String basedir, String subdir) throws IOException{
		//do some log here
		/*System.out.println("Entered in createSubDir ....");
		System.out.println("basedir Name = " + basedir);
		System.out.println("subdir Name = " + subdir);
		*/
		File directory = new File (".");
		
		if(bRelarivePath == true){
			//relative path to executable folder
			filePath = directory.getCanonicalPath() + basedir + folderDelimiter + subdir.toLowerCase();
		}else{
			 //absolute path
			filePath = basedir + folderDelimiter + subdir.toLowerCase();
		}
		File f = new File(filePath);
		if(!f.exists()) f.mkdir();
	}
	

	
	//create the file to write in
	protected FileHandle createFileInDir(String filename, boolean append) throws IOException{
		
		if(filePath == null || filePath.equals(""))  filePath =new File (".").getCanonicalPath();
		//do some log here
		
		System.out.println("Entered in createFileInDir ....");
		System.out.println("filedirectory Name = " + filePath);
		System.out.println("filename Name = " + filename);

		
		FileHandle fh = new FileHandle(filePath + folderDelimiter + filename + FILE_EXT);
		return fh;
	}
	
	
	
	public FileHandle getHandleToFile(String subdir, String filename, boolean append){
		try
		{
			rootDirhlp = rootDirectory;
			if(subdir != null) createDirInRootDir(subdir);
			
			//get FIlehandle
			return  createFileInDir(filename, append);
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	/***
	 * creates a subdirectory in root directory & return the path to the file directory!!!
	 * @return
	 * @throws IOException 
	 */
	public String createFileDirectory(String subdir) throws IOException{
		rootDirhlp = rootDirectory;
		createDirInRootDir(subdir);
		return rootDirhlp;
	}
	
	
	
	//saves files 
	 /**Saves Object 'obTosave' to the file with file name 'filename' 
	 * located in the sub directory to  root directory specified 
	 * in FileSaver constructor. if append is true add content to file otherwise overwrite content.
	 */
	public void save(String subdir, String filename, Object obTosave, boolean append){
		try {
			rootDirhlp = rootDirectory;
			if(subdir != null) createDirInRootDir(subdir);
			
			if(obTosave == null) return ;
			//save to file
			FileHandle fh = createFileInDir(filename, append);
			
			if(obTosave instanceof String){  //save as string
				//PrintWriter pr =  fh.getpWriter(true);
				//pr.write((String)obTosave);
				//pr.flush();
			}else{//save object to stream
				//ObjectOutputStream wr =  fh.getObjectOutStream(true);
				//wr.writeObject(obTosave);
				//wr.flush();
			}			
			//fh.release();
				
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}

