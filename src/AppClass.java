import java.util.LinkedList;
import java.util.List;

public class AppClass {

    // test code
    public static void main(String[] args) {
        BeaconCoord beacon1 = new BeaconCoord(new Coordinates(0,5), 2.5);
        BeaconCoord beacon2 = new BeaconCoord(new Coordinates(2.5,0), 5);
        BeaconCoord beacon3 = new BeaconCoord(new Coordinates(7,5), 4.5);

        List<BeaconCoord> mList = new LinkedList<>();

        mList.add(beacon1);
        mList.add(beacon2);
        mList.add(beacon3);

        Trilateration mCalc = new Trilateration();

        Coordinates object = mCalc.getLocationByTrilateration(mList);

        System.out.println("Xobj = "+ object.getX());
        System.out.println("Yobj = "+ object.getY());
    }
}
