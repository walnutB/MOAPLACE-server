package com.moaplace.controller.booking;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moaplace.service.BookingSelectService;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/booking")
@CrossOrigin("*")
@Log4j
public class GetBookingShowController {
	
	@Autowired
	private BookingSelectService service;
	

	@GetMapping(
			value = "/getShow/{num}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Object> getShowInfo(
			@PathVariable int num) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("list",service.ShowbookingSelect(num));
		
		map.put("thumb",service.returnThumbnail(num));
		log.info(service.ShowbookingSelect(num));
		return map;
	}
}
