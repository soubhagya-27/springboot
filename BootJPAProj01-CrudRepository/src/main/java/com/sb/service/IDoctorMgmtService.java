//service interface
package com.sb.service;

import com.sb.entity.Doctor;

public interface IDoctorMgmtService {
	
	public String registerDoctor(Doctor doctor);
	public long showDoctor(); 
	public long showDoctorsCount();
	public String registerDoctorsAsGroup(Iterable<Doctor> list); 	
}
