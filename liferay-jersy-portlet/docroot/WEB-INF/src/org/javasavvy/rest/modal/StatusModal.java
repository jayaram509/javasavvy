package org.javasavvy.rest.modal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatusModal {

	public int status;
	public String message;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
