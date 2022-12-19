package com.mycompany.employeemanagementsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.Serializable;

/**
 *
 * @author luald
 */
public class employee {
    private int id;
    private String name;
    private int age;
    private String designation;
    private String department;
    private double salary;

    employee(int i, String james, int i0, String developer, String it) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  public int getId(){
      return id;
  }
  
  public void setId(int id ){
      this.id = id;
      
  }
  public String getName(){
     return name; 
  }
  
  public void setName(String name){
      this.name = name;
  }
  public int getAge(){
      return age;
  }
  
  public void setAge(int age){
      this.age = age;
  }
  
  public String getDesignation(){
      return designation;
  }
  public void setDesignation(String designation){
      this.designation = designation;
  }
  
  public String getDepartment(){
      return department;
  }
  public void setDepartment(String department){
      this.department = department;
  }
  
  public double getSalary(){
      return salary;
  }
  public void setSalary(double salary){
      this.salary = salary;
  }
    @Override
  public String toString(){
      return "Employee [id =" + id +",name =" +name + ",age=" + age + "designation=" +designation + ",department=" + department + ",salary=" + salary + "]";
  }
  
  public  employee (int id, String name, int age, String designation, String department, double salary){
      super ();
      this.id = id;
      this.name = name;
      this.age = age;
      this.designation = designation;
      this.department = department;
      this.salary = salary;
  }
  
  
}

