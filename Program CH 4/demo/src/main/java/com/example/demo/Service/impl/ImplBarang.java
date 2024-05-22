package com.example.demo.Service.impl;

import com.example.demo.Service.BarangService;
import com.example.demo.model.Barang;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImplBarang implements BarangService {

    static List<Barang> listMhs = new ArrayList<>();

    private static final Logger logger = LoggerFactory.getLogger(BarangService.class);
    @Override
    public Barang save(Barang obj) {
        try {
            logger.info("Request:", obj);
            obj.setId(1L);
            listMhs.add(obj);
            return obj;
        } catch (Exception e){
            logger.error("Error save:", e.getMessage());
            return null;
        }

    }

    @Override
    public Barang update(Barang obj) {
        for (Barang data : listMhs){
            if (obj.getId() == data.getId()){
                Barang update = new Barang();
                update.setNama(data.getNama());
                update.setId(data.getId());
                update.setSatuan(data.getSatuan());
                update.setStok(data.getStok());
                listMhs.remove(data);
                listMhs.add(update);
                return update;
            }
        }
        return null;
    }

    @Override
    public List<Barang> deleted(Long id) {
        for (Barang data : listMhs){
            if (id == data.getId()){
                Barang update = new Barang();
                update.setNama(data.getNama());
                update.setId(data.getId());
                update.setSatuan(data.getSatuan());
                update.setStok(data.getStok());
                listMhs.remove(data);

                return listMhs;
            }
        }
        return null;
    }

    @Override
    public List<Barang> dataMhs(int row, int page) {
        return listMhs;
    }

    @Override
    public Barang findById(long obj) {
        for (Barang data : listMhs){
            if (obj == data.getId()){
                return data;
            }
        }
        return null;
    }
}
