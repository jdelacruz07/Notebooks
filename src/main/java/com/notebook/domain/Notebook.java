package com.notebook.domain;

import org.springframework.data.annotation.Id;

public class Notebook {

	@Id
	private String id;
	private String model;
	private String encuadernacion;
	private String color;
	private String sheets;
	private String typeOfMaterial;
	private String sizeOfNotebook;
	private Double price;
	private String urlPhoto;

	public Notebook(String model, String encuadernacion, String color, String sheets, String typeOfMaterial,
			String sizeOfNotebook, Double price, String urlPhoto) {
		super();
		this.model = model;
		this.encuadernacion = encuadernacion;
		this.color = color;
		this.sheets = sheets;
		this.typeOfMaterial = typeOfMaterial;
		this.sizeOfNotebook = sizeOfNotebook;
		this.price = price;
		this.urlPhoto = urlPhoto;
	}

	public Notebook() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEncuadernacion() {
		return encuadernacion;
	}

	public void setEncuadernacion(String encuadernacion) {
		this.encuadernacion = encuadernacion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSheets() {
		return sheets;
	}

	public void setSheets(String sheets) {
		this.sheets = sheets;
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

}
