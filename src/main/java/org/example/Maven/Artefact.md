## An artefact (or artifact) in Maven is a fundamental concept representing a file (usually a JAR, WAR, or POM) 
   that gets produced, used, or distributed during the build process.

1. What is a Maven Artefact?
An artefact is:
-- A compiled output of your project (JAR, WAR, EAR, etc.)
-- Identified by coordinates (groupId, artifactId, version)
-- Stored in Maven repositories (local or remote)

2. Artefact Coordinates
Every Maven artefact has three key identifiers:

Coordinate	         Example	         Description
groupId	          com.mycompany	    Reverse domain naming convention (like Java packages)
artifactId	      my-application	Name of the project/module
version	1.0.0	  Release version   (SNAPSHOT for development)

Example in pom.xml:
<groupId>com.mycompany</groupId>
<artifactId>my-application</artifactId>
<version>1.0.0-SNAPSHOT</version>

3. Types of Artefacts
Main Project Artefacts

Type       	 Description	              File Extension
JAR	    Java Archive (standard library)  	.jar
WAR	     Web Application Archive	        .war
EAR      	Enterprise Archive	            .ear
POM	       Project Object Model file     	.pom

Secondary Artefacts

-- Sources JAR (-sources.jar) - Contains source code
-- Javadoc JAR (-javadoc.jar) - Contains documentation
-- Tests JAR (-tests.jar) - Contains test classes

4. How Artefacts Are Created
Maven builds artefacts during the package phase:
mvn package
This creates:

target/
├── my-application-1.0.0.jar       # Main artefact
├── my-application-1.0.0-sources.jar # Sources
└── ...

5. Artefact Repositories

Artefacts are stored in:
-- Local Repository
   Default location: ~/.m2/repository/
   Stores all downloaded and installed artefacts
-- Remote Repositories
   Central Repository (repo.maven.apache.org) - Default public repo
   Private Repositories (Nexus, Artifactory) - For company/internal artefacts

6. Installing Artefacts Locally

To install your artefact in the local Maven repo:
mvn install
Installs to:
~/.m2/repository/com/mycompany/my-application/1.0.0-SNAPSHOT/
├── my-application-1.0.0-SNAPSHOT.jar
├── my-application-1.0.0-SNAPSHOT.pom
└── ...

7. Deploying Artefacts to Remote Repo
To deploy to a remote repository (e.g., Nexus):
mvn deploy
Requires distribution management in pom.xml:

<distributionManagement>
<repository>
<id>my-company-repo</id>
<url>https://repo.mycompany.com/releases</url>
</repository>
<snapshotRepository>
<id>my-company-snapshots</id>
<url>https://repo.mycompany.com/snapshots</url>
</snapshotRepository>
</distributionManagement>
Run HTML

8. Classifying Artefacts

For additional artefact types (like classifiers):
<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-jar-plugin</artifactId>
<version>3.2.0</version>
<executions>
<execution>
<goals>
<goal>test-jar</goal>  <!-- Creates a tests.jar -->
</goals>
</execution>
</executions>
</plugin>
</plugins>
</build>

9. Dependency on Other Artefacts
To use another artefact in your project:
<dependencies>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-core</artifactId>
<version>5.3.8</version>
</dependency>
</dependencies>

## Example: Complete Artefact Lifecycle

-- Developer writes code → mvn compile
-- Tests run             → mvn test
-- Artefact created      → mvn package
-- Installed locally     → mvn install
-- Deployed to remote    → mvn deploy