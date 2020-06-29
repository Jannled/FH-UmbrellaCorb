package UmbrellaCorp.UmbrellaTravel.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import UmbrellaCorp.UmbrellaTravel.User;

@Repository
public interface BenutzerRepository extends CrudRepository<User, Long>
{
	public List<User> findByEmail(String email);
}