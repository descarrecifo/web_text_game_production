package main.com.company.controllerRest;

import main.com.company.model.Equipment;
import main.com.company.model.Item;
import main.com.company.servicejpa.ServiceEquipment;
import main.com.company.servicejpa.ServiceItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemRest {

    @Autowired
    ServiceItem serviceItem;

    @PostMapping("/add")
    public Item saveE(@RequestBody Item item){

        return serviceItem.saveR(item);
    }
}
