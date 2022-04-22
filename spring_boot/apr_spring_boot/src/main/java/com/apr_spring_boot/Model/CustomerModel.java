package com.apr_spring_boot.Model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="customer")
public class CustomerModel {
    @Id//should be on top of PK
    @GeneratedValue(strategy= GenerationType.IDENTITY)//indicate this field is Auto increment
    Integer customer_no;
    String name,email,mobile,address,city,dob,password;

    @Column(updatable = false,insertable = false)
    LocalDate added_date;

    public LocalDate getAdded_date() {
        return added_date;
    }

    public void setAdded_date(LocalDate added_date) {
        this.added_date = added_date;
    }


    public Integer getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(Integer customer_no) {
        this.customer_no = customer_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
