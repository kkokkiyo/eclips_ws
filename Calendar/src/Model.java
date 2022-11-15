import java.time.*;

public class Model {
	//문제 1
	public LocalDate hundred_days_from_today() {
		LocalDate today = LocalDate.now();
		LocalDate after_hundred = today.plusDays(100);
		return after_hundred;
	}
	//문제 2
	public LocalDate hundred_days_from(LocalDate d0) {
		LocalDate after_hundred = d0.plusDays(100);
		return after_hundred;
	}
}
