package com.cpe.sa.main.Repository;

import com.cpe.sa.main.Entity.DiseaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface  DiseaseRepository extends JpaRepository<DiseaseEntity,Long> {
    DiseaseEntity findByAllergy(String allergy);
}
