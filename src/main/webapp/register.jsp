<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
    <link rel="stylesheet" href="register.css">
    <!-- This is an HTML comment ../css/register.css-->
    
</head>
<body>
	<h3 style="text-align: center;margin-top: 20px;">Registration Form</h3>
    <form id="myForm" action="registrationForm" method="get" style="margin-top: 20px;">
        <div class="form-group">
            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName" placeholder="Enter your first name">
        </div>

        <div class="form-group">
            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lastName" placeholder="Enter your last name">
        </div>

        <div class="form-group">
            <label for="nickName">Nick Name:</label>
            <input type="text" id="nickName" name="nickName" placeholder="Enter your nick name">
        </div>

        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email">
        </div>

        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter your password">
        </div>

        <div class="form-group">
            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob">
        </div>

        <div class="form-group">
            <label for="mobile">Mobile:</label>
            <input type="text" id="mobile" name="mobile" placeholder="Enter your mobile number">
        </div>

        <div class="form-group">
            <label>Gender:</label>
            <div class="radio-group">
                <input type="radio" id="male" name="gender" value="Male">
                <label for="male">Male</label>

                <input type="radio" id="female" name="gender" value="Female">
                <label for="female">Female</label>

                <input type="radio" id="others" name="gender" value="Others">
                <label for="others">Others</label>
            </div>
        </div>

        <div class="form-group">
            <label for="address">Address:</label>
            <textarea id="address" name="address" rows="3" cols="25" placeholder="Enter your address"></textarea>
        </div>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
