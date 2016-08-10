import java.util.Scanner;
class Employee
{
private String firstName;
private String lastName;
double salary;
public Employee()
{
firstName=null;
lastName=null;
salary=0;
}
public Employee getFirstName(Employee c)
{
    return c;
}
public void setFirstName()
{
Scanner in=new Scanner(System.in);
System.out.print("\nEnter the first name..");
this.firstName=in.nextLine();
}
public Employee getLastName(Employee c)
{
    return c;
}

public void setLastName()
{
    Scanner in=new Scanner(System.in);
System.out.print("Enter the second name..");
this.lastName=in.nextLine();
}
public Employee getSalary(Employee c)
{
return c;
}

public void setSalary()
{
Scanner in=new Scanner(System.in);
if(salary>=0)
{
System.out.print("Enter the salary..");
salary=in.nextDouble();
}
while(salary<0)
{
    System.out.print("Enter a positive salary..");
    salary=in.nextDouble();
}
}
public void increment()
{
    salary+=salary*10/100;
    System.out.println("The value of the corresponding employee after incrementing by 10% is.."+salary);
}
public void display()
{
    salary*=12;
    System.out.println("The yearly salary of "+firstName+" "+lastName+" is "+salary);
}
}
