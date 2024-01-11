import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Employee [] employees = new Employee[6];
//        employees[0] = new Programmer("Анатолий", "Ушанов", 1200);
//        employees[1] = new Programmer("Максим", "Грибов", 1200);
//        employees[2] = new Programmer("Роман", "Иванов", 1600);
//        employees[3] = new Manager("Анатолий", 31, 1700);
//        employees[4] = new Manager("Алексей", 35, 1900);
//        employees[5] = new Manager("Василий", 27, 1300);
//
//        Employee result = employees[0];
//
//        for (Employee employee: employees) {
//            if (result.getSalary() < employee.getSalary()) {
//                result= employee;
//            }
//
//        }
//        System.out.println(result.info());

//        int [] numbers = new int [] {1, 4, 3, 6, 3};
//        for (int elem: numbers){
//            System.out.println(elem);

//        ArrayList <Integer> numbers = new ArrayList<>();
//        numbers.add(12);
//        numbers.add(22);
//        numbers.add(32);
//
//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            int value = iterator.next();
//            System.out.println(value);


        CustomList array = new CustomList(new int[]{12, 4, 32, 4});
        for (Object element : array) {
            System.out.print(element + " ");

        }
        System.out.println();
    }



        }





