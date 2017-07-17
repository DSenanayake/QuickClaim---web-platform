<%-- 
    Document   : login
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
        <title>Login - Quick Claim</title>

        <!-- Bootstrap -->
        <!--<link href="css/bootstrap.css" rel="stylesheet">-->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
        <link rel="stylesheet" href="css/material.css">
        <link rel="stylesheet" href="styles.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="shortcut icon" href="images/favicon.ico">

        <style type="text/css">
            .mdl-layout {
                align-items: center;
                justify-content: center;
            }
            .mdl-layout__content {
                padding: 24px;
                flex: none;
            }
        </style>

    </head>
    <body>
        <div class="mdl-layout mdl-js-layout mdl-color--grey-100">
            <main class="mdl-layout__content">
                <div class="mdl-card mdl-shadow--6dp">
                    <div class="mdl-card__title mdl-color--red-700 mdl-color-text--white">
                        <h2 class="mdl-card__title-text">Quick Claim.</h2>
                    </div>
                    <form action="home.jsp" method="post">
                        <div class="mdl-card__supporting-text">

                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="username" />
                                <label class="mdl-textfield__label" for="username">Username</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="password" id="userpass" />
                                <label class="mdl-textfield__label" for="userpass">Password</label>
                            </div>

                        </div>
                        <div class="mdl-card__actions mdl-card--border">
                            <button type="submit" class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-color--orange-500">Log in</button>
                        </div>
                    </form>
                </div>
            </main>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <!--<script src="js/bootstrap.min.js"></script>-->
        <script src="js/material.min.js"></script>
        <script src="js/functions.js"></script>
    </body>
</html>
