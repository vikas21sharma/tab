let color1=document.getElementById('color1');
let color2=document.getElementById('color2');
let container=document.getElementById("container");

color1.addEventListener('click',function(){
    
    container.style.backgroundColor="orange";
    console.log("hii vikas");
});

color2.addEventListener('click',function(){
    container.style.backgroundColor="yellow";
});

let color3=document.getElementById('color3');

color3.addEventListener('click',function(){
    container.style.backgroundColor="black";
});