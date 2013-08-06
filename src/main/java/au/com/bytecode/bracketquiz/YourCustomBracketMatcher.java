package au.com.bytecode.bracketquiz;

/**
 * @author Samweli
 */
public class YourCustomBracketMatcher implements BracketMatcher {

    @Override
    public boolean validateBrackets(String lineWithBrackets) {
        int i;
        Stack stack = new Stack();
        for (i = 0; i < lineWithBrackets.length(); i++) {
            if (lineWithBrackets.charAt(i) == '(') {
                stack.push(lineWithBrackets.charAt(i));
            } else if (lineWithBrackets.charAt(i) == ')') {
                try {
                    stack.pop();
                } catch (Exception e) {
                   System.out.println("Invalid");
                    return false;
                }
            }

        }
        if(stack.empty()){
        System.out.println("Valid");
        }else{
        System.out.println("Invalid");
        }

        return stack.empty();
        
    }

}

