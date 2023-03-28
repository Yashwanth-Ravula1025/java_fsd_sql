function validateForm() {
    const username = document.getElementById("username").value.trim();
    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value.trim();
    const confirmPassword = document.getElementById("confirm-password").value.trim();
    
    
    let isValid = true;
    
    // Validate username
    if (username.length < 3 || username.length > 20) {
      document.getElementById("username").classList.add("error");
      document.getElementById("username").setCustomValidity("Username must be between 3 and 20 characters.");
      isValid = false;
    } else {
      document.getElementById("username").classList.remove("error");
      document.getElementById("username").setCustomValidity("");
    }
    
    // Validate email
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
      document.getElementById("email").classList.add("error");
      document.getElementById("email").setCustomValidity("Email must be a valid email address.");
      isValid = false;
    } else {
      document.getElementById("email").classList.remove("error");
      document.getElementById("email").setCustomValidity("");
    }
    
    // Validate password
    if (password.length < 8) {
      document.getElementById("password").classList.add("error");
      document.getElementById("password").setCustomValidity("Password must be at least 8 characters long.");
      isValid = false;
    } else {
      document.getElementById("password").classList.remove("error");
      document.getElementById("password").setCustomValidity("");
    }
    
    // Validate confirm password
    if (confirmPassword !== password) {
      document.getElementById("confirm-password").classList.add("error");
      document.getElementById("password").setCustomValidity("");
    }
}