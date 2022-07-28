<?php
error_reporting(0);
session_start();
include "config.php";
if(!(isset($_SESSION['uname']) && $_SESSION['uname']!=''))
{
    header('Location:login.php');
}

$e=$_REQUEST['id'];
$sql_query1="select id, computer_name, os_info, processor, ram, storage, keyboard, mouse, monitor, cabinet FROM computer_info where id='".$e."'";
$result1 = mysqli_query($con,$sql_query1);
$row1 = mysqli_fetch_row($result1);

  ?>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Josh Admin Template</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <!-- global css -->
    <link href="css/app.css" rel="stylesheet" type="text/css" />
    <!-- end of global css -->
    <!--page level css -->
    <link href="vendors/fullcalendar/css/fullcalendar.css" rel="stylesheet" type="text/css" />
    <link href="css/pages/calendar_custom.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" media="all" href="vendors/bower-jvectormap/css/jquery-jvectormap-1.2.2.css" />
    <link rel="stylesheet" href="vendors/animate/animate.min.css">
    <link rel="stylesheet" type="text/css" href="vendors/datetimepicker/css/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" href="css/pages/only_dashboard.css" />
    <link href="css/pages/icon.css" rel="stylesheet" type="text/css" />
    <!--end of page level css-->
    <!--page level css -->
    <link href="vendors/jasny-bootstrap/css/jasny-bootstrap.css" rel="stylesheet" />
    <link href="vendors/iCheck/css/all.css" rel="stylesheet" type="text/css" />
    <!--end of page level css-->
</head>

<body class="skin-josh">
    <header class="header">
        <a href="index.php" class="logo">
            <p>CLMS</p>
        </a>
         <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <!-- top -->
            <?php
               include "top.php";
             ?>
            <!-- end of top -->
        </nav>
    </header>
    <div class="wrapper row-offcanvas row-offcanvas-left">
        <!-- Left side column. contains the logo and sidebar -->
        <!-- Right side column. Contains the navbar and content of the page -->
         <?php
            include "side-menu.php";
          ?>

        <!-- end of side-bar -->

        <!-- right-side -->
        <aside class="right-side">
            <!-- Main content -->
            <section class="content-header">

               <!-- right side cotent start -->
               <br>
               <br>
               <br>
               <br>
               <br>
               <br>
               <!-- <div class="col-md-6"> -->
                   <!--lg-6 starts-->
                   <!--basic form starts-->
                   <div class="panel panel-primary" id="hidepanel1" style="width:800px margin: auto">
                       <div class="panel-heading">
                           <h3 class="panel-title">
                               <i class="livicon" data-name="clock" data-size="20" data-loop="true" data-c="#fff" data-hc="white"></i>
                              Add Computer
                           </h3>
                           <span class="pull-right">
                               <i class="glyphicon glyphicon-chevron-up clickable"></i>

                           </span>
                       </div>
                       <div class="panel-body" >
                           <form class="form-horizontal" action="edit_data1.php?id=<?php echo $row1[0];?>" method="post">
                               <fieldset>
                                   <!-- Name input-->
                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="name">Computer Name</label>
                                       <div class="col-md-9">
                                           <input id="name" name="computer-name" type="text" class="form-control" value="<?php echo $row1[1]; ?>"></div>
                                   </div>
                                   <!-- Email input-->
                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="email">OS-info</label>
                                       <div class="col-md-9">
                                           <input id="email" name="os-info" type="text" class="form-control" value="<?php echo $row1[2];?>"></div>
                                   </div>

                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="email">Processor</label>
                                       <div class="col-md-9">
                                           <input id="email" name="processor" type="text" class="form-control" value="<?php echo $row1[3];?>"></div>
                                   </div>

                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="email">Ram</label>
                                       <div class="col-md-9">
                                           <input id="email" name="ram" type="text" class="form-control" value="<?php echo $row1[4];?>"></div>
                                   </div>

                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="email">Storage</label>
                                       <div class="col-md-9">
                                           <input id="email" name="storage" type="text"  class="form-control" value="<?php echo $row1[5]; ?>"></div>
                                   </div>
                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="email">Keyboard</label>
                                       <div class="col-md-9">
                                       <select class="form-control" name="select1">
                                         echo
                                           <option <?php
                                                  if($row1[6]==1){
                                                      echo "SELECTED";
                                                  }
                                                  ?> value="1">Yes</option>
                                           <option <?php
                                                  if($row1[6]==0){
                                                      echo "SELECTED";
                                                  }
                                                  ?> value="0">No</option>
                                          </select></div>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-md-3 control-label" for="email">Mouse</label>
                                            <div class="col-md-9">
                                            <select class="form-control" name="select2">

                                                <option <?php
                                                       if($row1[7]==1){
                                                           echo "SELECTED";
                                                       }
                                                       ?> value="1">Yes</option>
                                                <option <?php
                                                       if($row1[7]==0){
                                                           echo "SELECTED";
                                                       }
                                                       ?> value="0">No</option>
                                               </select></div>
                                             </div>
                                             <div class="form-group">
                                                 <label class="col-md-3 control-label" for="email">Monitor</label>
                                                 <div class="col-md-9">
                                                 <select class="form-control" name="select3">
                                                     <option <?php
                                                            if($row1[8]==1){
                                                                echo "SELECTED";
                                                            }
                                                            ?> value="1">Yes</option>
                                                     <option <?php
                                                            if($row1[8]==0){
                                                                echo "SELECTED";
                                                            }
                                                            ?> value="0">No</option>
                                                    </select></div>
                                                  </div>


                                                  <div class="form-group">
                                                      <label class="col-md-3 control-label" for="email">Cabinet</label>
                                                      <div class="col-md-9">
                                                      <select class="form-control" name="select4">
                                                          <option <?php
                                                                 if($row1[9]==1){
                                                                     echo "SELECTED";
                                                                 }
                                                                 ?> value="1">Yes</option>
                                                          <option <?php
                                                                 if($row1[9]==0){
                                                                     echo "SELECTED";
                                                                 }
                                                                 ?> value="0">No</option>
                                                         </select></div>
                                                       </div>

                                   <!-- Form actions -->
                                   <div class="form-group">
                                       <div class="col-md-12 text-center">
                                           <button type="submit" name="submit111" class="btn btn-responsive btn-primary btn-sm">Update</button>

                                       </div>
                                   </div>
                               </fieldset>
                           </form>
                       </div>
                   </div>

               <!-- right side content  ends -->
            </section>
        </aside>
        <!-- end of right-side>
    </div>
    <a id="back-to-top" href="#" class="btn btn-primary btn-lg back-to-top" role="button" title="Return to top" data-toggle="tooltip" data-placement="left">
        <i class="livicon" data-name="plane-up" data-size="18" data-loop="true" data-c="#fff" data-hc="white"></i>
    </a>
    <!-- global js -->
    <script src="js/app.js" type="text/javascript"></script>
    <!-- end of global js -->
    <!-- begining of page level js -->
    <!-- EASY PIE CHART JS -->
    <script src="vendors/jquery.easy-pie-chart/js/easypiechart.min.js"></script>
    <script src="vendors/jquery.easy-pie-chart/js/jquery.easypiechart.min.js"></script>
    <script src="js/jquery.easingpie.js"></script>
    <!--end easy pie chart -->
    <!--for calendar-->
    <script src="vendors/moment/js/moment.min.js" type="text/javascript"></script>
    <script src="vendors/fullcalendar/js/fullcalendar.min.js" type="text/javascript"></script>
    <!--   Realtime Server Load  -->
    <script src="vendors/flotchart/js/jquery.flot.js" type="text/javascript"></script>
    <script src="vendors/flotchart/js/jquery.flot.resize.js" type="text/javascript"></script>
    <!--Sparkline Chart-->
    <script src="vendors/sparklinecharts/jquery.sparkline.js"></script>
    <!-- Back to Top-->
    <script type="text/javascript" src="vendors/countUp.js/js/countUp.js"></script>
    <!--   maps -->
    <script src="vendors/bower-jvectormap/js/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="vendors/bower-jvectormap/js/jquery-jvectormap-world-mill-en.js"></script>
    <script src="vendors/chartjs/Chart.js"></script>
    <script type="text/javascript" src="vendors/datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
    <!--  todolist-->
    <script src="js/pages/todolist.js"></script>
    <script src="js/pages/dashboard.js" type="text/javascript"></script>
    <!-- end of page level js -->
</body>

</html>
