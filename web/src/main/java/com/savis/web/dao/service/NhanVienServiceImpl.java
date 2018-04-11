package com.savis.web.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savis.web.dao.entity.NhanVien;
import com.savis.web.dao.repository.NhanVienRepository;

@Service("vienService")
public class NhanVienServiceImpl implements NhanVienService {
	@Autowired
	private NhanVienRepository res;

	@Override
	public List<NhanVien> findAll() {
		// TODO Auto-generated method stub
		List<NhanVien> nvs = null;
		try {
			nvs = res.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return nvs;
	}

	@Override
	public void save(NhanVien nhanVien) {
		// TODO Auto-generated method stub
		res.save(nhanVien);

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		res.deleteById(id);

	}

	@Override
	public NhanVien findById(long id) {
		return res.findById(id);
	}

	@Override
	public NhanVien findByTen(String ten) {
		// TODO Auto-generated method stub
		return res.findByTen(ten);
	}

	@Override
	public void deleteAllten() {
		// TODO Auto-generated method stub
		res.deleteAll();
		
	}

	@Override
	public boolean istenExist(NhanVien nhanVien) {
		// TODO Auto-generated method stub
		return findByTen(nhanVien.getTen())!=null;
	}

}
