<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "index" method = "post">
<label>Number 1</label><input type = "number" name = "n1" required><br>
<label>Number 2</label><input type = "number" name = "n2" required><br>
<br><br>
 <input type="radio" id="add" name="calc" value="ADD" required>
  <label for="add">ADD</label><br>
  <input type="radio" id="sub" name="calc" value="SUB" required>
  <label for="sub">SUB</label><br>
  <input type="radio" id="mul" name="calc" value="MUL" required>
  <label for="mul">MUL</label><br>
  <input type="radio" id="div" name="calc" value="DIV" required>
  <label for="div">DIV</label><br>
  <input type="radio" id="mod" name="calc" value="MOD" required>
  <label for="mod">MOD</label><br><br>
<input type = "submit" value = "Calculate">
</form>
<h1>${msg}</h1>
</body>
</html>