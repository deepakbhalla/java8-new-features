JAVA FUNCTIONAL INTERFACE

A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. 
From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface 
can have any number of default methods.

JAVA LAMDA EXPRESSIONS

- Lambda expression is a new feature which is introduced in Java 8
- A lambda expression is an anonymous function. 
- A function that doesn’t have a name and doesn’t belong to any class. 
- Lambda expressions can be used to represent the instance of a functional interface-

SYNTAX

- To create a lambda expression, we specify input parameters (if there are any) on the left side of the lambda operator ->, 
  and place the expression or block of statements on the right side of lambda operator. 
- For example, the lambda expression (x, y) -> x + y specifies that lambda expression takes two arguments x and y and 
  returns the sum of these.

  //Syntax of lambda expression
  (parameter_list) -> {function_body}
  
Java lambda expression is consisted of three components.

1) Parameter-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.  

No Parameter Syntax

	() -> {  
	//Body of no parameter lambda  
	}

One Parameter Syntax

	(p1) -> {  
	//Body of single parameter lambda  
	}

Two Parameter Syntax

	(p1,p2) -> {  
	//Body of multiple parameter lambda  
	}

LAMDA EXPRESSION Vs METHOD IN JAVA

- A method (or function) in Java has these main parts:
	1. Name
	2. Parameter list
	3. Body
	4. return type.

- Lambda expression only has body and parameter list.
	1. No name – function is anonymous so we don’t care about the name
	2. Parameter list
	3. Body – This is the main part of the function.
	4. No return type – The java 8 compiler is able to infer the return type by checking the code. you need not to mention it explicitly.
