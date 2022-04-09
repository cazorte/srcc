package day19_PracticeTasks;

public class TwiceCharacter {
    public static void main(String[] args) {

        String str ="faasdeerfsaaaceeeeddc";
        String result="";

        for (int k = 0; k < str.length(); k++) {
            char ch0=str.charAt(k);
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                char each=str.charAt(i);
                if (ch0==each){
                    count++;
                }
            }
            if (count==2){
                if (!result.contains(""+ch0)){
                    result+=""+ch0;
                }

            }

        }




        System.out.println("Twice character: "+result);






    }
}
