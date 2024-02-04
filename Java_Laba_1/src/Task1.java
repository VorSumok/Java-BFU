import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        int count = 0;

        while (a != 1){
            if (a<0){
                System.out.println("Переполнение переменной :(");
                break;
                }
            if (a%2 == 0){
                a = a/2;
            }
            else {
                a = 3*a + 1;
            }
            count = count + 1;
        }
        System.out.println(count);
    }
}