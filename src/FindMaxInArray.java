import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element "+(i+1)+":");
            array[i]=sc.nextInt();
        }

        for (int a:array) {
            System.out.print(a+"\t");
        }

        int max=0;
        int index=1;
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
                index = i+1;
            }
        }
        System.out.println("\n"+"Elemect max in the list : "+max+" at localtion: "+index);
    }
}
