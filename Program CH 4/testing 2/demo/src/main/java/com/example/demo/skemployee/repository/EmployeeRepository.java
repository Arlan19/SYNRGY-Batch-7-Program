package com.example.demo.skemployee.repository;


import com.example.demo.skemployee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
//public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
public interface EmployeeRepository extends JpaRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {

    /*
    1. Query JPA
     */

    //select semua data where nama == apa?
    public List<Employee> findByName(String nama);

    //select semua data where nama == apa dan status
    public List<Employee> findByNameAndStatus(String nama, String status);

    /*
    2. query objectnya, param / Queeru Projection
     */

    @Query(value = "select uk from Employee uk WHERE uk.id = :id")
    public Optional<Employee> getById(@Param("id") UUID id);

    @Query(value = "select uk from Employee uk WHERE uk.name = :nameParameter")
    public Optional<Employee> getByName(@Param("nameParameter") String name);

    @Query("FROM Employee u WHERE LOWER(u.name) like LOWER(:nameParam)")
    public List<Employee> findByNameLike(String nameParam);



    /*
   4. Pagination -> Memecah data -> 1000 -> 10 data ada 100 halaman
    */
//    menampilkan semua data : pagination
    @Query("FROM Employee u")
    public Page<Employee> getAllDataPage(Pageable pageable);

    // menampikan semua data : tapi filter base name
    @Query("FROM Employee u where LOWER(u.name) like LOWER(:nameParam)")
    public Page<Employee> getAllDataByName(@Param("nameParam") String name, Pageable pageable);
    //JPA Query
    @Query(value = "select c from Employee c WHERE c.id = :idEmployee", nativeQuery = false)
    public Employee getById(@Param("idEmployee") Long idEmployee);













    //Native Query : menggunakan JPAQL
    @Query(value = "select  e from employee e where  id = :idEmployee;",nativeQuery = true)
    public Object getByIdNativeQuery(@Param("idEmployee") Long idEmployee);

    //Store prosedure
    @Query(value = "select * from getemployeelist()",nativeQuery = true)
    public List<Object> getListSP();

    @Procedure("insert1")
    void saveEmployeeSP(@Param("resid") Long resid, @Param("rqnama") String rqnama);

    @Procedure("update_employee")
    void updateEmployeeSP(@Param("resid") Long resid,@Param("rqnama") String rqnama);

    @Procedure("deleted_employee1")
    void deleted_employee1(@Param("resid") Long resid);

    @Procedure("getemployeebyid")
    Object getemployeebyid(@Param("rqid") Long rqid);

}



//@Repository
//public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
//    //JPA Query
//    @Query(value = "select c from Employee c WHERE c.id = :idEmployee", nativeQuery = false)
//    public Employee getById(@Param("idEmployee") Long idEmployee);
//
//    //Native Query : menggunakan JPAQL
//    @Query(value = "select  e from employee e where  id = :idEmployee;",nativeQuery = true)
//    public Object getByIdNativeQuery(@Param("idEmployee") Long idEmployee);
//
//}
