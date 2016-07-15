<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

  <title>Login</title>

  <!-- Bootstrap core CSS -->


  <!-- Custom styles for this template -->
  <link href="resources/style/login.css" rel="stylesheet">
</head>
<body>
  <div class="container">
    <form class="form-signin" action="<c:url value='/j_spring_security_check' />" method='POST'>
      <h2 class="form-signin-heading">sign in</h2>
      <label for="inputEmail" class="sr-only">USER ID:</label>
      <input type="text" name = 'username'  class="form-control" placeholder="call sign" required autofocus>
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" name ='password' id="inputPassword" class="form-control" placeholder="Password" required>
      <div class="checkbox">
        <label>
          <input type="checkbox" value="remember-me"> Remember me
        </label>
      </div>
      
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      
    </form>

  </div> <!-- /container -->

</body>
</html>
