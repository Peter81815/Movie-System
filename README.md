# Movie-System
Application to browse movies and add new movies to DB(MySQL) by using MVC.
Mapped all the controllers using SimpleUrlHandlerMapping, ControllerClassNameHandlerMapping and
BeanNameUrlHandlerMapping method

Using SimpleFormController and Hibernate. Searching Movies to be done by Movie ID as the Hibernate Session objects’s get method requires Serializable ID (which is basically the PK in the DB, but SerializableID in Java). Use a Spring Validator to validate the fields. Create the SessionFactory from the Configuration instance.
