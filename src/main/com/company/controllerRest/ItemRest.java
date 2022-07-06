package main.com.company.controllerRest;

import main.com.company.servicejpa.ServiceItemJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemRest {

    @Autowired
    ServiceItemJPA serviceItemJPA;

//    @PostMapping("/add")
//    public Item saveE(@RequestBody Item item){
//
//        return serviceItem.saveR(item);
//    }


}
