package test.DesignModel;
public class StrengHero implements IStrengthHero{//力量型英雄的具体实现类
    private String name;
    public StrengHero(String name){
        super();
        this.name = name;
    }
    @Override
    public void createHero() {
        System.out.println("创建力量型英雄："+name);
    }

}