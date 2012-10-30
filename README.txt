This contains the set of instructions required to build and run the address book application.

Contents :
==========

├── h2
│   ├── db.h2.db
│   └── db.trace.db
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── tutorial
│   │   │           └── hibernate
│   │   │               ├── embedded
│   │   │               │   └── entity
│   │   │               │       ├── EmbeddedAddress.java
│   │   │               │       └── EmbeddedlUser.java
│   │   │               ├── helper
│   │   │               │   ├── BuildingHelper.java
│   │   │               │   ├── SessionFactoryHelper.java
│   │   │               │   └── UserHelper.java
│   │   │               ├── inheritance
│   │   │               │   ├── joinstrategy
│   │   │               │   │   └── entity
│   │   │               │   │       ├── JoinedBuilding.java
│   │   │               │   │       ├── JoinedHouse.java
│   │   │               │   │       └── JoinedUnit.java
│   │   │               │   ├── tblperclass
│   │   │               │   │   └── entity
│   │   │               │   │       ├── TblPerClassBuilding.java
│   │   │               │   │       ├── TblPerClassHouse.java
│   │   │               │   │       └── TblPerClassUnit.java
│   │   │               │   └── tblperhierarchy
│   │   │               │       └── entity
│   │   │               │           ├── Building.java
│   │   │               │           ├── House.java
│   │   │               │           └── Unit.java
│   │   │               ├── manytomany
│   │   │               │   └── entity
│   │   │               │       ├── Site.java
│   │   │               │       └── Worker.java
│   │   │               ├── relationship
│   │   │               │   └── entity
│   │   │               │       ├── Country.java
│   │   │               │       ├── Home.java
│   │   │               │       ├── RelationalAddress.java
│   │   │               │       └── RelationalUser.java
│   │   │               └── simple
│   │   │                   ├── entity
│   │   │                   │   └── UserDetails.java
│   │   │                   └── SimpleUsage.java
│   │   └── resources
│   │       └── hibernate.cfg.xml
│   └── test
│       ├── java
│       │   └── com
│       │       └── tutorial
│       │           └── hibernate
│       │               ├── AbstractTest.java
│       │               ├── embedded
│       │               │   └── TestEmbeddedUsage.java
│       │               ├── inheritance
│       │               │   ├── joinstrategy
│       │               │   │   └── TestJoinedStrategyUsage.java
│       │               │   ├── tblperclass
│       │               │   │   └── TestTablePerClassUsage.java
│       │               │   └── tblperhierarchy
│       │               │       └── TestTablePerHierachyUsage.java
│       │               ├── manytomany
│       │               │   └── TestManyToManyUsage.java
│       │               ├── relationship
│       │               │   └── TestRelationalUsage.java
│       │               └── simple
│       │                   └── TestSimpleUsage.java
│       └── resources
│           └── test-hibernate.cfg.xml
└── target
    ├── classes
    │   └── hibernate.cfg.xml
    └── test-classes
        └── test-hibernate.cfg.xml



Building the Project.
====================

Pre-requisites
--------------
JDK 1.5.x or higher
Maven 2 or higher
set java_home and m2_home.
eClipse 3.5 or higher
MySQL DB (Optional)

Steps:
------
1 - Import project to eClipse IDE (Existing Projects in Workspace > Browse and locate the sample code folder)
2 - Change the test-hibernate.cfg.xml DB properties as per the new DB
3 - Configure Project Build path and add a new Variable "M2_REPO" point to the directory "<<Local-User-Directory>>/.M2/repository"
4 - Go to the project home directory AddressBook, and run 
    - mvn clean package
    - This might take a few seconds to download all the dependencies to your local M2 repo.
5 - To run the tests,
   - mvn clean test




