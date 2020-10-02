import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
 
public class javalite{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        long count = 0;
        long cost = 0;
        long countzero =0;
        int temp;
        for (int i=0;i<a;i++){
            temp = input.nextInt();
            if (temp>0){
                cost += temp-1;
            } else if (temp<0){
                count++;
                cost += (temp+1)*(-1);
            } else if (temp==0){
                countzero++;
            }
        }
        if (countzero > 0) {
            cost += countzero;
        } else{
            if (count % 2 !=0){
                cost+=2;
            }
        }
        System.out.println(cost);
        input.close();
    }
 
   
}