package com.morrisons.esel.price.healthcheck;

import com.codahale.metrics.health.HealthCheck;

public class PriceHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
