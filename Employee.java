package assignment1ant;

public class Employee {

    //variables
    public String empID;
    public String fName;
    public String lName;
    public double Salary;
//constructor

    public Employee(String id, String fname, String lname, double salary) {
        this.empID = id;
        this.fName = fname;
        this.lName = lname;
        this.Salary = salary;
    }
//compare the nodes 

    public int compare(Employee e) {
        return this.empID.compareTo(e.empID);
    }
//Override toString method

    @Override
    public String toString() {
        String s = this.empID + " ";
        s += this.fName + " ";
        s += this.lName + "\t";
        s += this.Salary;
        return s;
    }
}
