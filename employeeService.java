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
 HashSet<employee> empset=new HashSet<employee>();
 
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
string designation;
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

}