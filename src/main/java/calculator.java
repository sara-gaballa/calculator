
import com.google.common.base.Strings;
import java.util.Scanner;
public class calculator {
    public final String name;
    public calculator(String name) {
        if(Strings.isNullOrEmpty(name))
        this.name = "standared";
        else{
            this.name=name;
        }
    }
    public int add(int x, int y){
        if(x<0||y<0)
        throw new RuntimeException("wrong input");
        else{
            return x+y;
        }
    }
    public int sub(int x, int y){
        return x-y;
    }
    public int mult(int x, int y){
        return x*y;
    }
    public int div(int x, int y){
        if(y==0){
            throw new RuntimeException("wrong input");
        }
        else{
        return x/y;}
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter ur name:");
        String s=sc.nextLine();
        calculator cal=new calculator(s);
        System.out.println("User name: "+cal.name);
        System.out.println("plz type the operation ^^ >> (add,sub,mult,div)");
        String op=sc.nextLine();
        if(op.equals("add")){
            System.out.println("enter the numbers");
            int x= sc.nextInt();
            int y= sc.nextInt();
            System.out.println(cal.add(x,y));
        }
        else if(op.equals("sub")){
            System.out.println("enter the numbers");
            int x= sc.nextInt();
            int y= sc.nextInt();
            System.out.println(cal.sub(x,y));
        }
        else if(op.equals("mult")){
            System.out.println("enter the numbers");
            int x= sc.nextInt();
            int y= sc.nextInt();
            System.out.println(cal.mult(x,y));
        }
        else if(op.equals("div")){
            System.out.println("enter the numbers");
            int x= sc.nextInt();
            int y= sc.nextInt();
            System.out.println(cal.div(x,y));
        }
        else{
            System.out.println("error");
        }

    }
}
