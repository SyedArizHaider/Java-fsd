package com.pack1;

	public class Person {
	    private String name;
	    private int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    // Setter methods
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Object-oriented pillars: Encapsulation, Inheritance, Polymorphism
	    public void introduce() {
	        System.out.println("My name is " + name + " and I am " + age + " years old.");
	    }

	    public static void main(String[] args) {
	        // Creating objects
	        Person person1 = new Person("John", 30);
	        Person person2 = new Person("Jane", 25);

	        // Accessing object properties and methods
	        System.out.println(person1.getName());
	        System.out.println(person2.getAge());
	        person1.introduce();
	        person2.introduce();

	        // Using inheritance
	        Student student = new Student("Bob", 20, "Computer Science");
	        student.introduce();

	        // Using polymorphism
	        Person person3 = new Student("Alice", 22, "Mathematics");
	        person3.introduce();
	    }
	}

	class Student extends Person {
	    private String major;

	    // Constructor
	    public Student(String name, int age, String major) {
	        super(name, age);
	        this.major = major;
	    }

	    // Getter method
	    public String getMajor() {
	        return major;
	    }

	    // Setter method
	    public void setMajor(String major) {
	        this.major = major;
	    }

	    // Polymorphism
	    @Override
	    public void introduce() {
	        System.out.println("My name is " + getName() + ", I am " + getAge() + " years old, and I am majoring in " + major + ".");
	    }
	}