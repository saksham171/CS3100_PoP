import java.util.Stack;

public class Calc {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<Integer>();
        int n = Code.code.length;
        for(int i = 0 ; i < n ; i++){
            String cur = Code.code[i];
            if(cur.equals("push")){
                s.push(Integer.parseInt(Code.code[i + 1]));
                i++;
            }
            else if(cur.equals("pop")){
                if(!s.empty()){
                    System.out.println(s.pop());
                }
            }
            else if(cur.equals("dup")){
                if(!s.empty()){
                    s.push(s.peek());
                }
            }
            else if(cur.equals("add")){
                int op1 = 0,op2 = 0;
                if(!s.empty()) op1 = s.pop();
                else continue;
                if(!s.empty()) op2 = s.pop();
                else{
                    s.push(op1);
                    continue;
                }
                s.push(op1 + op2);
            }
            else if(cur.equals("sub")){
                int op1 = 0,op2 = 0;
                if(!s.empty()) op1 = s.pop();
                else continue;
                if(!s.empty()) op2 = s.pop();
                else{
                    s.push(op1);
                    continue;
                }
                s.push(op1 - op2);
            }
            else if(cur.equals("mul")){
                int op1 = 0,op2 = 0;
                if(!s.empty()) op1 = s.pop();
                else continue;
                if(!s.empty()) op2 = s.pop();
                else{
                    s.push(op1);
                    continue;
                }
                s.push(op1 * op2);
            }
            else if(cur.equals("div")){
                int op1 = 0,op2 = 0;
                if(!s.empty()) op1 = s.pop();
                else continue;
                if(!s.empty()) op2 = s.pop();
                else{
                    s.push(op1);
                    continue;
                }
                s.push(op1 / op2);
            }
        }
    }
}
