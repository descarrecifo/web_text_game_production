package main.com.company.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idequipment", updatable = false, nullable = true)
    private String idequipment;
    private int quantityEquippedItems,
            totalDefense,
            totalSpeed,
            totalStrenght;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_item_fk")
    private List<EquippableItem> equipments;


    public Equipment(int i, int i1, int i2, int i3, List<EquippableItem> equipments) {
        this.quantityEquippedItems = i;
        this.totalDefense = i1;
        this.totalSpeed = i2;
        this.totalStrenght = i3;
        this.equipments = equipments;
    }
}
