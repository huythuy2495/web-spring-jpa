package com.savis.web.dao.service;

import java.util.List;

import com.savis.web.dao.entity.NhanVien;

public interface NhanVienService {
	List<NhanVien> findAll();
	void save(NhanVien nhanVien);
	void delete(long id);
	NhanVien findById(long id);
	NhanVien findByTen(String ten);
	void deleteAllten();
	boolean istenExist(NhanVien nhanVien);

}
