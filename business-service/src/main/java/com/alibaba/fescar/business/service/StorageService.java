package com.alibaba.fescar.business.service;

import com.alibaba.fescar.business.dto.StorageDTO;
import com.alibaba.fescar.business.service.impl.StorageFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@FeignClient(name = "STORAGE-SERVICE", fallback = StorageFallback.class)
public interface StorageService {

    /**
     * 更新库存
     * @param storageDTO
     */
    @RequestMapping(method = RequestMethod.POST)
    void updateStorage(StorageDTO storageDTO);

}
