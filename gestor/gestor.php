<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="style.css">
    <title>Gestor de Presupuesto</title> 
    <!-- aca esta el boostrap con cdn(se necesita internet para usarlo asi, y lo hice asi pq me da paja que este con los archivos)-->
<?php include_once('bd-cdn.php') ?>
    <!--Fin del boostrap-->
</head>
<body>
    <div class="center">
        <h1>Calculadora de presupuesto</h1>

                 
    <form id="GestorPre" method="post">
        <div class="inputbox">
        <input type="text" id="mother" required="required">
        <span>Modelo de Motherboard</span>
        </div>
        <div class="inputbox">
        <input type="number"  id="precioMother" required="required">
        <span>Precio</span>
        </div>
        <div class="inputbox">
        <input type="text" id="procesador" required="required">
        <span>Modelo de Procesador</span>
        </div>
        <div class="inputbox">
        <input type="number" id="precioProcesador" required="required">
        <span>Precio</span>
        </div>
        <div class="inputbox">
        <input type="text" id="cooler" required="required">
        <span>Modelo de cooler</span>
        </div>
        <div class="inputbox">
        <input type="number"  id="precioCooler" required="required">
        <span>Precio</span></div>
        <div class="inputbox">
        <input type="text"  id="ram" required="required">
        <span>Modelo Memoria RAM</span></div>
        <div class="inputbox">
        <input type="number" id="precioram" required="required">
        <span>Precio</span></div>
        <div class="inputbox">
        <input type="number" id="cantidadRam" required="required">
        <span>Cantidad de RAMS (max 4) </span></div>
        <div class="inputbox">

        <input type="text" id="placaDeVideo" required="required">
        <span>Modelo de GPU </span></div>
        <div class="inputbox">
        <input type="number" id="precioPDvideo"required="required">
        <span>Precio</span></div>
        <div class="inputbox">


        <input type="text" id="disco" required="required">
        <span>Modelo de disco de almacenamiento</span></div>
        <div class="inputbox">
        <input type="number" id="precioDisco" required="required">
        <span>Precio</span></div>
        <div class="inputbox">
        <input type="number"  id="cantidadDisco" required="required">
        <span>Cantidad de discos</span></div>
        <div class="inputbox">
 
        <input type="text"  id="fuente" required="required">
        <span>Modelo de fuente de poder</span></div>
        <div class="inputbox">
        <input type="number"  id="precioFuente" required="required">
        <span>Precio</span></div>
        <div class="inputbox">

        <input type="text"  id="gabinete" required="required">
        <span>Modelo del gabinete</span></div>
        <div class="inputbox">
        <input type="number"  id="precioGabinete" required="required">
        <span>Precio</span></div>
        <div class="inputbox">


        <input type="text"  id="monitor" required="required">
        <span>Modelo del monitor</span></div>
        <div class="inputbox">
        <input type="number"  id="precioMonitor" required="required">
        <span>Precio</span></div>
        <div class="inputbox">

  
        <input type="text"  id="tecladoYmause" required="required">
        <span>Modelo de teclado y mouse</span></div>
        <div class="inputbox">
        <input type="number"  id="precioperifericos" required="required">
        <span>Precio de ambos</span></div>
        <div class="inputbox">


        <input type="text"  id="otros" required="required">
        <span>Otros(Aurriculares,etc..)</span></div>
        <div class="inputbox">
        <input type="number" id="precioOtros" required="required">
        <span>Precio</span></div>

        <div class="inputbox">
    <input type="submit" class="submit" value="Calcular">   </div>

    
</form>
</div>
 
                    <script src="cal.js"></script>
               

</body>
</html>