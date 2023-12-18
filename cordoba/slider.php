<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>resultado</title>
    <link rel="stylesheet" href="css.css">
</head>
<body>
<?php    

            if(is_uploaded_file($_FILES['foto1']['tmp_name']) && is_uploaded_file($_FILES['foto2']['tmp_name']) && is_uploaded_file($_FILES['foto3']['tmp_name'])){
                $f1= $_FILES['foto1']['name'];
                $f2= $_FILES['foto2']['name'];
                $f3= $_FILES['foto3']['name'];
                move_uploaded_file($_FILES['foto1']['tmp_name'],$f1);
                move_uploaded_file($_FILES['foto2']['tmp_name'],$f2);
                move_uploaded_file($_FILES['foto3']['tmp_name'],$f3);
            }
        
        ?>
 <div class="container-all">
        <input type="radio" id="1" name="image-slide" hidden/>
        <input type="radio" id="2" name="image-slide" hidden/>
        <input type="radio" id="3" name="image-slide" hidden/>

        <div class="slide">

            <div class="item-slide">
                <img src="<?php echo $f1 ?>">
            </div>

            <div class="item-slide">
                <img src="<?php echo $f2 ?>">
            </div>

            <div class="item-slide">
                <img src="<?php  echo  $f3 ?>">
            </div>
        </div>
        <div class="pagination">
            <label class="pagination-item" for="1">
                <img src="<?php  echo $f1 ?>">
            </label>

            <label class="pagination-item" for="2">
                <img src="<?php  echo $f2 ?>">
            </label>

            <label class="pagination-item" for="3">
                <img src="<?php echo  $f3 ?>">
            </label>
        </div>
    </div>
</body>
</html>