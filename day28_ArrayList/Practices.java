package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practices {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        list.set(list.size()-1 , 0);
        System.out.println("list = " + list);

        System.out.println("-------------------");

        Integer temp = list.get(list.size()-1);
        System.out.println(temp);
        list.set(list.size()-1, list.get(0) );
        list.set(0,temp);

        System.out.println(list);
        System.out.println("-----------------");

        for (Integer each : list) {
            if (each.intValue() %2 ==1){
                list.set(list.indexOf(each), each.intValue()*2);
            }
        }
        System.out.println(list);


        System.out.println("-----------------------");

        ArrayList <String> arr1 = new ArrayList<>();
        ArrayList <String> arr2 = new ArrayList<>();
        arr1.addAll(Arrays.asList("A", "B", "C"));
        arr2.addAll(Arrays.asList("D", "E", "F","G"));

        ArrayList <String> list2 = new ArrayList<>();
        list2.addAll(arr1);
        list2.addAll(arr2);

        System.out.println(list2);


        System.out.println("--------------------");

        ArrayList<Integer>  list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,54,42,-11,12));
        int max = list3.get(0);


        for (Integer each : list3) {
            //System.out.println(each.intValue());
            if (each.intValue() > max){
                max = each.intValue();
            }
        }
        System.out.println("mux number is: "+max);

        System.out.println("------------------------");

        int min = list3.get(0);

        for (Integer each : list3) {
            if (each.intValue()< min){
                min = each.intValue();
            }
        }
        System.out.println("min = " + min);
        System.out.println("----------------------");

        ArrayList<Integer>  list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,1,1,1,2,2,48,48,4,5,54,42,-11,12,48));

        Integer result = null;
        for (Integer each : list4) {
            if (list4.indexOf(each) == list4.lastIndexOf(each)){
                result = each;
                break;
            }
        }
        System.out.println("result = " + result);





    }

}
