package nine;

public class TestFan {

    public static void main(String[] args){
        Fan FanOne = new Fan();
        Fan FanTwo = new Fan();
        FanOne.setSpeed(Fan.FAST);
        FanOne.setRadius(10);
        FanOne.setColor("yellow");
        FanOne.setOn(true);

        FanTwo.setSpeed(Fan.MEDIUM);
        FanTwo.setRadius(5);
        FanTwo.setColor("blue");
        FanTwo.setOn(false);

        System.out.println(FanOne.toString());
        System.out.println(FanTwo.toString());
    }
}
