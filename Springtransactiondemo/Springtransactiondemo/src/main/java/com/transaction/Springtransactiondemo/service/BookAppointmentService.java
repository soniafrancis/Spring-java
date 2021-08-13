package com.transaction.Springtransactiondemo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.transaction.Springtransactiondemo.controller.dto.AppointmentFormDto;
import com.transaction.Springtransactiondemo.entity.Appointment;
import com.transaction.Springtransactiondemo.entity.Pateint;
import com.transaction.Springtransactiondemo.repo.AppointmentRepo;
import com.transaction.Springtransactiondemo.repo.PateintRepo;

@Service
public class BookAppointmentService {
	
@Autowired
private AppointmentRepo appointmentRepo;

@Autowired
private PateintRepo pateintRepo;
	
	public String bookAppointment( AppointmentFormDto appointmentFormDto) {
		
		Pateint pateint = new  ObjectMapper().convertValue(appointmentFormDto, Pateint.class);
		
		Long pateintNumber = pateintRepo.save(pateint).getPateintNumber();
		
		System.out.println("pateint saved successfully");
		
		
		/*Appointment appointment = Appointment.builder().date(new  Date(System.currentTimeMillis())).DoctorNumber(101).pateintNumber(pateintNumber).build();		
		
		Long appointmentNumber = appointmentRepo.save(appointment).getAppointmentNumber();
		
		
		return "Appointment Confirmed"+appointmentNumber;
		*/
		
		Appointment appointment = new Appointment(new Date(System.currentTimeMillis()), (long) 101, pateintNumber);
		
		Long appointmentNumber = appointmentRepo.save(appointment).getAppointmentNumber();
		
		return "Appointment Completed";
	}

}
