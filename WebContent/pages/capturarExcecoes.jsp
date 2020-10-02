<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js">
</script>
</head>
<body>
	 <h2>capturar exceções</h2>
	 <input type="text" name="valor" value="valor informado" id="valor">
	 <input type="button" onclick="testarExcecao();" value="enviar">
	 
	 
	 <script type="text/javascript">
	 	function testarExcecao() {
			let valorInformado =  $("#valor").val();
			
			
			$.ajax({
				method:"POST",
				url:"capturarExcecao",
				data:{"valor":valorInformado}
			}).done(function(response){
				alert(response);
			}).fail(function(xhr){
				alert(xhr.responseText);
			});
		}
	 </script>
</body>
</html>