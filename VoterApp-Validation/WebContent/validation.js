function validate(form) {
	// set vflag to "yes" indicating client side form validation ares done
	form.vflag.value = "yes";
	// set style to error message
	document.getElementById("nameErr").innerHTML = "";
	document.getElementById("ageErr").innerHTML = "";
	document.getElementById("nameErr").style = "color:red";
	document.getElementById("ageErr").style = "color:red";

	// read form data
	var name = form.pname.value;
	var age = form.page.value;

	// perform client side form validations
	if (name == "")// required rule
	{
		document.getElementById("nameErr").innerHTML = "*Person name is  mandotary";
		form.pname.focus();
		return false;
	}// if
	if (age == "")// required rule
	{
		document.getElementById("ageErr").innerHTML = "*Person age is mandatory";
		form.page.focus();
		return false;
	}// if
	else {
		if (isNaN(age))// check weather age is numeric value or not
		{
			document.getElementById("ageErr").innerHTML = "*Person age must be Numeric value";
			form.page.focus();
			form.page.value = "";
			return false;
		}// if
	}// else
	return true;
}
