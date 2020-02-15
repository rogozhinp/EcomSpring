<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@include file="../shared/flows-header.jsp"%>
<div class="container">

	<div class="row">

		<div class="col-sm-6">

			<div class="card text-white bg-primary">

				<div class="card-header">
					<h4>Your Personal Details are ok?</h4>
				</div>

				<div class="card-body">
					<div class="text-center">
						<p>
							Name : <strong>${registerModel.user.firstName}
								${registerModel.user.lastName}</strong>
						</p>
						<p>
							Email : <strong>${registerModel.user.email}</strong>
						</p>
						<p>
							Contact : <strong>${registerModel.user.contactNumber}</strong>
						</p>
						<p>
							Role : <strong>${registerModel.user.role}</strong>
						</p>
						<p>
							<a href="${flowExecutionUrl}&_eventId_personal"
								class="btn btn-success">Edit</a>
						</p>
					</div>
				</div>

			</div>


		</div>

		<div class="col-sm-6">

			<div class="card text-white bg-primary">

				<div class="card-header">
					<h4>Your Billing Address are ok?</h4>
				</div>

				<div class="card-body">
					<div class="text-center">
						<p>Address line one: <strong>${registerModel.billing.addressLineOne}</strong></p>
						<p>Address line two: <strong>${registerModel.billing.addressLineTwo}</strong></p>
						<p>City and zip: <strong>${registerModel.billing.city}-
													${registerModel.billing.postalCode}</strong></p>
						<p>State and Country: <strong>${registerModel.billing.state} - ${registerModel.billing.country}</strong></p>
						<p>
							<a href="${flowExecutionUrl}&_eventId_billing"
								class="btn btn-success">Edit</a>
						</p>
					</div>
				</div>

			</div>

		</div>

	</div>

	<div class="row justify-content-center mt-5 mb-5">

		<div class="col-sm-4 col-sm-offset-4">

			<div class="text-center">

				<a href="${flowExecutionUrl}&_eventId_submit"
					class="btn btn-lg btn-success">Confirm</a>

			</div>

		</div>

	</div>


</div>
<%@include file="../shared/flows-footer.jsp"%>