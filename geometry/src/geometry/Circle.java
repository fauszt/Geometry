package geometry;

/**
 * Created by Szabys on 2017.10.24.
 */
public class Circle {

    private int n,y;

    public Circle(int x, int y) {
        this.n = x;
        this.y = y;
    }

    public int getX() {
        return n;
    }

    public void setX(int x) {
        this.n = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double kerulet(){
        return 2*3.147*n;
    }
    public double terulet() {
        return (3.147 * n) * (3.147 * n);
    }
}
