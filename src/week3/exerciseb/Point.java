package week3.exerciseb;

public class Point {
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setPoint(Point point){
        setX(point.getX());
        setY(point.getY());
    }
    public boolean equals(Point point){
        if(this.x == point.getX() && this.y == point.getY())
            return true;
        else
            return false;
    }

    public void moveHorizontally(int x){
        this.x+=x;
    }
    public void moveVertically(int y){
        this.y+=y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
