import java.util.Scanner;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {
        // задание 1
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        //  задание 2
        int[] mass = new int[size];
        System.out.println("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            mass[i] = in.nextInt();
        }


        // задание 3
        int min = mass[0];
        for (int i = 0; i < size; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }

        }
        System.out.println("минимальное число в масиве " + min);


        //  задание 4
        int max = mass[0];
        for (int i = 0; i < size; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }

        }
        System.out.println("\nмаксимальное число в масиве " + max);

// задание 5

        int J = 0;
        for (int i = 0; i < size; i++) {

            if (mass[i] == 5) {
                J++;
            }

        }
        System.out.println("\nколичество повторений числа 5 в масиве = " + J);


        // задание 6
        for(int i = 0; i < mass.length; i++) {
            for(int j = 1; j < (mass.length - i); j++) {
                if(mass[j-1] > mass[j]){
                    int temp = mass[j-1];
                    mass[j-1] = mass[j];
                    mass[j] = temp;
                }
            }
        }

        Arrays.sort(mass);

        System.out.println("\nмасив отсортирован по возрастанию");
        for(int car : mass) {
            System.out.println(car);
        }

        int[] mas= new int[size];
                int j=0,
                    p=0;

        for ( int i = 0; i < size; i++)

        {
            if ( j < size)
            {
                if ( mass[j] == mass[i])
                {
                    p++;
                    mas[j]= p ;
                }

                if (i == size)
                {
                    j++;
                    i = 0;
                }
            }

        }



        int max1 = mas[0];
        for (int i = 0; i < size; i++) {
            if (mas[i] > max1) {
                max1 = mas[i];
            }

        }
        System.out.println("\nмаксимальное число повторений в масиве = " + max1);

        int min1 = mas[0];
        for (int i = 0; i < size; i++) {
            if (mas[i] < min1) {
                min1 = mas[i];
            }

        }
        System.out.println("\nминимальное число повторений в масиве = " + min1);


    }
}