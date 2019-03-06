package org.esurovskiy.test4;

public class Car extends Vehicle implements Comparable {
    private int speed;

    public Car(final int speed) {
        this.speed = speed;
    }

    void doSomething() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }

    int getCount() {
        return 5;
    }

    public int compareTo(final Object o) {
        Car that = (Car) o;
        return this.speed-that.speed;

    }
}
