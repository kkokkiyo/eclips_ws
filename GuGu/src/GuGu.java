public class GuGu {
    public void dan(int n) {
    	for(int i = 1; i<10; i++) {
    		System.out.println(n*i);
    	}
    }

    public static void main(String[] args) {
        GuGu gugu = new GuGu();
        for(int n = 1; n<10; n++) {
        	gugu.dan(n);
        }
    }
}