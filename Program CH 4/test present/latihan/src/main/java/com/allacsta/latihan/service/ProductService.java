package com.allacsta.latihan.service;

import com.allacsta.latihan.entity.Product;

import java.util.Map;
import java.util.UUID;

public interface ProductService {

    Map save(Product request);
    Map edit(Product request);
    Map delete(Product request);
    Map list();

    Map deleteById(UUID id);

    Map getById(UUID id);

    Map pagination(int page, int size);



}
