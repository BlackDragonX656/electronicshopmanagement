package com.cogent.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Purchase;

@Repository
public interface PurchaseRepo extends JpaRepository<Purchase, Integer>{

}
