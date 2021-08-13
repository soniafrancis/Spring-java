package com.transaction.Springtransactiondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.Springtransactiondemo.controller.dto.AppointmentFormDto;
import com.transaction.Springtransactiondemo.service.BookAppointmentService;

@RestController
public class BookAppointmentController {
	
	@Autowired
	private BookAppointmentService bookAppointmentService;
	
	
	
	
	@PostMapping("/book")
	public String bookAppointment(@RequestBody AppointmentFormDto appoinmentFormDto) {
		return bookAppointmentService.bookAppointment(appoinmentFormDto) ;
		
	}

}
