package com.example.demo.skemployee.service;

import java.util.Map;

public interface AbsractFactoryService {
    Map save(Object request);

    Map update(Object request);

    Map deleted(Object request);

    Map getData();
}
