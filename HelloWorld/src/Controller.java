
public class Controller {
	
	public void control(Model m, View v) {
		String message = m.createMessage();
		v.show(message);
		v.showWindow(message);
	}

}
