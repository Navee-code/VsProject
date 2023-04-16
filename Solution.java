import java.util.*;
public class Solution {
    public static void main(String ar[]){
      System.out.println(  isValid("{[()      ]}"));
    }
    public static boolean isValid(String s) {
     Stack <Character> stack=new Stack<>();
        for (Character character : s.toCharArray()) {
            switch(character){
                case '{':
                case '[':
                case '(':
                stack.push(character);
               
                break;
                case ']':
                    if(stack.isEmpty() || stack.pop() !='['){
                    return false;
             }
             break;
                case '}':
                    if(stack.isEmpty() || stack.pop() !='{'){
                    return false;
             }
               break;
                case ')':
                    if(stack.isEmpty() || stack.pop() !='('){
                    return false;
             }
               break;

            }

        }
        System.out.print(stack);
        System.out.print( stack.isEmpty());
       return stack.isEmpty();
    }

}