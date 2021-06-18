package datastruct.stacks;

import java.util.Arrays;
import java.util.Stack;

public class ParenthesisStack {

    public static int[] calculateSpanUsingArray(int price[], int n){
        int[] span = new int[n];

        return span;

    }
    public static int[] calculateSpan(int price[], int n){
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] =1;
        for(int i=1;i<n;i++){

            while (!st.isEmpty() && price[st.peek()]<=price[i]){
                st.pop();
            }

            span[i]= st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }

        return span;
    }



    public static int[] calculateSpanTrial(int price[], int n)
    {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> backupStack = new Stack<>();
        int[] result = new int[n];
        if(n>0) {
            result[0] = 1;
            stack.push(price[0]);
        }
        for(int i=1;i<price.length;i++){
            int last = stack.peek();
            int index =0;
            if(last>price[i]){
                result[i]=1;
            }else{
                while (!stack.isEmpty()&&price[i]>last){
                    last = stack.pop();
                    backupStack.push(last);
                    /*if(!stack.isEmpty())
                        last = stack.peek();*/
                    index++;
                }
                if(stack.isEmpty() && price[i]>last ){
                    index++;
                }
                result[i]=index;
            }

            while (!backupStack.isEmpty()){
                stack.push(backupStack.pop());
            }
            stack.push(price[i]);
        }

        return result;

    }



    static boolean areBracketsBalanced(String expr){

        MonStack<Character> monStack = new MonStack<>(expr.length());
        char[] arr = expr.toCharArray();
        for(int i =0; i<arr.length;i++){
            if(arr[i]=='[' || arr[i]== '(' || arr[i]== '{') {
                monStack.push(arr[i]);
            }else{
                if((arr[i]==']' && monStack.pop()!='[') || (arr[i]=='}' && monStack.pop()!='{')  || (arr[i]==')' && monStack.pop()!='(')   ){
                    return false;
                }
            }
        }
        if(!monStack.isEmpty())
            return false;
        return true;
    }

    public static void main(String[] args) {

       // System.out.println(areBracketsBalanced("[(])"));

        int[] test = {10, 4, 5, 90, 120, 80};
        int[] result = calculateSpan(test,test.length);
        for(int k=0;k<result.length;k++){
            System.out.print(result[k]+",");
        }
    }
}
