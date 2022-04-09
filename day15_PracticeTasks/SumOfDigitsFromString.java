package day15_PracticeTasks;

public class SumOfDigitsFromString {

    public static void main(String[] args) {

        String input="A1B2C3";
        int sum=0;

  /*      for (int i = 0; i < input.length(); i++) {
            for (char a = '0'; a <= '9'; a++) {
                if (input.charAt(i)==a){
                    sum= sum+ (a-48);           //-48 convert char to int
                }
            }
        }
        System.out.println("sum = " + sum);
*/
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            if (ch>48 && ch<58){
                sum+=ch-48;

            }

        }
        System.out.println("sum = " + sum);

    }
}
