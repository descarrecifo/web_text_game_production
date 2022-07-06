//package main.com.company.repository;
//
//import main.com.company.model.EquippableItem;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.Optional;
//
//public interface RepositoryEItem extends JpaRepository<EquippableItem,Integer> {
//
//    @Query("select x from EquippableItem x where x.choise = ?1")
//    public Optional<EquippableItem> findByChoise(int choise);
//}
