AppFuse Basic Struts Archetype
--------------------------------------------------------------------------------
If you're reading this then you've created your new project using Maven and
pims.  You have only created the shell of an AppFuse Java EE
application.  The project object model (pom) is defined in the file pom.xml.
The application is ready to run as a web application. The pom.xml file is
pre-defined with Hibernate as a persistence model and Struts 2 as the web
framework.

To get started, please complete the following steps:

1. Download and install a MySQL 5.x database from 
   http://dev.mysql.com/downloads/mysql/5.0.html#downloads.

2. Run "mvn jetty:run" and view the application at http://localhost:8080.

3. More information can be found at:

   http://appfuse.org/display/APF/AppFuse+QuickStart




Walter comments
---------------------------------
# maven commands

mvn archetype:generate -B -DarchetypeGroupId=org.appfuse.archetypes -DarchetypeArtifactId=appfuse-basic-struts-archetype -DarchetypeVersion=3.0.0 -DgroupId=com.github.walterfan -DartifactId=pims -DarchetypeRepository=https://oss.sonatype.org/content/repositories/appfuse

mvn appfuse:full-source

mvn eclipse:eclipse

mvn jetty:run


# maven configuration
----------------------------------
* add mirror in settings.xml of apache maven home/conf
<mirrors>

    <mirror>
      <id>CN</id>
      <name>OSChina Central</name>                                                                                                                       
      <url>http://maven.oschina.net/content/groups/public/</url>
      <mirrorOf>central</mirrorOf>
    </mirror>


    <mirror>  
          <id>repo2</id>  
          <mirrorOf>central</mirrorOf>  
          <name>Human Readable Name for this Mirror.</name>  
          <url>http://repo2.maven.org/maven2/</url>  
    </mirror>  
    <mirror>  
          <id>net-cn</id>  
          <mirrorOf>central</mirrorOf>  
          <name>Human Readable Name for this Mirror.</name>  
          <url>http://maven.net.cn/content/groups/public/</url>   
    </mirror>  
    <mirror>  
          <id>ui</id>  
          <mirrorOf>central</mirrorOf>  
          <name>Human Readable Name for this Mirror.</name>  
         <url>http://uk.maven.org/maven2/</url>  
    </mirror>  
    <mirror>  
          <id>ibiblio</id>  
          <mirrorOf>central</mirrorOf>  
          <name>Human Readable Name for this Mirror.</name>  
         <url>http://mirrors.ibiblio.org/pub/mirrors/maven2/</url>  
    </mirror>  
    <mirror>  
          <id>jboss-public-repository-group</id>  
          <mirrorOf>central</mirrorOf>  
          <name>JBoss Public Repository Group</name>  
         <url>http://repository.jboss.org/nexus/content/groups/public</url>  
    </mirror>

</mirrors>


My SQL setting
--------------------------------------------
# mysql -u root -p
CREATE USER walter IDENTIFIED BY 'pass1234';
CREATE DATABASE IF NOT EXISTS pims default charset utf8 COLLATE utf8_general_ci
grant all privileges on pims.* to walter@localhost identified by 'pass1234';
grant all privileges on pims.* to walter@192.168.3.6 identified by 'pass1234';

FLUSH PRIVILEGES;
