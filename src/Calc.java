import java.util.Stack;

public class Calc extends Compf{
    private Stack<Integer> s;
    private Stack<Integer> preS;

    public Calc(){
        preS = new Stack<Integer>();
        s = new Stack<Integer>();
    }

    private static int char2int(char c){
        return (int)c - (int)'0';
    }

    private void buildNum(){
        if (preS.empty()){
            return;
        }
        int umn = 0;
        int num = 0;
        while(!preS.empty()){
            num += preS.pop() * Math.pow(10, umn++);
        }
        s.push(num);
    }

    @Override
    protected int symType(char c){
        switch (c) {
            case '(', '{', '[' -> {
                buildNum();
                return SYM_LEFT;
            }
            case ')', '}', ']' -> {
                buildNum();
                return SYM_RIGHT;
            }
            case '+', '-', '*', '/' -> {
                buildNum();
                return SYM_OPER;
            }
            default -> {
                return symOther(c);
            }
        }
    }

    @Override
    protected int symOther(char c){
        if(c < '0' || c > '9'){
            System.out.println("Недопустимый символ: " + c);

            System.exit(0);
        }

        return SYM_OTHER;
    }

    @Override
    protected void nextOper(char c){

        if (symType(c) == SYM_RIGHT){
            if (c == ']'){
                s.push(s.pop()*2);
            }
            return;
        }

        int second = s.pop();
        int first = s.pop();
        switch(c){
            case '+':
                s.push(first + second);
                break;
            case '-':
                s.push(first - second);
                break;
            case '*':
                s.push(first*second);
                break;
            case '/':
                s.push(first/second);
                break;
            case ']':
                break;
        }
    }

    @Override
    protected void nextOther(char c){
        preS.push(char2int(c));
        //s.push(Character.getNumericValue(c));
    }

    @Override
    public final Integer compile(char[] str){
        super.compile(str);

        return s.peek(); //?!
    }
}