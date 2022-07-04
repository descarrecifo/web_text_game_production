package main.com.company.repository;

import main.com.company.model.Item;
import main.com.company.model.Player;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryItem extends JpaRepository<Item,String> {

    @Query("select i from Item where i.name =:name")
    public Item findByName(@Param("name") String name);
}
