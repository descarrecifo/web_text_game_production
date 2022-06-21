package main.com.company.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name= "equippableItem")
@DiscriminatorValue(value = "equippableItem_itemc")
public class EquippableItem extends Item{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEquippableItem", updatable = false, nullable = true)
    private String idEquippableItem;
    int dexterity,
            charisma,
            defense,
            speed,
            strength;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "item_fk")
   private Item item;

    public EquippableItem(String name, String type, String description, int price, int quantity, int dexterity, int charisma, int defense, int speed, int strength) {
        super(name, type, description, price, quantity);
        this.dexterity = dexterity;
        this.charisma = charisma;
        this.defense = defense;
        this.speed = speed;
        this.strength = strength;
    }

}
