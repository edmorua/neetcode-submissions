// Definition for a pair
/**class Pair {
    int key;
    String value;

    Pair(int key, String value) {
        this.key = key;
        this.value = value;
    }
}**/

public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        int length = pairs.size();
        if(length <= 0){
            return new ArrayList<>();
        }
        List<List<Pair>> solutionList = new ArrayList<>();
        solutionList.add(new ArrayList<>(pairs));
        for(int i = 1; i < length; i++){
            Pair p = pairs.get(i);
            int j = i -1;
            while(j >= 0 && pairs.get(j).key > p.key){
                Pair jPair = pairs.get(j);
                pairs.set(j+1, jPair);
                j--;
            }
            pairs.set(j+1, p);
            solutionList.add(new ArrayList<>(pairs));

        }
        return solutionList;
    }
}
