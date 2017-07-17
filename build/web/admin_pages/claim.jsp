<%-- 
    Document   : claim
    Created on : May 9, 2017, 4:54:54 PM
    Author     : Deeptha Senanayake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
            .demo-card-wide.mdl-card {
                max-width: 512px;
            }
            .demo-card-wide > .mdl-card__title {
                color: #fff;
                height: 176px;
                background: url('images/car_damage.jpg') center / cover;
            }
            .demo-card-wide > .mdl-card__menu {
                color: #fff;
            }
        </style>
    </head>
    <body>
        <h3>Insurance Claim History</h3>
        <div class="mdl-grid">
            <div class="mdl-cell mdl-cell--4-col">
                <div class="demo-card-wide mdl-card mdl-shadow--2dp">
                    <div class="mdl-card__title">
                        <h2 id="vehicle-name" class="mdl-card__title-text" style="background: rgba(0,0,0,0.2)">Toyota Corolla 121 2008</h2>
                    </div>
                    <div class="mdl-card__supporting-text">
                        <p>Status: <b class="mdl-color-text--cyan">New</b></p>
                        <p>Date/Time occurred: <b>05 April 2017 11:55 AM</b></p>
                    </div>
                    <div class="mdl-card__actions mdl-card--border">
                        <a class="mdl-button mdl-button--raised mdl-color--orange-500 mdl-js-button mdl-js-ripple-effect">
                            Review
                        </a>
                    </div>
                    <div class="mdl-card__menu">
                        <button class="mdl-button mdl-js-button mdl-button--icon mdl-color--red-700">
                            <i class="material-icons">location_on</i>
                        </button>
                    </div>
                </div>
            </div>
            <div class="mdl-cell mdl-cell--4-col">
                <div class="demo-card-wide mdl-card mdl-shadow--2dp">
                    <div class="mdl-card__title" style="background: url('images/truck-damaged.png') center / cover; ">
                        <h2 class="mdl-card__title-text" style="background: rgba(0,0,0,0.2)">Nissan Sunny FB 15 2001</h2>
                    </div>
                    <div class="mdl-card__supporting-text">
                        <p>Status: <b class="mdl-color-text--green">Completed</b></p>
                        <p>Date/Time occurred: <b>10 Mar 2017 01:05 PM</b></p>
                    </div>
                    <div class="mdl-card__actions mdl-card--border">
                        <a class="mdl-button mdl-button--raised mdl-color--orange-500 mdl-js-button mdl-js-ripple-effect">
                            Review
                        </a>
                    </div>
                    <div class="mdl-card__menu">
                        <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect mdl-color--red-700">
                            <i class="material-icons">location_on</i>
                        </button>
                    </div>
                </div>
            </div>
            <div class="mdl-cell mdl-cell--4-col">
                <div class="demo-card-wide mdl-card mdl-shadow--2dp">
                    <div class="mdl-card__title" style="background: url('images/van_damaged.JPG') center / cover;">
                        <h2 class="mdl-card__title-text" style="background: rgba(0,0,0,0.2)">Mercedes Benz Van 2007</h2>
                    </div>
                    <div class="mdl-card__supporting-text">
                        <p>Status: <b class="mdl-color-text--red">Denied</b></p>
                        <p>Date/Time occurred: <b>11 Feb 2017 05:17 PM</b></p>
                    </div>
                    <div class="mdl-card__actions mdl-card--border">
                        <a class="mdl-button mdl-button--raised mdl-color--orange-500 mdl-js-button mdl-js-ripple-effect">
                            Review
                        </a>
                    </div>
                    <div class="mdl-card__menu">
                        <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect mdl-color--red-700">
                            <i class="material-icons">location_on</i>
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
