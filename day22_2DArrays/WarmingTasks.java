package day22_2DArrays;

import java.util.Arrays;

public class WarmingTasks {
    public static void main(String[] args) {

        int [][] arr = { {1,2,3} , {4,5,6}};
        int [][] reversed= new int[2][3];
        int a=0;

        for (int i = arr.length - 1; i >= 0; i--) {
            int b=0;
            for (int j = arr[1].length - 1; j >= 0; j--) {
                reversed[a][b++]=arr[i][j];
            }
            a++;
        }
        System.out.println(Arrays.deepToString(reversed));
        System.out.println("-----------------------");

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("--------------");

        int w=0;
        for (String[] arr1D : items) {
            int q =0;
            for (String each : items[w]) {
                System.out.print(items[w][q++] +"\t");
            }
            System.out.println();
            w++;
        }
        System.out.println("-/-----------------------");

        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length-1; j >=0; j--) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        for (int i =  items.length-1; i >=0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("------------------------");

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String [][] batch25Groups = new String[3][];

        batch25Groups[0] = Arrays.copyOf(batch25Group1, batch25Group1.length);
        batch25Groups[1] = Arrays.copyOf(batch25Group2, batch25Group2.length);
        batch25Groups[2] = Arrays.copyOf(batch25Group3, batch25Group3.length);

        System.out.println(Arrays.deepToString(batch25Groups));

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String [][] batch24Groups = new String[3][];
        batch24Groups[0] = Arrays.copyOf(batch24Group1, batch24Group1.length);
        batch24Groups[1] = Arrays.copyOf(batch24Group2, batch24Group2.length);
        batch24Groups[2] = Arrays.copyOf(batch24Group3, batch24Group3.length);
        System.out.println(Arrays.deepToString(batch24Groups));

        String [][][] CydeoStudents = new String[2][][];
        CydeoStudents[0] = Arrays.copyOf(batch24Groups, batch24Groups.length);
        CydeoStudents[1] = Arrays.copyOf(batch25Groups, batch25Groups.length);

        System.out.println(Arrays.deepToString(CydeoStudents));







    }

}
