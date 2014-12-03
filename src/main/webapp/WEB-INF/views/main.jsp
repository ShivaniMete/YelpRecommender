<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="navbar navbar-inverse" role="navigation">
      <div class="container">
      <div class="navbar-header">
          <a class="navbar-brand" style="color:White">Yelp Recommender</a>
        </div>
        </div>
</div>

<div class="container">
<form method ="post" action="getTrend" modelAttribute="trends" role="form">
<div class="form-group">
     <input type="text" name= "city" placeholder="City" class="form-control">
  </div>
  <div class="form-group">
       <input type="text" name="zip" placeholder="Zip Code" class="form-control">
  </div>
     <button type="submit" class="btn btn-success" value="Submit">Submit</button>
</form>
</div>
<div class="jumbotron">
      <div class="container">
        <h2>Most popular business/es in your neighborhood</h2>
        <p>${trends.trendingBusiness}</p>
        
        <h2>Most popular category in your neighborhood</h2>
        <p>${trends.trendingCategory}</p>
     </div>
    </div>

</body>
</html>