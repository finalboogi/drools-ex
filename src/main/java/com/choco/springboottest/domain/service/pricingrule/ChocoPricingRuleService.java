package com.choco.springboottest.domain.service.pricingrule;

import com.choco.springboottest.domain.config.drools.facttypes.pricingrule.Driver;
import com.choco.springboottest.domain.config.drools.facttypes.pricingrule.Policy;
import lombok.extern.slf4j.Slf4j;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Slf4j
@Service
public class ChocoPricingRuleService {

    private final StatelessKieSession pricingRuleKieSession;

    public ChocoPricingRuleService(StatelessKieSession pricingRuleKieSession) {
        this.pricingRuleKieSession = pricingRuleKieSession;
    }

    public int test() {
        // create some test data
        Driver driver = Driver.builder().name("Choco").age(30).priorClaims(0).locationRiskProfile("LOW").build();
        Policy policy = Policy.builder().type("COMPREHENSIVE").approved(false).discountPercent(0).build();

        pricingRuleKieSession.execute(Arrays.asList(driver, policy));

        log.info("basePrice is: {}", policy.getBasePrice());
        log.info("discountPercent is: {}", policy.getDiscountPercent());

        return policy.getBasePrice();
    }

}
