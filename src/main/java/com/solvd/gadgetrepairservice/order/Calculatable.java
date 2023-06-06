package com.solvd.gadgetrepairservice.order;

public interface Calculatable {
    default double calculateEstimatedCost() {

        return 0;
    }
}

