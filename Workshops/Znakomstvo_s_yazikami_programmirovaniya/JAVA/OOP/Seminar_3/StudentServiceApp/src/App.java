import java.util.*;

import StudentDomain.Employee;
import StudentDomain.Student;
import StudentDomain.Teacher;
import StudentService.EmployeeService;
import StudentService.StudentService;
import StudentService.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Сергей", "Петров", 48, 141);
        Student s2 = new Student("Андрей", "Харитян", 20, 142);
        Student s3 = new Student("Иван", "Пашинян", 25, 143);
        Student s4 = new Student("Игорь", "Вартанян", 32, 144);
        Student s5 = new Student("Даша", "Цветканян", 30, 145);
        Student s6 = new Student("Елена", "Незабудканян", 19, 146);
        Student s7 = new Student("Елена", "Бабич", 65, 147);

        Student[] arrayOfStudents = {s1, s2, s3, s4, s5, s6, s7};
        StudentService meanAgeStudents = new StudentService();
        List<Student> listOfStudents = new ArrayList<Student>();
        listOfStudents.add(s1);
        listOfStudents.add(s2);
        listOfStudents.add(s3);
        listOfStudents.add(s4);
        listOfStudents.add(s5);
        listOfStudents.add(s6);
        listOfStudents.add(s7);

        System.out.println("\n" + listOfStudents + "\n");
        List<Student> sortedListOfStudents = meanAgeStudents.getSortedByFIStudentGroup(listOfStudents);
        System.out.println(sortedListOfStudents + "\n");

        System.out.println("Средний возраст студентов = " + meanAgeStudents.meanAge(arrayOfStudents) + " лет!");

        Employee e1 = new Employee("Рубэн", "Иванов", 54, 1101);
        Employee e2 = new Employee("Анатолий", "Сидоров", 63, 1102);
        Employee e3 = new Employee("Валентин", "Петров", 38, 1103);
        Employee e4 = new Employee("Алмаз", "Иванов", 40, 1104);
        Employee e5 = new Employee("Маша", "Цветкова", 39, 1105);

        Employee[] arrayOfEmployees = {e1, e2, e3, e4, e5};
        EmployeeService meanAgeEmployees = new EmployeeService();
        System.out.println("Средний возраст работников = " + meanAgeEmployees.meanAge(arrayOfEmployees) + " лет!");

        Teacher t1 = new Teacher("Вася", "Пупкин", 63, "Математика", 121, "Кандидат наук");
        Teacher t2 = new Teacher("Егор", "Андреев", 73, "Высшая математика", 122, "Доктор наук");
        Teacher t3 = new Teacher("Иван", "Мишин", 52, "Психология", 123, "Кандидат наук");
        Teacher t4 = new Teacher("Игорь", "Луговой", 49, "Сопромат", 124, "Кандидат наук");
        Teacher t5 = new Teacher("Даша", "Белова", 45, "ТММ", 125, "Кандидат наук");
        Teacher t6 = new Teacher("Елена", "Забудкина", 32, "Русский язык", 126, "Доцент");
        Teacher t7 = new Teacher("Алина", "Будкина", 27, "Химия", 127, "Аспирант");
        Teacher t8 = new Teacher("Вера", "Чернова", 86, "Физика", 128, "Доктор наук");

        Teacher[] arrayOfTeachers = {t1, t2, t3, t4, t5, t6, t7, t8};
        TeacherService meanAgeTeachers = new TeacherService();
        System.out.println("Средний возраст учителей = " + meanAgeTeachers.meanAge(arrayOfTeachers) + " лет!\n");

        /** Для примера добавил массив целых чисел для демонстрации того, что meanAge работает только с классом User
         * и его потомками.
         */
        // Integer[] l1 = {1, 4, 5, 6};
        // System.out.println(MeanAgeUser.meanAge(l1));

        // Student s11 = new Student("Сергей", "Иванов", 22, 111);
        // Student s12 = new Student("Андрей", "Сидоров", 22, 112);
        // Student s13 = new Student("Иван", "Петров", 21, 113);
        // Student s14 = new Student("Игорь", "Иванов", 21, 114);
        // Student s15 = new Student("Даша", "Цветкова", 22, 115);
        // Student s16 = new Student("Елена", "Незабудкина", 21, 116);

        // List<Student> listStud1 = new ArrayList<Student>();
        // listStud1.add(s11);
        // listStud1.add(s12);
        // listStud1.add(s13);
        // listStud1.add(s14);
        // listStud1.add(s15);
        // listStud1.add(s16);

        // Student s21 = new Student("Вася", "Пупкин", 23, 121);
        // Student s22 = new Student("Егор", "Андреев", 23, 122);
        // Student s23 = new Student("Иван", "Мишин", 22, 123);
        // Student s24 = new Student("Игорь", "Луговой", 22, 124);
        // Student s25 = new Student("Даша", "Белова", 23, 125);
        // Student s26 = new Student("Елена", "Забудкина", 22, 126);
        // Student s27 = new Student("Алина", "Будкина", 22, 127);
        // Student s28 = new Student("Вера", "Чернова", 23, 128);

        // List<Student> listStud2 = new ArrayList<Student>();
        // listStud2.add(s21);
        // listStud2.add(s22);
        // listStud2.add(s23);
        // listStud2.add(s24);
        // listStud2.add(s25);
        // listStud2.add(s26);
        // listStud2.add(s27);
        // listStud2.add(s28);

        // Student s31 = new Student("Рубэн", "Иванов", 24, 131);
        // Student s32 = new Student("Анатолий", "Сидоров", 24, 132);
        // Student s33 = new Student("Валентин", "Петров", 23, 133);
        // Student s34 = new Student("Алмаз", "Иванов", 23, 134);
        // Student s35 = new Student("Маша", "Цветкова", 24, 135);

        // List<Student> listStud3 = new ArrayList<Student>();
        // listStud3.add(s31);
        // listStud3.add(s32);
        // listStud3.add(s33);
        // listStud3.add(s34);
        // listStud3.add(s35);

        // List<Student> listStud4 = new ArrayList<Student>();
        // listStud4.add(s41);
        // listStud4.add(s42);
        // listStud4.add(s43);
        // listStud4.add(s44);
        // listStud4.add(s45);
        // listStud4.add(s46);
        // listStud4.add(s47);

        // StudentGroup group1 = new StudentGroup(listStud1);
        // StudentGroup group2 = new StudentGroup(listStud2);
        // StudentGroup group3 = new StudentGroup(listStud3);
        // StudentGroup group4 = new StudentGroup(listStud4);

        // List<StudentGroup> listGroups = new ArrayList<StudentGroup>();
        // listGroups.add(group1);
        // listGroups.add(group2);
        // listGroups.add(group3);
        // listGroups.add(group4);
        // StudentCourse groups = new StudentCourse(listGroups);

        // for (StudentGroup studentGroup : groups) {
        //     System.out.println(studentGroup);
        // }

        // System.out.println("\n============= после сортировки =============");

        // Collections.sort(groups.getGroups());

        // for (StudentGroup studentGroup : groups) {
        //     System.out.println(studentGroup);
        // }

        // Integer studHour[] = {124, 234, 231, 1, 45};
        // System.out.println(EmployeeController.mean(studHour));

        // Double emplSalary[] = {12555.23, 34213.5, 10000.0};
        // System.out.println(EmployeeController.mean(emplSalary));

        // Employee person1 = new Employee("Олег", "Иванов", 55, 110);
        // EmployeeController.paySalary(person1);

        // Collections.sort(group1.getStudents());

        // for (Student student : group1) {
        //     System.out.println(student);
        // }

        // System.out.println(u1);
        // System.out.println(s1);
    }
}
