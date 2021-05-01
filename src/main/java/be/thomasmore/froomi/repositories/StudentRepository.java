package be.thomasmore.froomi.repositories;

import org.springframework.data.repository.CrudRepository;
import be.thomasmore.froomi.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
