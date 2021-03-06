package com.wanniu.game.poes;

import com.alibaba.fastjson.annotation.JSONField;
import com.wanniu.core.game.entity.GEntity;
import com.wanniu.game.DBTable;
import com.wanniu.game.item.po.PlayerItemPO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@DBTable("player_fightlevel")
public class FightLevelsPO
        extends GEntity {
    public Map<Integer, Integer> todays;
    public Map<Integer, Integer> buys = new HashMap<>();


    public Map<Integer, Integer> finishes;

    public Map<Integer, Map<Integer, Integer>> dropedBossMap = new ConcurrentHashMap<>();
    public Map<Integer, ResourceDungeonPO> resourceDungeon;
    public RDDoubleRewardPO doubleReward;

    public static class ResourceDungeonPO {
        public int usedTimes;
        public int buyTimes;
        @JSONField(deserialize = false, serialize = false)
        public boolean entering = false;
    }

    public static class RDDoubleRewardPO {
        public Map<String, Integer> doubleVirtualItems;
        public List<PlayerItemPO> doubleItems;
    }
}


