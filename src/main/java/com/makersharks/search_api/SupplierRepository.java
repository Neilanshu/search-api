package com.makersharks.search_api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    @Query("SELECT s FROM Supplier s WHERE LOWER(s.location) = LOWER(:location) AND LOWER(s.natureOfBusiness) = LOWER(:natureOfBusiness) AND LOWER(s.manufacturingProcesses) = LOWER(:manufacturingProcesses)")
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(
            @Param("location") String location,
            @Param("natureOfBusiness") String natureOfBusiness,
            @Param("manufacturingProcesses") String manufacturingProcesses,
            Pageable pageable
    );
}