package task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Маша");
        list.add("Василий");
        list.add("Андрей");
        list.add("Галя");
        list.add("Тоша");
        System.out.println(list);
        for(int i =0; i<list.size(); i++){
            char arr[] = list.get(i).toCharArray();
            if(arr.length<5){
                System.out.println(arr);
            }
        }
    }
}
