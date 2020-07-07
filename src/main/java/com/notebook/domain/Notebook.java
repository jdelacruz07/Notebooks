package com.notebook.domain;

import org.springframework.data.annotation.Id;


public class Notebook {
	
	@Id
	private String id;
	
	private String description;
	private Double price;
	private String urlPhoto;
	private String typeOfMaterial;
	private String sizeOfNotebook;
	
	public Notebook() {
		
	}

	public Notebook(String description, Double price, String urlPhoto, String typeOfMaterial, String sizeOfNotebook) {
		super();
		this.description = description;
		this.price = price;
		this.urlPhoto = urlPhoto;
		this.typeOfMaterial = typeOfMaterial;
		this.sizeOfNotebook = sizeOfNotebook;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}

	public void setTypeOfMaterial(String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}

	public String getSizeOfNotebook() {
		return sizeOfNotebook;
	}

	public void setSizeOfNotebook(String sizeOfNotebook) {
		this.sizeOfNotebook = sizeOfNotebook;
	}

	@Override
	public String toString() {
		return "Notebook [id=" + id + ", description=" + description + ", precio=" + price + ", urlPhoto=" + urlPhoto
				+ ", typeOfMaterial=" + typeOfMaterial + ", sizeOfNotebook=" + sizeOfNotebook + "]";
	}

	
}
