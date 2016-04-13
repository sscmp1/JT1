/**
 * Created by marina.peunkova on 13/04/2016.
 */
public class Point {
    double x;
    double y;
    public void setCoordinates(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point fromPoint) {
        return Math.sqrt((this.x - fromPoint.x) * (this.x - fromPoint.x) + (this.y - fromPoint.y) * (this.y - fromPoint.y));
    }
}
