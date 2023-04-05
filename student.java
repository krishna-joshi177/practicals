// Create a class “Student” having following instance variables and methods.
// Instance variables: ID, Name, Branch and university
// Non static Methods: setDetails() and getDetails().
// The setDetails() method sets the values of ID, Name, Branch and University.
// And getDetails() method shows the value of each field.


import java.util.*;
class student{
    int id;
    String name, branch, university;

    void setDetails( String Name, String Br, String Uni)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input id :");
        int Id = sc.nextInt();
        sc.close();
        id = Id;
        name = Name;
        branch = Br;
        university = Uni;
    }

    void getDetails()
    {

        System.out.println(id);
        System.out.println(name);
        System.out.println(branch);
        System.out.println(university);
    }

    public static void main(String[] args) {
        student obj = new student();

        Scanner sc=new Scanner(System.in);
        System.out.println("input name :");
        String namme = sc.next();
        sc.close();
        obj.setDetails(namme,"cse","gehu");
        obj.getDetails();
    }
}