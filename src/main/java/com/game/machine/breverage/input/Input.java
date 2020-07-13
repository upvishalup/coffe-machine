package com.game.machine.breverage.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.game.machine.breverage.model.TotalCapacity;

public class Input {

    @JsonProperty("outlets")
    private Outlet outlets;

    @JsonProperty("total_items_quantity")
    private TotalCapacity totalCapacity;

    @JsonProperty("beverages")
    private Beverages beverages;

    public Outlet getOutlets() {
        return outlets;
    }

    public TotalCapacity getTotalCapacity() {
        return totalCapacity;
    }

    public Beverages getBeverages() {
        return beverages;
    }
}
