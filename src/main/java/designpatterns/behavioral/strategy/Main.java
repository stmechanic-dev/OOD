package designpatterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        Auto sedan = new Sedan();
        Auto hybrid = new HibridAuto();
        Auto f1car = new F1Car();

        sedan.fill();
        hybrid.fill();
        f1car.fill();
    }
}