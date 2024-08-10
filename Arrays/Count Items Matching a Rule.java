
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;
        if(ruleKey.equals("type"))
        {
            index = 0;
        }
        else if(ruleKey.equals("color"))
        {
            index = 1;
        }
        else
        {
            index = 2;
        }
      //another loop
        // for(int i = 0;i<items.size();i++)
        //     {
        //         if(items.get(i).get(index).equalsto(rulevalue))
        //         {
        //             count++;
        //         }
                
        //     }
        // return count;
        for(List<String> item : items)
        {
            if(item.get(index).equals(ruleValue))
            {
                count++;
            }
        }
        return count;
      
    }

}
