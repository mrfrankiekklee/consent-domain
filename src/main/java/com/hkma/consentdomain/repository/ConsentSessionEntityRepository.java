package com.hkma.consentdomain.repository;

import com.hkma.consentdomain.repository.entity.ConsentSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsentSessionEntityRepository extends JpaRepository<ConsentSessionEntity,String> {

}
