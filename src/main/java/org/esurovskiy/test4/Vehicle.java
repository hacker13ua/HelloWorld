package org.esurovskiy.test4;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public abstract class Vehicle implements Movable {
    public void move() {
        for (int i = 0; i < getCount(); i++) {
            System.out.println("Vehicle move.");
        }
    }

    abstract int getCount();
}
