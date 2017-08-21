# simple-spring-boot-jwt-demo
<code>mvn spring-boot:run</code>

we can test this out by querying http://localhost:8080/users, and we should get a message saying "Access Denied." To authenticate ourselves, we will send a POST request to /login with our user's credentials in the body: {"username":"admin","password":"password"}.

In the response to this request, we will get a token as part of the Authorization header, prefixed by "Bearer". We can copy this token, with the Bearer prefix, to issue GET requests to our /users path.
