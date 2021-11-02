package com.REST.REST_TEST.ex01;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Component
public class MemberVO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	
	@Override
	public String toString() {
		return String.format(id,"%s", pwd, "%s", name, "%s", email, ",", ",", ",");
	}
}
