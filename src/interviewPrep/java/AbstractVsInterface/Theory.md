Abstract Class-

1) Abstract class can extend classes as well as implement Interfaces
2) In Abstract class , methods can or cannot be abstract
3) In Abstract class you can have final , static non static variables
4) You can use public,protected,private access modifier


Interface:

1) Interface can only extend interfaces , it cannot implement classes
2) In Interface all methods are abstract, and variables are public static final
3) In Interface , it can have only static final variable
4) Members are public by default

Why variables in interfaces are public static final ?
The final modifier ensures the value assigned to the interface variable is a true constant
that cannot be re-assigned. In other words, interfaces can declare only constants, not instance variables.

interfaces are meant to achieve 100% abstraction , therefore variable are final
no instantiation , so static
public because -> interfaces are way in which client access other objects


Why variable is static in interface?
Ok, Lets say we have to access variable of the interface , how can we access?
We will create a object of interface and access variable? - we cant
interfaces cant be instantiated , so instead we will make variable static and
it can be access via interface.variable

Why variable is final in interface?
final: to make them constants. If 2 classes implement the same interface
and you give both of them the right to change the value, conflict will occur
in the current value of the var, which is why only one time initialization is permitted.


When to use What ?

1) If you have same line of code that are to be shared by 2 or more classes
- Use Abstract class , define method here and let the class extend the abstract class

2)If you need access specifier other then public in sub class or want to define static non static variable
-Use Abstract class

3)If you dont care about the implementation and have diff implementation for each class
-Use Interface

4)If you want to bond a contract that all methods in sub class should be implemented
-Use interface

****  IMPORTANT  *****
Use abstract classes and inheritance if you can make the statement “A is a B”.
Use interfaces if you can make the statement “A is capable of [doing] as”

Why cannot we instantiate abstract class?
-- Simple answer: Because the owner/author of code dont want to, or else why do he mark it as abstract
Explanation: An abstract class is not complete!
The author marked it abstract to tell you that some implementation is missing in the code.
The author has done some of the work, but you must fill in some bits yourself to get it working.
The abstract keyword ensures that no one would accidentally initiate this incomplete class.

Example: Think of repairing a car.
Someone has removed the brake pads and is going to replace them in the next day.
Now, to prevent someone accidentally driving this car(which has no brakes installed),
the mechanic installs a lock on the steering wheel. It's a fail-safe measure.

Why memebers in interfaces cants be non-public?

Interfaces exist to allow people to access your class without knowing what the concrete implementation is.
It completely divorices the implementation from the data passing contract.

Therefore, everything in an interface must be public. Non-public members are only useful if
you have access to the implementation and therefore don't meaningfully contribute to an interface definition.


Final verdict:

1. Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. 
Abstract class and interface both can't be instantiated.

