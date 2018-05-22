package com.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.store.entity.Store;
import com.store.repository.StoreRepository;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner{
	
	@Autowired
	StoreRepository storeRepo;

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		storeRepo.save(new Store("Big Bazzar","Pune"));
		storeRepo.save(new Store("D-Mart","Delhi"));
		storeRepo.save(new Store("Pantalon","Bangalore"));
		
	}
}
