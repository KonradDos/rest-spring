package pl.konrad.rest.springrest.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.konrad.rest.springrest.model.Category;
import pl.konrad.rest.springrest.model.Product;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
