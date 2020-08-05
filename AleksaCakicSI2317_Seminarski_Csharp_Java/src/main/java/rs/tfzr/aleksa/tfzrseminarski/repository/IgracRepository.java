package rs.tfzr.aleksa.tfzrseminarski.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.tfzr.aleksa.tfzrseminarski.model.Igrac;

@Repository
public interface IgracRepository extends CrudRepository<Igrac, Integer> { }
