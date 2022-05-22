//this program difference b/w map fun and foreach fun
//Map function return something
// where foreach does not return out side

let data=[23,2,42,52,4,64];

//map function it's return but foreach doesn't.
let result=data.map((item)=>{
    console.warn(item*100)
    return item*10
});
// data.map((item)=>{
//     console.log(item*20);
// });

//Foreach function it's does not return
// let result1=data.forEach((item)=>{
//     console.warn(item*200)
//     return result1
// });
data.forEach((item)=>{
    console.warn(item*500)
});
//console.warn(result);
console.warn(result);