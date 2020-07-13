package com.game.machine.breverage.model;

import com.game.machine.constant.BeverageType;

import static com.game.machine.constant.Constant.NOT_REQUIRED_CONTENT_MARKER;

public class Coffee extends BeveragesCapacity implements Beverage{

    private static final BeverageType beverageType = BeverageType.coffee;

    public Coffee() {}

    public Coffee(int hotWater, int hotMilk, int gingerSyrup, int coffeeSyrup, int sugarSyrup) {
        super(hotWater, hotMilk, gingerSyrup, coffeeSyrup, NOT_REQUIRED_CONTENT_MARKER, sugarSyrup, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER);
    }

    @Override
    public BeverageType getBeverageType() {
        return beverageType;
    }
}
