package org.esurovskiy.test4;

public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    public Shape(String color) {
        shapeColor = color;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public String toString() {
        return "Shape color is:" + shapeColor;
    }

    public abstract double calcArea();

    public void draw() {
        System.out.println(toString());
    }

    public int compareTo(final Object o) {
        Shape that = (Shape) o;
        return Double.compare(this.calcArea(), that.calcArea());
    }
}
