# Facility Management Project
By: Thomas Walsh and Brandon Moy

# How To Run
You can run this program by accessing the FacilityManagementClient file that can be found in src -> client. Run the main method and it will print out the results of some hard coded examples. You can also test individual methods from all classes by running tests from the files that can be found in the tests folder. 
NOTE: You need to add all the dependencies that were listed in the SRD at 2.5.

# Our Interpretation Of The Project
This program was made for a company that provides eventspaces for clients. We use Loyola as a hard coded example. So therefore a facility object would be a representation of an event space with variables like facility name (Gentile Arena), and facility capacity (5000).

# Folder Separation
All the source code can be found in src and all the tests can be found in tests. Within src the folders are broken up by layer with facility_management being the highest, facility being below that, and both facility_use and facility_maintenance below that. Within the folders are all files that are part of that layer. src also has a client folder that is home to the aforementioned FacilityManagementClient class that demonstrates the program. The tests folder is similarly divided. All classes have an interface that they implement. We also have a folder containing PDF files of diagrams of our program.

# FacilityManagementClient
Running this file will output information about a FacilityManagement Object that we have hardcoded into the program.

# FacilityManagement
This program deals with a list of Facility objects. From FacilityManagement you can get, set, add a new facility, and remove a facility. You can get information about a specific facility or find a facility to accomodate a specific number of people.

# Facility
Facility is where you can make the Facility objects. Facility objects contain a facility name, a facility capacity, a facility description, a FacilityUse object, and a FacilityMaintenance object. There are getters and setters to all the variables of the Facility object. Also you can request the amount of room a facility has left depending on how many people are coming to the event.

# FacilityUse
FacilityUse is where you can make the FacilityUse object. FacilityUse objects have 2 variables: one is a list of GeneralUse Objects and the other is a list of Inspection Objects. Ther are getters, setters, and add methods for both of the variables. You can see if a facility is in use on a certain date, cancel all reservations and inspections on a certain date, and you can calculate the usage rate for a facility over a period of 90 days.

# GeneralUse
GeneralUse is where you can make the GeneralUse Objects. GeneralUse objects have one variable: reservation date. There is a getter and a setter for the reservation date.

# Inspection
Inspection is where you can make the Inspection Objects. Inspection objects have one variable: inspection date. There is a getter and a setter for the inspection date.

# FacilityMaintenance
FacilityMaintenance is where you can make the FacilityMaintenance Object. FacilityMaintenance objects have two variables: a list of Request objects and a list of ScheduleMaintenance objects. There are getters, setters, and add methods for both variables. You can also calculate the problem rate for a specific facility over a period of 90 days.

# Request
Request is where you can make the Request objects. Request objects have one variable: the maintenance request. There is a getter and a setter for the maintenance request.

# ScheduleMaintenance
ScheduleMaintenance is where you can make the ScheduleMaintenance objects. ScheduleMaintenance objects have 3 variables: maintenance cost, downtime, and maintenance date. There are getters and setters for all the variables. Also you can calculate the maitenance cost and downtime given an estimate.

# pdf_diagrams
In this folder you will find two PDF files: one that is the UML diagram for this program and one that is an architecture diagram of our FacilityManagement object.
