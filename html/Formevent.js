const form = document.querySelector('form');
const input = document.querySelector('input');
const list = document.querySelector('ul');
form.addEventListener('submit', function (e) {
    e.preventDefault();//use to stop the console to go for next page gamer
    //console.log('stop submiting');
    const inputvalues = input.value;
    const nLI=document.createElement('LI');
    nLI.innerText=inputvalues;
    //console.log(nLI); To check program is still right or not
    list.append(nLI);
});