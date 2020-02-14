<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@include file="../shared/flows-header.jsp"%>
<div class="container">

	<div class="row">

		<div class="col-sm-6">

			<div class="card text-white bg-primary">

				<div class="card-header">
					<h4>Personal Details</h4>
				</div>

				<div class="card-body">
					<div class="text-center">
						<h3>
							Name : <strong>${registerModel.user.firstName}
								${registerModel.user.lastName}</strong>
						</h3>
						<h4>
							Email : <strong>${registerModel.user.email}</strong>
						</h4>
						<h4>
							Contact : <strong>${registerModel.user.contactNumber}</strong>
						</h4>
						<h4>
							Role : <strong>${registerModel.user.role}</strong>
						</h4>
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
					<h4>Billing Address</h4>
				</div>

				<div class="card-body">
					<div class="text-center">
						<p>${registerModel.billing.addressLineOne},</p>
						<p>${registerModel.billing.addressLineTwo},</p>
						<p>${registerModel.billing.city}-
							${registerModel.billing.postalCode},</p>
						<p>${registerModel.billing.state}</p>
						<p>${registerModel.billing.country}</p>
						<p>
							<a href="${flowExecutionUrl}&_eventId_billing"
								class="btn btn-success">Edit</a>
						</p>
					</div>
				</div>

			</div>

		</div>

	</div>

	<div class="row justify-content-center">

		<div class="col-sm-4 col-sm-offset-4">

			<div class="text-center">

				<a href="${flowExecutionUrl}&_eventId_success"
					class="btn btn-lg btn-success">Confirm</a>

			</div>

		</div>

	</div>


</div>
<%@include file="../shared/flows-footer.jsp"%>