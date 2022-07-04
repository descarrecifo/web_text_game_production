package main.com.company.repository;

import main.com.company.model.Player;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPlayer extends JpaRepository<Player,Integer> {

    @Query("select p from Player where p.charClass =:charClass")
    public  Player findBycharClass(@Param("charClass") String charClass);
}
