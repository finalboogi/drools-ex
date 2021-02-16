package com.choco.springboottest.api.controller;

import com.choco.springboottest.domain.service.pricingrule.ChocoPricingRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ChocoHelloWorldController {

    private final ChocoPricingRuleService chocoPricingRuleService;

    public ChocoHelloWorldController(ChocoPricingRuleService chocoPricingRuleService) {
        this.chocoPricingRuleService = chocoPricingRuleService;
    }

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello Choco's world~!";
    }

    @RequestMapping("/testDrools")
    public String testDrools() {
        int testResult = chocoPricingRuleService.test();
        log.info("testDrools result: {}", testResult);
        return String.format("testDrools result is %d", testResult);
    }

}
