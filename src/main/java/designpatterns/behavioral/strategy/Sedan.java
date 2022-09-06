package designpatterns.behavioral.strategy;

public class Sedan extends Auto {

    public Sedan() {
        super(new StandartFillable());
    }
}
