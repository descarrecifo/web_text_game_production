package main.com.company.servicejpa;

import main.com.company.model.NPC;
import main.com.company.repository.RepositoryNPC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class ServiceNPC {

    @Autowired
    private RepositoryNPC repoNPC;

    private static RepositoryNPC repoN;

    @PostConstruct
    public void init(){
        this.repoN = repoNPC;

    }

    public  NPC findbyChoise(int choise){
        Optional<NPC> o = repoN.findByChoise(choise);
        NPC n = o.get();
        return n;
    }




}
