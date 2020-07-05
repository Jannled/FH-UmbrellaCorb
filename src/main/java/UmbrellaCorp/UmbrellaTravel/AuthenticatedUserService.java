package UmbrellaCorp.UmbrellaTravel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;

@Service
public class AuthenticatedUserService implements UserDetailsService 
{
    @Autowired
    BenutzerRepository benutzerRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }
    
}