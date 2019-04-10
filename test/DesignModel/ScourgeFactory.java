package test.DesignModel;
public class ScourgeFactory implements IHeroFactory{
//天灭军团工厂
    @Override
    public IStrengthHero getStrengthHero() {
        return new StrengHero("流浪剑圣-力量");
    }

    @Override
    public IAgileHero getAgileHero() {
        return new AgileHero("剑客-敏捷");
    }

}