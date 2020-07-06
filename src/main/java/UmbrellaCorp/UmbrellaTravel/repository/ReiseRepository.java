package UmbrellaCorp.UmbrellaTravel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import UmbrellaCorp.UmbrellaTravel.Entity.ReiseV2;

@Repository
public interface ReiseRepository extends CrudRepository<ReiseV2, Long>
{
    
}