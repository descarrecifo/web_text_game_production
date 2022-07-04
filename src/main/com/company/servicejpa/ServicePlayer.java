package main.com.company.servicejpa;

import main.com.company.model.Item;
import main.com.company.model.Player;
import main.com.company.repository.RepositoryItem;
import main.com.company.repository.RepositoryPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class ServicePlayer {

    @Autowired
    static RepositoryPlayer repoPlayer;
    @Autowired
    static RepositoryItem repoItem;


    public  Player findBycharClass(String name,String charClass ){
        Player p = repoPlayer.findBycharClass(charClass);
        p.setName(name);
        return p;
    }



    public Item getItem(Player p ){
        Item i = new Item();

        if(p.getCharClass() == "Cleric"){
            i = repoItem.findByName("Tunic");
        }
        if(p.getCharClass() == "Mage"){
             i=  repoItem.findByName("Tunic");
        }
        if(p.getCharClass() == "Monk"){
             i=   repoItem.findByName("Wooden stick");
        }
        if(p.getCharClass() == "Paladin"){
             i=   repoItem.findByName("Sword");
        }
        if(p.getCharClass() == "Hunter"){
             i=   repoItem.findByName("Bow");
        }
        if(p.getCharClass() == "Hunter"){
             i=   repoItem.findByName("Bow");
        }
        if(p.getCharClass() == "Rogue"){
             i=   repoItem.findByName("Dagger");
        }
        if(p.getCharClass() == "Warrior"){
             i=  repoItem.findByName("Sword");
        }

        return i;
    }
}
