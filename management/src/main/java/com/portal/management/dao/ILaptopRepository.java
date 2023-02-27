package com.portal.management.dao;

import com.portal.management.model.Laptop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepository extends JpaRepository<Laptop, Integer> {
}
