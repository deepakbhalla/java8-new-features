METHOD REFERENCE

- Method reference is a shorthand notation of a lambda expression to call a method. 
- For example:
  If your lambda expression is like this:

	str -> System.out.println(str)

  then you can replace it with a method reference like this:

	System.out::println

- The :: operator is used in method reference to separate the class or object from the method name

FOUR TYPES OF METHOD REFERENCES

  1. Method reference to an instance method of an object � object::instanceMethod
  2. Method reference to a static method of a class � Class::staticMethod
  3. Method reference to an instance method of an arbitrary object of a particular type � Class::instanceMethod
  4. Method reference to a constructor � Class::new