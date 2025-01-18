import java.util.*;

public class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var numStudents = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numStudents; i++) {
            var grade = Integer.parseInt(scan.nextLine());
            if (grade < 38) { 
                System.out.println(grade);
            }
            else if (grade % 5 < 3) {
                System.out.println(grade);
            } else {
                System.out.println((Math.floorDiv(grade,5)+1)*5);
            }
    }
}
}