package designpatterns.behavioral.strategy;

public class F1Car extends Auto {
    public F1Car() {
        super(new F1Fillable());
    }
}
