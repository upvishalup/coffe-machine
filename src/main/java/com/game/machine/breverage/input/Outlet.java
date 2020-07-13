package com.game.machine.breverage.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Outlet {

    @JsonProperty("count_n")
    int count;

    public Outlet() {
    }

    public Outlet(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
