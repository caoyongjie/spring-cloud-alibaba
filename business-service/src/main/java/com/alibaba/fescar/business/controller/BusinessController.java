package com.alibaba.fescar.business.controller;

import com.alibaba.fescar.business.dto.BusinessDTO;
import com.alibaba.fescar.business.dto.OrderDTO;
import com.alibaba.fescar.business.dto.StorageDTO;
import com.alibaba.fescar.business.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@RestController("business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @PostMapping
    public ResponseEntity<?> insert(@RequestBody BusinessDTO businessDTO){
        businessService.purchase(businessDTO);
        return ResponseEntity.ok(HttpEntity.EMPTY);
    }

}
