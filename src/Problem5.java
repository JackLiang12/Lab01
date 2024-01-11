import java.util.Stack;

public class Problem5 {
    public static boolean validBrackets(String s){
        Stack<Character> c = new Stack<>();
        char[] characters = s.toCharArray();

        for(int i = 0; i < characters.length ; i++){
            if(characters[i] == '('||characters[i] == '{'||characters[i] == '['){
                c.push(characters[i]);
            }
            if(characters[i] == ')'){
                if(c.pop() != '('){
                    return false;
                }
            }
            if(characters[i] == '}'){
                if(c.pop() != '{'){
                    return false;
                }
            }
            if(characters[i] == ']'){
                if(c.pop() != '['){
                    return false;
                }
            }
        }
        return true;
    }
}
