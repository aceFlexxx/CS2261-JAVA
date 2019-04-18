//Class: CS2261-JAVA
//Due Date: 04/15/19  
//Author: Elijah Korneffel
//Description: This script contains the Person, Student, Employee, Faculty, and Staff classes 
public class Ex11_2_Test 
{



    public static class Person
    {

        String name; 
        String address;
        String phone;
        String email;
        /* Default constructor */
        public Person()
        {
        
        }

        /* Constructor with inputs */
        public Person(String name, String address, String phone, String email)
        {
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.email = email;
        }

        
        //This method returns string with the identity of the class and name.
        @Override    
        public String toString()
        {
            String id = "Person, ";
            id += name;
            return id;
        }
    }

    public static class Employee extends Person 
    {        
        String office;
        String salary;
        String dateHired;
        
        /* Default constructor */
        public Employee()
        {
        
        }
        /* Constructor with inputs */
        public Employee(String name, String address, String phone, String email, String office, String salary, String dateHired)
        { 
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.email = email;
            this.office = office;
            this.salary = salary;
            this.dateHired = dateHired;
            
        }

        
        //This method returns string with the identity of the class and name.
        @Override    
        public String toString()
        {
            String id = "Employee, ";
            id += name;
            return id;
        }
        
    }

    public static class Student extends Person 
    {   
        
        final String classStatus;
        /* Constructor with inputs */
        public Student(String name, String address, String phone, String email, String classStatus)
        {
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.email = email;
            this.classStatus = classStatus;
        }
        
        //This method returns string with the identity of the class and name.
        @Override    
        public String toString()
        {
            String id = "Student, ";
            id += name;
            return id;
        }
        
    }

    
    public static class Faculty extends Employee  
    {        
        String hours;
        String rank;
        /* Constructor with inputs */
        public Faculty(String name, String address, String phone, String email, String office, String salary, String dateHired, String hours, String rank)
        { 
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.email = email;
            this.office = office;
            this.salary = salary;
            this.dateHired = dateHired;
            this.hours = hours;
            this.rank = rank;
        }

        
        //This method returns string with the identity of the class and name.
        @Override    
        public String toString()
        {
            String id = "Faculty, ";
            id += name;
            return id;
        }
        
    }


    public static class Staff extends Employee  
    {        
        String title;
        /* Constructor with inputs */
        public Staff(String name, String address, String phone, String email, String office, String salary, String dateHired, String title)
        { 
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.email = email;
            this.office = office;
            this.salary = salary;
            this.dateHired = dateHired;
            this.title = title;
        }

        
        //This method returns string with the identity of the class and name.
        @Override    
        public String toString()
        {
            String id = "Staff, ";
            id += name;
            return id;
        }
        
    }

    //Tests out class 
    public static void main(String[] args)
    {
        
        Person person1 = new Person("Dan Hold", "Avenue", "314-999-9999", "dan@gmail.com");
        Employee employee1 = new Employee("Aaron Lueffer", "Avenue", "314-999-9999", "dan@gmail.com", "R107", "60000", "01/01/01");
        Student student1 = new Student("Bryce Landgraf", "Avenue", "314-999-9999", "bryceL@gmail.com", "Freshman");
       
        Faculty faculty1 = new Faculty("Harding Bell", "avenue", "314-999-9999", "hardingB@gmail.com","R207", "80000", "01/01/01", "MW11-2", "Dean");
        Staff staff1 = new Staff("Carter Jackson", "Avenue", "314-999-9999", "carterJ@gmail.com", "R17", "30000", "01/01/01", "janitor");

        System.out.println(person1.toString());
        System.out.println(employee1.toString()); 
        System.out.println(student1.toString()); 
        System.out.println(faculty1.toString()); 
        System.out.println(staff1.toString()); 

    }

}
