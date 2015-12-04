package animalsTest;


public class Dog extends Domestic {
    public Dog(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

@Override
    public String getVoice() {
        String result =super.getVoice() + ". Woof";
        return result;
    }
}
