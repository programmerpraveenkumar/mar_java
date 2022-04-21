package com.apr_spring_boot.Repo;

import com.apr_spring_boot.Model.CityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<CityModel,Integer> {
}
