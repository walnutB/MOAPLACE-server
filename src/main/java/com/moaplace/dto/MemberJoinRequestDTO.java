package com.moaplace.dto;

import lombok.Data;

@Data
public class MemberJoinRequestDTO {

	private String member_id;
	private String member_pwd;
	private String member_email;
	private String member_name;
	private String member_gender;
	private String member_birth;
	private String member_phone;
	private String member_address;
}