package designpatterns.behavioral.strategy;

public class StandartFillable implements Fillable {
    @Override
    public void fill() {
        System.out.println("Просто заправляем бензин!");
    }
}
