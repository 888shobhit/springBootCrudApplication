package com.bcto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Products {
	@Id
	@Column(name = "ID")
	private int prodid;
	@Column(name = "prodcode", nullable = false, length = 20)
	private String prodcode;
	@Column(name = "prica", nullable = false, length = 10)
	private Double price;
	@Column(name = "gst", nullable = false, length = 10)
	private Double gst;
	@Column(name = "discount", nullable = false, length = 20)
	private Double discount;

	private String prodname;

	public Products(int prodid, String prodcode, Double price, Double gst, Double discount) {
		super();
		this.prodid = prodid;
		this.prodcode = prodcode;
		this.price = price;
		this.gst = gst;
		this.discount = discount;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdcode() {
		return prodcode;
	}

	public void setProdcode(String prodcode) {
		this.prodcode = prodcode;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getGst() {
		return gst;
	}

	public void setGst(Double gst) {
		this.gst = gst;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "products [prodid=" + prodid + ", prodcode=" + prodcode + ", price=" + price + ", gst=" + gst
				+ ", discount=" + discount + "]";
	}

}
