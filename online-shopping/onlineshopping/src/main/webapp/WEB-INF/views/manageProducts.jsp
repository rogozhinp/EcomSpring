<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">

	<div class="row justify-content-center">

		<c:if test="${not empty message}">

			<div class="col-lg-offset-2 col-lg-8">

				<div class="alert alert-success alert-dismissible">

					<button type="button" class="close" data-dismiss="alert">&times;</button>

					${message}

				</div>

			</div>


		</c:if>



	</div>

	<div class="row justify-content-center">


		<div class="col-lg-offset-2 col-lg-8">

			<div class="card text-white bg-primary">

				<div class="card-header">
					<h4>Product Management</h4>
				</div>

				<div class="card-body">
					<!--FORM ELEMENTS -->
					<sf:form class="form-horizontal" modelAttribute="product"
						action="${contextRoot}/manage/products" method="POST"
						enctype="multipart/form-data">

						<div class="form-group">

							<label class="control-label col-md-4" for="name">Enter
								Product Name: </label>

							<div class="col-md-8">

								<sf:input type="text" path="name" id="name"
									placeholder="Product Name" class="form-control" />

								<sf:errors path="name" cssClass="help-block" element="em" />
							</div>


						</div>

						<div class="form-group">

							<label class="control-label col-md-4" for="brand">Enter
								Brand Name: </label>

							<div class="col-md-8">

								<sf:input type="text" path="brand" id="brand"
									placeholder="Brand Name" class="form-control" />
								<sf:errors path="brand" cssClass="help-block" element="em" />

							</div>


						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Description:</label>
							<div class="col-md-8">
								<sf:textarea path="description" class="form-control"
									placeholder="Enter your description here!" />
								<sf:errors path="description" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Unit Price:</label>
							<div class="col-md-8">
								<sf:input type="number" path="unitPrice" class="form-control"
									placeholder="Enter Unit Price" />
								<sf:errors path="unitPrice" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="quantity">Quantity:</label>
							<div class="col-md-8">
								<sf:input type="number" path="quantity" class="form-control"
									placeholder="Enter Quantity" />
							</div>
						</div>

						<!-- File element for image upload -->
						<div class="form-group">
							<label class="control-label col-md-4" for="file">Select
								an Image:</label>
							<div class="col-md-8">
								<sf:input type="file" path="file" id="file" class="form-control" />
								<sf:errors path="file" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Category:</label>
							<div class="col-md-8">
								<sf:select path="categoryId" items="${categories}"
									itemLabel="name" itemValue="id" class="form-control" />
								<c:if test="${product.id == 0}">
									<div class="text-right">
										<br />
										<button type="button" class="btn btn-warning btn-xs"
											data-toggle="modal" data-target="#categoryForm">Add
											New Category</button>
									</div>
								</c:if>
								<sf:hidden path="id" />
								<sf:hidden path="code" />
								<sf:hidden path="supplierId" />
								<sf:hidden path="active" />
							</div>
						</div>



						<div class="form-group">

							<div class="col-md-offset-4 col-md-4">

								<input type="submit" name="submit" id="submit" value="Submit"
									class="btn btn-primary" />


							</div>
						</div>

					</sf:form>

				</div>

			</div>

		</div>

	</div>

	<!-- Modal -->
	<div class="modal fade" id="categoryForm" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">New Category</h4>
				</div>
				<div class="modal-body">

					<sf:form id="categoryFormValidate" class="form-horizontal"
						modelAttribute="category" action="${contextRoot}/manage/category"
						method="POST">

						<div class="form-group">
							<label class="control-label col-md-4">Name</label>
							<div class="col-md-8 validate">
								<sf:input type="text" path="name" class="form-control"
									placeholder="Category Name" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Description</label>
							<div class="col-md-8 validate">
								<sf:textarea path="description" class="form-control"
									placeholder="Enter category description here!" />
							</div>
						</div>


						<div class="form-group">
							<div class="col-md-offset-4 col-md-4">
								<input type="submit" name="submit" value="Save"
									class="btn btn-primary" />
							</div>
						</div>
					</sf:form>
				</div>
			</div>
		</div>
	</div>


	<div class="row">

		<div class='col-lg-12'>
			<div class="contaiter-fluid">
				<div class="table-responsive-sm">

					<h1>Available Products</h1>



					<table id="adminProductsTable"
						class="table table-condensed table-bordered">

						<thead>
							<tr>
								<th>Id</th>
								<th>image</th>
								<th>Name</th>
								<th>Brand</th>
								<th>Qty. Avail</th>
								<th>Unit Price</th>
								<th>Activate</th>
								<th>Edit</th>
							</tr>
						</thead>



						<tfoot>
							<tr>
								<th>id</th>
								<th>image</th>
								<th>Name</th>
								<th>Brand</th>
								<th>Qty. Avail</th>
								<th>Unit Price</th>
								<th>Activate</th>
								<th>Edit</th>
							</tr>
						</tfoot>


					</table>

				</div>
			</div>

		</div>



	</div>


</div>