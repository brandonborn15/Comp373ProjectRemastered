# Facility Management Project
By: Thomas Walsh and Brandon Moy

# How To Run
You can run this program by accessing the FacilityManagementClient file that can be found in src -> client. Run the main method and it will print out the results of some hard coded examples. You can also tes individual methods from all classes by running tests from the files that can be found in the tests folder.

# Ideas That Were Not Fully Realized
There were several ideas we had for this project that we were not able to implement due to lack of time or lack of knowledge.
- Storing data
    - We wanted to store all information in a database but we have no experience with database programming
    - We wanted to store all information in HashMaps and then save/overwrite data saved in CSV files so data persisted between uses

# Our Interpretation Of The Project
This program was made for a company that provides eventspaces for clients. We use Loyola as a hard coded example. So therefore a facility object would be a representation of an event space with variables like facility name (Gentile Arena), and facility capacity (5000).

# Folder Separation
All the source code can be found in src and all the tests can be found in tests. Within src the folders are broken up by layer with facility_management being the highest, facility being below that, and both facility_use and facility_maintenance below that. Within the folders are all files that are part of that layer. src also has a client folder that is home to the aforementioned FacilityManagementClient class that demonstrates the program. The tests folder is similarly divided. All classes have an interface that they implement.

# FacilityManagementClient

# FacilityManagement

# Facility

# FacilityUse

# GeneralUse

# Inspections

# FacilityMaintenance

# Requests

# ScheduleMaintenance

# Testing