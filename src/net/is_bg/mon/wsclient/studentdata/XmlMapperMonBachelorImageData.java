package net.is_bg.mon.wsclient.studentdata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

class XmlMapperMonBachelorImageData {

	private List<String> images = new ArrayList<String>();
	private String imageType = "PDF";
	{
		images.add("image1");
		images.add("image2");
	}
	
	
	@XmlElement(name="image_data")
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	@XmlElement(name="image_type")
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imagaType) {
		this.imageType = imagaType;
	}
}
