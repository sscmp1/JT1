/**
 * Created by marina.peunkova on 13/04/2016.
 */
public class JavaFirst {
    public static void main (String[] args) {
        Point myP1 = new Point();
        Point myP2 = new Point();
        double distance;
        myP1.setCoordinates(0,0);
        myP2.setCoordinates(3,7);
        distance = Math.sqrt((myP2.x - myP1.x) * (myP2.x - myP1.x) + (myP2.y - myP1.y) * (myP2.y - myP1.y));
        System.out.println(Double.toString(distance));
        distance = myP2.distance(myP1);
        System.out.println(Double.toString(distance));
    }
}
