package org.esurovskiy.test4;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(final String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;

    }

    public void setWidth(final double width) {
        this.width = width;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "This is Reactangle, color: " + getShapeColor()
                + ", width=" + width
                +", height " + height +
                "\nShape area is: " + calcArea();
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
