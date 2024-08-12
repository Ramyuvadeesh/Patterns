//tricky pattern
public class PatternProgram {
    public static void main(String[] args) {
        String input = "EVERY";
        int length = input.length();
        int mid=input.length()/2;
        System.out.println(mid);
        String s = input.substring(mid,length);
        System.out.println(s);

        for (int i = 1; i <= length; i++) {
            // Print leading spaces
            for (int j = 1; j <= 2 * (length - i); j++) {
                System.out.print(" ");
            }

            // Print the required substring from the end
            if(i<=mid+1){
            for (int k = 0; k < i; k++) {
                System.out.print(s.charAt(k));
            }
            }
            else{
               System.out.print(s);
            for (int k = 0; k < i-(mid+1); k++) {
                System.out.print(input.charAt(k));
            }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
