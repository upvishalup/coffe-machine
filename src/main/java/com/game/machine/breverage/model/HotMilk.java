package com.game.machine.breverage.model;

import com.game.machine.constant.BeverageType;

import static com.game.machine.constant.Constant.NOT_REQUIRED_CONTENT_MARKER;

public class HotMilk extends BeveragesCapacity implements Beverage {

    private static final BeverageType beverageType = BeverageType.hot_milk;

    public HotMilk() {

    }

    public HotMilk(int hotMilk) {
        super(NOT_REQUIRED_CONTENT_MARKER, hotMilk, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER,
                NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER, NOT_REQUIRED_CONTENT_MARKER);
    }

    @Override
    public BeverageType getBeverageType() {
        return beverageType;
    }
}
