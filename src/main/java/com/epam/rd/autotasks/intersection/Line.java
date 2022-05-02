package com.epam.rd.autotasks.intersection;

public class Line {
    int k, b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (k == other.k) {
            return null;
        } else {
            int x, y;
            x = (other.b - b)/(k - other.k);
            y = k * x + b;
            return new Point(x, y);
        }
    }

}
