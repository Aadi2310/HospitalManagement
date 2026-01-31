package com.hospital.HospitalManagement.entity;

import com.hospital.HospitalManagement.entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.ToString;

import java.time.LocalDate;
@Entity
@Table(
        name="patient",
        uniqueConstraints ={

//                @UniqueConstraint(name = "unique_patient_name",columnNames = {"email"}),
                @UniqueConstraint(name="unique_patient_name_birthdate",columnNames = {"name","birthDate"})
        },
        indexes = {
                    @Index(name="idx_patient_birth_date",columnList = "birthDate")
        }
)

@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private LocalDate birthDate;

    @Column(unique = true)
    private String email;
    private String gender;

//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", birthDate=" + birthDate +
//                ", email='" + email + '\'' +
//                ", gender='" + gender + '\'' +
//                '}';
//    }

@Enumerated(EnumType.STRING)
private BloodGroupType bloodGroup;

}
