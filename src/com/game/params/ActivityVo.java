package com.game.params;

import java.util.List;
import java.util.ArrayList;

//活动信息(工具自动生成，请勿手动修改！）
public class ActivityVo implements IProtocol {
	public short id;//活动id
	public String name;//名称
	public byte isOpen;//是否开启
	public byte bigType;//大类型
	public String icon;//图标
	public String logo;//标志
	public short sortRange;//排序
	public short showLev;//显示等级
	public byte timeType;//时间类型
	public String startTime;//开始时间
	public String endTime;//结束时间
	public List<MapVo> rewards1;//奖励
	public List<MapVo> rankRewards;//排名奖励
	public byte forwardView;//前往页面
	public String uiConfig;//界面配置
	public short type;//活动类型
	public int guildId;//系统开启
	public String content;//活动内容


	public void decode(BufferBuilder bb) {
		this.id = bb.getShort();
		this.name = bb.getString();
		this.isOpen = bb.getByte();
		this.bigType = bb.getByte();
		this.icon = bb.getString();
		this.logo = bb.getString();
		this.sortRange = bb.getShort();
		this.showLev = bb.getShort();
		this.timeType = bb.getByte();
		this.startTime = bb.getString();
		this.endTime = bb.getString();
		
        if (bb.getNullFlag())
            this.rewards1 = null;
        else {
            int length = bb.getInt();
            this.rewards1 = new ArrayList<MapVo>();
            for (int i = 0; i < length; i++)
            {
                //如果元素不够先创建一个，Java泛型创建对象，性能？
                boolean isNull = bb.getNullFlag();

                //如果不是null就解析
                if(isNull)
                {
                    this.rewards1.add(null);
                }
                else
                {
                    MapVo instance = new MapVo();
                    instance.decode(bb);
                    this.rewards1.add(instance);
                }

            }
        }
		
        if (bb.getNullFlag())
            this.rankRewards = null;
        else {
            int length = bb.getInt();
            this.rankRewards = new ArrayList<MapVo>();
            for (int i = 0; i < length; i++)
            {
                //如果元素不够先创建一个，Java泛型创建对象，性能？
                boolean isNull = bb.getNullFlag();

                //如果不是null就解析
                if(isNull)
                {
                    this.rankRewards.add(null);
                }
                else
                {
                    MapVo instance = new MapVo();
                    instance.decode(bb);
                    this.rankRewards.add(instance);
                }

            }
        }
		this.forwardView = bb.getByte();
		this.uiConfig = bb.getString();
		this.type = bb.getShort();
		this.guildId = bb.getInt();
		this.content = bb.getString();
	}

	public void encode(BufferBuilder bb) {
		bb.putShort(this.id);
		bb.putString(this.name);
		bb.putByte(this.isOpen);
		bb.putByte(this.bigType);
		bb.putString(this.icon);
		bb.putString(this.logo);
		bb.putShort(this.sortRange);
		bb.putShort(this.showLev);
		bb.putByte(this.timeType);
		bb.putString(this.startTime);
		bb.putString(this.endTime);
		bb.putProtocolVoList(this.rewards1);
		bb.putProtocolVoList(this.rankRewards);
		bb.putByte(this.forwardView);
		bb.putString(this.uiConfig);
		bb.putShort(this.type);
		bb.putInt(this.guildId);
		bb.putString(this.content);
	}
}
