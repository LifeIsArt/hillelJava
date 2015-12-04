package animalsTest;


public class Cat extends Domestic{
    public Cat(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

@Override
    public String getVoice() {
        String result =super.getVoice() + ". Meow";
        return result;

    }
}
