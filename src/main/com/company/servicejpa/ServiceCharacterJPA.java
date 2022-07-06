package main.com.company.servicejpa;

import main.com.company.model.NPC;
import main.com.company.model.Player;
import main.com.company.repository.RepositoryChar;
import main.com.company.repository.RepositoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;
@Service
public class ServiceCharacterJPA {

    @Autowired
    private RepositoryChar repoChar;

    private  static RepositoryChar repoC;




    @PostConstruct
    public void init(){
        this.repoC = repoChar;


    }

    public Player findBycharClass(String name, String charClass ){
        Optional<Player> p = repoC.findBycharClass(charClass);
        Player k = p.get();
        k.setName(name);
        return k;
    }

    public NPC findbyChoise(int choise){
        Optional<NPC> o = repoC.findByChoise(choise);
        NPC n = o.get();
        return n;
    }




}
