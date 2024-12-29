public class Student extends Person{
    private short grade;
    Student(String name, short age, short grade){
        super(name, age);
        this.grade = grade;
    }
    // Method overriding
    void introduce(){
        super.introduce();
        System.out.println("studying in grade "+ grade);
    }
}
