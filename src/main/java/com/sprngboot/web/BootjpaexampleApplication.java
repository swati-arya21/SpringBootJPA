package com.sprngboot.web;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sprngboot.web.dao.UserRepository;
import com.sprngboot.web.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		User user = new User();
		user.setName("Bhavesh");
		user.setCity("Barla");
		user.setStatus("I am a Java Pragrammer");
		
		User user1 = new User();
		user1.setName("Manish");
		user1.setCity("Barla");
		user1.setStatus("I am an IAS Office");
		
		User user2 = new User();
		user2.setName("Chota");
		user2.setCity("Barla");
		user2.setStatus("I am Business man");
		
	
		// ************Save one user data
		/*User output = userRepository.save(user);
		System.out.println(output);*/
		
		//**********Save multiple data 
	   /* List<User> users = List.of(user,user1,user2);
		Iterable<User> result = userRepository.saveAll(users);	
		result.forEach(u->{System.out.println(u);});*/
		
		//******* Update existing data
		 /*Optional<User> optional = userRepository.findById(2);
		 User u = optional.get();
		 u.setName("Chunnu");
		 User ur = userRepository.save(u);
		 System.out.println(ur);*/
		
		 //**********How to get the data
		 // 1. findById(id) --> return Optional Containing your data
		 // 2. findAll()
		 /*Iterable<User> itr = userRepository.findAll();
		 Iterator<User> i = itr.iterator();
		 while(i.hasNext())
		 {
			 User n =i.next();
			 System.out.println(n);
		 }*/
		 
		 
		 //**** Deleting the user elements
		 /*userRepository.deleteById(2);
		 // delete multiple values
		 Iterable<User> alluser = userRepository.findAll();
		 System.out.println("Deleted Elements are ");
		 alluser.forEach(x->System.out.println(x));
		 userRepository.deleteAll(alluser);*/
		 
		 
		 //**************Custom Finder Method
		 List<User> z = userRepository.findByName("Bhavesh");
		 z.forEach(j->System.out.println(j));
		 
		 
		
	}

}
