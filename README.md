# SpringBoot REST APIs using Postgres in GCP

## Tech Stack:
* Java 11
* Spring Boot
* Postgres
* JPA
* Google Cloud (GCP)


## Requirements
* [Java 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
* [Gradle](https://gradle.org/install/) 
* Editor of your choice (IntelliJ, STS or Eclipse), configure the editor with [lombok](https://projectlombok.org/setup/intellij) support.
* [Postgres Database](https://www.postgresql.org/download/macosx/)

## REST APIs:
* SpringBoot library used for cloud-sql(Postgres in GCP) is:
	```
		implementation 'org.springframework.cloud:spring-cloud-gcp-starter-sql-postgresql'
	```
	
# application.yml:
	```
	  datasource:
	      url: jdbc:postgresql://localhost:2226/upm-dev
	      username: postgres
	      password: ********
	  cloud:
	    gcp:
	      project-id: mtech-commonsvc-pricepromo-np
	      sql:
	        credentials:
	          location: file:/Users/b008967/Downloads/mtech-commonsvc-pricepromo-np-1e7831499554.json
	        database-name: upm-dev
	        instance-connection-name: mtech-commonsvc-pricepromo-np:us-central1:price-upm
	  jpa:
	    show-sql: true
	    properties:
	      hibernate:
	        dialect: org.hibernate.dialect.PostgreSQLDialect
	```