import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i=1; i<=10; i++){
            stack.push(i*3);
        }

        System.out.println("Stack before removal of 4 elements: " + stack);

        for(int i =1; i<=4; i++){
            stack.pop();
        }

        System.out.println("Stack after removal of 4 elements: " + stack);
    }
}
