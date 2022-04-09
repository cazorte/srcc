package day18_PracticeTasks;

public class FrequencyChar {
    public static void main(String[] args) {

        String word="aaabbbcdddeef";
        String result="";


        while(true){
            result+=word.substring(0,1);
            String firstChar = word.substring(0,1);
            int counter=0;
            while (word.contains(firstChar)){
                word=word.replaceFirst(firstChar,"");
                counter++;
            }
            result+=counter;
            if (word.length()==0){
                System.out.println(result);
                break;
            }


        }


     /*   while (true){
            int count=0;
            result+=word.substring(0,1);
            String ch=word.substring(0,1);
            while (word.contains(ch)){
                count++;
                word=word.replaceFirst(ch,"");}
            result+=count;
            if (word.length()==0){
                System.out.println(result);break;}}
*/





    }
}
