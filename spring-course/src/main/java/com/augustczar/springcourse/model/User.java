package com.augustczar.springcourse.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private Long id;
	private String name;
	private String email;
	private String password;
	private List<Request> requests = new ArrayList<Request>();
	private List<RequestStatage> requestStatages = new ArrayList<RequestStatage>();
}
