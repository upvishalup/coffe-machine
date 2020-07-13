package com.game.machine.breverage.model;

import com.game.machine.constant.BeverageType;

import static com.game.machine.constant.Constant.NOT_REQUIRED_CONTENT_MARKER;

public class ElaichiTea extends BeveragesCapacity implements Beverage {

    private static final BeverageType beverageType = BeverageType.elaichi_tea;

    public ElaichiTea() {
    }

    public ElaichiTea(int hotWater, int hotMilk, int elaichiSyrup, int sugarSyrup, int teaLeavesSyrup) {
        super(hotWater, hotMilk, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER, elaichiSyrup, sugarSyrup, teaLeavesSyrup, NOT_REQUIRED_CONTENT_MARKER);
    }

    @Override
    public BeverageType getBeverageType() {
        return beverageType;
    }

}
