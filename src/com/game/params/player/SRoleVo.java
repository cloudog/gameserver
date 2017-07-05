package com.game.params.player;

import com.game.params.*;

//角色列表信息(工具自动生成，请勿手动修改！）
public class SRoleVo implements IProtocol {
	public int playerId;//角色id
	public String name;//角色名
	public int sex;//性别
	public int vocation;//职业
	public int level;//等级
	public int fashionId;//时装id
	public int weapon;//武器
	public int weaponSoulRank;//器魂阶
	public long lastLoginTime;//上次登录时间
	public int vip;//vip
	public int exp;//经验
	public int title;//称号
	public String gang;//公会
	public int attack;//攻击
	public int defense;//防守
	public int crit;//暴击
	public int symptom;//症状
	public int fu;//符能
	public int hp;//血量
	public int head;//头部


	public void decode(BufferBuilder bb) {
		this.playerId = bb.getInt();
		this.name = bb.getString();
		this.sex = bb.getInt();
		this.vocation = bb.getInt();
		this.level = bb.getInt();
		this.fashionId = bb.getInt();
		this.weapon = bb.getInt();
		this.weaponSoulRank = bb.getInt();
		this.lastLoginTime = bb.getLong();
		this.vip = bb.getInt();
		this.exp = bb.getInt();
		this.title = bb.getInt();
		this.gang = bb.getString();
		this.attack = bb.getInt();
		this.defense = bb.getInt();
		this.crit = bb.getInt();
		this.symptom = bb.getInt();
		this.fu = bb.getInt();
		this.hp = bb.getInt();
		this.head = bb.getInt();
	}

	public void encode(BufferBuilder bb) {
		bb.putInt(this.playerId);
		bb.putString(this.name);
		bb.putInt(this.sex);
		bb.putInt(this.vocation);
		bb.putInt(this.level);
		bb.putInt(this.fashionId);
		bb.putInt(this.weapon);
		bb.putInt(this.weaponSoulRank);
		bb.putLong(this.lastLoginTime);
		bb.putInt(this.vip);
		bb.putInt(this.exp);
		bb.putInt(this.title);
		bb.putString(this.gang);
		bb.putInt(this.attack);
		bb.putInt(this.defense);
		bb.putInt(this.crit);
		bb.putInt(this.symptom);
		bb.putInt(this.fu);
		bb.putInt(this.hp);
		bb.putInt(this.head);
	}
}
