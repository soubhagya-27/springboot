//service impl class 
package com.sb.service;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.entity.Doctor;
import com.sb.repository.IDoctorRepository;

@Service
public  class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	@Autowired
	private IDoctorRepository doctorRepo;// inject the dynamically InMemory Proxy class obj

	@Override
	public String registerDoctor(Doctor doctor) {
		/*System.out.println("Repository class obj name(InMemoryProxy name)::"+doctorRepo.getClass()
		.getName());
		System.out.println("list of implemented interface"+Arrays.toString(doctorRepo.getClass().getInterfaces()));
		System.out.println("List of methods::"+Arrays.toString(doctorRepo.getClass().getDeclaredMethods()));*/
		// save the object insert the record
		Doctor savedDoctor = doctorRepo.save(doctor);
		// get the generated idValue
		int idVal = savedDoctor.getDid();
		return "doctor obj is saved with::::" + idVal;
	}

	@Override
	public long showDoctor() {
		
		
		return 0;
	
	}

	@Override
	public long showDoctorsCount() {
		long count = doctorRepo.count();
		return count;
	}
/*
	@Override
	public String registerDoctorsAsGroup(Iterable<Doctor> list) {
	// TODO Auto-generated method stub
	Iterable <Doctor> savedList=doctorRepo.saveAll(list);
		List<Doctor> savedList1=(List<Doctor>)savedList;
      int count=savedList1.size();
		
		List<Integer> ids=new ArrayList<> ();
		savedList1.forEach(doc->{
		ids.add(doc.getDid());
		});
		return count+" no of doctors are saved with id values ::"+ ids;
	}*/
	public String registerDoctorsAsGroup(Iterable<Doctor> list) {
		//save objects 
		Iterable<Doctor> savedList=doctorRepo.saveAll(list);
		//collected one value from the saved list object
		List<Integer> ids=StreamSupport.stream(savedList.spliterator(),false).map(Doctor::getDid).collect(Collectors.toList());
		return  ids.size()+"no,of doctors are saved with id values ::"+ ids ;
		
	}

}
