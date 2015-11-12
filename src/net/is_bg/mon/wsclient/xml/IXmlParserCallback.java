package net.is_bg.mon.wsclient.xml;

import org.w3c.dom.Node;

public interface IXmlParserCallback {

	public void OnForward(Node node);
		
	public void OnReturn(Node node);
}
