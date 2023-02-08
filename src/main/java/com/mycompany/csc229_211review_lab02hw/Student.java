package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author Hanbi Hanz Choi
 */

// ToDo 1: Make this class a child of Person
// By using extends Person the Student bcame the child class of Person
public class Student extends Person{
    
    private String address;
    private double GPA;
	
    // ToDo 2: Fix the resulting errors
    public Student(String name, short age){
        super(name, age);
        address="";
    }
    
    public Student(String name, short age, double GPA, String address){
        super(name, age);
        this.GPA = GPA;
        this.address = address;
                 
    }
    
    
    
    
    // They wanted to override the get and set address 
    // I am not sure exacly why this is the case
    // Maybe something to do with the fact that those two methods are abstract
    @Override 
    public String getAddress(){
        return this.address;
    }
    
    @Override
    public void setAddress(String address){
        this.address = address;
    }
	
    // ToDo 3: Add a field for GPA and create setter and getter
    public double getGPA(){
        return this.GPA;
    }
    
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    
    @Override
    public String toString(){
        return getName() + " age:" + getAge() + " and address is " + getAddress()
                    + " with GPA:" + getGPA();
    }

}