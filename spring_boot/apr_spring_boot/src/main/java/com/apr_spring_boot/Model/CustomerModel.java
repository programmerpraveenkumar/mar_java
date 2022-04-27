package com.apr_spring_boot.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="customer")
public class CustomerModel {
    @Id//should be on top of PK
    @GeneratedValue(strategy= GenerationType.IDENTITY)//indicate this field is Auto increment
    Integer customer_no;
    String name;
    String email;
    String address;
    String dob;
    String password;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    String token;

    @OneToOne
    @JoinColumn(name="city")
    CityModel cityModel;

    public List<MobileModel> getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(List<MobileModel> mobileModel) {
        this.mobileModel = mobileModel;
    }

    @OneToMany
    @JoinColumn(name="customer_id")
    List<MobileModel> mobileModel;//multiple data may exist.so list

    @Column(updatable = false,insertable = false)
    LocalDate added_date;


    public CityModel getCityModel() {
        return cityModel;
    }

    public void setCityModel(CityModel cityModel) {
        this.cityModel = cityModel;
    }


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


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
