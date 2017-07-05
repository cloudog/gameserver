package com.game.params.gang;

import com.game.params.BufferBuilder;
import com.game.params.IProtocol;

//帮派记录(工具自动生成，请勿手动修改！）
public class GangRecord implements IProtocol {
	public int id;//自增长id
	public String record;//记录


	public void decode(BufferBuilder bb) {
		this.id = bb.getInt();
		this.record = bb.getString();
	}

	public void encode(BufferBuilder bb) {
		bb.putInt(this.id);
		bb.putString(this.record);
	}
}
