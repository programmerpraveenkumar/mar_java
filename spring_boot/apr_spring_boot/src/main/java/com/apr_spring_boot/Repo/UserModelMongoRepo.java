package com.apr_spring_boot.Repo;

import com.apr_spring_boot.Model.MongoDb.UserModelMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserModelMongoRepo extends MongoRepository<UserModelMongo,String> {

}
