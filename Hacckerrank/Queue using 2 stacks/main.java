import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    Stack <Integer> input=new Stack();
    Stack <Integer> output=new Stack();
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        Solution s=new  Solution();
        for(int i=0;i<q;i++){
            int choice=sc.nextInt();
            //Enqueue for 1 //Dequeue for 2 //Peek for 3
            int add=0;
            
            switch(choice){
                case 1:{
                    add=sc.nextInt();
                    s.enqueue(add);
                    break;
                }
                case 2:{
                    s.dequeue();
                    break;
                }
                case 3:{
                   int res= s.peek();
                   System.out.println(res);
                    break;
                }
                
                
            }
        }  
        sc.close();      
    }
    public void enqueue(int x){
        input.push(x);
    }
    public int dequeue(){
         if(isEmpty()) {
             return -1;
         }
        peek();
        return output.pop();
    }
    public int peek(){
        if(output==null||output.empty()){
            while(!input.empty()){
                output.push(input.pop());
            }
        }
        if(output.isEmpty()){
            return -1;
        }
        return output.peek();
    }
    public boolean isEmpty(){
        return input.isEmpty() && output.isEmpty();
    }
    
    
}
