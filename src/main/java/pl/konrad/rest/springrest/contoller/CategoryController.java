package pl.konrad.rest.springrest.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.konrad.rest.springrest.model.Category;
import pl.konrad.rest.springrest.respository.CategoryRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @PostMapping
    public Category createCategory(@Valid @RequestBody Category category) {
        return categoryRepository.save(category);
    }

}
