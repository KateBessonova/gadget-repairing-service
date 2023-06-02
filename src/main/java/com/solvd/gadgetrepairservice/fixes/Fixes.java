package com.solvd.gadgetrepairservice.fixes;

public class Fixes {
    private String fixName;
    private double fixCost;
    public Fixes(String fixName, double fixCost) {
        this.fixName = fixName;
        this.fixCost = fixCost;
    }
    public String getFixName() {
        return fixName;
    }

    public void setFixName(String fixName) {
        this.fixName = fixName;
    }

    public double getFixCost() {
        return fixCost;
    }

    public void setFixCost(double fixCost) {
        this.fixCost = fixCost;
    }
}

