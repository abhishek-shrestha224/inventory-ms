package world.hello.inventory.service;

public interface InventoryService {
  boolean canOrder(String skuCode, Integer quantity);
}