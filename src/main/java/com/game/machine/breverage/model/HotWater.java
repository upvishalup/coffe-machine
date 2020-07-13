package com.game.machine.breverage.model;

import com.game.machine.constant.BeverageType;

import static com.game.machine.constant.Constant.NOT_REQUIRED_CONTENT_MARKER;

public class HotWater extends BeveragesCapacity implements Beverage {

    private BeverageType beverageType = BeverageType.hot_water;

    public HotWater() {

    }

    public HotWater(int hotWater) {
        super(hotWater, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER,
                NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER);
    }

    @Override
    public BeverageType getBeverageType() {
        return beverageType;
    }
}
