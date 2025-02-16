package world.hello.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import world.hello.inventory.dto.entity.InventoryEntity;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity, Long> {

  @Query(
      "SELECT COUNT(i) > 0 FROM InventoryEntity i WHERE i.skuCode = :skuCode AND i.quantity >= :quantity")
  boolean isInStock(String skuCode, Integer quantity);
}