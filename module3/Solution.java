package module3;

import module3.task3.CollegeStudent;
import module3.task3.Course;
import module3.task3.SpecialStudent;
import module3.task3.Student;

/**
 * Created by pan on 14.12.16.
 */
public class Solution {

    public static void main(String[] args) {
        Course courseJava = new Course("Java", 120, "GOIT");
        Course courseMySQL = new Course("MySQL",120,"INTERNET");
        Course coursePHP = new Course("PHP",120,"INTERNET");
        Course courseHTML = new Course("HTML",120,"INTERNET");
        Course courseCSS = new Course("CSS",120,"INTERNET");
        Course[] courses = {courseCSS,courseMySQL,courseHTML,courseJava,coursePHP};

        Student Viacheslav = new Student("Viacheslav", courses);
        Student Hubert = new Student("Hubert", "Pieczynski",4);

        CollegeStudent Jakub = new CollegeStudent("Galyk",courses);
        CollegeStudent Michal = new CollegeStudent("Michal","Rybak",4);
        CollegeStudent Anna = new CollegeStudent("Anna","Blaszak",3,"Michal",21,9);

        SpecialStudent Alexandra = new SpecialStudent("Alexsandra",courses,42563);
        SpecialStudent Paluch = new SpecialStudent("Darek","Zubr",32);
        SpecialStudent Fiona = new SpecialStudent("Fiona","Szrek",42,"Anna",4,53);



        int a = 101;
        int b = 102;
        int c = 103;
        int d = 104;
        int[] array = {a,b,c,d};

        System.out.println(array[3]);

    }
}

