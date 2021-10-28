package th.ac.ku.restaurant.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.restaurant.model.Restaurant;

//import java.util.UUID;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
