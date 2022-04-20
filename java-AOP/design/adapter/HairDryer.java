package design.adapter;

public class HairDryer implements Electronic110V{
    @Override
    public void powerOn() {
        System.out.println("헤어드라이기 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("헤어드라이기 OFF");
    }
}
