**Creation of maven project:**

open maven project --> apache quickstart-->org.jsp.chetan    hibooo --->finish

1.pom.xml-->path of hibernate ,jdbc,jakarta, ctrl+s

2.IN src/main/java---->create file (database property \& hibernate property also mapping at the last )



**hibernate.cfg.xml**



<?xml version="1.0" encoding="UTF-8"?>



<hibernate-configuration>

&nbsp; <session-factory>

&nbsp;   <!-- Database Properties -->

&nbsp;   <property name="connection.driver\_class">com.mysql.cj.jdbc.Driver</property>

&nbsp;   <property name="connection.url">jdbc:mysql://localhost:3307/hibernate?createDatabaseIfNotExist=true</property>

&nbsp;   <property name="connection.username">root</property>

&nbsp;   <property name="connection.password">chetan</property>



&nbsp;   <!-- Hibernate Properties -->

&nbsp;   <property name="hbm2ddl.auto">update</property>

&nbsp;   <property name="show\_sql">true</property>

&nbsp;   <property name="format\_sql">true</property>

&nbsp;   <property name="dialect">org.hibernate.dialect.MySQL55Dialect</property>

&nbsp;   <mapping class="org.jsp.chetan.demo\_hib.Student"/>

&nbsp; </session-factory>

</hibernate-configuration>



3.in the same 

src/main/java- create a class what ever they mentioned like(student class ,employee class) write all the fileds create pojo class ,default constructor, getters and setters  and tostring method



4\. in app.java ---->



**write scanner class for all the field**  

step1-->create the obj of student class

step2-->Configuration conf=new Configuration();

&nbsp;	conf.configure("hibernate.cfg.xml");

step3:-->SessionFactory factory=conf.buildSessionFact();

&nbsp;	

Step4:-->Session session =factory.opensession();





Step5:---->Transaction transaction=session.beginTransaction();



Step6:---> session.persist(student class obj);



tansaction.commit;

session.close();

factory.close();







**pom.xml**





**<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"**

  **xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">**

  **<modelVersion>4.0.0</modelVersion>**



  **<groupId>org.jsp.chetan</groupId>**

  **<artifactId>demo\_hib</artifactId>**

  **<version>0.0.1-SNAPSHOT</version>**

  **<packaging>jar</packaging>**



  **<name>demo\_hib</name>**

  **<url>http://maven.apache.org</url>**



  **<properties>**

    **<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>**

  **</properties>**



  **<dependencies>**

    **<dependency>**

      **<groupId>junit</groupId>**

      **<artifactId>junit</artifactId>**

      **<version>3.8.1</version>**

      **<scope>test</scope>**

    **</dependency>**

    **<dependency>**

    **<groupId>org.hibernate</groupId>**

    **<artifactId>hibernate-core</artifactId>**

    **<version>5.6.15.Final</version>**

**</dependency>**

**<!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->**

**<dependency>**

    **<groupId>com.mysql</groupId>**

    **<artifactId>mysql-connector-j</artifactId>**

    **<version>8.0.33</version>**

**</dependency>**

**<!-- https://mvnrepository.com/artifact/jakarta.persistence/jakarta.persistence-api -->**

**<dependency>**

    **<groupId>jakarta.persistence</groupId>**

    **<artifactId>jakarta.persistence-api</artifactId>**

    **<version>3.1.0</version>**

**</dependency>**

  **</dependencies>**

  

**</project>**







