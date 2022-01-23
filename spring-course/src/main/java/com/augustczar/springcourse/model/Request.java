package com.augustczar.springcourse.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.augustczar.springcourse.enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

	private Long id;
	private String subject;
	private String description;
	private Date creiationDate;
	private RequestState requestState;
	private User user;
	private List<RequestStatage> requestStatages = new ArrayList<>();
}
