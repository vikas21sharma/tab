<?php
session_start();
include 'config.php';
if(isset($_POST['submit111']))
{
$id2 = $_REQUEST['id'];
$cname = mysqli_real_escape_string($con,$_POST['computer-name']);
$os = mysqli_real_escape_string($con,$_POST['os-info']);
$processor = mysqli_real_escape_string($con,$_POST['processor']);
$ram = mysqli_real_escape_string($con,$_POST['ram']);
$storage = mysqli_real_escape_string($con,$_POST['storage']);
$keyboard = mysqli_real_escape_string($con,$_POST['select1']);
$mouse = mysqli_real_escape_string($con,$_POST['select2']);
$monitor = mysqli_real_escape_string($con,$_POST['select3']);
$cabinet = mysqli_real_escape_string($con,$_POST['select4']);
 echo $cname;
 echo $os;
 echo $processor;
 echo $ram;
 echo $storage;
 echo $keyboard;
 echo $mouse;
 echo $monitor;
 echo $cabinet;
 if($cname!="" && $os!="" && $processor!="" && $ram!="" && $storage!="" && $keyboard!="" && $mouse!="" && $monitor!="" && $cabinet!="")
 {
$sql="update computer_info set computer_name='".$cname."', os_info='".$os."', processor='".$processor."', ram='".$ram."', storage='".$storage."', keyboard='".$keyboard."', mouse='".$mouse."', monitor='".$monitor."', cabinet='".$cabinet."' where id=".$id2."";
mysqli_query($con,$sql);
header('Location:viewcomputer.php?msg=1');
 }
}

 ?>
