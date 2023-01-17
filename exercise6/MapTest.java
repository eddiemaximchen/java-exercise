package exam.e6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {

         People p1 = new People("001",21);
         People p2 = new People("002",33);
         People p3 = new People("003",41);
         //實作1:請實作一個「泛型」的Map中的key值為people的id，value為people物件，將上述三個people放入Map中
         Map<String,People> map = new HashMap<>();
         map.put("001",p1);
         map.put("002",p2);
         map.put("003",p3);
         //實作2:請用for迴圈或者iterator，計算Map中三人的平均年齡，列印到小數以下第一位
         Set keys = map.keySet();
         int sum=0;
         Double average=0.0;
         for (Object key : keys) {
             String id = (String) key;
             sum = sum +(map.get(id).getAge());
         }
         average =(double) (sum / map.size());
         System.out.printf("平均年齡:%.1f",average);
    }
}
