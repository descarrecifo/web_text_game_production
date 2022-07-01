package main.com.company.dto;

import main.com.company.model.Equipment;
import org.springframework.stereotype.Component;

@Component
public class DtoEquipmentMapper implements  MapperEquipment<DtoEquipment,Equipment>{

    @Override
    public Equipment map(DtoEquipment dtoEquipment) {
        Equipment e = new Equipment();
        e.setTotalDefense(dtoEquipment.getTotalDefense());
        e.setTotalSpeed(dtoEquipment.getTotalSpeed());
        e.setTotalDefense(dtoEquipment.getTotalDefense());
        e.setQuantityEquippedItems(dtoEquipment.getQuantityEquippedItems());

        return e;
    }
}
