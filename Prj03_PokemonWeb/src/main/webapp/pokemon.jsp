
<!DOCTYPE html>
<%@page import="controller.PokemonCtrl"%>
<html>
<head>
<meta charset="utf-8">
<title>List pokemon</title>
</head>
<body>

	<h1>I miei pokemon</h1>
	
	<div>
	<a href ="index.html">Home page</a>
	</div>
	
	<ul>
	
	<% PokemonCtrl controller = new PokemonCtrl(); %>
	
	<% for(String nomePokemon : controller.getNomiPokemon()){ %>
	
	
	<li>
	
	<a target ="_blank" href = "http://www.google.com/search?q=<%= nomePokemon  %>">
			<%= nomePokemon  %>
	</a>
	</li>
	
	<% } %>
	
	</ul>

</body>
</html>