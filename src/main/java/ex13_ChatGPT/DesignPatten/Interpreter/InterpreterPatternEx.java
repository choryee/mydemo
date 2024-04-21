package ex13_ChatGPT.DesignPatten.Interpreter;

interface Expression{
    int interpret(Context context);
}

class Context{
    private String input;

    Context(String input){
        this.input=input;
    }

    public String getInput(){
        return input;
    }
}
// TerminalExpression 클래스
class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}
class Add implements Expression{
    private Expression left;
    private Expression right;

    Add(Expression left, Expression right){
        this.left=left;
        this.right=right;
    }
    @Override
    public int interpret(Context context) {
        return left.interpret(context)+right.interpret(context);
    }
}

public class InterpreterPatternEx {
    public static void main(String[] args) {
        Context context=new Context("1+2+3");
        Expression expression = new Add(new Add(new Number(1), new Number(2)), new Number(3));


    }
}
