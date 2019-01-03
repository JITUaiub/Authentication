package com.authentication.main.model;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	public UserDetails loadUserByUsername(String user)
			throws UsernameNotFoundException {
			if(user.equals("admin")) {
				User nwUser = new User();
				nwUser.setUsername(user);
				nwUser.setPassword(new BCryptPasswordEncoder().encode("admin"));
				return UserPrinciple.build(nwUser);	
			}
			else {
				return null;
			}
	}


}