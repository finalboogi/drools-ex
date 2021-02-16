package com.choco.springboottest.domain.config.drools.facttypes.pricingrule;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Policy {

    private String type;

    private boolean approved;

    private int discountPercent;

    private int basePrice;

    public void applyDiscount(int discount) {
        discountPercent += discount;
    }

}
