package com.apr_spring_boot.Repo;

import com.apr_spring_boot.Model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo  extends JpaRepository<CustomerModel,Integer> {

    /*
    ?1->map the 1st arg
    ?2->map the 2nd arg
     */
    @Query("select c from CustomerModel c where c.email=?1 and c.password =?2")
    Optional<CustomerModel> login(String email, String password);
}
