package com.makersharks.search_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Page<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcesses, int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(location, natureOfBusiness, manufacturingProcesses, pageable);
    }

    public Page<Supplier> querySuppliers(SupplierQueryRequest request, Pageable pageable) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
                request.getLocation(),
                request.getNatureOfBusiness(),
                request.getManufacturingProcesses(),
                pageable
        );
    }
}