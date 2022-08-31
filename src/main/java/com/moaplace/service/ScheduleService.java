package com.moaplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moaplace.dto.ScheduleDTO;
import com.moaplace.mapper.ScheduleMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ScheduleService {

	@Autowired 
	private ScheduleMapper scheduleMapper;
	
	public List<ScheduleDTO> schedule(int show_num) {
		
		return scheduleMapper.schedule(show_num);
	}
}