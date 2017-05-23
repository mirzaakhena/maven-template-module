# template-module

This is simple module template for maven project

you can run it with maven (make sure you are under maven-template-module directory)

	mvn clean install
	cd experiment-hellomodule/
	mvn spring-boot:run

the open browser, we can access the hello message

	http://localhost:8080/hello?name=mirza

will produce

	{
		"message": "hello mirza. Sum of 2 + 3 = 5"
	}

and then the another child that have simple sum service

	http://localhost:8080/sum?a=2&b=5

produce

	{
		"a": 2,
		"b": 5,
		"sumAB": 7
	}

In this project i want to show you that we can access another service from another (bundle) module. 
In this case, we can access `CalculatorService` (in experiment-calculatormodule) from `HelloServiceImpl` (in experiment-hellomodule)