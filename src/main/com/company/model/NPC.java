package main.com.company.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue(value = "npc_char")
public class NPC extends Character {


//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY,optional = true)
//    @JoinColumn(name = "treasure_fk")
    @Transient
    private Item treasure;

    public NPC(String name, int level, Item treasure, int maxHealthPoints, int healthPoints, int strength, int defense, int speed, int dexterity, String charClass, int money, int experiencePoints, int charisma) {
        super(name, level, maxHealthPoints, healthPoints, strength, defense, speed, dexterity, charClass, money, experiencePoints, charisma);
        this.treasure = treasure;
    }

}
