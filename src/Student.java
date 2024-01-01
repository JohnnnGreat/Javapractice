public class Student extends Person {

    String studentRollNo;

    public Student(String name, int age, String studentRollNo) {
        super(name, age);
        this.studentRollNo = studentRollNo;
    }

    public void getDetails() {
        System.out.println("Name " + name + ' ' + "Age: " + age + " studentRollNo " + studentRollNo);
    }

    @Override
    public String getName() {
        String name = super.getName();
        return name + " " + this.age;
    }
}
