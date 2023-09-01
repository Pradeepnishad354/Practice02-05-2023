

 function validateForm() {
      // Reset error messages
      
      document.getElementById("emailError").innerHTML = "";
     document.getElementById("passwordError").innerHTML = "";
     
     
     
      let  email = document.getElementById("email").value;
      let password = document.getElementById("password").value;
      let isValid = true;
 
      // Validate email
      if (!isValidEmail(email)) {
        document.getElementById("emailError").innerHTML = "Invalid email address";
        isValid = false;
      }

      // Validate password
      if (!isValidPassword(password)) {
        document.getElementById("passwordError").innerHTML = "Password must be at least 8 characters long";
        isValid = false;
      }

      return isValid;
    }

    function isValidEmail(email) {
      // Simple email validation using regular expression
      let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      return emailRegex.test(email);
    }

    function isValidPassword(password) {
      return password.length >= 8;
    }
    
    
    
    