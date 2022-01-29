public class Percentage{
    public static void main(String[] args) {
        System.out.println("Enter Marks Out Of 100 :-");
        int marks_english = 93;
        int marks_hindi = 99;
        int marks_math = 96;
        int marks_physics = 95;
        int marks_chemistry = 93;

        int marks_total = marks_chemistry + marks_english + marks_hindi + marks_math + marks_physics;
        System.out.println(marks_total);

        double marks_percentage = ((double)marks_total / 500 * 100);
        System.out.println(marks_percentage);
    }
}