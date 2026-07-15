import java.util.Stack;

public class l2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        Stack<Character> stack =new Stack<>();
        for (char ch:s.toCharArray())
        {
            if(ch=='*')
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }
        StringBuilder result=new StringBuilder();
        for(char ch: stack)
        {
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}
