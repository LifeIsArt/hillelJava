package oop;

public class test {
    public static void main(String[] args) {
        float f  = 10_000_000;
        for (int i = 0; i < 10_000_000; i++) {
            f+=1;
        }
        System.out.println(f);
    }
}
