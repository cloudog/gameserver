package com.game.params.player;

import com.game.params.*;

//角色注册信息(工具自动生成，请勿手动修改！）
public class CRegVo implements IProtocol {
	public int vocation;//职业
	public int sex;//性别
	public String name;//角色名
	public String accName;//账号名称
	public String channel;//渠道
	public int version;//某些平台用于版本检测


	public void decode(BufferBuilder bb) {
		this.vocation = bb.getInt();
		this.sex = bb.getInt();
		this.name = bb.getString();
		this.accName = bb.getString();
		this.channel = bb.getString();
		this.version = bb.getInt();
	}

	public void encode(BufferBuilder bb) {
		bb.putInt(this.vocation);
		bb.putInt(this.sex);
		bb.putString(this.name);
		bb.putString(this.accName);
		bb.putString(this.channel);
		bb.putInt(this.version);
	}
}
