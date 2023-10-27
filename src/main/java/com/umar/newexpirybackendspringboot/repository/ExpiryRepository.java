package com.umar.newexpirybackendspringboot.repository;

import com.umar.newexpirybackendspringboot.expiryModel.ExpiryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpiryRepository extends JpaRepository<ExpiryModel, Integer> {

}
