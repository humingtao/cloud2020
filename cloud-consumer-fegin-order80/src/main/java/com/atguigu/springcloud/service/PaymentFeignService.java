package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: PaymentFeignService
 * @Author: Lenovo
 * @Description: 支付服务的接口
 * @Date: 2020/5/23 22:34
 * @Version: 1.0
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    CommonResult<Payment> getPaymentById(@Param("id") Long id);
}
