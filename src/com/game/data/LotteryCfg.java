package com.game.data;

/**
* c抽奖.xlsx(自动生成，请勿编辑！)
*/
public class LotteryCfg {
	public int id;//key
	public int singleId;//单抽奖励组
	public int multiId;//保底奖励组
	public int[] singlePrice;//单抽价格
	public int[] multiPrice;//连抽价格
	public int limit;//限购次数
	public int freePeriod;//免费时间间隔(小时)
	public int freeLimit;//每日最大免费次数
	public int vipLimit;//vip限制
}