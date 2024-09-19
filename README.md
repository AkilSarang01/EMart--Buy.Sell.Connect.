An E-mart Android Application
ABSTRACT



The E-MART is an android app which is useful for students as well as the university faculty member and other academic staff. A paper based system all the works are done manually. Paper based work is so time consuming. The main objective behind the use of E-MART is easy to help the Institute. .Through our application students can sell/buy old stuff with in institute using Android mobile. All information is stored in the database . The faculty member is authorized to log into E-MART database through user id and password . In this application, The student can also upload the notes, Books etc. using their student’s id and password provided by the admin. Through this application faculty can post eh upcoming events. Through this application notice board is all time updated by respective teachers and admin personnel.
 
TABLE OF CONTENT


Sr No	INDEX	Page No
	Certificate	
	Declaration	
	Abstract	I
	Table Of Content	II
	Table Of Figure	III
1	Introduction	1
1.1	Definition	1
1.2	Scope	1
1.3	Motivation	2
1.4	Objective	2
2	Literature Survey	3
3	Existing System	6
3.1	Drawbacks of college management system	6
4	Proposed System	7
4.1	Software Specification	8
4.2	Design approach	11
4.3	Implementation	13
5	Conclusion	15
6	References	16
 

TABLE OF FIGURE




SR No	Fig No	Description	Page No
1	4.1	Use Case Diagram	7
2	4.1.1	Android Studio	8
3	4.1.2	Firebase Storage	9
4	4.1.3	Android Default Structure	10
5	4.2.1	System Working	12
6	4.3.1	Splash Screen	13
7	4.3.2	Register Interface	13
8	4.3.3	Login Page	14
9	4.3.4	Categories	14
 
01.	INTRODUCTION


•	E-MART Application provides platform, where student can Buy/ Sell their used stationary stuff within an institute. Other than buying & selling e-mart application comprise features like printing, notes, Events Section, chat & Notice .By looking all lostthis feature we can see that it is more than ecommerce app, we can say our application a "student portal ".While signup we provide two options, a user can sign up either using his Email or he can use Google account to sign up faster.
•	The app is user-friendly for all buyers and sellers. Sellers can easily post and edit their books' ads. Buyers can easily search for the book they want with advanced search features.
•	In recent years, the Android Technology with web services has brought many drastic changes in the mobile application development field. This application provides a generalized solution to monitor the various works that are carried out by a College for managing it. “E-MART” provides a simple interface for helping student and faculty.

1.1	Definition:
The Bulletin board is the existing system, which is officially used in college for all the update related to curriculum notifications. It is intended to reduce the hardship faced by the students and management and has been developed to overrides the problems faced by manual system.


1.2	Scope:
The “E-MART” is Incremental Development Model. Event announcement can be implemented using posting event information within app. Android application will help to ease the problem faced by manual system, it will help many students way like access study material, Buy/sell old stuff , and get notified of upcoming events.
 
1.3	Motivation:
In this section, we will learn that, existing problem that motivates us to propose our idea
•	In the Modern Technology Era, Where we all are dependent on application for everything
•	But Student are still confused where to sell their used books and stationary stuff after clearing their semesters
•	Either they sell their books to Scrap dealer (raddiwala) which degradesthe value of book by offering less price to students.
•	So Instead of selling books to scrap dealer it will be best to sell books to needy student in affordable price.
•	So this app will also help student who cannot afford new books, will be able to buy books in affordable prices.
•	In college, events and other information are displayed on notice boards and thus it become very important for students to check the notice board regularly.
•	This process of displaying notices does not guarantee that every student have received the message. Other than that is requires lot of time.
•	The existing system uses emails for communication between students and teacher. Thus, there is no direct.
•	We can automate this process by creating an application that will allow you to use these things in a fully functional way

1.4	Objective:
•	Providing the online interface for students, faculty.
•	Increasing the efficiency of college.
•	Decrease time required to access and deliver notices.
•	To make the system more secure.
•	Decrease time spent on non-value added task
 

02.	LITERATURE SURVEY

All researchers have aimed to develop and provide a generalized solution to monitor the various works that are carried out by a College for automation of various tasks. They provided up to date information of the system, which improved efficiency of college record management and decrease the space between student and college. The major contributions to this topic are summarized below: S. Shivasubramanian, S. Sivasankaran, and S. Thiru Nirai Senthi [1] proposed one of the first computational schemes An Android Based Mobile Application to Monitor Works at Remote Sites. This application provided a generalized solution to monitor the various works that were carried out by a construction company atdifferent geological points. By using a Web Service the data was stored in the remote database. This mobile application requires General Packet Radio Service (GPRS) or Wi-Fi technology to reach the remote database. Using data in the remote database various reports were generated and projected as a MIS [Management Information System] web application.
Sanjay T. Attendance [2] proposed attendance Management System to generate an android application to calculate the attendance of the students in colleges and updating the result directly into the college server. The data would be stored in the smart phone if the internet connection.
was unavailable at that time. When the internet connection was available, then the faculty could login into their college account and update the attendance result.
Shradha S. Chawhan, Mangesh P. Girhale, and Gunjan Mankar [3] worked on MPBAS that helped lecturers to take the attendance of students using Smart-phone. Lecturers would login to the phone application, get connected to the server and take attendance using Smart-phone. After taking the attendance in the mobile, lecturers would send it over to the server using GPRS and attendance list would be updated automatically. Lecturers would be able to edit the attendance by login on to the website. Students would be able to view their own attendance as well as curriculum details. To reduce the chances of fake attendance, the project would include Location detection using GPS. Also email would be send to the students by the lecturers, notifying them of their regular activities.
S. R. Bharamagoudar, Geeta, S.G. Totad [4] worked on Web Based Student Information Management System that provided a simple interface for maintenance of student information. It could be used by educational institutes or colleges to maintain the records of students easily. The creation and management of accurate, up-to-date information regarding a students’
 

academic career is critically important in the university as well as colleges. Student information system deals with all kind of student details, academic related reports, college details, course details, curriculum, batch details, placement details and other resource related details too.Eiichiro Tsutsui, Kazuharu Owade, Yusuke Kondo, Michiko Nakano [5] A Proposal For A New-Dimensional Online Feedback System: Focusing On Individual Learner Differences purpose of this study was to create a new method of assessing individual learner differences in the contexts of language learning. Their questionnaire-type items used in that system was based on SILL (Strategy Inventory of Language Learning) questionnaire items.

Namrata Shahade, Priya Kawade and Satish Thombare [6], proposed Student Information Tracking System an Android application to manage student attendance on mobile. In many colleges teachers used to take attendance manually. Main objective of this project is to add mobility and automation in the existing attendance process. This system helps teachers to take attendance through mobile and also keep in touch with student in some aspect. This System allow teachers to take attendance, edit attendance, view student’s bunks, send important documents in pdf format such as exam time table, question bank etc. and also helps teachers to inform students about the events that college was going to organize. This system also helped students in specifying bunks, deleting bunks, viewing their bunks. This system gives a priorintimation to student as soon as his attendance goes below the specified attendance deadline in the form of an alert. This system helps students to keep in touch with the events that college was organizing.


Sr.
No.	Name of Author	Title of Paper	Year	Description
[1]	Arulogun, Olatunbosun, Fakolujo, Olaniyi	RFID-Based Student Attendance Management System	Feb 2013	An application based on Radio Frequency Identification (RFID) to manage
student attendance.
[2]	S. R. Bharamagou d ar, Geeta,
S.G. Totad	Web Based Student Information Management System	Jun 2013	SIMS provides a simple interface for managing college.
[3]	Bongani T.
Mabunda
, Johnson O.	Enhancing Online University Class Management System with Instance Email	Octobe r-24- 26 ,
2012	Manages the class, attendance and provides instant email alerts and updates student records.
 
	Dehinbo	Feedback Alert		
[4]	Yohei, Tetsuo, Weijane, Koh, Michihiko	Face Reorganization Based Lecture Attendance System	Dec 2011	This system takes attendance automatically using face reorganization.
[5]	Eiichiro Tsutsui, Kazuharu Owade, Yusuke Kondo, Michiko nakano	A Proposal For A New- Dimensional Online Feedback System: Focusing On Individual Lerner
Differences	March 2008	Using online feedback system learners will become aware and will be responsible for their own learning.
 

03.	EXISTING SYSTEM

The college information and notification are currently viewed through only official website .It is difficult to check the notification through mobile phone and the notifications can only get by accessing the website. In college, events and other information are displayed on notice boards and thus it become very important for students to check the notice board regularly. This process of displaying notices does not guarantee that every student have received the message. Other than that is requires lot of time. The existing system uses emails for communication between students and teacher. Thus, there is no direct communication between student and teachers.
Thus there is a great need for a fast, reliable, efficient and easy automated system which will help in updating and provide the best way for interaction in short duration of time. In Existing Application, We observed that ads posted are displayed at the end, which makes users difficult to find the recent posted ads To register into app, user have to fill a long sign up form which makes signup process slow & boring It only focus to buy/sell Stuff Existing Application doesn’t come up with Advance search features , so user cant search any specific item ,he have to scroll to look for the specific item Suppose we want to organize an event in college we need to create posters, banners and make an announcement in classes so that students participate but if any student got absent on that day, then he will remain unmodified. In existing application we observed there is no such app which offer’s many features which will help students and faculty to get the daily use features in one application, For every purpose user have to look for multiple application to complete their task.

3.1	Drawbacks of the College Management System:

In this section, we will discuss the existing system and some of its drawbacks, which force us to plan this whole idea of developing an android application for college.

•	This process is so time-consuming.

•	There is a threat to the record of the student and teachers in this case; there might be a chance that a person makes entry on someone else record.

•	There is no proper way of getting to know about the events and extra curriculum activities happening in colleges.


So, above this is the whole process of the college management system and its working by our system we can make it a little bit simpler and the fast process of automating it.
 


04.	PROPOSED SYSTEM.

•	The “E-MART” is aimed at developing a one stop College Management Sys-tem that is of importance for Institution. The project is an Android based application that can be accessed by the institution management and students. The project aims at providing information to all the levels of management within an organization. This system can be used as a knowledge/information management system for the college. For a given student/ staff (technical/Non-technical) can access to either upload or download some academic information from the application.
The project is intended to reduce the hardship faced by the students and management, which overrides the problems faced by the existing system. The project Deals with monitoring the student and faculty activity, the main function of the E-MART application is to help student & faculty at every possible way like student can buy or sell their old stuff, update their lost items, can access the study materials and also get notified of upcoming events many more.



Fig No 4.1 Use Case Diagram
 

4.1	SOFTWARE SPECIFICATION


Android Studio:







Fig. 4.1.1 Android Studio


The official integrated development environment (IDE) for Google's Android operating system is Android Studio. It is based on Jet Brains' IntelliJ IDEA software and is intended for Android development alone.


Android Java and XML:

•	JAVA is a class-based and object-oriented programming language that is utilized in the development of Android apps. JAVA's main aims are to be simple, object- oriented, robust, secure, and high level. JVM (JAVA Virtual Machine) is used to execute JAVA applications, however Android has its own virtual machine called Dalvik Virtual Machine (DVM) that is tailored for mobile devices.
•	Extensible Markup Language is an abbreviation for XML. It is a markup language similar to HTML that is used to represent the data. XML is utilized in Android to implement UI-related data, and it is a lightweight markup language that does not make layout heavy.
 




Firebase Database:



Fig. 4.1.2 Firebase Storage




Firebase offers a real-time database as well as a back-end as a service. The service offers application developers an API that allows application data to be synced among clients and saved in the Firebase cloud. It offers client libraries for integration with Android, iOS, JavaScript, and Java. It allows for safe file uploads and downloads for our Firebase Apps regardless of network quality. It can be used by the developer to store photographs, music, video, or other user-generated information. Google Cloud Storage, a powerful, simple, and cost-effective object storage solution, backs up Firebase storage.
 






Android SDK (Minimum API 15):




Fig. 4.1.3 Android Default Structure


Android Software Development is the process of creating new applications for the Android operating system. Applications are often written in the Java programming language and built with the Android Development Kit (SDK). The Android SDK includes a vast number of programming tools. A debugger, feature descriptor for building, auto- imports for library functions, an emulator to run devices with different screen widths, and a simple import or method invocation for an object class by pressing Alt + Enter. Improvements to the Android SDK work hand in hand with the overall development of the Android Platform.
 

4.2	DESIGN APPROACH

A first-time user of the mobile application should see the splash screen consist of the window containing an image, logo, and the current version of the application. If the user has not registered, he/she should be able to do that on the log -in page. If the user is not a first-time user, he/she should be able to see the login page(user can login using google sign-in) and then navigate departments directly when the application is opened. Here the user chooses the type of departments he/she wants to conduct.
Since neither the mobile application nor the web portal have any designated hardware, it does not have any direct hardware interfaces. The mobile phone and the hardware connection to the database server is managed by the underlying operating system on the mobile phone and the web server.
The Student and Management must be able to login into their respective accounts and have access to the features according to the user rights given to them by the administrator. last group of the requirements which is non-functional requirements will be explained in detail. Nonfunctional requirements include performance requirements, safety requirements and secu-rity requirements and software quality attributes.
Since this software is going to be mobile application based, it does require a powerful device with 3G/4G internet access. Mobile should have a powerful CPU and high-speed internet access so that it can handle multiple activities of the users at the same time. Performance requirement by the user side is, mobile application should be developed as a lightweight application so that it can work on almost any android device even with slower internet connection.
 



Since this firebase database is hosted on cloud server, all the user data will be kept on the cloud server. Product should be able to protect privacy of user data. application should only be accessed through user own credentials and any other user should not be able to access to the user private data. Since execution will also be done in the cloud, user should be restricted in terms of user rights. Also, rights of the user should be restricted so that user can not harm to system. Since all the data will be transferred on the web, system should also use an encryption and de-cryption mechanism only intended user that is administrator can decode the data and work on the data.






Fig. 4.2.1 System working
 
4.3	IMPLEMENTATION


Software Interface

In this section, we are introducing some user interfaces of this project:
Splash Screen:
After opening the app, the following Splash screen interface will appear.


 

Register Interface:
 
Figure 4.3.1 Splash Screen
 

New User have to register to get into the application and get benefit of useful features.

Figure 4.3.2 Register Interface
 

Login Page /Sign in With Google
Existing user can login by entering their credentials or to ease of entering long credentials user can also easily sign in with google in one click.


 

Categories:
 
Figure 4.3.3 Login Page
 

After getting into the application user can get the benefit of following categories
1.	User can buy/sell their old Stuff.
2.	Student can access Study Materials and post their notes, which will be used full for other students.
3.	Faculty and students can post the upcoming events, which will be visible to every students. Therefore, if any students got absent he will not remain unnotified.

Figure 4.3.4 Categories
 
5.	CONCLUSION.
E-MART Android Application was made such that MGM's College of Engineering and Technology finally gets its own App. Today, applications are so common, making it a requirement for institutes to reach out to the users. The main aim of the project was to enhance user interaction, allowing for basic information to be conveyed, as well as real-time updates. Firebase as the backend allowed for the smooth agile process implemented. The developed system:
•	Allows users to access the app based on the profile.
•	Student can access the notes.
•	Students can sell/buy their stuff within institute.
•	Faculty can post the upcoming events.

Thus, the E-MART Android Application is an effective and efficient app fulfilling the needs required by an organization. The posts allow College events to be noted by all users. Data is going to be preserved carefully for longer period hence it gives more reliability. More comfortable for all users because of its simplicity. Users can get the required information via the fragments. At the end, the basic requirements of the application for our college were covered as per the requirements analyze
 
6.	REFERENCE
[1]	M.A. Norasiah and A. Norhayati.“Intelligent student information system”. 4th International conference on telecommunication technology proceedings, Shah Alam, Malaysia, 0-7803-7773-7/03 2003 IEEE.
[2]	Jin Mei-shan1 Qiu Chang-li 2 Li Jing 3. “The Designment of student information management system based on B/S architecture”. 978-14577-1415-3/12 2012 IEEE.
[3]	Zhibing Liu, HuixiaWang,HuiZan“Design and implementation of student information management system.” 2010 International symposium on intelligence information processing and trusted computing.978-0-7695-41969/10 IEEE.
[4]	“Mobile Phone Based Attendance System”, by Shraddha S.Chawhan1, Mangesh P. Girhale2, Gunjan Mankar3, IOSR Journal of Computer Engineering (IOSR-JCE) e-
ISSN:2278-0661, p- ISSN: 2278-8727Volume 10, Issue 3 (Mar. -Apr. 2013), PP 48
[5]	DonnFelker, “Android Tablet Application Development For Dummies”, john Wiley and Sons, 2012
[6]	“Mobile Phone Based Attendance System”, by Shraddha S. Chawhan1, Mangesh P. Girhale2, Gunjan Mankar3, IOSR Journal of Computer Engineering (IOSR-JCE) e- ISSN: 2278-0661, p- ISSN: 2278-8727Volume 10, Issue 3 (Mar. - Apr. 2013), PP 48- 50 www.iosrjournals.org.
[7]	“Portable Lab: Implementation of Mobile remote laboratory for Android platform”, an IEEE paper by Macro Andre Guerra, Claudia Mariline Francisco, RuiNeves Madeira, Portugal.
[8]	Krejcar, 0., "PDPT framework - Building information system with wireless connected mobile devices", In Icinco 2006, 3rd International Conference on Infonnatics in Control, Automation and Robotics Instinct Press, Setubal, Portugal, pp. 162-167.

[9]	Zigurd	Mednieks,	Laird	Dornin,	G.	Blake	Meike,	and	Masumi Nakamura, ”Programming Android”, Second Edition 2009.
[10]	Diego Torres Milano ,” Android Application Testing Guide”, Packt Publishing, 2011.
[11]	T.Govindasamy, “Successful implementation of e-learning pedagogical considerations,” in The Internet and Higher Education, vol. 4, 2012, pp. 287–299.
[12]	D. C. Hillman, D. J. Willis, & C. N. Gunawardena, “Designing online courses to promote retention,” in The American Journal of the Distance Education, vol. 8, No. 2, 1994, pp. 30–42.
[13]	K. Akhila, a Novel Approach of Mobile Based Student Attendance Tracking System Using Android Application, International Journal of Engineering Research & Technology (IJERT) Vol. 2 Issue 4, April - 2013 ISSN: 2278-0181
