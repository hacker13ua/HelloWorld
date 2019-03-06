package org.esurovskiy.test4;

import java.util.Arrays;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Drawable[] drawables = new Drawable[3];
        final Rectangle red = new Rectangle("RED", 1, 2);
        final Rectangle yellow = new Rectangle("YELLOW", 1, 2);
        final Circle green = new Circle("GREEN");
        green.setRadius(10);
        drawables[0] = red;
        drawables[1] = yellow;
        drawables[2] = green;
        for (final Drawable drawable : drawables) {
            drawable.draw();
        }

    }


}
