document.write("<h1>Welcome to JS</h1>");


function askInput()
{
	var name = prompt("Enter your name");
	alert ("Welcome:"+name);
	}
function display()
{
	
		
		var r=confirm("Are u Sure to Logout?");
		if (r){
			alert("Logged out");
		}
		else{
			alert("Welcome Back");
		}
	}