package com.polydactyl.realtimegraphics;

public class Ingredient {
    Oil oil;
    String units;
    int amount;
    int percent;

    public Ingredient(Oil oil, int percent) {
        this.oil = oil;
        this.percent = percent;
    }

    public Oil getOil() {
        return oil;
    }

    public void setOil(Oil oil) {
        this.oil = oil;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
