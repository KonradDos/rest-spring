package pl.konrad.rest.springrest.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.konrad.rest.springrest.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
