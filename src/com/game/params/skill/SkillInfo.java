package com.game.params.skill;

import java.util.List;
import java.util.ArrayList;
import com.game.params.*;

//技能信息(工具自动生成，请勿手动修改！）
public class SkillInfo implements IProtocol {
	public List<Integer> skills;//所有技能id
	public List<Integer> curSkills;//当前使用的技能id
	public List<SkillCardVo> skillCards;//技能卡
	public List<Integer> curCards;//当前装载的技能卡id(是自增长id）


	public void decode(BufferBuilder bb) {
		this.skills = bb.getIntList();
		this.curSkills = bb.getIntList();
		
        if (bb.getNullFlag())
            this.skillCards = null;
        else {
            int length = bb.getInt();
            this.skillCards = new ArrayList<SkillCardVo>();
            for (int i = 0; i < length; i++)
            {
                //如果元素不够先创建一个，Java泛型创建对象，性能？
                boolean isNull = bb.getNullFlag();

                //如果不是null就解析
                if(isNull)
                {
                    this.skillCards.add(null);
                }
                else
                {
                    SkillCardVo instance = new SkillCardVo();
                    instance.decode(bb);
                    this.skillCards.add(instance);
                }

            }
        }
		this.curCards = bb.getIntList();
	}

	public void encode(BufferBuilder bb) {
		bb.putIntList(this.skills);
		bb.putIntList(this.curSkills);
		bb.putProtocolVoList(this.skillCards);
		bb.putIntList(this.curCards);
	}
}
