package shanice.spring6webapp.repositories;

import shanice.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
