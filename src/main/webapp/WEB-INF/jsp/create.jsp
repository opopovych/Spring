
<!DOCTYPE html>


<html xmlns:th="http://www.thymeleaf.org" lang="en">
<head>
<title>Lesson-18</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">Spring MVC</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="/">All Participants</a></li>
				<li><a href="addParticipant">new Participant</a></li>
			</ul>
		</div>
	</nav>




	<div class="container">
<form action="#" th:action="@{/addParticipant}" th:object="${participant}" method="POST">

			

				<div class="form-group">
					<label for="name">Part Name:</label> <input type="text"
						class="form-control" id="name" name="name"
						th:field="*{name}">
				</div>

				<div class="form-group">
					<label for="email">Email:</label> <input type="text"
						class="form-control" id="email" name="email"
						th:field="*{email}">
				</div>
				<div class="form-group">
					<label class="my-1 mr-2" for="inlineFormCustomSelectPref"
						th:field="*{level}">Level</label> <select
						class="custom-select my-1 mr-sm-2" name="level"
						id="inlineFormCustomSelectPref">
						<option selected>Choose...</option>
						<option value="L1">L1</option>
						<option value="L2">L2</option>
						<option value="L3">L3</option>

					</select>
				</div>

				<div class="form-group">
					<label for="skill">Skill:</label> <input type="text"
						class="form-control" id="skill" name="skill"
						th:field="*{participantSkill}">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>

	</div>
</body>
</html>


