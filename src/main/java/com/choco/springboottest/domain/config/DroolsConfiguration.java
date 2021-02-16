package com.choco.springboottest.domain.config;

import lombok.extern.slf4j.Slf4j;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class DroolsConfiguration {

    @Bean
    public StatelessKieSession pricingRuleKieSession() {
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        log.info("pricingRuleKieSession verify: {}", kc.verify().getMessages().toString());

        return kc.newStatelessKieSession("PricingRuleDecisionTableKieSession");
    }

}
