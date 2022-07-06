package main.com.company.servicejpa;

import main.com.company.model.Equipment;
import main.com.company.model.EquippableItem;
import main.com.company.model.Item;
import main.com.company.model.Player;
import main.com.company.repository.RepositoryItem;
import main.com.company.repository.Repositoryequipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class ServiceItem {

    @Autowired
    private RepositoryItem repoeitem;

    private static RepositoryItem repoei;

    @PostConstruct
    public void init(){
        this.repoei = repoeitem;

    }



    public EquippableItem findbyChoise(int choise){
        Optional<EquippableItem> o = repoei.findByChoise(choise);
        EquippableItem n = o.get();
        return n;
    }


}
