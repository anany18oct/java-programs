import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        int size ,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Elements");
        size = sc.nextInt();
        int a[]=new int[size];
        for(i=0;i<size;i++){
             a[i]=sc.nextInt();
        }
        System.out.print("Printed Elements");
        for(i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }

    }
}