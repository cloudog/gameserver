package com.game.params;

import java.util.List;
import java.util.ArrayList;

//掉落奖励(工具自动生成，请勿手动修改！）
public class DropReward implements IProtocol {
	public List<Reward> rewards;//奖励
	public int id;//唯一怪物id
	public float x;//x
	public float y;//y
	public float z;//z


	public void decode(BufferBuilder bb) {
		
        if (bb.getNullFlag())
            this.rewards = null;
        else {
            int length = bb.getInt();
            this.rewards = new ArrayList<Reward>();
            for (int i = 0; i < length; i++)
            {
                //如果元素不够先创建一个，Java泛型创建对象，性能？
                boolean isNull = bb.getNullFlag();

                //如果不是null就解析
                if(isNull)
                {
                    this.rewards.add(null);
                }
                else
                {
                    Reward instance = new Reward();
                    instance.decode(bb);
                    this.rewards.add(instance);
                }

            }
        }
		this.id = bb.getInt();
		this.x = bb.getFloat();
		this.y = bb.getFloat();
		this.z = bb.getFloat();
	}

	public void encode(BufferBuilder bb) {
		bb.putProtocolVoList(this.rewards);
		bb.putInt(this.id);
		bb.putFloat(this.x);
		bb.putFloat(this.y);
		bb.putFloat(this.z);
	}
}
