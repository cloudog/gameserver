package com.game.params.scene;

import com.game.params.*;

//移动信息(工具自动生成，请勿手动修改！）
public class MoveVo implements IProtocol {
	public int playerId;//玩家id
	public float x;//目标点x
	public float y;//目标点y
	public float z;//目标点z


	public void decode(BufferBuilder bb) {
		this.playerId = bb.getInt();
		this.x = bb.getFloat();
		this.y = bb.getFloat();
		this.z = bb.getFloat();
	}

	public void encode(BufferBuilder bb) {
		bb.putInt(this.playerId);
		bb.putFloat(this.x);
		bb.putFloat(this.y);
		bb.putFloat(this.z);
	}
}
