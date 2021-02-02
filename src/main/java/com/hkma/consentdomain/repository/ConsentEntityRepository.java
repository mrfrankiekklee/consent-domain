package com.hkma.consentdomain.repository;

import com.hkma.consentdomain.repository.entity.ConsentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConsentEntityRepository extends JpaRepository<ConsentEntity,String> {

    Optional<ConsentEntity> findById(String consentId);



}