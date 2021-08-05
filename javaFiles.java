import java.util.Scanner;

enum Courses {
    CSE, EEE, ECE
public class NewAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[2];

        for (int i = 0; i < 2; i++) {
            long regdNo = Long.parseLong(scanner.nextLine());
            String name = scanner.nextLine();
            Courses course = Courses.CSE;
            String subject = scanner.nextLine();
            switch (subject) {
                case "EEE":
                    course = Courses.EEE;
                    break;
                case "ECE":
                    course = Courses.ECE;
                    break;
                default:
                    break;
            }
            String[] subjects = new String[3];
            for (int j = 0; j < 3; j++) {
                subjects[j] = scanner.nextLine();
            }
            students[i] = new Student(regdNo, name, course, subjects);

            System.out.println(students[i]);
        }

        scanner.close();
    }
}
