package com.store.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.entity.Store;
import com.store.repository.StoreRepository;

@RestController
@RequestMapping("/rest")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class StoreController {

	@Autowired
	StoreRepository storeRepo;

	@GetMapping("/stores")
	public List<Store> getStores() {

		return storeRepo.findAll();
	}

	@GetMapping("/stores/{id}")
	public Optional<Store> getStoreById(@PathVariable Long id) {

		return storeRepo.findById(id);
	}

	@DeleteMapping("/stores/{id}")
	public boolean deleteStore(@PathVariable long id) {
		storeRepo.deleteById(id);
		return true;
	}

	@PostMapping("/store")
	public Store createStore(Store store) {

		return storeRepo.save(store);
	}

	@PutMapping("/store/update")
	public Store updateStore(Store store) {
		return storeRepo.save(store);
	}

}
