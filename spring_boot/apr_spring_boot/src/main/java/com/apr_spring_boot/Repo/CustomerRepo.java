package com.apr_spring_boot.Repo;

import com.apr_spring_boot.Model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface CustomerRepo  extends JpaRepository<CustomerModel,Integer> {

    /*
    ?1->map the 1st arg
    ?2->map the 2nd arg
     */
    @Query("select c from CustomerModel c where c.email=?1 and c.password =?2")
    Optional<CustomerModel> login(String email, String password);

    @Query("select c from CustomerModel c where c.customer_no=?1 and c.token =?2")
    Optional<CustomerModel> tokenValidation(Integer customer_no, String token);


    @Transactional
    @Modifying
    @Query("update CustomerModel set password=?2 where customer_no=?1")
    void passwordUpdate(Integer customerId, String password);

    @Transactional
    @Modifying
    @Query("update CustomerModel set token=?2 where customer_no=?1")
    void tokenUpdate(Integer customerId, String token);

    @Transactional
    @Modifying
    @Query("delete from CustomerModel where customer_no=?1")
    void deleteUser(Integer customerId);
}
