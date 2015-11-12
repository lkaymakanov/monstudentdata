package net.is_bg.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public  class FileHandleStreams{
	public static FileInputStream getFileInStream(FileHandle fh){
		try {
			return new FileInputStream(new File(fh.fullFileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw  new RuntimeException(e);
		}
	}
	
	public static FileOutputStream getFileOutStream(FileHandle fh ,boolean append) {
		try {
			return new FileOutputStream(new File(fh.fullFileName), append);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw  new RuntimeException(e);
		}
	}

	public static FileReader getFileReader(FileHandle fh) {
		try {
			return new FileReader(new File(fh.fullFileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw  new RuntimeException(e);
		}
	}

	public static FileWriter getFileWriter(FileHandle fh) {
		try {
			return new FileWriter(new File(fh.fullFileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw  new RuntimeException(e);

		}
	}

	public static BufferedReader getbFileReader(FileHandle fh) {
		return  new BufferedReader(getFileReader(fh));
	}

	public static BufferedWriter getbFileWriter(FileHandle fh) {
		return  new BufferedWriter(getFileWriter(fh));
	}

	public static PrintWriter getpWriter(FileHandle fh, boolean append) {
		return new PrintWriter(getFileOutStream(fh, append));
	}
	
	
	public static ObjectOutputStream getObjectOutStream(FileHandle fh, boolean append) {
		try {
			return new ObjectOutputStream(getFileOutStream(fh, append));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw  new RuntimeException(e);
		}
	}
}
