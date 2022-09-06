package designpatterns.behavioral.strategy;

public class F1Fillable implements Fillable {
    @Override
    public void fill() {
        System.out.println("Заправляем бензин только после всех остальных процедур пит-стопа!");
    }
}
