package com.example.demo.skemployee.entity;

import com.example.demo.skemployee.entity.abstractdate.AbstractDate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "rekening")
@Where(clause = "deleted_date is null")
public class Rekening extends AbstractDate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "jenis")
    private String jenis;

    @Column(length = 100)
    private String rekening;

    //    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_karyawan")
    private Employee employee;

    //    @JsonIgnore
    //cara ke 1
//    @ManyToOne
//    private Employee employee;

    // cara k2
//    @ManyToOne
//    @JoinColumn(name = "id_karyawan")
//    private Employee employee;

//    //cara ke3
//    @ManyToOne(targetEntity = Employee.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_karyawan")
//    private Employee employee;//ok supplier_id

}
