package ExceptionsExercise;

import java.util.Scanner;
import java.util.InputMismatchException;
    public class ArrayException {
        public String getPriceDetails() {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter the number of elements in the array");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the price details");
                for(int i=0; i<size; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("Enter the index of the array element you want to access");
                int index = sc.nextInt();
                return "The array element is " + arr[index];
            }
            catch(ArrayIndexOutOfBoundsException e) {
                return "Array index is out of range";
            }
            catch(InputMismatchException e) {
                return "Input was not in the correct format";
            }
        }
        public static void main(String[] args) {
            ArrayException ae = new ArrayException();
            System.out.println(ae.getPriceDetails());
        }
    }




