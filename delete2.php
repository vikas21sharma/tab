<?php
session_start();
include "config.php";
$id5 = $_REQUEST['id'];
$sql1 ="delete from clms_student where id=".$id5."";
mysqli_query($con,$sql1);
header('Location:viewstudent.php?msg=3');
 ?>
