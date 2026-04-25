package Map_set;

import java.util.*;
public class Task4{

    public static void main(String[] args) {

        Map<Integer, Integer> emp = new HashMap<>();

        // 🔹 Store employee data
        emp.put(01, 60000);
        emp.put(02, 70000);
        emp.put(03, 65000);

        System.out.println("Employees Data: " + emp);

        // 🔹 Retrieve salary by ID
        int id = 101;

        if(emp.containsKey(id)) {
            System.out.println("Salary of " + id + " → " + emp.get(id));
        } else {
            System.out.println("Employee not found");
        }

        // 🔹 Update salary
        emp.put(01, 65000);  // update

        System.out.println("Updated Salary of 01 → " + emp.get(01));

        // 🔹 Handle missing ID
        int searchId = 04;

        if(emp.containsKey(searchId)) {
            System.out.println("Salary → " + emp.get(searchId));
        } else {
            System.out.println("Employee ID " + searchId + " not found");
        }
    }
}