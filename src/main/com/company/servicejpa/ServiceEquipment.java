package main.com.company.servicejpa;


import main.com.company.model.Equipment;

import main.com.company.repository.Repositoryequipment;
import org.springframework.stereotype.Service;

@Service
public class ServiceEquipment {

   private final  Repositoryequipment repoequipment;


    public ServiceEquipment(Repositoryequipment repoequipment) {
        this.repoequipment = repoequipment;

    }





    public Equipment createEquipment2(Equipment e){
        return repoequipment.save(e);
    }

}
