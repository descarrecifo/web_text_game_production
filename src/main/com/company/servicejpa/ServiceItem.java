package main.com.company.servicejpa;

import main.com.company.model.Equipment;
import main.com.company.model.Item;
import main.com.company.repository.RepositoryItem;
import main.com.company.repository.Repositoryequipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceItem {

    @Autowired
    RepositoryItem repoItem;

    public Item saveR(Item item ){
        return repoItem.save(item);
    }
}
