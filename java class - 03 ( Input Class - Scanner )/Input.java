import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int int_Number = sc.nextInt();
        System.out.println(int_Number);

        float float_Number = sc.nextFloat();
        System.out.println(float_Number);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        String str = sc.next();
        System.out.println(str);
        
    }

}
