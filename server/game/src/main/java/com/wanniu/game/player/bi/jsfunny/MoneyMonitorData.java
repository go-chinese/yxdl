package com.wanniu.game.player.bi.jsfunny;

import com.wanniu.game.item.VirtualItemType;
import com.wanniu.game.poes.PlayerPO;


public class MoneyMonitorData
        extends AnsycPublisher {
    protected String channel() {
        return "data.MoneyMonitor";
    }

    public MoneyMonitorData(PlayerPO player, VirtualItemType type, int today, int threshold) {
        this.data.put("os", player.os);
        this.data.put("channel", player.channel);
        this.data.put("subchannel", player.subchannel);
        this.data.put("id", player.id);
        this.data.put("name", player.name);

        this.data.put("level", Integer.valueOf(player.level));
        this.data.put("type", type.getItemcode());
        this.data.put("today", Integer.valueOf(today));
        this.data.put("threshold", Integer.valueOf(threshold));
    }
}


