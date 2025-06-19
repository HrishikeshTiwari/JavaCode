package OOPS;

class Employee {
    String name;  // Instance variable

    // Constructor with a parameter having the same name as the instance variable
    public Employee(String name) {
        this.name = name;  // 'this.name' refers to the instance variable, 'name' refers to the parameter
    }

    // Method to display the employee's name
    public void displayName() {
        String name = "Local Variable";  // Local variable
        System.out.println("Local variable name: " + name);  // Prints the local variable's value
        System.out.println("Instance variable name: " + this.name);  // Prints the instance variable's value
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe");  // Instance variable 'name' is set to "John Doe"
        emp.displayName();
    }
}
