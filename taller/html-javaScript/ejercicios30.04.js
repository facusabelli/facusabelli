
let margen = "1cm";

function moverHaciaAbajo(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenSuperior = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenSuperior + "cm";
    cuadrado.style.marginTop = margen;
}

function moverHaciaArriba() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenInferior = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenInferior + "cm";
    cuadrado.style.marginTop = margen;
}

function moverHaciaDerecha(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenIzquierdo + "cm";
    cuadrado.style.marginLeft = margen;

}

function moverHaciaIzquierda(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginLeft = margen;
    
}