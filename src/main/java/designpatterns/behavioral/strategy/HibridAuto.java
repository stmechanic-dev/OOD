package designpatterns.behavioral.strategy;

public class HibridAuto extends Auto {
    public HibridAuto() {
        super(new HibridFillable());
    }
}
