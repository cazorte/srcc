package day19_PracticeTasks;

public class FirstDuplicatedCharacter {
    public static void main(String[] args) {

        String str = "daaasddwwweessdd";
        str = " " + str + " ";
        String result = "";

        for (int i = 0; i <= str.length() - 4; i++) {
            char ch0 = str.charAt(i);
            char ch1 = str.charAt(i + 1);
            char ch2 = str.charAt(i + 2);
            char ch3 = str.charAt(i + 3);
            if (ch1 == ch2 && ch0 != ch1 && ch3 != ch2) {
                result = "" + ch1 + ch2;
                System.out.println("First duplicated character: " + result);
                System.out.println("Index of the these duplicate character: " + str.indexOf(result));

                System.exit(0);
            }


        }


    }
}
