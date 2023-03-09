var sumaNumeros = document.getElementById("GestorPre")

        GestorPre.addEventListener('submit', resultado)
    
    function resultado(e){
    
        e.preventDefault()
    
        let procesador = document.getElementById("procesador").value,
            precioprocesador = document.getElementById("precioProcesador").value,
            mother = document.getElementById("mother").value,
            precioMother = document.getElementById("precioMother").value,
            cooler = document.getElementById("cooler").value,
            preciocooler = document.getElementById("precioCooler").value,
            ram = document.getElementById("ram").value,
            precioRam = document.getElementById("precioram").value,
            cantidadRam = document.getElementById("cantidadRam").value,
            placaDeVideo = document.getElementById("placaDeVideo").value,
            precioPDvideo = document.getElementById("precioPDvideo").value,
            disco = document.getElementById("disco").value,
            precioDisco = document.getElementById("precioDisco").value,
            cantidadDisco = document.getElementById("cantidadDisco").value,
            fuente = document.getElementById("fuente").value,
            precioFuente = document.getElementById("precioFuente").value,
            gabinete = document.getElementById("gabinete").value,
            precioGabinete = document.getElementById("precioGabinete").value,
            monitor = document.getElementById("monitor").value,
            precioMonitor = document.getElementById("precioMonitor").value,
            tecladoYmause = document.getElementById("tecladoYmause").value,
            precioperifericos = document.getElementById("precioperifericos").value,
            otros = document.getElementById("otros").value,
            precioOtros = document.getElementById("precioOtros").value;
    
        let total = parseInt(precioprocesador) + parseInt(precioMother) + parseInt(preciocooler) + parseInt(precioRam) * parseInt(cantidadRam) + parseInt(precioPDvideo) + parseInt(precioDisco)*parseInt(cantidadDisco)+ parseInt (precioFuente)+ parseInt (precioGabinete) + parseInt(precioMonitor) + parseInt (precioperifericos)+parseInt (precioOtros);
    
            document.write(`
            <link rel="stylesheet" href="style.css"><h2>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
            <div class="inputbox">
             Procesador `+procesador+` : `+precioprocesador+` <br>
                Motherboard `+mother+` : `+precioMother+`<br>
                Cooler `+cooler+` : `+preciocooler+`<br>
                Memoria RAM `+ram+`(x`+cantidadRam+`) : `+precioRam+`<br>
                GPU `+placaDeVideo+` : `+precioPDvideo+`<br>
                Almacenamiento `+disco+`(x `+cantidadDisco+`) : `+precioDisco+`<br>
                Fuente `+fuente+` : `+precioFuente+`<br>
                Gabinete `+gabinete+` : `+precioGabinete+`<br>
                Monitor `+monitor+` : `+precioMonitor+`<br>
                Teclado y mouse `+tecladoYmause+` : `+precioperifericos+`<br>
                Otros `+otros+` : `+precioOtros+`<br>
                Su presupuesto es de: ` +total+`
                </div>`);
                
                
            console.log(total)
    
    
    }
    