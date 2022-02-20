package com.abraxel.foodservice.repository;

import com.abraxel.foodservice.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
    @Override
    <S extends Measurement> S save(S entity);
}
