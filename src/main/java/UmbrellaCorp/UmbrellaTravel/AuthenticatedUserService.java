package UmbrellaCorp.UmbrellaTravel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import UmbrellaCorp.UmbrellaTravel.entity.User;
import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;

@Service
public class AuthenticatedUserService implements UserDetailsService 
{
    @Autowired
    BenutzerRepository benutzerRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException 
    {
        User user = benutzerRepository.findByEmail(email.toLowerCase());
        if(user != null)
            return user;
        else
        {
            System.out.println("Benutzer " + email + " existiert niet!");
            throw new UsernameNotFoundException("Konnte den Benutzer mit Name " + email + " leider nicht finden...");
        }
            
    }
}