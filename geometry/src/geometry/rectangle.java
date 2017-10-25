package geometry;

public class rectangle {
    private Point p;
    private Point p1;

    public rectangle(Point p,Point p1)
    {
        this.p = p;
        this.p1 = p1;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }
    
    public double perimeter(){
        return 2 * (p.getX() - p1.getX()) + 2 * (p.getY() - p1.getY()); 
    }
    
    public double area(){
        return (Math.abs((p.getX()-p1.getX())) * Math.abs((p.getY()-p1.getY())) ) / 2;
    }

}