package com.hospital.HospitalManagement;

import com.hospital.HospitalManagement.entity.Patient;
import com.hospital.HospitalManagement.entity.dto.BloodGroupResponseEntity;
import com.hospital.HospitalManagement.entity.type.BloodGroupType;
import com.hospital.HospitalManagement.repository.PatientRepository;
import com.hospital.HospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@SpringBootTest
public class PatientTests {
    @Autowired
    private  PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository() {
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);

        Patient  p1=new Patient();
        patientRepository.save(p1);
    }

    @Test
    public void testTransactionmethods() {
//        Patient patient=patientService.getPatientById(1L);
//        System.out.println(patient);
//        Patient patient=patientRepository.findByName("Diva Patel");
//        System.out.println(patient);

//    List<Patient> patientList=patientRepository.findByBirthDateOrEmail(LocalDate.of(1988,3,15),"diya.patel@example.com");
//
        Page<Patient> patientList = patientRepository.findallPatients(PageRequest.of(0,2));
        for(Patient p:patientList){
        System.out.println(p);
    }
//
//    List<Object[]> bloodGroupList=patientRepository.countEachBloodGroupType();
//       for (Object[] ob:bloodGroupList){
//           System.out.println(ob[0]+" "+ob[1]);
//        }

//       int rowsUpdated= patientRepository.updateNamewithID("Aadi Dharaskar",1L);
//       System.out.println(rowsUpdated);

//        List<BloodGroupResponseEntity> bloodGroupList=patientRepository.countEachBloodGroupType();
//       for (BloodGroupResponseEntity b:bloodGroupList){
//            System.out.println(b);
//        }
//




    }





}
