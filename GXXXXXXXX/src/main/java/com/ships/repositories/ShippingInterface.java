package com.ships.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ships.model.ShippingCompany;

public interface ShippingInterface extends CrudRepository<ShippingCompany, Long>{

}
