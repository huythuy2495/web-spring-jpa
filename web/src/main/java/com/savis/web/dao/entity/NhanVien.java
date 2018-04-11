package com.savis.web.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name="nhanvien")
public class NhanVien {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable=false)
	private long id;
	@Column(name="ten",nullable=false)
	private String ten;
	@Column(name="tuoi")
	private String tuoi;
	@Column(name="diachi")
	private String diachi;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public NhanVien(long id, String ten, String tuoi, String diachi) {
		super();
		this.id = id;
		this.ten = ten;
		this.tuoi = tuoi;
		this.diachi = diachi;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
