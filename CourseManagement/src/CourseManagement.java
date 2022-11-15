import javax.swing.*;

public class CourseManagement {

    public double calculateAverage(int n) {
        double sum = 0.0;
        int count = 0;
        while (count < n) {
            String input = JOptionPane.showInputDialog("시험 점수?");
            int score = Integer.parseInt(input);
            sum += score;
            count += 1;
            // loop invariant : sum == count개 점수의 합
        }
        return sum / count; // n == count
    }

    public static void main(String[] args) {
        CourseManagement course_mgmt = new CourseManagement();
        String message = "평균 점수 = " + course_mgmt.calculateAverage(5);
        JOptionPane.showMessageDialog(null, message);
    }

}