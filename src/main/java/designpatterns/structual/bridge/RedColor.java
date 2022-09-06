package designpatterns.structual.bridge;

public class RedColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Filling in red color");
    }
}
