<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ACF</title>
    <link rel="stylesheet" href="css.css">
</head>
<?php
    
?>
<body>
<div class="contenedor">    
<form action="slider.php" method="post" enctype="multipart/form-data">

<HEADER>   SLIDER </HEADER>
        <label for="1f"> ingrese imagen 1</label>
        <input type="file" accept="image/*" id="1f" name="foto1" require> 
        <label for="2f"> ingrese imagen 2</label>
        <input type="file" accept="image/*" id="2f" name="foto2" require> 
        <label for="3f"> ingrese imagen 3</label>
        <input type="file" accept="image/*" id="3f" name="foto3" require>
        <input type="submit" name="subir" value="SUBIR">
        </form>
</div>

</body>
</html>