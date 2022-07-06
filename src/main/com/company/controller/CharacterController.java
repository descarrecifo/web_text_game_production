package main.com.company.controller;


import main.com.company.model.*;
import main.com.company.repository.RepositoryItem;
import main.com.company.repository.RepositoryPlayer;
import main.com.company.service.CharacterService;
import main.com.company.servicejpa.ServiceNPC;
import main.com.company.servicejpa.ServicePlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Controller;


import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static main.com.company.service.InventoryService.createItem;
@Controller
public class CharacterController {

    @Autowired
    private ServicePlayer servPlayer;
    @Autowired
    private ServiceNPC servNPC;

    private  static ServicePlayer sp;
    private  static ServiceNPC snpc;


    @PostConstruct
    public void init(){
        this.sp = servPlayer;
        this.snpc = servNPC;
    }


    public static Player createPlayer(String name, String charClass) {


        Player p1 = sp.findBycharClass(name,charClass);
        Item item = sp.getItem(p1);
        Player p2  = CharacterService.createPlayer(new ArrayList<>(), item,p1,new Inventory(10, new ArrayList<>()));
        return p2;
    }

    public static NPC createEnemyPlaceholder(int playerLevel) {

        int value = new Random().nextInt(1, 11);
        NPC npc =  snpc.findbyChoise(value);

        if(npc.getCharClass().equals("beast")){
            Item fur = new Item("Fur", "material", "The fur of an wild animal", 1, 1);
            npc.setTreasure(fur);
            return npc;
        }else if(npc.getCharClass().equals("golem")){
            Item clay = new Item("Clay", "material", "A handful of clay", 1, 1);
            npc.setTreasure(clay);
            return npc;
        }


        Item i = createItem();
        npc.setTreasure(i);
        return npc;


    }

}



