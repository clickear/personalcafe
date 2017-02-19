<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/18
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <script>
      fetch("/music").then(function(res) {
        // res instanceof Response == true.
        if (res.ok) {
          res.json().then(function(data) {
            debugger;


            console.log(data.entries);
          });
        } else {
          console.log("Looks like the response wasn't perfect, got status", res.status);
        }
      }, function(e) {
        console.log("Fetch failed!", e);
      });
    </script>
  </body>
</html>
