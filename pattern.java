//code to print hollow square pattern
import java.util.Scanner;
class pattern{
    void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        pattern p=new pattern();
        int n;
        System.out.println("Enter n:");
        n=scan.nextInt();
        p.printPattern(n);
    }
}