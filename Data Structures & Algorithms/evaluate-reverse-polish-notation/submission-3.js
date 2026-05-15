class Solution {
    /**
     * @param {string[]} tokens
     * @return {number}
     */
    evalRPN(tokens) {
        const numbers = [];
        for(let token of tokens){
            if(!isNaN(Number.parseInt(token))){
                numbers.push(Number.parseInt(token))
            }
            else {
                let num1 = numbers.pop();
                let num2 = numbers.pop();
                if(token === '+'){
                    numbers.push(num1 + num2);
                }
                if(token === '-'){
                    numbers.push(num2-num1);
                }
                if(token === '*'){
                    numbers.push(num1*num2);
                }
                if(token === '/'){
                    numbers.push(Math.trunc(num2/num1));
                }
            }
        }
        return numbers.pop();
    }
}
