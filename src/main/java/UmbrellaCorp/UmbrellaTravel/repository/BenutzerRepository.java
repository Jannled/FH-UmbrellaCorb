package UmbrellaCorp.UmbrellaTravel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import UmbrellaCorp.UmbrellaTravel.Entity.User;

@Repository
public interface BenutzerRepository extends CrudRepository<User, Long>
{
	public User findByEmail(String email);
}