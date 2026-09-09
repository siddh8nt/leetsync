class Solution {
    public int totalFruit(int[] fruits) {
        int hi = 0, lo = 0;
        int maxfr=Integer.MIN_VALUE; //fruits determined by subarray length
        Map<Integer, Integer> freq = new HashMap<>();
        // element to frequency mapping

        for(hi = 0; hi < fruits.length; hi++){
            freq.put(fruits[hi], freq.getOrDefault(fruits[hi],0)+1);

            while(freq.size()>2){
                freq.put(fruits[lo], freq.get(fruits[lo])-1);
                if (freq.get(fruits[lo])==0){
                    freq.remove(fruits[lo]);
                }
                
                lo++;
            }
            maxfr=Math.max(maxfr, hi-lo+1);
           
        }
      return (maxfr==Integer.MIN_VALUE)?0:maxfr;
    }
}