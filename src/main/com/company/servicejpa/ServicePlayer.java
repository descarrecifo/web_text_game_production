package main.com.company.servicejpa;

import main.com.company.model.EquippableItem;
import main.com.company.model.Item;
import main.com.company.model.Player;
import main.com.company.repository.RepositoryItem;
import main.com.company.repository.RepositoryPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class ServicePlayer {



    @Autowired
    private RepositoryPlayer repoPlayer;
    @Autowired
    private  RepositoryItem repoItem;
    private  static RepositoryPlayer repoP;
    private static RepositoryItem repoI;



    @PostConstruct
    public void init(){
        this.repoP = repoPlayer;
        this.repoI = repoItem;

    }


    public  Player findBycharClass(String name,String charClass ){
        Optional<Player> p = repoP.findBycharClass(charClass);
        Player k = p.get();
        k.setName(name);
        return k;
    }


    public Item getItem(Player p ){
      Optional<Item>  i = repoI.findByName(p.getNameItem());
      return i.get();

    }
}
