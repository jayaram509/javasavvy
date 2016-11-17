package org.javasavvy.rest.modal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductModal {

	private long productId;
	private String name;
	private String description;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
