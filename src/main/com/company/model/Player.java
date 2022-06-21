package main.com.company.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "player")
@DiscriminatorValue(value = "player_har")
public class Player extends Character {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idplayer", updatable = false, nullable = true)
    private String idplayer;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY,optional = true)
    @JoinColumn(name = "inventory_fk")
    private Inventory inventory;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY,optional = true)
    @JoinColumn(name = "equipment_fk")
    private Equipment equipment;

    public Player(String name, int level, Inventory inventory, Equipment equipment, int maxHealthPoints, int healthPoints, int strength, int defense, int speed, int dexterity, String charClass, int money, int experiencePoints, int charisma) {
        super(name, level, maxHealthPoints, healthPoints, strength, defense, speed, dexterity, charClass, money, experiencePoints, charisma);
        this.inventory = inventory;
        this.equipment = equipment;
    }

}
