/**
 * Pair class to store key-value pairs
 */
// class Pair {
//     /**
//      * @param {number} key The key to be stored in the pair
//      * @param {string} value The value to be stored in the pair
//      */
//     constructor(key, value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    /**
     * @param {Pair[]} pairs
     * @returns {Pair[][]}
     */
    insertionSort(pairs: Pair[]): Pair[][] {
        const res: Pair[][] = [];
        if(pairs.length <= 0){
            return [];
        }
        for(let i = 0; i < pairs.length; i++){
            const current = pairs[i];
            let j = i-1;
            while(j >= 0 && pairs[j].key > current.key){
                const temp = pairs[j];
                pairs[j+1] = temp;
                j--;
            }
            pairs[j+1] = current;
            res.push([...pairs]);
        }
        return res;
    }
}
