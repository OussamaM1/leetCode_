class Solution {
    public String sortSentence(String s) { 
        String[] str = s.split(" ");
        String ans = "";
        for(int i=0 ; i < str.length ; i++){

            for(int j=0 ; j < str.length ;j++){
                
               if(i+1 ==Character.getNumericValue(str[j].charAt(str[j].length()-1))){
                    ans+=str[j].substring(0, str[j].length() - 1)+" ";
                }
            }
        }
        
        return ans.trim();

    }
} 
