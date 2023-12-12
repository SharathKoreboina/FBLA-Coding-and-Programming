# Coding and Programming

Overview: 

A Java database program made for the 2023-24 FBLA Coding and Programming Competition. This Program allows our school's Career and Technical Education Department to collect and store information about businesses and community partners. We used Java and SQL primarily because they supported our logic and filtration system and were adaptable. We also used JDBC(Java Database Connectivity) to connect to the users' database/server. This program is not meant to be publicly released to schools. Our only main challenge was that our SQL was running on our servers and this could be a problem since the users won't have access to these. 

How to Install and Run the Project:

(MAKE SURE TO DO THE FOLLOWING FIRST)

To start, you will need to download an IDE for JAVA (Eclipse or IntelliJ) and an IDE for SQL (MySQL workbench). You will also need to use Git for source control to clone our Github repository into a code editor of your choice (We recommend the IDEs listed before). You can also download it as a ZIP and extract it. 

External Dependencies required:

Link to to SQL IDE: https://www.mysql.com/products/workbench/
When starting the SQL server, paste the following: 

create table organization (
organization_ID INT primary key,
organization_Name VARCHAR(50),
organization_Type VARCHAR(30),
organization_resources VARCHAR(50),
organization_contact VARCHAR(50));

Running the Project: 

Once you finished cloning the repository on your preferred JAVA and SQL IDE. 





