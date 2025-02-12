package com.lombardinternational.classtest.springdata.repository;

import com.lombardinternational.classtest.springdata.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

}
