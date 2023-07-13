package com.example.demo1.repository;

import com.example.demo1.model.Vendor;
import org.hibernate.Session;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import java.util.List;

public class VendorRepositorySession {
    private Session session;

    public VendorRepositorySession(Session session) {
        this.session = session;
    }

}
