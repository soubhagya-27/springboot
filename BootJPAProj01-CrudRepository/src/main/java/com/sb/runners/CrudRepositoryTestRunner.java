package com.sb.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sb.entity.Doctor;
import com.sb.service.IDoctorMgmtService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorMgmtService docService;
	@Override
	public void run(String...args)throws Exception{
		try {
			//prepare the doctor obj
			Doctor doc=new Doctor(1007,"raja","MD",89999L,999999L,"cardio");
			String msg=docService.registerDoctor(doc);
			System.out.println(msg);
		}
		catch(Exception e) { 
			e.printStackTrace();
		
		}
		
		
		try {
			System.out.println("Doctors count::"+docService.showDoctor());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Doctor doc1= new Doctor(1001,"Suresh", "MD", 89991L, 9999998L, "Cardio");
			Doctor doc2= new Doctor(1002,"Mahesh", "D", 89992L, 9999997L, "physio");
			Doctor doc3= new Doctor(1003,"Kiran", "M", 89993L, 9999996L, "nuero");
			
			List<Doctor> list=List.of(doc1,doc2,doc3);  //java 9 features giving immutable collection
			String resultMsg=docService.registerDoctorsAsGroup(list);
			System.out.println(list);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	} // run method
	
} // class
