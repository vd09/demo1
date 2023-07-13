package com.example.demo1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vendor_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String address;
    private String phoneNumber;

/*
Creating getters because lambok and getter does not go together
 */

/*
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
*/

}
