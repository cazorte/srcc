package day16_PracticeTasks;

public class WordCounter {
    public static void main(String[] args) {

        String sentence ="java I java java Java";
        String word ="java";

        int occurrence2=0;

        for (int i = 0; i < sentence.length(); i++) {
            if ( sentence.indexOf(word, i) > -1) {
                occurrence2++;
                i = sentence.indexOf(word, i);
            }

        }
        System.out.println( occurrence2 );
        float data= 45_4;
        System.out.println(data);



    }
}
