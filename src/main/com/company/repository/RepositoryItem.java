package main.com.company.repository;

import main.com.company.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryItem extends JpaRepository<Item,String> {
}
