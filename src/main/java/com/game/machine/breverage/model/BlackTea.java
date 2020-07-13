package com.game.machine.breverage.model;

import com.game.machine.constant.BeverageType;

import static com.game.machine.constant.Constant.NOT_REQUIRED_CONTENT_MARKER;

public class BlackTea extends BeveragesCapacity implements Beverage{

    private static final BeverageType beverageType = BeverageType.black_tea;

    public BlackTea() {

    }

    public BlackTea(int hotWater, int gingerSyrup, int sugarSyrup, int teaLeavesSyrup) {
        super(hotWater, NOT_REQUIRED_CONTENT_MARKER, gingerSyrup, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER,
                sugarSyrup, teaLeavesSyrup, NOT_REQUIRED_CONTENT_MARKER);
    }

    @Override
    public BeverageType getBeverageType() {
        return beverageType;
    }
}
