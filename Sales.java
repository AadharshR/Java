import java.util.Scanner;
public class Sales
{
public static void main(String args[])
{
    int i,n,salary;
    Scanner in=new Scanner(System.in);
    int value[]=new int[10];
    int count[]=new int [10];
    System.out.println("Enter the number of employees...");
       n=in.nextInt();
       for(i=0;i<n;i++)
       {
           System.out.println("Enter the gross income...");
           salary=in.nextInt();
           value[i]=salary*9/100+200;
       }


      for(i=0;i<n;i++)
       {
      if(value[i]>=200&&value[i]<=299)
            count[0]=count[0]+1;
          else if(value[i]>=300&&value[i]<=399)
            count[1]=count[1]+1;
         else if(value[i]>=400&&value[i]<=499)
           count[2]=count[2]+1;
          else if(value[i]>=500&&value[i]<=599)
            count[3]=count[3]+1;
          else if(value[i]>=600&&value[i]<=699)
           count[4]=count[4]+1;
          else if(value[i]>=700&&value[i]<=799)
            count[5]=count[5]+1;
          else if(value[i]>=800&&value[i]<=899)
          count[6]=count[6]+1;
          else if(value[i]>=900&&value[i]<=999)
            count[7]=count[7]+1;
          else if(value[i]>=1000)
            count[8]=count[8]+1;
       }
System.out.print("The number of salesman in the ranges\n200-299 are "+count[0]+"\n300-399 are "+count[1]+"\n400-499 are "+count[2]);
System.out.print("\n500-599 are "+count[3]+"\n600-699 are "+count[4]+"\n700-799 are "+count[5]+"\n800-899 are "+count[6]+"\n900-999 are "+count[7]+"\nAbove 1000 are "+count[8]);

}
}
