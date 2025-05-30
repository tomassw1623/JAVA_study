package class1;

import javax.xml.crypto.OctetStreamData;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "학생 1";
        student1.age= 15;
        student1.grade = 90;

        Student student2 = new Student();

        student2.name = "학생 2";
        student2.age= 16;
        student2.grade = 80;

        Student[] students = {student1, student2};

/*
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:  " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
*/
        //iter 단축키
        for (Student s : students) {
            System.out.println("이름:  " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }

    }

}//class
