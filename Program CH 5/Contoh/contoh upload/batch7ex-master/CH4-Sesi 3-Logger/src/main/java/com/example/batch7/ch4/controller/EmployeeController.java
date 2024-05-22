package com.example.batch7.ch4.controller;


import com.example.batch7.ch4.config.Config;
import com.example.batch7.ch4.entity.Employee;
import com.example.batch7.ch4.service.ServiceEmployee;
import com.example.batch7.ch4.service.impl.ServiceImplEmployee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    //CURD : method CURD ada dimana?
    @Autowired
    private ServiceEmployee serviceEmployee;

    Config config = new Config(); // tampa DI -> Depedency injection

    //JIKa pake DI
    @Autowired
    private Config configWithDI;

//    public  EmployeeController (ServiceEmployee serviceEmployee){
//
//    }

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);


    @PostMapping(value = "/save")
    public Map hello(@RequestBody Employee request){
        Map map = new HashMap();
        try {
            logger.info("Request:",request);
            map =  serviceEmployee.save(request);
            return map;
        }catch (Exception e){
            logger.info("Eror hello :",e.getMessage());
            return map;
        }

    }
}
