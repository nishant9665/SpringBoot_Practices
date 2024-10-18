# How to Create SpringBoot Project ?
Steps to create 'Spring Boot'with Spring data JPA program:
1.Create Spring starter project.
2.Provide dependencies.
Spring-boot-starter-data-jpa
 mysql-connection-j
3.Create an entity class (Student.java)
4.Create custom repository interface(StudentRepository.java)
5.Create service interface(Student.java) and it's implemented class(StudentServiceImpl.java)
6.Create main class and execute the program

--------------------------
How to use CRUD operation in SpringBootFramework
Insert (Create) operation:
save(s entity)
saveAll(Iterable<s>entities)
   
Update Operation:
Save(s entity)
  
Delete Operation
delete(s entity)
deleteAll(Iterable<? extends S>entities)
deleteAll()
deleteById(Id id)
  
Read operation:
findById(Id id)
findAllById(Iterable<ID> ids )
count()
existsById(Id id)

   
   
Operation	SQL	   HTTP verbs	  RESTful Web Service
Create	  INSERT	PUT/POST	   POST
Read	  SELECT	GET	           GET
Update	  UPDATE	PUT/POST/PATCH PUT
Delete	  DELETE	DELETE	       DELETE

  

