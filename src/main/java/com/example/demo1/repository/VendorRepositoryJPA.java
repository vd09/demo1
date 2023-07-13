package com.example.demo1.repository;

import com.example.demo1.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public interface VendorRepositoryJPA extends JpaRepository<Vendor, String> {
    List<Vendor> findByName(String name);

    default public List<Vendor> findByVendorName(String vendorName) {
        /*
        findByName and findByVendorName is same but you JPA will create findByName automatically
         */
        return findByName(vendorName);
    }
}
