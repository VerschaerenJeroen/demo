package be.thomasmore.froomi.repositories;

import org.springframework.data.repository.CrudRepository;
import be.thomasmore.froomi.model.Apartment;

public interface ApartmentRepository extends CrudRepository<Apartment, Integer> {
}
