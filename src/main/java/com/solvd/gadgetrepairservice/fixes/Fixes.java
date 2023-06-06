package com.solvd.gadgetrepairservice.fixes;
import com.solvd.gadgetrepairservice.exception.InvalidFixTypeException;

public class Fixes {
    private String fixName;
    private double fixCost;

    public Fixes(String fixName, double fixCost) {
        validateFixName(fixName);
        this.fixName = fixName;
        this.fixCost = fixCost;
    }

    public Fixes() {
    }

    public String getFixName() {
        return fixName;
    }

    public void setFixName(String fixName) {
        validateFixName(fixName);
        this.fixName = fixName;
    }

    public double getFixCost() {
        return fixCost;
    }

    public void setFixCost(double fixCost) {
        this.fixCost = fixCost;
    }

    private void validateFixName(String fixName) {
        if (fixName == null || fixName.isEmpty()) {
            throw new InvalidFixTypeException("Invalid fix name: " + fixName);
        }
    }
}

