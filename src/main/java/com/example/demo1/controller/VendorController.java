package com.example.demo1.controller;

import com.example.demo1.model.Vendor;
import com.example.demo1.response.ResponseHandler;
import com.example.demo1.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/vendor")
public class VendorController {
    
    VendorService vendorService;

    @Autowired
    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping("/{vendorId}")
    public ResponseEntity<Object> getVendorDetails(@PathVariable("vendorId") String vendorId) {
        return ResponseHandler.responseBuilder("Requested Vendor Details are given here",
                HttpStatus.OK, vendorService.getVendor(vendorId));
    }

    @PostMapping("/")
    public String createVendorDetails(@RequestBody Vendor vendor)
    {
        vendorService.createVendor(vendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping("/")
    public String updateVendorDetails(@RequestBody Vendor vendor) {
        vendorService.updateVendor(vendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteVendorDetails(@PathVariable("vendorId") String vendorId, @RequestHeader("Accept-Encoding") String encoding) {
        vendorService.deleteVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }

}
