/*function myfun(){
    alert("click");
}*/
//arrow function 
const ch=10;
//alert(ch)


let letn=10;
var var10=10;

function hello(){
    for(let i=1;i<=10;i++){
        var10++;
        letn++;
    }
}
hello()
alert("value is var is :"+var10+"\nvalue is let is :"+letn);

let myfun = (n) => n*n;
let newfun=(n)=>{
    return n*n;
}


console.log(myfun(5));

//import function
import { a } from "/export.js";
console.log(a);
