# GNZ ZeroCarbon - Web App 
<br>

![video- kapak ](https://github.com/gdscbaskent/gnz-zero-carbon/assets/116390010/4e5e3157-9848-42d3-ab83-34fbd52b16c9)
The main purpose of this web application is to understand how much carbon dioxide emissions people cause with their daily "normal" activities through an individual tracking system and to raise awareness. By using the application daily, the user learns how much compensation activity he needs to do per unit for each activity that causes carbon dioxide emissions and perceives the amount of carbon dioxide emissions more clearly. Thus, the user's self-awareness and perception now reduce the activities that cause this carbon dioxide release, and the user tries to eliminate their negative effects by performing compensatory activities.

<br>

# Frontend
## <img width="150" alt="Ekran Resmi 2024-02-25 23 59 47" src="https://github.com/gdscbaskent/gnz-zero-carbon/assets/128600199/ce180b07-984e-424b-9c9c-94edc5d7a31d">
This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 17.1.2.

### Development server

Run  `npm start` or `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

### Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.

<br>

## PrimeNG and PrimeFlex

We used PrimeNG and PrimeFlex libraries to develop user interface components and layouts in our Angular-based web application. PrimeNG provides a wide range of user interface components such as tables, forms, menus, and charts, while PrimeFlex offers flexible CSS utility classes to create responsive and aesthetically pleasing layouts. By leveraging these libraries, we were able to speed up development and provide a visually appealing and user-friendly interface for our application.

<br>

## IP change

src -> app -> app.service.ts -> Replace the "10.7.28.212" IP in the sendActivity and getCompensations functions with your own IP.

<br>

## User Interface (UI)
<img width="800" alt="Ekran Resmi 2024-02-25 23 45 26" src="https://github.com/gdscbaskent/gnz-zero-carbon/assets/128600199/6714f4f6-4c04-468e-add0-6d93f8db727e">

# Backend
Our project utilizes the Spring Boot framework for backend development, providing a robust and efficient foundation for building RESTful APIs and web services. With Spring Boot, we benefit from features like auto-configuration, embedded servers, and dependency management, enabling rapid development and deployment of our backend components.
   
Upload the "carbonfootprint/carbonfootprint" file to your Java IDE. Then run the code. 

# Database
In terms of database management, we employ PostgreSQL database to store and manage our application's data. PostgreSQL, a powerful open-source relational database, offers features such as ACID compliance, JSON support, and robust scalability, making it an ideal choice for handling complex data requirements. Additionally, SQL (Structured Query Language) is used to interact with the databases, allowing us to perform various operations such as querying, updating, and managing data efficiently."
    
For the database connection, change the username part as your username and password part as your password in the src -> main -> resources -> application.properties file for connecting your own database.

# Team Members

Zeynep Gamze Topay - Backend Developer     
Zeynep Nazire Demir - Backend Developer    
Gökçe Nur Yılmaz - Frontend Developer      

# Video Submission
Click on the thumbnail below for watching our presentation & demo video! 
       
[![GNZ ZeroCarbon - GDSC Solution Challenge 2024](https://img.youtube.com/vi/s0pWy3pbP8I/0.jpg)](https://www.youtube.com/watch?v=s0pWy3pbP8I "GNZ ZeroCarbon - GDSC Solution Challenge 2024")
