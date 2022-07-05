package main.com.company.repository;

import main.com.company.model.NPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RepositoryNPC extends JpaRepository<NPC,Integer> {

    @Query("select x from NPC x where x.choise = ?1")
    public Optional<NPC> findByChoise(int choise);
}
