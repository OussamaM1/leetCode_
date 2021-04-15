class Solution {
    public String interpret(String command) {
        String ans = "";
        for(int i = 0 ; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                ans+="G";
            }else if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    ans+="o";
                }else {
                    ans+="al";
                }
            }
        } 
        return ans ;
    }
}