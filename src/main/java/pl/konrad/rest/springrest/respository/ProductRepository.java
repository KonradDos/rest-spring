package pl.konrad.rest.springrest.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.konrad.rest.springrest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
