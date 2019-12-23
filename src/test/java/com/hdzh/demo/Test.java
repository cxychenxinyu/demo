package com.hdzh.demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {

          /*List<String> list = new ArrayList<>();
          list.add("first");
          list.add("second");
          Iterator<String> iterator = list.iterator();
          while (iterator.hasNext()){
              String item = iterator.next();
              if ("first".equals(item)){
                  System.out.println("删除元素"+item);
                  iterator.remove();
              }
          }*/

        Map<String , String> map =  new HashMap<>(16);
        map.put("1", "111111");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for ( Map.Entry<String, String> nmber: entrySet) {
            System.out.println(nmber.getKey());
            System.out.println(nmber.getValue());
        }
    }
}
