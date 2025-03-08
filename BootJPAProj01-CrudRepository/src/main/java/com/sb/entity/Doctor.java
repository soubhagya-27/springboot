// Doctor.java (entity class)
package com.sb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="JPA_DOCTOR")
public class Doctor{
	@Id
	@Column(name="DOCTOR_ID")
	//@SequenceGenerator(name="gen1",sequenceName="DID_DEQ",allocationSize=1,initialValue=100 )
	//@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	
	//@GeneratedValue(generator="gen1",strategy=GenerationType.AUTO)
	private Integer did;
	
	@Column(name="DOCTOR_NAME",length=30)
	@NonNull
	private String dname;
	
	@Column(name="DOCTOR-QLFY",length=30)
	@NonNull
	private String qlfy;
	
	@NonNull
	@Column(name="DOCTOR-INCOME")
	private Long income;
	
	@Column(name="DOCTOR-MOBILENO")
	@NonNull
	private Long mobileNo;
	
	@Column(name="DOCTOR-SPECIALIZATION",length=30)
	@NonNull
	private String specialization;
	
	
	
}