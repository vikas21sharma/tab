<?php
error_reporting(0);
session_start();
 include "config.php";
if(isset($_POST['submit110']))
{
$cname = mysqli_real_escape_string($con,$_POST['computer-name']);
$os = mysqli_real_escape_string($con,$_POST['os-info']);
$processor = mysqli_real_escape_string($con,$_POST['processor']);
$ram = mysqli_real_escape_string($con,$_POST['ram']);
 $storage = mysqli_real_escape_string($con,$_POST['storage']);
$kb=0;$ms=0;$mn=0;$cb=0;
if(!empty($_POST['check1']))
{
$value=($_POST['check1']);
  for ($i=0; $i<4; $i++)
     {
        if ($value[$i] == "keyboard")
        {
          $kb = 1;
        }
        if ($value[$i] == "mouse")
        {
          $ms = 1;
        }
        if ($value[$i] == "monitor")
        {
          $mn = 1;
        }
        if ($value[$i] == "cabinet")
        {
          $cb = 1;
        }
     }
}
if($cname!="" && $os!="" && $processor!="" && $ram!="" && $storage!="")
{
$sql_query2 = "insert into computer_info(computer_name, os_info, processor, ram, storage, keyboard, mouse, monitor, cabinet) values('".$cname."', '".$os."', '".$processor."', '".$ram."', '".$storage."', '".$kb."', '".$ms."', '".$mn."', '".$cb."')";
mysqli_query($con,$sql_query2);
header('Location:viewcomputer.php?msg=1');
 }
 else
 {
     header('Location:addcomputer.php?msg=2');
 }
}
?>
