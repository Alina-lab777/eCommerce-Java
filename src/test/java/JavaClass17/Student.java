package JavaClass17;

public class Student {

    String studentFirstName;
    String studentLastName;
    String studentHomeCity;
    String studentUsState;

    int studentAge;
    int studentId;
    int studentCellNumber;

    Student(){};

    Student(String firstName, String lastName, int age, int id) {
        this.studentFirstName = firstName;
        this.studentLastName = lastName;
        this.studentAge = age;
        this.studentId = id;
    }

    Student(String homeCity, String usSate, int cellNumber) {
        this.studentHomeCity = homeCity;
        this.studentUsState = usSate;
        this.studentCellNumber = cellNumber;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Brooklyn", "NY", 214235343);
        System.out.println(student1.studentHomeCity + " " + student1.studentUsState + " " + student1.studentCellNumber);

        Student student2 = new Student("Lolita", "Baku", 23, 212324);
        System.out.println(student2.studentFirstName + " " + student2.studentLastName + " " + student2.studentAge + " " + student2.studentId);


        Student std = new Student();


    }
}



