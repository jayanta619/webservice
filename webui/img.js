
var rad = 10

function increase() {
    var myimg = document.getElementById("pgm").width + 50;
    var imgRad = document.getElementById("pgm")
    imgRad.style.borderRadius = rad + 'px'
    rad += 2
    imgRad.style.borderRadius = rad + 'px'
    console.log(rad)
    //  var bord=document.getElementById(pgm).style.borderImageWidth + 5 px
    document.getElementById('pgm').style.width = myimg + "px";
    //   document.getElementById('pgm').style.borderImageWidth=bord +"px";


}

function decrease() {
    var myimg = document.getElementById("pgm").width - 50;
    document.getElementById('pgm').style.width = myimg + "px";

}










