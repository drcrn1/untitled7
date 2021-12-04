public class lab8 {
    public static void main(String[] args) {
        People people =  new People("Anton","Danilov",17);
        people.walk();
        people.run();
        people.voice();
        Student student = new Student("Anton2","Danilov2",19);
        student.walk();
        student.learn();
        Teacher teacher = new Teacher("Anton3","Danilov3",36);
        teacher.voice();
        teacher.teach();
    }
}
