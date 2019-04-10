package test.DesignModel;

//英雄生产抽象工厂

public interface IHeroFactory{
    //获取力量型英雄
    public IStrengthHero getStrengthHero();
    //获取敏捷型英雄
    public IAgileHero getAgileHero();
}