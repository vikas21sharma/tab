const button=document.querySelector('button');
button.addEventListener('click',function(){
    const newColor = myfun();
    document.querySelector('body').style.backgroundColor=newColor;
    document.querySelector('h1').innerText=newColor;
})
const myfun = () =>{
    const r=Math.floor(Math.random()*255);
    const g=Math.floor(Math.random()*255);
    const b=Math.floor(Math.random()*255);
    return`rgb(${r}, ${g}, ${b})`;
}