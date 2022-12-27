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
    public static void menu (){
         System.out.println("Welcome to the employee management system."
                + "\n 1. Add employee"
                + "\n 2. View employee"
                + "\n 3. Update employee"
                + "\n 4. Delete employee"
                + "\n 5. view all employees"
                + "\n 6. EXIT");
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        employeeService service  = new employeeService();
    
        do{
            menu();
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            
            switch(choice){
                
            case 1:
                System.out.println("Add employee");
                service.addEmployee();
                break;
            case 2: 
                System.out.println("View Employee");
                service.viewEmployee();
                break;
        case 3:
                System.out.println("Update Employee");
                service.updateEmployee();
                break;
        case 4:
                System.out.println("Delete Employee");
                service.deleteEmployee();
                break;
        case 5:
                System.out.println("View all Employee");
                service.viewAllEmployees();
                break;
        case 6:
                System.out.println("Thank you for using our application");
                System.exit(0);
                break;
            
        default: 
                System.out.println("Please enter valid choice");
                break;
                    
    }
    
        
    } while(ordering);  
    
    
        
        
    
}
}