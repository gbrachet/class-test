package com.lombardinternational.classtest.springdata.repository;

import com.lombardinternational.classtest.springdata.entity.PolicyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<PolicyEntity, Long> {


}
