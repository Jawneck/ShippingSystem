package com.ships.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ships.model.OrderInfo;
import com.ships.model.Ship;

public interface ShipInterface extends CrudRepository<Ship, Long>{

}
