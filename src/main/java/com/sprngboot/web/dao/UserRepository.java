package com.sprngboot.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sprngboot.web.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
     public List<User> findByName(String name);
     public List<User> findByNameAndCity(String name, String city);
     
     //JPQL
     @Query("select u FROM User u")
     public List<User> getAllUser();
     
     @Query("select u From User u where u.name=:n")
     public List<User> getUserByName(@Param("n") String name);
     @Query("select m from User m WHERE m.name=:f and m.city=:c")
     public List<User> getUserByNameAndCity(@Param("f") String name, @Param("c") String city);
     
     
     //Native Query
     @Query(value="select * from user", nativeQuery=true)
     public List<User> getUsers();
}
