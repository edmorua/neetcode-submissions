// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        if(pairs.size() <= 1) return pairs;
        mergeSortHelper(pairs,0,pairs.size()-1);
        return pairs;
    }

    private void mergeSortHelper(List<Pair> pairs, int start, int end){
        if(start >= end){
            return;
        }
        int middle = (start + end)/2;
        mergeSortHelper(pairs, start, middle);
        mergeSortHelper(pairs,middle+1, end);
        merge(pairs, start, middle, end);
    }
    private void merge(List<Pair> pairs, int left, int middle, int right){
        List<Pair> leftList = new ArrayList<>(pairs.subList(left, middle+1));
        List<Pair> rightList = new ArrayList<>(pairs.subList(middle+1, right+1));
        int i = 0,j = 0;
        int k = left;
        while(i < leftList.size() && j < rightList.size()){
            if(leftList.get(i).key <= rightList.get(j).key){
                pairs.set(k++, leftList.get(i++));
            }else {
                pairs.set(k++, rightList.get(j++));
            }
        }
        while(i < leftList.size()) pairs.set(k++, leftList.get(i++));
        while(j < rightList.size()) pairs.set(k++, rightList.get(j++));
    }
}
