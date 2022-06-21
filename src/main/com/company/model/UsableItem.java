package main.com.company.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "usable_item")
@DiscriminatorValue(value = "usableItem_itemc")
public class UsableItem extends Item{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUsableItem", updatable = false, nullable = true)
    private String idUsableItem;
    String use;
    int value;


    public UsableItem(String name, String type, String description, int price, int quantity, String use, int value) {
        super(name, type, description, price, quantity);
        this.use = use;
        this.value = value;
    }
}
