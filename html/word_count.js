let textarea = document.getElementById("textarea");
let a = document.getElementById("words");
let b = document.getElementById("char");
 
textarea.addEventListener('input',function(){
    var c=this.value;
    // console.log(a);
    let char = c.length;
    //console.log(char);
    b.innerHTML=char;

    c=c.trim();//use to remove extra space from starting and ending positon
    var words = c.split(" ");
    let cleanlist=words.filter(function(para){
        return para != "";//only return non space words/useable words
    });
    //console.log(words);
    let arr=words.length;
    let cl=cleanlist.length;
    a.innerHTML=cl;
});


