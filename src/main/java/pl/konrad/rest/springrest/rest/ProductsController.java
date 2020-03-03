package pl.konrad.rest.springrest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.konrad.rest.springrest.model.Product;
import pl.konrad.rest.springrest.respository.ProductRepository;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductRepository repository;

    @GetMapping()
    public List<Product> get() {
        return repository.findAll();
    }

    @PostMapping
    public Product addProduct(@Valid @RequestBody Product product) {
        return repository.save(product);
    }
}
