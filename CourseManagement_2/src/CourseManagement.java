import javax.swing.*;

public class CourseManagement {
	public double calculateAverage() {
		double sum = 0.0;
		int count = 0;
		boolean processing = true;
		while (processing) {
// loop invariant : sum == count개 점수의 합
			String message = "다음 시험 점수? (입력 완료시 Cancel 버튼 누름)";
			String input = JOptionPane.showInputDialog(message);
			if (input == null) // Cancel 버튼을 눌렀음
				processing = false;
			else {
				int score = Integer.parseInt(input);
				sum += score;
				count += 1;
			}
		}
		if (count == 0)
			return 0;
		else
			return sum / count;
	}

	public static void main(String[] args) {
		CourseManagement course_mgmt = new CourseManagement();
		String message = "평균 점수 = " + course_mgmt.calculateAverage();
		JOptionPane.showMessageDialog(null, message);
	}
}