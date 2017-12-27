package com.socialhub.social.repositories;

import com.socialhub.social.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 */
public interface UserRepository extends MongoRepository<User, String> {
}
