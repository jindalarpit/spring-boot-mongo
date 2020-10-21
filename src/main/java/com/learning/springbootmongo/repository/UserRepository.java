package com.learning.springbootmongo.repository;

import com.learning.springbootmongo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

}
