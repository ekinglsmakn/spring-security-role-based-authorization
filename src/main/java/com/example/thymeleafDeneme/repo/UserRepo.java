package com.example.thymeleafDeneme.repo;

import com.example.thymeleafDeneme.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {

//    @Query(value = "select u from User u where u.username=:username",nativeQuery = true)
//    User getUsersByUsername(@Param("username") String username);


    User getUsersByUsername(@Param("username") String username);
}
