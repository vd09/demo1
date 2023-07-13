package com.example.demo1.service;

import com.example.demo1.model.Vendor;

import java.util.List;

public interface VendorService {
    public String createVendor(Vendor vendor);
    public String updateVendor(Vendor vendor);
    public String deleteVendor(String vendorId);
    public Vendor getVendor(String vendorId);
    public List<Vendor> getAllVendors();
    public List<Vendor> getByVendorName(String vendorName);
}
