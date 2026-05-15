class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        const stack = [];
        const dict = {
            ')': '(',
            '}': '{',
            ']': '['
        };

        for( let char of s){
            if(dict[char]){
                if(stack.length > 0 && stack[stack.length -1] === dict[char]){
                    stack.pop();
                } else {
                    return false;
                }
                
            } else {
                stack.push(char);
            }
            
        }
        if(stack.length === 0){
            return true;
        }
        return false;
    }
}
