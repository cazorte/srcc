package day19_PracticeTasks;

public class IndexOfFirstUniqueChar {
    public static void main(String[] args) {

        String str ="aaassddssweasddffsddgertjyuj";
        String result ="";

        for (int k = 0; k < str.length(); k++) {
            char ch=str.charAt(k);
            int count=0;

            for (int i = 0; i < str.length(); i++) {
                char each=str.charAt(i);
                if (ch==each){
                    count++;
                }
            }


            if (count==1){
                System.out.println(ch);
                break;

            }

        }




    }
}
