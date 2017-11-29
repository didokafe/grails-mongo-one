# grails-mongo-one

###### Install MongoDB
* first follow this url: https://docs.mongodb.com/manual/tutorial/install-mongodb-on-ubuntu/
* then for the last configs use: https://www.howtoforge.com/tutorial/install-mongodb-on-ubuntu-16.04/

###### Create required mongo user
* login: `mongo -u root -p root --authenticationDatabase admin`
* change db: `use grails-mongo-one`
* create the user in the particular db: 
````
db.createUser(
 {
   user: "grails",
   pwd: "grails",
   roles: [ "readWrite", "grails-mongo-one" ]
 }
)
````

###### Run it 
* `gradle clean bootRun`


