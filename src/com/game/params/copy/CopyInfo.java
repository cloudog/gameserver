package com.game.params.copy;

import java.util.List;
import java.util.ArrayList;
import com.game.params.*;

//所有副本信息(工具自动生成，请勿手动修改！）
public class CopyInfo implements IProtocol {
	public List<CopyVo> copys;//已打副本
	public List<Integer> threeStars;//已经领取的星级宝箱id


	public void decode(BufferBuilder bb) {
		
        if (bb.getNullFlag())
            this.copys = null;
        else {
            int length = bb.getInt();
            this.copys = new ArrayList<CopyVo>();
            for (int i = 0; i < length; i++)
            {
                //如果元素不够先创建一个，Java泛型创建对象，性能？
                boolean isNull = bb.getNullFlag();

                //如果不是null就解析
                if(isNull)
                {
                    this.copys.add(null);
                }
                else
                {
                    CopyVo instance = new CopyVo();
                    instance.decode(bb);
                    this.copys.add(instance);
                }

            }
        }
		this.threeStars = bb.getIntList();
	}

	public void encode(BufferBuilder bb) {
		bb.putProtocolVoList(this.copys);
		bb.putIntList(this.threeStars);
	}
}
