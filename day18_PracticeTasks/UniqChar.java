package day18_PracticeTasks;

public class UniqChar {
    public static void main(String[] args) {

        String word = "aaadeefrrrarttgyyydgylq";
        String result = "";

        while (true) {
            String temp = word.substring(0, 1);
            int counter = 0;
            while (word.contains(temp)) {

                word = word.replaceFirst(temp, "");
                counter++;
            }
            if (counter == 1) {
                result += temp;
            }
            if (word.length() == 0) {
                System.out.println(result);
                break;
            }

        }


    }
}
