package com.makersharks.search_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/api/supplier/query")
    public ResponseEntity<Page<Supplier>> querySuppliers(@RequestBody SupplierQueryRequest request, Pageable pageable) {
        Page<Supplier> suppliers = supplierService.querySuppliers(request, pageable);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }
}