package com.example.thymeleafDeneme.config;

import com.example.thymeleafDeneme.model.User;
import com.example.thymeleafDeneme.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepo.getUsersByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
        return new MyUserDetails(user);
    }



//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//       User user = userRepo.getUsersByUsername(username);
//
//       if(user==null){
//           throw new UsernameNotFoundException("Could not find user");
//       }
//       return new MyUserDetails(user);
//    }

}
