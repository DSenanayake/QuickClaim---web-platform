<%-- 
    Document   : coverage
    Created on : May 9, 2017, 4:56:14 PM
    Author     : Deeptha Senanayake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Insurance Coverage History</h3>
        <div class="mdl-grid">
            <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
                <thead>
                    <tr>
                        <th class="mdl-data-table__cell--non-numeric mdl-data-table__header--sorted-ascending">Date</th>
                        <th>Vehicle</th>
                        <th>Coverage Value</th>
                        <th>Owner Info</th>
                        <th>Expire Date</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>2016/11/16</td>
                        <td class="mdl-data-table__cell--non-numeric">Toyota Corolla 121</td>
                        <td>28,00000.00</td>
                        <td class="mdl-data-table__cell--non-numeric">Deeptha Senanayake</td>
                        <td>2017/11/16</td>
                        <td class="mdl-data-table__cell--non-numeric mdl-color-text--green"><b>Active</b></td>
                    </tr>
                    <tr>
                        <td>2016/12/06</td>
                        <td class="mdl-data-table__cell--non-numeric">Nissan FB-15 121</td>
                        <td>24,50000.00</td>
                        <td class="mdl-data-table__cell--non-numeric">Deeptha Senanayake</td>
                        <td>2017/12/06</td>
                        <td class="mdl-data-table__cell--non-numeric mdl-color-text--green"><b>Active</b></td>
                    </tr>
                    <tr>
                        <td>2017/01/12</td>
                        <td class="mdl-data-table__cell--non-numeric">Toyota Corolla 141</td>
                        <td>38,00000.00</td>
                        <td class="mdl-data-table__cell--non-numeric">Deeptha Senanayake</td>
                        <td>2018/01/12</td>
                        <td class="mdl-data-table__cell--non-numeric mdl-color-text--green"><b>Active</b></td>
                    </tr>
                </tbody>
            </table>
            <div style="position: absolute;right: 36px;bottom:36px;">
                <button class="mdl-button mdl-js-button mdl-button--fab mdl-js-ripple-effect mdl-button--colored mdl-color--orange-500">
                    <i class="material-icons">add</i>
                </button>  
            </div>
        </div>
        <script src="js/material.min.js"></script>
    </body>
</html>
