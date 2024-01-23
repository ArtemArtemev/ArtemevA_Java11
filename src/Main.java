import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

       //Составить алгоритм: если введенное число больше 7, то вывести “Привет”

       int num;
       System.out.print("Введите число больше 7 (7 не входит): ");

        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num > 7) {
                System.out.println("Привет");

            }
        } else {
            System.out.println("Вы ввели не число, Перезапустите программу попробуйте снова");

        }

        //Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
        String name;
        System.out.print("Введите имя (Например: Иван): ");

        if(scanner.hasNext()){
            name = scanner.next();
            if(name.equals("Вячеслав")){
                System.out.println("Привет, " + name);

            }else {
                System.out.println("Нет такого имени");

            }
        }

        //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

        String newString ="";
        System.out.println("Введите массив целых чисел с разделителем ',' : ");

        if (scanner.hasNext()){
            newString = scanner.next();
        }
        String [] arrStr = newString.split(",");
        int[] arr = new int[arrStr.length];
        int counterWrite=0;

        for ( int i=0; i < arr.length; i++){
            arr[counterWrite] = Integer.valueOf(arrStr[i]);
            counterWrite++;

        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] % 3 == 0 && arr[k] != 0) {
                System.out.println(arr[k]);

            }
        }
    }
}