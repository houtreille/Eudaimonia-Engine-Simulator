package com.eblood.ees.model.repository;

import com.eblood.ees.model.entity.HumanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<HumanEntity, Long> {
}
