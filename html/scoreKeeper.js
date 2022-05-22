const h1 = document.querySelector('h1');
const span0 = document.querySelector('#span0');
const spanend = document.querySelector('#spanend');
const btn = document.querySelector('#btnone');
const btn1 = document.querySelector('#btntwo');
const btn2 = document.querySelector('#btnrest');
const selectid = document.querySelector('#selectid');
//const =document.querySelector('#');

selectid.addEventListener('change', function () {
    winningscore = parseInt(this.value);
    //console.log(winningscore);    
})

selectid.addEventListener('change', function () {
    span0.textContent = 0;
    spanend.textContent = 0;
})

var score1 = 0;
var score2 = 0;
var winningscore = 5;
var gameisover = false;


btn.addEventListener('click', function () {
    if (!gameisover) {
        score1 += 1;
        if (score1 === winningscore) {
            gameisover = true;
            winningfun();
            btn.disabled = 'true';
            btn1.disabled = "true";
        }
        span0.textContent = score1;
    }
})

btn1.addEventListener('click', function () {
    //console.log("intin");
    if (!gameisover) {
        score2 += 1;
        if (score2 === winningscore) {
            gameisover = true;
            loserfun();
            btn.disable = "true";
            btn1.disable = "true";
        }
        //console.log(score2);
        spanend.textContent = score2;
    }
})
btn2.addEventListener('click', function () {
    // score1=0;
    //score2=0;
    span0.textContent = 0;
    spanend.textContent = 0;
    span0.style.cssText = 'color:black';
    spanend.style.cssText = "color:black ";
})

function winningfun() {
    span0.style.cssText = 'color:green';
    spanend.style.cssText = "color:red";
}

function loserfun() {
    span0.style.cssText = "color:red";
    spanend.style.cssText = "color:green"
}
