const cel = document.getElementById("cel");
const fah =document.getElementById("fah");

fah.addEventListener('input',function(){
    let v=this.value;
    let v1=(v*4)/5;
    cel.value=v1;
});

cel.addEventListener('input',function(){
   var r=this.value;
   var r1=(r*5)/6;
   fah.value=r1;
});