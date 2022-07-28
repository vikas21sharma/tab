<?php
error_reporting(0);
session_start();
 include "config.php";
if(isset($_POST['submit210']))
{
$sname = mysqli_real_escape_string($con,$_POST['student_name']);
$email = mysqli_real_escape_string($con,$_POST['email']);
$pass = mysqli_real_escape_string($con,$_POST['password']);
$add1 = mysqli_real_escape_string($con,$_POST['address']);
 $phone = mysqli_real_escape_string($con,$_POST['phone']);
 echo $sname;
 echo $email;
 echo $pass;
 echo $add1;
 echo $phone;
if($sname!="" && $email!="" && $pass!="" && $add1!="" && $phone!="")
{
$sql_query2 = "insert into clms_student(username, email, password, address, phone) values('".$sname."', '".$email."', '".$pass."', '".$add1."', '".$phone."')";
mysqli_query($con,$sql_query2);
header('Location:viewstudent.php?msg=1');
 }
 else
 {
     header('Location:addstudent.php?msg=2');
 }
}
?>
