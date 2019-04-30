function increase() {
   document.getElementById('spanId').innerText++;
   setColor();
}

function decrease() {
    document.getElementById('spanId').innerText--;
    setColor();
}

function setColor() {
    var idSpan = document.getElementById('spanId');
    var idColor = idSpan.innerText;

    if (idColor == 0) {
        idSpan.classList.replace(idSpan.classList.item(0), 'red');
    }
    else if (idColor > 0) {
        idSpan.classList.replace(idSpan.classList.item(0), 'green');
    }
    else if (idColor < 0) {
        idSpan.classList.replace(idSpan.classList.item(0), 'blue');
    }
}
