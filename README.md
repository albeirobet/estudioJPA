java-ee7-maven-archetype
========================

Maven Archetype to work with Java EE7, JPA, JSF, EJB 3.x, Primefaces

1. <span style="color:red;">IMPORTANT! </span> Changing these properties in the pom.xml file located in the root of the project.

   group.id.project       changhe this -->  com.ascuntar <br>
   artifact.id.project    changhe this -->  test <br>
   version.project        changhe this -->  1.0  <br>
   name.project           changhe this -->  test <br>
   
2. <span style="color:red;">IMPORTANT! </span> Configure the datasource in any server that supports Java EE7 eg Wildfly8, Glassfish4. 
   This should be done in the persistence.xml file located in,

   module-dm/src/main/resources/META-INF/persistence.xml
   
