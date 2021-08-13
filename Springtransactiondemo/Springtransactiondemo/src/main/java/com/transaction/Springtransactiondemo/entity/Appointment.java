package com.transaction.Springtransactiondemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Appointment {
	
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long appointmentNumber;
		private Date date;
		private Long doctorNumber;
		private Long pateintNumber;
		
		public Appointment() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Appointment( Date date, Long doctorNumber, Long pateintNumber) {
			super();
			//this.appointmentNumber = appointmentNumber;
			this.date = date;
			this.doctorNumber = doctorNumber;
			this.pateintNumber = pateintNumber;
		}

		public Long getAppointmentNumber() {
			return appointmentNumber;
		}

		public void setAppointmentNumber(Long appointmentNumber) {
			this.appointmentNumber = appointmentNumber;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Long getDoctorNumber() {
			return doctorNumber;
		}

		public void setDoctorNumber(Long doctorNumber) {
			this.doctorNumber = doctorNumber;
		}

		public Long getPateintNumber() {
			return pateintNumber;
		}

		public void setPateintNumber(Long pateintNumber) {
			this.pateintNumber = pateintNumber;
		}
		
		

}
