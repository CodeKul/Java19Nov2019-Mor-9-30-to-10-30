package collections;

import java.util.*;

public class CollectionDemo {

    void listData(){

        List<Integer>  list=new ArrayList<>();
        List<Integer>  list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);


        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3
        list.add(5);//4
        list.add(6);//5 index
        list.add(3,8);
        list.addAll(list1);

        list.forEach(l ->{
            System.out.println(l);
        });
    }

    void setData(){

//        Set<String> set=new HashSet<>();
        Set<String> set=new TreeSet<>();
        Set<String> set1=new HashSet<>();
        set1.add("priya1");
        set1.add("varsha1");
        set1.add("ajay1");


        set.add("rajan");
        set.add("priya");
        set.add("varsha");
        set.add("ajay");
        set.add("rajan");
        set.add("priya");
        set.add("varsha");
        set.add("ajay");
        set.addAll(set1);

        set.forEach(s ->{
            System.out.println(s);
        });
    }


    public static void main(String[] args) {
        CollectionDemo demo=new CollectionDemo();
        //demo.listData();
        demo.setData();
    }

}
