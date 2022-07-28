<?php
session_start();
include 'config.php';
if(isset($_POST['submit222']))
{
$id2 = $_REQUEST['id'];
$cname = mysqli_real_escape_string($con,$_POST['username']);
$os = mysqli_real_escape_string($con,$_POST['email']);
$processor = mysqli_real_escape_string($con,$_POST['password']);
$ram = mysqli_real_escape_string($con,$_POST['address']);
$storage = mysqli_real_escape_string($con,$_POST['phone']);
 // echo $cname;
 // echo $os;
 // echo $processor;
 // echo $ram;
 // echo $storage;

 if($cname!="" && $os!="" && $processor!="" && $ram!="" && $storage!="")
 {
$sql="update clms_student set username='".$cname."', email='".$os."', password='".$processor."', address='".$ram."', phone='".$storage."' where id=".$id2."";
mysqli_query($con,$sql);
header('Location:viewstudent.php?msg=1');
 }
}

 ?>
