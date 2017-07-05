package com.game.module.task;

public class Task{
	/**
1通关指定副本
    **/
	
	public static final int TYPE_JOINT = 1;
	public static final int TYPE_DAILY = 2;
	public static final int TYPE_CHELLENGE = 3;
	public static final int TYPE_TASK = 4;
	public static final int TYPE_GANG = 5;
	
	public static final int FINISH_TRANSIT = 1;//通关[ID,类型,星级,次数]
	public static final int FINISH_KILL = 2;//击杀[类型,ID,次数]
	public static final int FINISH_WEAR = 3;//装备[品质,次数]
	public static final int FINISH_STRONG = 4;//强化[次数]/[等级,装备类型,个数]
	public static final int FINISH_DECOMPOSE = 5;//分解[次数]
	public static final int FINISH_STONE = 6;//宝石[次数]/[等级,装备类型,个数]
	public static final int FINISH_SKILL = 7;//技能[等级,卡等级,次数]
	public static final int FINISH_CARD_UPGRADE = 8;//卡牌升级[次数]/[等级,个数]
	public static final int FINISH_CONSUME = 9;//货币消耗[类型,数量]
	public static final int FINISH_CURRENCY = 10;//货币(累计)[类型,数量]
	public static final int FINISH_BUY_POWER = 11;//购买体力[次数]
	public static final int FINISH_STAR = 12;//升星[次数]/[等级,数量]
	public static final int FINISH_CLEAR = 13;//洗练[次数]
	public static final int FINISH_CARD_COMPOSE = 14;//卡牌合成[次数]/[品质,个数]
	public static final int FINISH_JOIN_PK = 15;//参加竞技[类型,次数]类型:1-AI竞技场;2-排位赛
	public static final int FINISH_ARTIFACT = 16;//神器解密[次数]
	public static final int FINISH_DONATE = 17;//公会捐献[类型,次数]
	public static final int FINISH_ENDLESS = 18;//无尽漩涡[层数]
	public static final int FINISH_LOTTERY = 19;//抽奖[类型,次数]
	
	public static final int STATE_INIT = 0;//未接(等级不够)
	public static final int STATE_ACCEPTED = 1;//已接
	public static final int STATE_FINISHED = 2;//完成
	public static final int STATE_SUBMITED = 3;//已提交


	private int taskId;
	private volatile int state;
	private volatile int count;
	
	public Task(){}
	
	
	public Task(int taskId, int state){
		this.taskId = taskId;
		this.state = state;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void alterCount(int value){
		this.count += value;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
