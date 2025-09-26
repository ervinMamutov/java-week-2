package projects.studentReport;

public class StudentReport {
    public static void main(String[] args) {
        String[] name = {
                "John Smith",
                "Emily Johnson",
                "Michael Brown",
                "Sarah Davis",
                "David Wilson",
                "Laura Miller",
                "James Taylor",
                "Jessica Anderson",
                "Robert Thomas",
                "Linda Jackson"
        };

        int[] age = {18, 23, 25, 23, 19, 25, 25, 18, 19, 20};

        int numberOfSubject = 5;
        Student student = new Student(name, age, numberOfSubject);
        student.createStudentTable();
    }
}

class Student {
    private final String[] name;
    private final int[] age;
    private final int numberOfSubject;

    public Student(String[] name, int[] age, int  numberOfSubject) {
        this.name = name;
        this.age = age;
        this.numberOfSubject = numberOfSubject;
    }

    public void createStudentTable() {
        System.out.printf("%-15s | %-3s", "Student Name", "Age");

        for (int i = 0; i < numberOfSubject; i++) {
            System.out.printf(" | %-12s", "Subject " + (i + 1));
        }

        System.out.printf(" | %-12s | %-7s%n", "Total Score", "Status");
        System.out.println(new String(new char[15 + 3 + (numberOfSubject * 12) + 12 + 7]).replace("\0", "-"));

        int[][] information = new int[name.length][numberOfSubject];

        for (int i = 0; i < name.length; i++) {
            System.out.printf("%-15s | %-3d", name[i], age[i]);

            int sum = 0;
            for (int j = 0; j < numberOfSubject; j++) {
                information[i][j] = (int)(Math.random() * 100) + 1;
                sum += information[i][j];
                System.out.printf(" | %-12d", information[i][j]);
            }
            int average = sum / numberOfSubject;
            System.out.printf(" | %-12d | %-12d | %-7s%n", sum, average, isPassed(sum) ? "Failed" : "Passed");

            System.out.println(new String(new char[15 + 3 + (numberOfSubject * 12) + 12 + 7]).replace("\0", "-"));
        }
    }
    private boolean isPassed(int sum) {
        return sum / numberOfSubject <= 40;
    }

}




