package cc.fish.simplegame.Item;

/**
 * Created by fish on 16-5-17.\
 * 附加属性
 */
public enum ExtraAttr {
    ATTACK_FIRE,        //火属性攻击
    ATTACK_WATER,       //冰属性攻击
    ATTACK_LIGHT,       //光属性攻击
    ATTACK_DARK,        //暗属性攻击
    BREAK_ATTACK,       //破招伤害
    P_CRITICAL_ATTACK,  //物理暴击伤害
    M_CRITICAL_ATTACK,  //魔法暴击伤害
    BACK_ATTACK,        //背击伤害
    DECREASE_DEF,       //降低物理防御
    DECREASE_MDEF,      //降低魔法防御
    REMOVE_PERCENT,     //减少目标百分比HP
    DAMAGE_INCREASE,    //伤害增加 取最高
    EXTRA_ATK,          //伤害附加 可叠加
    CURSE,              //诅咒， 降低攻击和防御
    BLESS,              //祝福， 增加四维
    SKILL,              //技能+1
}
