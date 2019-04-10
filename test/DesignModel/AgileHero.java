package test.DesignModel;
public class AgileHero implements IAgileHero{//力量型英雄的具体实现类
    private String name;
    public AgileHero(String name){
        super();
        this.name = name;
    }
    @Override
    public void createHero() {
        System.out.println("创建敏捷型英雄："+name);
    }

}