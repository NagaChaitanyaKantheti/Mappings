package com.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mappings.models.Stage;

@Repository
public interface StageRepository extends JpaRepository<Stage,String>{

}
