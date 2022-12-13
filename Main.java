/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employeemanagementsystem;
import java.util.Scanner;

/**
 *
 * @author luald
 */
public class Main {
    employeeService service = new employeeService();
    static boolean ordering = true;

    public static void main(String[] args) {
        System.out.println("Welcome to the employee management system."
                + "\n 1. Add employee"
                + "\n 2. View employee"
                + "\n 3. Update employee"
                + "\n 4. Delete employee"
                + "\n 5. view all employees"
                + "\n 6. EXIT");
        
        
    }
}
