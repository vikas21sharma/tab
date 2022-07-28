<?php
error_reporting(0);
session_start();
include "config.php";
if(!(isset($_SESSION['uname']) && $_SESSION['uname']!=''))
{
    header('Location:login.php');
}
 $f = $_REQUEST['msg'];

  ?>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CLMS</title>
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
               <!-- form start -->
               <?php
               $f1 = '<div class="alert alert-success alert-dismissable margin5"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button><strong>Warning:</strong> Invalid Value.</div>';
               if($f == 2)
               {
                   echo $f1;
               }
               ?>
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
                           <form class="form-horizontal" action="add_computer.php" method="post">
                               <fieldset>
                                   <!-- Name input-->
                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="name">Computer Name</label>
                                       <div class="col-md-9">
                                           <input id="name" name="computer-name" type="text" placeholder="Computer Name" class="form-control"></div>
                                   </div>
                                   <!-- Email input-->
                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="email">OS-info</label>
                                       <div class="col-md-9">
                                           <input id="email" name="os-info" type="text" placeholder="OS-info" class="form-control"></div>
                                   </div>

                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="email">Processor</label>
                                       <div class="col-md-9">
                                           <input id="email" name="processor" type="text" placeholder="Processor" class="form-control"></div>
                                   </div>

                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="email">Ram</label>
                                       <div class="col-md-9">
                                           <input id="email" name="ram" type="text" placeholder="Ram" class="form-control"></div>
                                   </div>

                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="email">Storage</label>
                                       <div class="col-md-9">
                                           <input id="email" name="storage" type="text" placeholder="Storage" class="form-control"></div>
                                   </div>

                                   <div class="form-group">
                                       <label class="col-md-3 control-label" for="email">Keyboard</label>
                                         <div class="col-md-9">
                                              <input id="email" name="check1[]" type="checkbox" class="custom-checkbox" value="keyboard">&nbsp;
                                            </div>
                                       </div>
                                       <div class="form-group">
                                           <label class="col-md-3 control-label" for="email">Mouse</label>
                                             <div class="col-md-9">
                                                  <input id="email" name="check1[]" type="checkbox" class="custom-checkbox" value="mouse">&nbsp;
                                                </div>
                                           </div>

                                           <div class="form-group">
                                               <label class="col-md-3 control-label" for="email">Monitor</label>
                                                 <div class="col-md-9">
                                                      <input id="email" name="check1[]" type="checkbox" class="custom-checkbox" value="monitor">&nbsp;
                                                    </div>
                                               </div>

                                               <div class="form-group">
                                                   <label class="col-md-3 control-label" for="email">Cabinet</label>
                                                     <div class="col-md-9">
                                                          <input id="email" name="check1[]" type="checkbox" class="custom-checkbox" value="cabinet">&nbsp;
                                                        </div>
                                                   </div>
                                   <!-- Form actions -->
                                   <div class="form-group">
                                       <div class="col-md-12 text-center">
                                           <button type="submit" name="submit110" class="btn btn-responsive btn-primary btn-sm">Submit</button>
                                       </div>
                                   </div>
                               </fieldset>
                           </form>
                       </div>
                   </div>
                <!--form end -->
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
