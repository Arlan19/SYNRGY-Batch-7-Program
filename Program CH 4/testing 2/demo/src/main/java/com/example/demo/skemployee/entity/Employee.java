package com.example.demo.skemployee.entity;

import com.example.demo.skemployee.entity.abstractdate.AbstractDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Where;

import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Table(name = "employee")
@Where(clause = "deleted_date is null")
public class Employee extends AbstractDate implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @Column(name = "address", columnDefinition = "TEXT")
    public String address;

    // 2016-01-01
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    public  String status;

//    @OneToOne(targetEntity = DetailKaryawan.class, cascade = CascadeType.ALL) // FK dari tabel
//    @JoinColumn(name = "id_detail_karyawan", referencedColumnName = "id")
//    private Employee karyawan;


//    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)// ono to one
//    @JoinColumn(name = "id_detail_karyawan") //nama column
//    @PrimaryKeyJoinColumn
//    private DetailKaryawan detailEmployee;

    @OneToOne (targetEntity = DetailKaryawan.class, cascade = CascadeType.ALL)
    @JoinColumn(name="id_detail_karyawan", referencedColumnName = "id")
//    @PrimaryKeyJoinColumn
    private DetailKaryawan detailKaryawan;

//        // best practice -> jika data yang ditampilkan , karena akan pengarruh performance
//    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Rekening> rekening;
}


//@Data
//@Entity
//@Table(name = "employee")
//@Where(clause = "deleted_date is null")
//public class Employee implements Serializable {
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public Long id;
//
//    public String name;
//
//    @Column(name = "address", columnDefinition = "TEXT")
//    public String address;
//
//    // 2016-01-01
//    @Temporal(TemporalType.DATE)
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private Date dob;
//
//    public  String status = "active";
//
//}


