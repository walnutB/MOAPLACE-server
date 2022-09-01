package com.moaplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moaplace.dto.ShowImgDTO;
import com.moaplace.mapper.ShowImgMapper;
import com.moaplace.vo.ShowImgVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ShowImgService {
	
	@Autowired 
	private ShowImgMapper showImgMapper;
	
	public List<ShowImgDTO> detailimg(int show_num) {
		
		return showImgMapper.detailimg(show_num);
	}
}
