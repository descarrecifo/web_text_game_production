package main.com.company.repository;

import main.com.company.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPlayer extends JpaRepository<Player,Integer> {
}
