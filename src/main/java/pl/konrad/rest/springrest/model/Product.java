package pl.konrad.rest.springrest.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "products")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "description", nullable = false, unique = true)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "weight", nullable = false)
    private Double weight;

}
