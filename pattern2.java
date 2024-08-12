
//pattern to print continous number series as inverted left right triangle
import java.util.Scanner;
class pattern2{
    static void ppattern(int n){
        int i,j,num=1;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        ppattern(n);
    }
}