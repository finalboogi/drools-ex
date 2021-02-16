package com.choco.springboottest.domain.config.drools.facttypes.pricingrule;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Driver {

    private String name;

    private int age;

    private int priorClaims;

    private String locationRiskProfile;

}
