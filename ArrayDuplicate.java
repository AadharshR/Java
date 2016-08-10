import java.util.*;
public class ArrayDuplicate
{
public static void main(String args[])
{
int b,i;
Scanner in=new Scanner(System.in);
    ArrayList<Integer> a1=new ArrayList<>();
    System.out.println("Enter numbers..");
    for(i=0;i<5;)
    {
    b=in.nextInt();
    if(!(a1.contains(b)))
    {
    a1.add(b);
    i++;
    }
    }
     System.out.println("The elements are ");
    for (i = 0; i <5; i++) {
	    System.out.println(+a1.get(i));
	}
}
}
