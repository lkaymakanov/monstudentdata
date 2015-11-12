package net.is_bg.mon.wsclient.studentdata;

/**
 * Value & description of the MON xml single value properties!!!
 * @author lubo
 *
 */
public class ValueDescription {
	String value;
	String desccription;
	
	public ValueDescription(String value, String description){
		this.value = value;
		this.desccription = description;
	}

	public String getValue() {
		return value;
	}

	public String getDesccription() {
		return desccription;
	}

	void setValue(String value) {
		this.value = value;
	}

	void setDesccription(String desccription) {
		this.desccription = desccription;
	}
	
};