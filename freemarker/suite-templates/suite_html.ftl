<html>
	<head>
    	<title>Jasmine Test Suite</title>

    	<link rel="stylesheet" href="lib/jasmine/jasmine.css">

		<!-- Production Code -->


    	<!-- Test Infrastructure -->
	    <script src="../lib/jasmine/jasmine.js"></script>
	    <script src="../lib/jasmine/jasmine-html.js"></script>
	    <script src="../lib/jasmine/json2.js"></script>

	    <!-- Test Code -->
	    <script src="src/test/js/${file_under_test}-spec.js"></script>
 
	    <script type="text/javascript">
	    $(document).ready(function(){
	      jasmine.getEnv().addReporter(new jasmine.TrivialReporter());
	      jasmine.getEnv().execute();
	    });
	    </script>

		<!-- production header code -->
		${headerCode}
	
	</head>
	<body>
		${body}
	</body>
</html>
