package test.DesignModel;
public class SentinelFactory implements IHeroFactory{
//近卫军团工厂
    @Override
    public IStrengthHero getStrengthHero() {
        return new StrengHero("斧王-力量");
    }

    @Override
    public IAgileHero getAgileHero() {
        return new AgileHero("影魔-敏捷");
    }

}