package animalsTest;

public abstract class Domestic extends Animal {
    private String name;
    private boolean isVactinated;

    public Domestic(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVactinated() {
        return isVactinated;
    }

    public void setVactinated(boolean vactinated) {
        this.isVactinated = isVactinated;
    }

    @Override
    public String getVoice(){
        String result = super.getVoice()+"My name is "+name;
        return result;
    }
}
