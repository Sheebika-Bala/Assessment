//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Student {
    public void studentDetail() {
        System.out.println("Student details ");
    }

    static class Name extends Student {
        public void name() {
            System.out.println("The name of the student is Sheebika");
        }
    }

    static class Rollno extends Student {
        public void rollno() {
            System.out.println("The rollno is 12");
        }
    }

    static class Marks extends Student {
        public void marks() {
            System.out.println("The Marks is 95");

        }
    }

    public class Main {
        public static void main(String[] args) {
            Student obj1 = new Student();
            Name obj2 = new Name();
            Rollno obj3 = new Rollno();
            Marks obj4 = new Marks();

            obj1.studentDetail();
            obj2.name();
            obj3.rollno();
            obj4.marks();

        }
    }
}