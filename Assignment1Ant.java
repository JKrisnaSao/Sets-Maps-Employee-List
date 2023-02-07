package assignment1ant;

/**
 *
 * @author Jonathan Sao Assignment 1
 *
 * This program maintains the use of Sets and Maps
 * @Sing January 23, 2023 I have followed the UNCG Academic Integrity policy on
 * this assignment
 */
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.util.Scanner;

public class Assignment1Ant {

    public static void main(String[] args) {
        multiSet ms = new multiSet();
        try {
            File f = new File("employee.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String word[] = s.nextLine().split(",");
                Employee e = new Employee(word[0], word[1], word[2], Double.parseDouble(word[3]));
                ms.add(e);
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("THIS FILE NOT HERE!!");
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1, To Display all the Employees");
            System.out.println("Press 2, Add a new Employee");
            System.out.println("Press 3, To Exit");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    ms.display();
                    break;

                case 2:
                    String id,
                     fname,
                     lname;
                    double salary;

                    System.out.print("Enter employee id : ");
                    id = sc.next();
                    System.out.print("Enter employee first name : ");
                    fname = sc.next();
                    System.out.print("Enter employee last name : ");
                    lname = sc.next();
                    System.out.print("Enter employee salary : ");
                    salary = sc.nextDouble();
                    Employee emp = new Employee(id, fname, lname, salary);
                    ms.add(emp);
                    break;

                case 3:
                    System.out.println("\nThank you!!!");
                    exit(0);

            }
        }
    }
}

}
