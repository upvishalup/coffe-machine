package com.game.machine.breverage.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.game.machine.breverage.model.*;

public class Beverages {

    public Beverages() {
    }

    @JsonProperty("hot_tea")
    private HotTea hotTea;

    @JsonProperty("hot_coffee")
    private Coffee coffee;

    @JsonProperty("black_tea")
    private BlackTea blackTea;

    @JsonProperty("green_tea")
    private GreenTea greenTea;

    @JsonProperty("elaichi_tea")
    private ElaichiTea elaichiTea;

    @JsonProperty("hot_milk")
    private HotMilk hotMilk;

    @JsonProperty("hot_water")
    private HotWater hotWater;
}
