package designpatterns.behavioral.strategy;

public class Auto {

    private Fillable fillStrategy;

    public Auto(Fillable fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void fill() {
        fillStrategy.fill();
    }

    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

    public void setFillable(Fillable fillStrategy) {
        this.fillStrategy = fillStrategy;
    }
}
