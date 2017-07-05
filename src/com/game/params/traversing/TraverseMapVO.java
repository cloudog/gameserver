package com.game.params.traversing;

import java.util.List;
import com.game.params.*;

//穿越仪地图(工具自动生成，请勿手动修改！）
public class TraverseMapVO implements IProtocol {
	public int mapId;//地图ID
	public int goodsCfgId;//物品配置ID
	public int copyCfgId;//副本ID
	public List<Integer> affixs;//词缀


	public void decode(BufferBuilder bb) {
		this.mapId = bb.getInt();
		this.goodsCfgId = bb.getInt();
		this.copyCfgId = bb.getInt();
		this.affixs = bb.getIntList();
	}

	public void encode(BufferBuilder bb) {
		bb.putInt(this.mapId);
		bb.putInt(this.goodsCfgId);
		bb.putInt(this.copyCfgId);
		bb.putIntList(this.affixs);
	}
}
