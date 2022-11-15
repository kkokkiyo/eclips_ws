import java.time.*;

public class Controller {
	public void control(Model m, ViewIn in, ViewOut out) {
		//문제 1
		LocalDate d = m.hundred_days_from_today();
		out.showDate_today(d, null);
		//문제 2
		LocalDate d0 = in.getDate(null);
		LocalDate d100 = m.hundred_days_from(d0);
		out.showDate(d100, null);
	}
}
