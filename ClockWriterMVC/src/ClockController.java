public class ClockController {
    
    /** delay - how_long millisecond 동안 실행 정지  */
    private void delay(int how_long) { 
        try { Thread.sleep(how_long); }
        catch (InterruptedException e) { }
    }
    
    public void switchOn(ClockWriter clock) {
        while (true) { 
            delay(20);
            clock.repaint();
        }
    }

}