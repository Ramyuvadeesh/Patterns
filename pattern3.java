//print palindrome number pattern
import java.util.*;
class pattern3{
    void printPattern(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n:");
        n=scan.nextInt();
        pattern3 p=new pattern3();
        p.printPattern(n);
    }
}