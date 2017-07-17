<%-- 
    Document   : home
    Created on : May 8, 2017, 11:52:57 PM
    Author     : Deeptha Senanayake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Home - Quick Claim</title>

        <!-- Bootstrap -->
        <!--<link href="css/bootstrap.css" rel="stylesheet">-->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
        <link rel="stylesheet" href="css/material.css">
        <link rel="stylesheet" href="styles.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="shortcut icon" href="images/favicon.ico">

    </head>
    <body>
        <!-- The drawer is always open in large screens. The header is always shown,
  even in small screens. -->
        <div class="mdl-layout mdl-js-layout mdl-layout--fixed-drawer
             mdl-layout--fixed-header">
            <header class="mdl-layout__header  mdl-color--red-700">
                <div class="mdl-layout__header-row">
                    <div class="mdl-layout-spacer"></div>
                    <button id="demo-menu-lower-left"
                            class="mdl-button mdl-js-button mdl-button--icon">
                        <i class="material-icons">more_vert</i>
                    </button>

                    <ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect"
                        for="demo-menu-lower-left">
                        <li class="mdl-menu__item"><a href="login.jsp">Logout</a></li>
                        <li class="mdl-menu__item">About</li>
                    </ul>
                </div>
            </header>
            <div class="mdl-layout__drawer">
                <span class="mdl-layout-title"><img src="images/logo_64.png" style="max-width: 32px"> Quick Claim</span>
                <nav  id="main-nav" class="mdl-navigation">
                    <a class="mdl-navigation__link" href="#claim"><i class="material-icons mdl-list__item-icon">history</i> Claim</a>
                    <a class="mdl-navigation__link" href="#coverage"><i class="material-icons mdl-list__item-icon">verified_user</i> Coverage</a>
                    <a class="mdl-navigation__link" href="#vehicle"><i class="material-icons mdl-list__item-icon">time_to_leave</i> Vehicle</a>
                    <a class="mdl-navigation__link" href="#owner"><i class="material-icons mdl-list__item-icon">person</i> Owner</a>
                </nav>
            </div>
            <main class="mdl-layout__content">
                <div style="padding: 16px" class="page-content" id="main-content"><!-- Your content goes here --></div>
            </main>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <!--<script src="js/bootstrap.min.js"></script>-->
        <script src="js/material.min.js"></script>
        <script src="js/functions.js"></script>
    </body>
</html>
