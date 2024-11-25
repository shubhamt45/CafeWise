

---

# ☕ Cafe Wise

The **Cafe Wise** is a desktop-based Cafe Management System application developed in **Java** using **Swing** for the user interface and **MySQL** as the backend database. This system provides an efficient way to manage cafe operations, including placing orders, managing products, generating bills, and user verification.

---

## ✨ Features

### 🔐 User Authentication
- **Login and Logout**: Secure login and logout functionality to ensure authorized access.
- **Change Password**: Allows users to update their passwords.
- **Change Security Questions**: Enhances account recovery options with security questions.

### 🛒 Order Management
- **Place Order**: Easily place customer orders by selecting products from the menu.
- **View Bill and Order Placed Details**: View all generated bills and details of previous orders.

### 🍴 Product Management
- **Manage Categories**: Add or remove product categories (e.g., Beverages, Snacks).
- **Add New Products**: Add new items to the cafe menu with details like name, category, and price.
- **View, Edit, and Delete Products**: Manage the product inventory by updating or removing existing products.

### 📃 Billing System
- Automatically generates detailed bills for each order, including itemized lists and total costs.

### 👥 User Management
- **Verify Users**: Admins can verify new user registrations to ensure security.

### 🚪 Exit Application
- Securely closes the application to prevent unauthorized access.

---

## 🛠️ Technologies Used
- **Programming Language**: Java  
- **UI Framework**: Swing  
- **Database**: MySQL  
- **Development Environment**: IntelliJ IDEA / Eclipse  

---

## 🚀 Installation and Setup

### Prerequisites
1. Install **Java JDK** (version 8 or above).  
2. Install a **MySQL Server** (version 5.7 or above).  
3. Set up an **IDE** such as IntelliJ IDEA or Eclipse.  

### Steps to Install
1. Clone or download the repository.  
2. Import the project into your IDE.  
3. Configure the MySQL database:  
   - Create a database named `cafe_management`.  
   - Import the provided SQL file to set up tables (if available).  
4. Update the database connection in the Java code:  
   - Open the `DBConnection` class (or equivalent).  
   - Update the URL, username, and password for your MySQL server:  
     ```java
     private static final String URL = "jdbc:mysql://localhost:3306/cafe_management";
     private static final String USER = "root";
     private static final String PASSWORD = "your_password";
     ```
5. Build and run the project:  
   - Compile the Java files.  
   - Run the `Main` class to launch the application.

---

## 📒 Usage

1. Launch the application.  
2. **Log in** using the credentials provided (or create a new account if needed).  
3. Use the menu options at the top to access features:  
   - Manage orders, products, and users.  
   - Generate and view bills.  
4. Log out after completing operations.  

---

## 📸 Screenshots

### Login Page  
![Login Page](https://github.com/shubhamt45/CafeWise/blob/master/Login_Page.png)  

### Features  
![Features](https://github.com/shubhamt45/CafeWise/blob/master/Features.png) 

### Generating an Order  
![Generating an Order](https://github.com/shubhamt45/CafeWise/blob/master/Order.png)  

### Bill Generation  
![Bill Generation](https://github.com/shubhamt45/CafeWise/blob/master/Bill.png)  

(*Replace `<add_screenshot_path_here>` with the actual paths of your screenshots or URLs if hosted online.*)

---

## 🎥 Project Demo

Watch the full demo of the project on YouTube:  
[📹 Click here to view the video](https://www.youtube.com/watch?v=HVDwEmjsMkw)  

(*Replace `<add_youtube_video_link_here>` with your actual video link.*)

---

## 🔮 Future Enhancements
- **📊 Report Generation**: Add functionality to generate sales and inventory reports.  
- **📤 Data Export**: Allow exporting data to formats like Excel or PDF.  
- **📱 Mobile Compatibility**: Develop a mobile version of the system.  
- **💳 Integration with Payment Gateways**: Enable online payment options.  

---

## 🤝 Contributing

Feel free to fork this repository and submit pull requests for improvements or bug fixes.

---

## 📝 License

This project is licensed under the MIT License.

---

Let me know if you'd like more adjustments! 😊
