package com.solvd.gadgetrepairservice.fixes;

public class Screen extends Fixes {
    private String screenIssue;
    private int screenSize;

    public Screen(String screenIssue, int screenSize) {
        super();
        this.screenIssue = screenIssue;
        this.screenSize = screenSize;
    }

    public String getScreenIssue() {
        return screenIssue;
    }

    public void setScreenIssue(String screenIssue) {

        this.screenIssue = screenIssue;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}

