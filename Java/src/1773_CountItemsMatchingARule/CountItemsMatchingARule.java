import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0 ;
        if(ruleKey.equals("type")){
            for(List<String>  stringList : items){
                if(stringList.get(0).equals(ruleValue))
                    ans++;
            }
        }else if(ruleKey.equals("color")){
            for(List<String>  stringList : items){
                if(stringList.get(1).equals(ruleValue))
                    ans++;
            }
        }else {
            for(List<String>  stringList : items){
                if(stringList.get(2).equals(ruleValue))
                    ans++;
            }
        }
        return ans;
    }
}