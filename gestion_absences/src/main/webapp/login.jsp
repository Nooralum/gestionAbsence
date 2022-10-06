<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Connexion SYGERECLAM</title>
		
		<link rel="stylesheet" type="text/css" href="resource/css/bootstrap.css"></link>
		<link rel="stylesheet" type="text/css" href="resource/css/app.css"></link>
		
		 <link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
		 <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
		 <link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" /> 
	</head>

	<body>
		<div id="mainWrapper">
			<div class="login-container">
				<div class="login-card">
					<div class="login-form">
						<!-- <c:url var="loginUrl" value="/login" /> -->
						<form action="j_spring_security_check" method="post" class="form-horizontal">
							<div class="form-actions" align="center"><h2>SGERECLAM</h2></div>
							<div class="input-group input-sm">
							
								<label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
								<input type="text" class="form-control" id="username" name='j_username' placeholder="Entrer le login" required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label> 
								<input type="password" class="form-control" id="password" name='j_password' placeholder="Entrer le Password" required>
							</div>
							<%-- <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" /> --%>
								
							<div class="form-actions">
								<input type="submit"
									class="btn btn-block btn-primary btn-default" value="Se connecter">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>

	</body>
</html>