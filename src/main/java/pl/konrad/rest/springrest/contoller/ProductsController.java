package pl.konrad.rest.springrest.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.konrad.rest.springrest.model.Product;
import pl.konrad.rest.springrest.respository.ProductRepository;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductRepository repository;

    @GetMapping()
    public List<Product> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getOne(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

    @PostMapping
    public Product addProduct(@Valid @RequestBody Product product) {
        return repository.save(product);
    }

    @PatchMapping
    public void patchProduct(@Valid @RequestBody Product product, HttpServletResponse httpServletResponse) {
        int responseCode = repository.updateProductForId(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getWeight(), product.getCategory());
        if (responseCode == 1) httpServletResponse.setStatus(204);
        else httpServletResponse.setStatus(400);

    }
}
