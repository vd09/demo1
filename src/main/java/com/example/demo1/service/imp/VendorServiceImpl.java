package com.example.demo1.service.imp;

import com.example.demo1.exception.VendorNotFoundException;
import com.example.demo1.model.Vendor;
import com.example.demo1.repository.VendorRepositoryJPA;
import com.example.demo1.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {

    VendorRepositoryJPA vendorRepositoryJPA;

    @Autowired
    public VendorServiceImpl(VendorRepositoryJPA vendorRepositoryJPA) {
        this.vendorRepositoryJPA = vendorRepositoryJPA;
    }

    @Override
    public String createVendor(Vendor vendor) {
        vendorRepositoryJPA.save(vendor);
        return "Success";
    }

    @Override
    public String updateVendor(Vendor vendor) {
        vendorRepositoryJPA.save(vendor);
        return "Success";
    }

    @Override
    public String deleteVendor(String vendorId) {
        vendorRepositoryJPA.deleteById(vendorId);
        return "Success";
    }

    @Override
    public Vendor getVendor(String vendorId) {
        if(vendorRepositoryJPA.findById(vendorId).isEmpty())
            throw new VendorNotFoundException("Requested Cloud Vendor does not exist");
        return vendorRepositoryJPA.findById(vendorId).get();
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepositoryJPA.findAll();
    }

    @Override
    public List<Vendor> getByVendorName(String vendorName) {
        return vendorRepositoryJPA.findByVendorName(vendorName);
    }

}
