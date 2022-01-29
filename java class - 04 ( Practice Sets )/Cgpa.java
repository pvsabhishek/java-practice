import java.util.*;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Subject1 :-");
        int subject1 = sc.nextInt();
        System.out.println("Enter marks of Subject2 :-");
        int subject2 = sc.nextInt();
        System.out.println("Enter marks of Subject3 :-");
        int subject3 = sc.nextInt();

        float cgpa = (float)(subject1 + subject2 + subject3) / 30;


        System.out.println(cgpa);

    }
    
}
