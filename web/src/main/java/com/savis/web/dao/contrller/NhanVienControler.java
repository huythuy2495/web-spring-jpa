package com.savis.web.dao.contrller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.savis.web.dao.service.NhanVienService;
import com.savis.web.dao.entity.NhanVien;

@Controller
@RequestMapping("/savis")
public class NhanVienControler {
	
	public static final Logger logger = LoggerFactory.getLogger(NhanVienControler.class);
	@Autowired
	private NhanVienService vienService;

	@RequestMapping(value = "/nv", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody List<NhanVien> getAll() {
		return vienService.findAll();
	}

	@RequestMapping(value = "/savenv", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE }, consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody void savenv(@RequestBody NhanVien nhanvien) {
		vienService.save(nhanvien);
	}

	@RequestMapping(value = "/deletenv/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody void deleteNV(@PathVariable("id") Long id) {
		vienService.delete(id);

	}
	
	
	@RequestMapping(value = "/getnvid/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody NhanVien getnvbyid(@PathVariable("id") long id) {
		return vienService.findById(id);
	}
	
	@RequestMapping(value = "/getnvten/{ten}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody NhanVien getnvbyid(@PathVariable("ten")String  ten) {
		
		return vienService.findByTen(ten);
	}
	@RequestMapping(value="/deleteall",method=RequestMethod.DELETE,produces= {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public @ResponseBody void deleteallten() {
		vienService.deleteAllten();
	}
	
	
	

}