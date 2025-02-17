package world.hello.inventory.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import world.hello.inventory.repository.InventoryRepository;
import world.hello.inventory.service.InventoryService;

@Service
@Slf4j
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {
  private final InventoryRepository inventoryRepository;

  @Override
  public boolean isInStock(String skuCode, Integer quantity) {
    log.info("Checking if sku: {} is order for quantity: {}", skuCode, quantity);
    final boolean res = inventoryRepository.isInStock(skuCode, quantity);
    log.info("Can order: {}", res);
    return res;
  }
}