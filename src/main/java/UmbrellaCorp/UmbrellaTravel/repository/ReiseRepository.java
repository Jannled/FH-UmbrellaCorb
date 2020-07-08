package UmbrellaCorp.UmbrellaTravel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import UmbrellaCorp.UmbrellaTravel.entity.Reiseziel;

@Repository
public interface ReiseRepository extends CrudRepository<Reiseziel, Long>
{
    
}