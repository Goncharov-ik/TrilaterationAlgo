import java.util.LinkedList;
import java.util.List;
import java.math.*;

public class Trilateration {

    public Coordinates getLocationByTrilateration(List<BeaconCoord> listOfBeacons){
        double xObj, yObj;

        List<Double> xList, yList, rList;
        xList = new LinkedList<>();
        yList = new LinkedList<>();
        rList = new LinkedList<>();

        for(int i=0; i<listOfBeacons.size(); i++){
            xList.add(listOfBeacons.get(i).getX());
            yList.add(listOfBeacons.get(i).getY());
            rList.add(listOfBeacons.get(i).getDistance());
        }

        double a12 = (Math.pow(rList.get(0),2)-Math.pow(rList.get(1),2)) - (Math.pow(xList.get(0),2)-Math.pow(xList.get(1),2)) - (Math.pow(yList.get(0),2)-Math.pow(yList.get(1),2));
        double a13 = (Math.pow(rList.get(0),2)-Math.pow(rList.get(2),2)) - (Math.pow(xList.get(0),2)-Math.pow(xList.get(2),2)) - (Math.pow(yList.get(0),2)-Math.pow(yList.get(2),2));

        yObj = (a13*(xList.get(1)-xList.get(0))-a12*(xList.get(2)-xList.get(0)))*(xList.get(1)-xList.get(0))/
                (2*(xList.get(1)-xList.get(0))*((yList.get(2)-yList.get(0))*(xList.get(1)-xList.get(0))-(yList.get(1)-yList.get(0))*(xList.get(2)-xList.get(0))));

        xObj = (a12 - 2*yObj*(yList.get(1)-yList.get(0)))/(2*(xList.get(1)-xList.get(0)));

        return new Coordinates(xObj, yObj);
    }
}
