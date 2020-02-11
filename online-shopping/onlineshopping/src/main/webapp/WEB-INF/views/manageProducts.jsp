<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
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
					<sf:form class="form-horizontal" modelAttribute="product" action="${contextRoot}/manage/products" method="POST">

					<div class="form-group">

						<label class="control-label col-md-4" for="name">Enter
							Product Name: </label>

						<div class="col-md-8">

							<sf:input type="text" path="name" id="name"
								placeholder="Product Name" class="form-control" /> <em
								class="help-block">Please enter Product Name!</em>

						</div>


					</div>

					<div class="form-group">

						<label class="control-label col-md-4" for="brand">Enter
							Brand Name: </label>

						<div class="col-md-8">

							<sf:input type="text" path="brand" id="brand"
								placeholder="Brand Name" class="form-control" /> <em
								class="help-block">Please enter Brand Name!</em>

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
						<label class="control-label col-md-4">Quantity:</label>
						<div class="col-md-8">
							<sf:input type="number" path="quantity" class="form-control"
								placeholder="Enter Quantity" />
							<sf:errors path="quantity" cssClass="help-block" element="em" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-4">Category:</label>
						<div class="col-md-8">
							<sf:select path="categoryId" 
								items="${categories}"
								itemLabel="name" 
								itemValue="id" class="form-control" />

							<div class="text-right">
								<br />
								<sf:hidden path="id" />
								<sf:hidden path="code" />
								<sf:hidden path="supplierId" />
								<sf:hidden path="active" />
								<button type="button" class="btn btn-warning btn-xs"
									data-toggle="modal" data-target="#myCategoryModal">Add
									New Category</button>
							</div>
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




</div>