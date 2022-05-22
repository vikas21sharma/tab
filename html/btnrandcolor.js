const buttons = document.querySelectorAll('button')


for (let button of buttons) {
    button.addEventListener('click', function () {
        // console.log('clicked');
        const r = Math.floor(Math.random() * 255);
        const g = Math.floor(Math.random() * 255);
        const b = Math.floor(Math.random() * 255);
        button.style.backgroundColor = `rgb(${r},${g},${b})`;
        button.style.color=`rgb(${r},${b},${g})`//for text color
        button.innerText='clicked';
    })
}
const h1s = document.querySelectorAll('h1');
for (let h1 of h1s) {
    h1.addEventListener('click', function () {
        const r = Math.floor(Math.random() * 255);
        const g = Math.floor(Math.random() * 255);
        const b = Math.floor(Math.random() * 255);
        //console.log('heading clicked:');
        h1.style.backgroundColor = `rgb(${r},${g},${b})`;
    })
}