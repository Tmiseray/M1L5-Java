import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Objective1 {

    public static ArrayList<Integer> getIntegerArray(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a total of 5 integers, 1 at a time.");
        System.out.print("Integer 1: ");
        int num1 = scan.nextInt();
        scan.nextLine();

        System.out.print("Integer 2: ");
        int num2 = scan.nextInt();
        scan.nextLine();

        System.out.print("Integer 3: ");
        int num3 = scan.nextInt();
        scan.nextLine();

        System.out.print("Integer 4: ");
        int num4 = scan.nextInt();
        scan.nextLine();

        System.out.print("Integer 5: ");
        int num5 = scan.nextInt();
        scan.nextLine();

        ArrayList<Integer> intList = new ArrayList();
        intList.add(num1);
        intList.add(num2);
        intList.add(num3);
        intList.add(num4);
        intList.add(num5);

        return intList;
    }

    public static void reverseArray(ArrayList<Integer> arr){
        Collections.sort(arr);
        ArrayList<Integer> revArr = new ArrayList<>(arr.reversed());
        System.out.println("Your array of integers reversed: " + revArr);
//        System.out.println(revArr);
    }

    public static void maxValue(ArrayList arr){
        int maxValue = 0;
        for(Object num : arr){
            if((int) num < maxValue){
                continue;
            } else if ((int) num > maxValue) {
                maxValue = (int) num;
            }
        }
        System.out.println("Max Value: " + maxValue);
    }

    public static void minValue(ArrayList<Integer> arr){
        Collections.sort(arr);
        int minValue = arr.get(0);
        System.out.println("Min Value: " + minValue);
    }

    public static void sumArray(ArrayList<Integer> arr){
        int sum = 0;
        for(Object num : arr){
            sum += (int) num;
        }
        System.out.println("Sum of Integer Array: " + sum);
    }

    public static void evenNumbers(ArrayList<Integer> arr){
        ArrayList<Integer> evenArr = new ArrayList<>();
        for(Object num : arr){
            if((int) num % 2 == 0){
                evenArr.add((int) num);
            }
        }
//        Integer[] intArray = evenArr.toArray(new Integer[0]);
        if(evenArr.size() == 0){
            System.out.println("There are no even numbers in the array.");
        } else {
            System.out.println("There are " + evenArr.size() + " even numbers in the array.");
        }
    }

    public static void main(String[] args) {
        ArrayList intList = getIntegerArray();
        System.out.println("Your array of integers: " + intList);
//        System.out.println(intList);

        reverseArray(intList);
        maxValue(intList);
        minValue(intList);
        sumArray(intList);
        evenNumbers(intList);
    }
}
//