package com.mycompany.employeemanagementsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author luald
 */
public class employeeService {
    
    HashSet<employee> empset=new HashSet<>();
 
    employee emp1 = new employee(100, "James", 55, "Developer", "I.T.", 300000);
    employee emp2 = new employee(234, "Rebecaa", 34, "Manager", "Management", 39089383);
    employee emp3 = new employee(345, "Tony", 32, "Janitor", "Cleaning dep", 80000);
    employee emp4 = new employee(422, "Kevin", 44, "Bookkeeping", "Finance dep", 9978383);
 
    Scanner scanner = new Scanner(System.in);

    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String designation;
    double salary;

    public employeeService(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    
    }
    
    public void viewAllEmployees(){
        for(employee emp: empset){
            System.out.println(emp);
        }
    }
    
    public void viewEmployee(){
        System.out.println("Enter ID");
        id = scanner.nextInt();
        for(employee emp: empset){
            if(emp.getId() == id){
                System.out.println(emp);
                found = true;
            }
            
            if (!found){
                System.out.println("Employee with this ID is not present");
            }
        }
    }
    
    public void updateEmployee(){
        System.out.println("Enter ID");
        id = scanner.nextInt();
        boolean found = false;
        for(employee emp: empset){
            if(emp.getId()==id){
                System.out.println("ENTER Name: ");
                name = scanner.next();
                System.out.println("Enter new Salary");
                salary = scanner.nextDouble();
                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("Updated details of employee are ");
                System.out.println(emp);
                found = true;
           
            }
            if (!found){
                System.out.println("Employee is not present");
            
            }
            else{
                System.out.println("Employee details updated successfully");
            }
        }
    }
    
    public void deleteEmployee(){
        System.out.println("Enter ID");
        id = scanner.nextInt();
        boolean found = false;
        employee empDelete = null;
        for (employee emp: empset){
            if (emp.getId() == id){
                empDelete = emp;
                found = true;
            
            }
         
        } 
        if(!found){
            System.out.println("Employee not present");
        }
        else {
            empset.remove(empDelete);
            System.out.println("Employee deleted successfully ");
        }
    } 


    public void addEmployee(){
    System.out.println("Enter ID");
    id = scanner.nextInt();
    System.out.println("Enter Name");
    name = scanner.next();
    System.out.println("Enter age");
    age = scanner.nextInt();
    System.out.println("Enter department");
    department = scanner.next();
    System.out.println("Enter designation");
    designation = scanner.next();
    System.out.println("Enter salary");
    scanner.nextDouble();
    employee emp = new employee(id,name,age,designation,department,salary);
    empset.add(emp);
    System.out.println(emp);
    System.out.println("Employee added successfully");
    }

    }