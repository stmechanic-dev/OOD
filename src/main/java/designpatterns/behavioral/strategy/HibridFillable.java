package designpatterns.behavioral.strategy;

public class HibridFillable implements Fillable {

    @Override
    public void fill() {
        System.out.println("Заправляем бензином или электричеством на выбор!");
    }
}
