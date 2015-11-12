package net.is_bg.mon.wsclient.studentdata;

import javax.xml.bind.annotation.XmlElement;

import net.is_bg.mon.wsclient.studentdata.XmlMapperMonBachelorImageData;

class XmlMapperMonBachelorF {
	
	private XmlMapperMonBachelorImageData image = new  XmlMapperMonBachelorImageData();

	@XmlElement(name="image")
	public XmlMapperMonBachelorImageData getImage() {
		return image;
	}

	public void setImage(XmlMapperMonBachelorImageData image) {
		this.image = image;
	}
	
}
