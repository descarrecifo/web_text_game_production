package main.com.company.servicejpa;

import main.com.company.dto.DtoEquipment;
import main.com.company.dto.DtoEquipmentMapper;
import main.com.company.model.Equipment;

import main.com.company.repository.Repositoryequipment;
import org.springframework.stereotype.Service;

@Service
public class ServiceEquipment {

   private final  Repositoryequipment repoequipment;
   private  final DtoEquipmentMapper dtoEquipmentMapper;

    public ServiceEquipment(Repositoryequipment repoequipment, DtoEquipmentMapper dtoEquipmentMapper) {
        this.repoequipment = repoequipment;
        this.dtoEquipmentMapper = dtoEquipmentMapper;
    }



    public Equipment createEquipment(DtoEquipment dto){
        Equipment mb = dtoEquipmentMapper.map(dto);
        return repoequipment.save(mb);
    }

    public Equipment createEquipment2(Equipment e){
        return repoequipment.save(e);
    }

}
