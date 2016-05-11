<%--
  Created by IntelliJ IDEA.
  User: Ильгиз
  Date: 11.05.2016
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Cart | MY-Express</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/font-awesome.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/prettyPhoto.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/price-range.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/animate.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/responsive.css"/>" rel="stylesheet">
    <link rel="shortcut icon" href="<c:url value="/resources/images/ico/favicon.ico"/>">
</head>
<!--/head-->

<body>
<jsp:include page="components/header.jsp"/>


<!--/#cart_items-->

<section id="do_action">
    <div class="container">

        <div class="row">

            <div class="col-sm-6 col-sm-offset-3">
                <div class="total_area">
                    <ul>
                        <li>Name<span>${Name}</span></li>
                        <li>Emale <span>${Email}</span></li>
                        <li>Role <span>${Role}</span></li>
                    </ul>
                </div>

                <br>


                <%--<input type="number" min="0" step="0.01" placeholder="Give me your money!!" name="money"--%>
                <%--value="${Total}$"/>--%>
            </div>

        </div>
    </div>
</section>

<jsp:include page="components/footer.jsp"/>


</body>
</html>
