import java.util.*;

class employee{
    String empname;
    int empcode;
    double bacicpay;
    employee(String s, int e, double d)
    {
        empname = s;
        empcode=e;
        bacicpay=d;
    }
    double salarycal(){
        double hra=(30/100)*bacicpay;
        double da=(40/100)*bacicpay;
        double salary = bacicpay +hra+da;
        double specialall;
        if(empcode<=15 && salary<=15000)
        {
            specialall=(20/100)*salary;
        }
        else
        {
            specialall=1000;
        }
        if(specialall>2500)
        {
            specialall=2500;
        }
        double tsalary=specialall+salary;
        return tsalary;
    }

    
}
public class emp{
    public static void main(String[] args)
    {
        employee rr= new employee("krishna", 1, 15000);
        double a=rr.salarycal();
        System.out.println(a);
    }
}