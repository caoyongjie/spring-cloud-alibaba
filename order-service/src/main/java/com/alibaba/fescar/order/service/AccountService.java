package com.alibaba.fescar.order.service;

import com.alibaba.fescar.order.dto.AccountDTO;
import com.alibaba.fescar.order.service.impl.AccountFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@FeignClient(name = "ACCOUNT-SERVICE",fallback = AccountFallback.class)
public interface AccountService {

    /**
     * 账户余额更新
     * @param accountDTO
     */
    @RequestMapping(method = RequestMethod.POST)
    void updateAccount(AccountDTO accountDTO);

}
