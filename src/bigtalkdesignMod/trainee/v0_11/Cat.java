package bigtalkdesignMod.trainee.v0_11;

public abstract class Cat extends Animal {

    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getShoutSound() {
        // TODO Auto-generated method stub
        return "喵";
    }
}
