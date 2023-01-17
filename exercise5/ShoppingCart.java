package exam.e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {

        //實作1.加入二台Notebook("Asus",30000),Notebook("Acer",20000),Food("Cookie",200)到shoppingList中
        List<Product> shoppingList = new ArrayList<Product>();
        Notebook e1 = new Notebook("Asus", 30000);
        Notebook e2 = new Notebook("Acer", 20000);
        shoppingList.add(e1);
        shoppingList.add(e2);
        //實作2.利用for迴圈，計算shoppingList中的總金額,並印在Console中
        Food f1 = new Food("cookie",200);
        shoppingList.add(f1);
        int sum=0;
        for (Product product : shoppingList) {
        	sum = sum+product.getPrice();
        	
        }
        System.out.printf("shoppinglist總金額為:%d元%n",sum);
        //實作3.利用for迴圈，計算shoppingList中是Notebook型態的總金額,並印在Console中
        sum=0;
        for (Product product : shoppingList) {
        	if(product instanceof Notebook) {
        		sum= sum+product.getPrice();
        		}
            }
        System.out.printf("Notebook總金額為:%d元%n",sum);
        	
        }

    }
