package com.your_name.rotp_item_stand.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;

public class GiveItemStand extends StandEntityAction {

    public GiveItemStand(StandEntityAction.Builder builder) {
        super(builder);
    }

    @Override
    public boolean enabledInHudDefault() {
        return false;
    }

}
