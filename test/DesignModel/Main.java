package test.DesignModel;
public class Main{
    public static void main(String[] args) {
        IHeroFactory sentinelFactory = new SentinelFactory();//近卫工厂
        IStrengthHero sentineStrengthHero = sentinelFactory.getStrengthHero();//获取一个英雄,这个英雄一定时近卫军团的
        IAgileHero sentineStrAgileHero = sentinelFactory.getAgileHero();//获取一个近卫军团的敏捷的英雄
        System.out.println("近卫军团");
        sentineStrAgileHero.createHero();
        sentineStrengthHero.createHero();

        IHeroFactory scourgeFactory = new ScourgeFactory();//天灭军团
        IStrengthHero scourStrengthHero = scourgeFactory.getStrengthHero();//获取天灭军团的力量英雄
        IAgileHero scourAgileHero = scourgeFactory.getAgileHero();//获取天灭军团的冥界英雄
        System.out.println("天灭军团");
        scourAgileHero.createHero();
        scourStrengthHero.createHero();
    }
}