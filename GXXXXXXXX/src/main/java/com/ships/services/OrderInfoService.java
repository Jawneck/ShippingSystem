 package com.ships.services;

import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ships.model.Ship;
import com.ships.repositories.ShipInterface;
 
@Service
public class OrderInfoService {

	@Autowired
		private ShipInterface shipInterface;
	
	public ArrayList<Ship> listAll(){
		return (ArrayList<Ship>) shipInterface.findAll();
	}
}
	