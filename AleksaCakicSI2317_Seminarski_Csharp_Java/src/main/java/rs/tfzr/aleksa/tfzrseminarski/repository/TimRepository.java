package rs.tfzr.aleksa.tfzrseminarski.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.tfzr.aleksa.tfzrseminarski.model.Tim;

@Repository
public interface TimRepository extends CrudRepository<Tim, Integer> { }
