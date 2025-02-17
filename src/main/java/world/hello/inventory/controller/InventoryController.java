package world.hello.inventory.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import world.hello.inventory.service.InventoryService;

@RestController
@RequestMapping("/api/v1/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {
  private final InventoryService inventoryService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
    log.info("GET /api/v1/inventory");
    log.info("Query Params: skuCode = {} quantity = {}", skuCode, quantity);
    return inventoryService.isInStock(skuCode, quantity);
  }
}