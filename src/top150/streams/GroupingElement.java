package top150.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingElement {

    static class  Employee{

        private int id;

        private String name;

        private String department;

        public Employee() {
        }

        public Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Nasser", "IT");
        Employee employee2 = new Employee(102, "Mohit", "IT");
        Employee employee3 = new Employee(103, "Aakash", "CIVIL");
        Employee employee4 = new Employee(104, "Sumit", "IT");

        List<Employee> employeeList = List.of(employee, employee2, employee3, employee4);
//        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(e -> e.department));
        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(e -> e.department, Collectors.counting()));
        System.out.println(collect);

    }
}
