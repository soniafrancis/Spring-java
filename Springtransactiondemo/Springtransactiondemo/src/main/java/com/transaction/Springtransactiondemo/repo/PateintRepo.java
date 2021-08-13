package com.transaction.Springtransactiondemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.Springtransactiondemo.entity.Pateint;

//import org.springframework.stereotype.Repository;

@Repository
public interface PateintRepo extends JpaRepository<Pateint,Long>{

}
