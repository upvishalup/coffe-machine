package com.game.machine.breverage.model;

import com.game.machine.constant.BeverageType;

import static com.game.machine.constant.Constant.NOT_REQUIRED_CONTENT_MARKER;

public class GreenTea extends BeveragesCapacity implements Beverage {

    private static final BeverageType beverageType = BeverageType.green_tea;

    public GreenTea() {}

    public GreenTea(int hotWater, int hotMilk, int gingerSyrup, int coffeeSyrup, int elaichiSyrup, int sugarSyrup, int teaLeavesSyrup, int greenTeaMixture) {
        super(hotWater, NOT_REQUIRED_CONTENT_MARKER, gingerSyrup, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER, sugarSyrup, NOT_REQUIRED_CONTENT_MARKER, greenTeaMixture);
    }

    @Override
    public BeverageType getBeverageType() {
        return beverageType;
    }
}
