package net.is_bg.mon.wsclient.studentdata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

class XmlMapperMonStudentImageData {

	private List<String> images = new ArrayList<String>();
	{
		images.add("image1");
		images.add("image2");
	}
	
	
	@XmlElement(name="image")
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
}
