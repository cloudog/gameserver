package com.game.params.friend;

import com.game.params.*;

//好友信息Item(工具自动生成，请勿手动修改！）
public class FriendVo implements IProtocol {
	public int code;//错误码
	public int playerId;//玩家id
	public String name;//玩家名称
	public int lev;//等级
	public int vip;//vip等级
	public boolean online;//是否在线
	public int fightStrength;//战斗力
	public int vocation;//职业
	public String gang;//工会


	public void decode(BufferBuilder bb) {
		this.code = bb.getInt();
		this.playerId = bb.getInt();
		this.name = bb.getString();
		this.lev = bb.getInt();
		this.vip = bb.getInt();
		this.online = bb.getBoolean();
		this.fightStrength = bb.getInt();
		this.vocation = bb.getInt();
		this.gang = bb.getString();
	}

	public void encode(BufferBuilder bb) {
		bb.putInt(this.code);
		bb.putInt(this.playerId);
		bb.putString(this.name);
		bb.putInt(this.lev);
		bb.putInt(this.vip);
		bb.putBoolean(this.online);
		bb.putInt(this.fightStrength);
		bb.putInt(this.vocation);
		bb.putString(this.gang);
	}
}
