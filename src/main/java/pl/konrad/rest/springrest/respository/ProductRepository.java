package pl.konrad.rest.springrest.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.konrad.rest.springrest.model.Category;
import pl.konrad.rest.springrest.model.Product;

import javax.transaction.Transactional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Transactional
    @Modifying
    @Query("update Product p set p.name = :name, p.description = :description, p.price = :price, p.weight = :weight, p.category = :category where p.id = :id")
    int updateProductForId(@Param("id") Long id, @Param("name") String name, @Param("description") String description, @Param("price") double price, @Param("weight") double weight, @Param("category") Category category);

}
