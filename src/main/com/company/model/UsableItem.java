package main.com.company.model;

import lombok.*;
import org.hibernate.engine.spi.Status;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

@DiscriminatorValue(value = "usableItem_itemc")
public class UsableItem extends Item{
    String use;
    int value;


    public UsableItem(String name, String type, String description, int price, int quantity, String use, int value) {
        super(name, type, description, price, quantity);
        this.use = use;
        this.value = value;
    }
}
