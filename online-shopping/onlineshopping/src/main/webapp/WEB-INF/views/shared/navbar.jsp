
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="${contextRoot}/home">Online Shopping</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li id="about" class="nav-item"><a class="nav-link"
					href="${contextRoot}/about">About</a></li>
				<li id="contact" class="nav-item"><a class="nav-link"
					href="${contextRoot}/contact">Contact</a></li>
				<li id="listProducts" class="nav-item"><a class="nav-link"
					href="${contextRoot}/show/all/products">View Products</a></li>
				<li id="manageProducts" class="nav-item"><a class="nav-link"
					href="${contextRoot}/manage/products">Manage Products</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li id="register" class="nav-item"><a class="nav-link"
					href="${contextRoot}/register">Sign Up</a></li>
				<li id="login" class="nav-item"><a class="nav-link"
					href="${contextRoot}/login">Login</a></li>
				<li id="login" class="dropdown nav-item show">
				
					<a class="nav-link dropdown-toggle"
						href="javascript:void(0)" class="btn btn-default dropdown-toggle"
						id="dropdownMenu1" data-toggle="dropdown"> Full Name <span
							class="caret"></span>
					</a>
						<ul class="dropdown-menu show">
							<li><a class="dropdown-item" href="${contextRoot}/cart"> <span
									class="glyphicon glyphicon-shopping-cart"></span> <span
									class="badge">0</span> - &#36; 0.0
							</a></li>
							<li class="divider" role="separator"></li>
							<li><a class="dropdown-item" href="${contextRoot}/logout">Logout</a></li>
	
	
						</ul>
				</li>
			</ul>
		</div>
	</div>
</nav>