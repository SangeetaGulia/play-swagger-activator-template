# Swagger Integration with Play Framework

This is an activator template that is designed to see how swagger can be integrated with play-framework using play-swagger. This template will include demonstration of the most common use-cases while using swagger with any API which are as follows :

1. Hiding an end point using swagger-ui.

2. Specify parameters in query-string

3. Specify parameters in path(url)

4. Specify parameters as FormUrlEncodedBody

To get the conceptual knowledge on every use-case, or how routes of a play-framework application interacts to create the swagger UI, you can read @ [Introduction to Play-Swagger](https://blog.knoldus.com/2016/11/03/introduction-to-swagger/)

## Clone Project
```
git clone git@github.com:SangeetaGulia/play-swagger-activator-template.git
cd play-swagger-activator-template
activator clean compile
```

## Run Project
To run the project use the below command which will start your play application at port 9000.
```
activator run
```

##### To Render swagger-ui for your API routes

Open the below url in your browser to see the swagger-ui generated:
```
http://localhost:9000/docs/index.html?url=/swagger.json#/
```
Swagger-ui is generated based on the swagger-spec (swagger.json in this template). ApiSpecs is responsible for auto-generating the swagger-spec based on the definitions and rules provided in routes file for each route.

##### Note:
1) "/swagger.json" is the route which is responsible to generate swagger spec from the route file based on the rules specified for each route.

2) "/docs/*file" is the route responsible for rendering the swagger-ui.

For any issue please raise a ticket @ [Github Issue](https://github.com/SangeetaGulia/play-swagger-activator-template/issues)