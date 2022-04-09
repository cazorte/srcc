package KahhotIcinSorular;

public class Unit2 {

    public static void main(String[] args) {


        String a = "123";
        String b = 5+4+a;
        System.out.println(b);

        String s3 = "Java is fun";
        int c = s3.charAt(4);

        if (c == 'a'){
            System.out.println("A");
                    }
        else if (c == ' ') System.out.println("B");

        else
            System.out.println("C");


        String s = "the game was tied";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if (index1 == index2) System.out.println(index1);
        else System.out.println(index2);

        int count =0;
        for (int i = 0; i < 4; i++) {
            if (i==3) continue;

            for (int b1 =i+1; b1<5; b1++){
                count++;

                if (b1==3) break;
            }
        }
        System.out.println(count);

        int[] nums = {14,1,84,97,1243,46};
        int total =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] %2 !=0) total+=3;
            else total+=10;

            if (i%3 ==0) total-=15;
        }
        System.out.println(total);

    }


}
