package com.game.machine.breverage.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BeveragesCapacity {

    @JsonProperty("hot_water")
    private int hotWater;
    @JsonProperty("hot_milk")
    private int hotMilk;
    @JsonProperty("ginger_syrup")
    private int gingerSyrup;
    @JsonProperty("coffee_syrup")
    private int coffeeSyrup;
    @JsonProperty("elaichi_syrup")
    private int elaichiSyrup;
    @JsonProperty("sugar_syrup")
    private int sugarSyrup;
    @JsonProperty("tea_leaves_syrup")
    private int teaLeavesSyrup;
    @JsonProperty("green_mixture")
    private int greenTeaMixture;

    BeveragesCapacity() {
    }

    BeveragesCapacity(int hotWater, int hotMilk, int gingerSyrup, int coffeeSyrup, int elaichiSyrup, int sugarSyrup, int teaLeavesSyrup, int greenTeaMixture) {
        this.hotWater = hotWater;
        this.hotMilk = hotMilk;
        this.gingerSyrup = gingerSyrup;
        this.coffeeSyrup = coffeeSyrup;
        this.elaichiSyrup = elaichiSyrup;
        this.sugarSyrup = sugarSyrup;
        this.teaLeavesSyrup = teaLeavesSyrup;
        this.greenTeaMixture = greenTeaMixture;
    }

    public int getHotWater() {
        return hotWater;
    }

    public int getHotMilk() {
        return hotMilk;
    }

    public int getGingerSyrup() {
        return gingerSyrup;
    }

    public int getCoffeeSyrup() {
        return coffeeSyrup;
    }

    public int getElaichiSyrup() {
        return elaichiSyrup;
    }

    public int getSugarSyrup() {
        return sugarSyrup;
    }

    public int getTeaLeavesSyrup() {
        return teaLeavesSyrup;
    }

    public int getGreenTeaMixture() {
        return greenTeaMixture;
    }
}