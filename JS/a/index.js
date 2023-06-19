
let num1
let num2
let op

function update(value) {/*
    if (value === '+') {
        num1 = document.getElementById("screen").value 
        document.getElementById("screen").value =''
        op = '+'
    }else if (value === '-') {
        num1 = document.getElementById("screen").value 
        document.getElementById("screen").value =''
        op = '-'
    }else if(value === '/'){
        num1 = document.getElementById("screen").value 
        document.getElementById("screen").value =''
        op = '/'
    }else if(value === '*'){
        num1 = document.getElementById("screen").value 
        document.getElementById("screen").value =''
        op = '*'
    }else{
        let a = document.getElementById("screen").value + value;
        document.getElementById("screen").value = a;
        if (num1!=='') {
            num2 = document.getElementById("screen").value;
        }
    }
*/

    let a = document.getElementById("screen").value + value;
    document.getElementById("screen").value = a;
}

function result() {/*
    let result
    switch (op) {
        case '+':
            result = Number(num1) + Number(num2);
        break;
        case '-':
            result = Number(num1) - Number(num2);
        break;
        case '/':
            result = Number(num1) / Number(num2);
        break;
        case '*':
            result = Number(num1) * Number(num2);
        break;
    
        default:
            break;
    }
    document.getElementById("screen").value = result
    num1=''
    num2=''*/
        expression = document.getElementById("screen").value
        // Remove any whitespace from the expression
        expression = expression.replace(/\s/g, '');
      
        // Use the built-in eval function to evaluate the expression
        try {
            document.getElementById("screen").value = eval(expression);
        } catch (error) {
          // If there is an error, return NaN
          return NaN;
        }
      
}

function form_reset() {
   document.getElementById("screen").value =''
   
} 