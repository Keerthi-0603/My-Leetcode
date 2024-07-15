class Solution {
    public int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        char operand='+';
        int currentNumber=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                currentNumber=currentNumber*10+(c-'0');
            }
            if((!Character.isDigit(c) && !Character.isWhitespace(c)) || i==s.length()-1){
                if(operand=='+'){
                    stack.push(currentNumber);
                }
                else if(operand=='-'){
                    stack.push(-currentNumber);
                }
                else if(operand=='*'){
                    stack.push(stack.pop()*currentNumber);
                }
                else if(operand=='/'){
                    stack.push(stack.pop()/currentNumber);
                }
                operand=c;
                currentNumber=0;
            }
        }
        int result=0;
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
}