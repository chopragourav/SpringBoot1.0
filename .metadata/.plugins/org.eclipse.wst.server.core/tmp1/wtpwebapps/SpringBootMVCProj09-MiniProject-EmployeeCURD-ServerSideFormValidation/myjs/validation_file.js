function validate(frm) {
	document.getElementById("nameError").innerHTML="";
	document.getElementById("jobError").innerHTML="";
	document.getElementById("salError").innerHTML="";
	document.getElementById("deptnoError").innerHTML="";
	
	
	let name = frm.ename.value;
	let desg = frm.job.value;
	let salary = frm.sal.value;
	let deptno = frm.deptno.value;
	let validationFlag = true;

	if (name == "") {
		document.getElementById("nameError").innerHTML = "Employee name must required(CS)";
		validationFlag = false;
	}
	else if (name.length() < 5) {
		document.getElementById("nameError").innerHTML = "Employee name must have minimum 5 character(CS)";
		validationFlag = false;
	}

	if (desg == "") {
		document.getElementById("jobError").innerHTML = "Employee desg must required(CS)";
		validationFlag = false;
	}
	else if (desg.length() < 5) {
		document.getElementById("jobError").innerHTML = "Employee desg must have minimum 5 character(CS)";
		validationFlag = false;
	}

	if (salary == "") {
		document.getElementById("salError").innerHTML = "Employee salary must required(CS)";
		validationFlag = false;
	}
	else if (isNaN(salary)) {
		document.getElementById("salError").innerHTML = "Employee salary must be numeric only(CS)";
		validationFlag = false;
	}
	else if (salary.length() < 10000 || salary.length()>100000) {
		document.getElementById("nameError").innerHTML = "Employee salary must be in given range 10000 to 100000 only(CS)";
		validationFlag = false;
	}
	
	if (deptno == "") {
		document.getElementById("deptnoError").innerHTML = "Employee department number must required(CS)";
		validationFlag = false;
	}
	else if (isNaN(deptno)) {
		document.getElementById("salError").innerHTML = "Employee department number must be numeric only(CS)";
		validationFlag = false;
	}
	else if (deptno.length() < 10 || deptno.length()>100) {
		document.getElementById("nameError").innerHTML = "Employee department number must be in given range 10 to 100 only(CS)";
		validationFlag = false;
	}
	
	frm.vflag.value="yes";
}