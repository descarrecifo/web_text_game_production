package main.com.company.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idinventory", updatable = false, nullable = true)
    private String idinventory;
    private int capacity;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "items_fk")
    private List<Item> items;


    public Inventory(int i, List<Item> items) {
        this.capacity = i;
        this.items = items;
    }
}
