function cantApariciones(Arreglo,Numero){
    var repetido = 0;
    for (var i = 0; i < Arreglo.lenght; i++) {
        if(Arreglo[i]==Numero){
        repetido = repetido + 1;
        }
    }
    return repetido;
}
        
function posibleMailValido(posibleMail){
    if(posibleMail[0]=="@" || posibleMail[(posibleMail.lenght-1)]=="@"){
        return false;
    }
    return true;
}

function posibleTelefonoValido(Numeros){
    if(Numeros[0]=="0" && Numeros[1]=="1" && Numeros[2]=="1" && Numeros.lenght-1=="11"){
        return true;
    }
    if (Numeros[0]=="1" && Numeros[1]=="1" && Numeros.lenght-1=="10") {
        return true;
    }
    return false;
}