<%--
  Created by IntelliJ IDEA.
  User: VanHuan
  Date: 6/1/2020
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>
    VietNamese Dictionary
  </h2>
  <form method="post" action="${pageContext.request.contextPath}/translate">
    <input type="text" name="txtsearch" placeholder="Enter your word: ">
    <input type="submit" id="submit" value="Search">
  </form>
  </body>
</html>
