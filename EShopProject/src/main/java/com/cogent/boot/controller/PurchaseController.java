package com.cogent.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Purchase;
import com.cogent.boot.repo.PurchaseRepo;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
	@Autowired
	PurchaseRepo pr;
	
	@GetMapping("/getPurchases")
	public List<Purchase> getPurchases(){
		return pr.findAll();
	}
	
	@PostMapping("/addPurchase")
	public Purchase addPurchase(@RequestBody Purchase p) {
		return pr.save(p);
	}
	
	@DeleteMapping("/deletePurchases/{pid}")
	public void deletePurchase(@PathVariable("pid") int pid) {
		pr.deleteById(pid);
	}
}
