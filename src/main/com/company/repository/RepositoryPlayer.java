package main.com.company.repository;

import main.com.company.model.Player;
import org.hibernate.annotations.Parameter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositoryPlayer extends JpaRepository<Player,Integer> {

@Query("select p from Player p where p.charClass =?1")
    public Optional<Player> findBycharClass(String charClass);


}
