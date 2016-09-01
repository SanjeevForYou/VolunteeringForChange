<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <script>
	 $(function () {
	     $(this).vfc_home({
	         UserModuleID: '1',
	         rowTotal: '1',
	         PageLimit:'10',
	         CategoryID: '2'
	     });      
	 });
 </script>
 
	<div class="a"></div>
	<div class="main_page">
		<div class="search_page"></div>

		<div class="event_page">

			<c:forEach var="item" varStatus="status" items="${listOfEvents}">
				<div class="event_box">
					<strong>${item.title}</strong><br> ${item.shortDescription} 


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
						<c:if test="${item.mark == 0}">
						 <span class="btn btn-primary btn-mini interested" id="${item.eventId}" data-eventid="${item.eventId}">Event ${item.eventId} Instrested</span>
						</c:if>
						<c:if test="${item.mark == 1}">
						 <span class="btn btn-success btn-mini interested" id="${item.eventId}" data-eventid="${item.eventId}">Event ${item.eventId} Instrested</span>
						</c:if>
						 
					</div>
				</div>
				<br>
				<br>
			</c:forEach>
		</div>

		<div class="clear"></div>
	</div>
