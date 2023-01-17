package exam.e8;

import java.util.concurrent.ThreadLocalRandom;

public class RetryWithLimitCount {
    public static void main(String[] args) {
        /**
         * getRandomDouble()可以取得0-1之間的一個亂數，為double值，將其放大10倍以取得0-10之間的整數,但可能會丟出Exception
         * 題目：總共需取得10組整數
         * 限制：每一組，呼叫getRandomDouble()取得數字如果發生Exception，則要重新取，最多只能試3次。也就是如果連續取3次都發生Exception，則印出「無法取得」。
         *      最後將取得的結果以及呼叫次數列印出來
         * 例如：
         * 第1次取得 3 呼叫2次
         * 第2次取得 無法取得
         * 第3次取得 4 呼叫1次
         * ..
         * 第10次取得 5
         */
    	int countNum = 0; //取樣幾次
    	int correctSet=0; //需有10個整數
        int result=0;
        int count=0; //最多只能取三次
        while(correctSet<10) {
        	count=0;
        	try {
        		result = (int)(getRandomDouble()*10);
        		countNum++;
        		correctSet++;
        		System.out.printf("第%d次取得 %d 呼叫 %d次%n",countNum,result,count);
        	}
        	catch (Exception e) {
        		countNum++;
        		result = -1 ;
        		count=0;
        		while(count<4) {
        			count++;
        			try {
        				result =(int)(getRandomDouble()*10);  
                        break;
        			}catch(Exception e2) {
        				continue;
        			}
        		}
        		if(count<=3) {
        			System.out.printf("第%d次取得 %d 呼叫 %d次%n",countNum,result,count);
        			correctSet++;
        		}
        		else {
        			System.out.printf("第%d次取得 無法取得%n",countNum);
        			count=0;
        		}
        		}
        	}
        }
    

    // DO NOT CHANGE
    public static double getRandomDouble() throws IllegalStateException{

        double nextValue = ThreadLocalRandom.current().nextDouble();
        if ( (int)(nextValue*10) %2 == 1 ){
            throw new IllegalStateException("Something wrong, please try again!");
        }
        return nextValue;
    }

}
