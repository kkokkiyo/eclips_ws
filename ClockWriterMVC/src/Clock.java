public class Clock {
    
    public static void main(String[] args) {
        ClockWriter clock = new ClockWriter(250);
        new ClockController().switchOn(clock);
    }

}