package com.yapinda.entities;

import com.yapinda.constant.TableConventionConstants;
import com.yapinda.constant.UuidConstants;
import com.yapinda.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = TableConventionConstants.MST_STUDENT)
public class Students {
    @Id
    @GeneratedValue(generator = UuidConstants.SYSTEM_UUID)
    @GenericGenerator(name = UuidConstants.SYSTEM_UUID, strategy = UuidConstants.STRATEGY)
    private Long id_student;

    private String fullName;
    private String bornPlace;
    private Date birthDate;
    private Gender gender;
    private String religion;
    private String citizen;
    private String nisn;
    private String nik;
    private String motherName;
    private String address;
    private String rt;
    private String rw;
    private String village;
    private String villageOffice;
    private String subDistrict;
    private String district;
    private String province;
    private String posCode;
    private String phoneNumber;
    private String email;
    private String facebook;
    private String username;
    private String password;


    public Students() {
    }


}
