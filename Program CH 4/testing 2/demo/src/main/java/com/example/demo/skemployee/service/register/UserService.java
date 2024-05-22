package com.example.demo.skemployee.service.register;

import com.example.demo.skemployee.dto.req.RegisterModel;

import java.util.Map;

public interface UserService {
    Map registerManual(RegisterModel objModel) ;

    Map registerByGoogle(RegisterModel objModel) ;
}

