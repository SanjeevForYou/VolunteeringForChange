<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet" type="text/css" href="resources/css/main.css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>

	<div class="a"></div>
	<div class="main_page">
		<div class="search_page"></div>

		<div class="event_page">

			<c:forEach var="item" varStatus="status" items="${listOfEvents}">
				<div class="event_box">
					<strong>${item.title}</strong><br> ${item.shortDescription} <a
						href="#" style="text-decoration: underline;">see more>></a>

					<div class="partition_date_venue">
						<div class="date_event">
							<div class="dv_logo">
								<img src="resources/app-images/date.png" alt="image"
									style="height: 40px; width: 40px;" /><strong>Date:</strong>
							</div>
							<div class="dv_detail">
								Start Date: ${item.startDate}<br>Deadline: ${item.endDate}
							</div>

						</div>
						<div class="venue_event">
							<div class="dv_logo">
								<img src="resources/app-images/location.png" alt="image"
								style="height: 40px; width: 40px;" /><strong>Venue:</strong>
							</div>
							<div class="dv_detail">
								${item.location}
							</div>
						</div>
						<div class="clear"></div>
					</div>
				</div>
				<br>
				<br>
			</c:forEach>
		</div>

		<div class="clear"></div>
	</div>
</body>
</html>
