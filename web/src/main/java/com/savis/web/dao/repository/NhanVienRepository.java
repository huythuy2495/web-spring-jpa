package com.savis.web.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savis.web.dao.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien , Long>{
	NhanVien findByTen(String ten);
	
	NhanVien findById(long id);

}
