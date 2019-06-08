
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>
<br>
<div class="container" align="center">
 <h3  >Currency Calculator</h3>

 <form action="/testParam" method = "post" >
   <div class="form-group" >
        <label for="EUR">Euro (EUR)</label>
        <input type="" class="form-control" name="EUR" id="EUR" default="0" style="width: 300px;">
   </div>

    <div class="form-group">
        <label for="EUR">Korona szwedzka (SEK)</label>
        <input type="" class="form-control" name="SEK" id="SEK"  default="0"  style="width: 300px;">
    </div>

    <div class="form-group">
         <label for="EUR">Korona norweska (NOK)</label>
         <input type="" class="form-control" name="NOK" id="NOK"  default="0" style="width: 300px;">
    </div>

    <div class="form-group">
          <label for="EUR">Korona duńska (DKK)</label>
          <input type="" class="form-control" name="DKK" id="DKK" default="0"  style="width: 300px;">
    </div>

   <button type="submit" class="btn btn-primary">Oblicz</button>

 </form>
    <div>
        Suma pieniędzy w kasie wynosi ${param.EUR} zł.


        <option value="1" ${param.EUR} ==  null  ? ' Suma pieniędzy w kasie wynosi ${param.EUR} zł.' : ''}></option> //to nie dziła //


    </div>

</div>







<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>