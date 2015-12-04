package animalsTest;

public class Wild extends Animal {
    private boolean IsPredator;

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        IsPredator = isPredator;
    }

    public boolean isPredator() {
        return IsPredator;
    }

    public void setPredator(boolean predator) {
        IsPredator = predator;
    }
}
