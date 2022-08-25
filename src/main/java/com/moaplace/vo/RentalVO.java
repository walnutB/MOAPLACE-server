package com.moaplace.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RentalVO {
	private int rental_num;
	private int member_num;
	private int hall_num;
	private String rental_name;
	private String rental_phone;
	private String rental_email;
	private String rental_title;
	private String rental_genre;
	private Date rental_date;
	private String rental_time;
	private String rental_savefilename;
	private String rental_originfilename;
	private long rental_filesize;
	private String rental_ownsname;
	private String rental_ownsphone;
	private String rental_ownemail;
	private String rental_content;
	private Date regdate;
	private String rental_state;
}