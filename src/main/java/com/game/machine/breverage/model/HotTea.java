package com.game.machine.breverage.model;

import com.game.machine.constant.BeverageType;

import static com.game.machine.constant.Constant.NOT_REQUIRED_CONTENT_MARKER;

public class HotTea extends BeveragesCapacity implements Beverage {

    private static final BeverageType beverageType = BeverageType.hot_tea;

    public HotTea(){}

    public HotTea(int hotWater, int hotMilk, int gingerSyrup, int sugarSyrup, int teaLeavesSyrup) {
        super(hotWater, hotMilk, gingerSyrup, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER, sugarSyrup, teaLeavesSyrup, NOT_REQUIRED_CONTENT_MARKER);
    }

    @Override
    public BeverageType getBeverageType() {
        return beverageType;
    }

}
