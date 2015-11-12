package net.is_bg.mon.wsclient.studentdata;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
class XmlMapperMonBachelorAdminRheData {

	private XmlMapperMonBachelorAdminRhe bachelor = new  XmlMapperMonBachelorAdminRhe();

	@XmlElement(name="student")
	public XmlMapperMonBachelorAdminRhe getBachelor() {
		return bachelor;
	}

	public void setBachelor(XmlMapperMonBachelorAdminRhe bachelor) {
		this.bachelor = bachelor;
	}
}
