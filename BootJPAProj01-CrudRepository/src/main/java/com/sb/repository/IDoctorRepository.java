package com.sb.repository;

import org.springframework.data.repository.CrudRepository;

import com.sb.entity.Doctor;

public interface IDoctorRepository extends CrudRepository<Doctor, Integer> {

}
