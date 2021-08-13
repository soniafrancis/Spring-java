package com.transaction.Springtransactiondemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.Springtransactiondemo.entity.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment,Long>{

}
