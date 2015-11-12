package net.is_bg.mon.wsclient.xml;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XmlParser {
	
	
	public static void parse(String xmlString, String rootNodeName, IXmlParserCallback callback) throws ParserConfigurationException, SAXException, IOException{
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xmlString));
        Document doc = builder.parse(is);
        
        NodeList nl = doc.getElementsByTagName(rootNodeName);
        for(int i=0; i < nl.getLength(); i++){
        	processNode(nl.item(i), callback);
        }
    }
	
	
    
    private static void processNode(Node currentNode, IXmlParserCallback callback){
    	if(currentNode == null || callback == null) return;
    	callback.OnForward(currentNode);
    	NodeList nl = currentNode.getChildNodes();
    	
    	for(int i=0; i < nl.getLength(); i++){
	        processNode(nl.item(i), callback);
	    }
    	callback.OnReturn(currentNode);
    }
    
    
}
