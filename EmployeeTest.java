public class EmployeeTest extends Employee
{
public static void main(String args[])
{
    Employee a1=new Employee();
    Employee a2=new Employee();
    a1.setFirstName();
    a1.getFirstName(a1);
    a1.setLastName();
    a1.getLastName(a1);
    a1.setSalary();
    a1.getSalary(a1);
    if(a1.salary>=0)
    {
    a1.display();
    a1.increment();
    }
    a2.setFirstName();
    a2.getFirstName(a2);
    a2.setLastName();
    a2.getLastName(a2);
    a2.setSalary();
    a2.getSalary(a2);
    if(a2.salary>=0)
   {
    a2.display();
    a2.increment();
    }
}
}
