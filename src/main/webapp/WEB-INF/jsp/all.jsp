
<!DOCTYPE html>


<html  xmlns:th="http://www.thymeleaf.org" lang="en">
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

	
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Id</th>
							<th>Part Name</th>
							<th>Email</th>
							<th>Level</th>
							<th>Skill</th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
						
							<tr th:each="participant : ${participants}" >
								<td th:text="${participant.id}"></td>
								<td th:text="${participant.name}"></td>
								<td th:text="${participant.email}"></td>
								<td th:text="${participant.level}"></td>
								<td th:text="${participant.participantSkill}"></td>
								<td><a th:href="@{/update/{id}(id=${participant.id})}">edit</a></td>
								<td><a th:href="${participant.id}+'/delete'">delete</a></td>
							</tr>
						
					</tbody>
				</table>
		

			

				
			
	</div>
</body>
</html>


