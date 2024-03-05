package shanice.spring6webapp.repositories;

import shanice.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
