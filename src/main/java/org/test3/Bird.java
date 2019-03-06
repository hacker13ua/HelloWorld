package org.test3;

import org.esurovskiy.test4.Movable;

public class Bird implements Movable, Singer {
    protected final String name;
    protected int color;
    protected int hz;
    private int k;

    public Bird(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Bird bird = (Bird) o;

        if (color != bird.color) return false;
        if (hz != bird.hz) return false;
        if (k != bird.k) return false;
        return name != null ? name.equals(bird.name) : bird.name == null;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public void walk() {
        System.out.println("I'm walking");
    }

    public void move() {
        System.out.println("Bird move");
    }

    public void sing() {
        System.out.println("Bird sing");
    }
}
