# Java

## Conventions

- Class names are capitalized (`MyClass`)
- method names are lowercase (`main()`)
- package names are lowercase and with dots or underscores (`com.example.myapp_1`). Dots indicate a hierarchy of packages (package `com` contains package example which contains package `myapp_1`).

## Variables

- A literal is data that has been typed directly in the code (hardcoded, e.g. `String s = "Hello World!";`)
- int x = 10; (int is a primitive type)
- Integer x = 10; (Integer is a class)

## Data types

### Primitive types

- Variables of primitive types contain their value directly, i.e. primitive data types store the values assigned to them in the corresponding memory locations. 
- **byte**: `byte a = 10;` 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.
- **short**: `short b = 2000;` 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.
- **int**: `int c = 42;` 32-bit signed two's complement integer. It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive). For integral values, this data type is generally the default choice unless there is a reason (like the above) to choose something else. This data type will most likely be large enough for the numbers your program will use, but if you need a wider range of values, use long instead.
- **long**: `long d = 123456789123L;` 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int.
- **float**: `float e = 3.5f;` single-precision 32-bit IEEE 754 floating point. Use a float (instead of double) if you need to save memory in large arrays of floating point numbers. This data type should never be used for precise values, such as currency. For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.
- **double**: `double f = 3.5;` double-precision 64-bit IEEE 754 floating point. This data type is generally the default choice for decimal values. As mentioned above, this data type should never be used for precise values, such as currency.
- **boolean**: `boolean g = true;` the boolean data type has only two possible values: true and false. It starts with false as default! Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.
- **char**: `char h = 'A'`, `char newLineChar = '\n'`; `char backspace = '\b'`, `char unicodeChar = '\u03A9'` (Greek capital letter omega), `char unicodeLiteral = 65` (= 'A') The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive). Important: single quotes!

### Non-primitive/reference types

- Variables of reference types contain references (addresses) to the memory location where the corresponding data is stored. They do not store the values directly.
- **String**: Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. Because String objects are immutable they can be shared. For example:
  ```java
  String str = "abc";
  ```
- **Array**: An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.

  ```java
  int[] anArray;          // declares an array of integers
  anArray = new int[10];  // allocates memory for 10 integers
  anArray[0] = 100; // initialize first element
  anArray[1] = 200; // initialize second element
  anArray[2] = 300; // etc.

  int[] exArray = { 100, 200, 300 };
  System.out.println(exArray[1]); // 200

  length is a property of arrays (exArray.length).
  ```

- **ArrayList**: The ArrayList class extends AbstractList and implements the List interface. ArrayList supports dynamic arrays that can grow as needed. Only values of a single type are possible. Always prefer ArrayLists over Arrays.

  ```java
  ArrayList<String> al = new ArrayList<String>();
  al.add("A");
  al.add("B");
  al.add("C");
  al.add("D");
  al.add("E");

  ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));

  ```

  Length of array: `al.size();`  
  Remove an item with `al.remove(index)` or `al.remove(item)`.  
  Get index: `al.indexOf(item);`  
  Contains: `al.contains(item);`  
  Get: `al.get(index);`  
  Overwrite: `al.set(index, item);`  
  Remove everything in list: `al.clear();`

- **Multidimensional Arrays**: A multidimensional array is an array containing one or more arrays. To create a two-dimensional array, add each array within its own set of curly braces.
  ```java
  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
  int x = myNumbers[1][2]; // 7
  ```
- **HashMap**: A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String). One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values.
  ```java
  HashMap<String, String> capitalCities = new HashMap<String, String>();
  capitalCities.put("England", "London");
  capitalCities.put("Germany", "Berlin");
  capitalCities.put("Norway", "Oslo");
  capitalCities.put("USA", "Washington DC");
  ```
- **Enum**: define fixed set of values. Separated by commas and written in capital letters by convention because they are constants. Benefit: restricts the values to only those values that have been defined.

### Type casting/conversion

- You can only cast up and down, not across types.
- **implicit type casting**: byte -> short -> int -> long -> float -> double
- **explicit type casting**: double -> float -> long -> int -> short -> byte
- ```java
    double d = 100.04; (100.04)
    long l = (long) d; (100)
    int i = (int) l; (100)
  ```
- ```java
    int num1 = 10;
    int num2 = 3;
    double division = (double) num1 / num2; (3.3333333333333333)
  ```
- `Integer.parseInt("123")` converts a String to an int.
  - `Integer.toString(123)` converts an int to a String.  
    `String.valueOf(123)` converts an int to a String.
- If you have an interface used by different classes, and you have e.g. one method in only one class, you can check for that class and do a type conversion to be able to use this method.
  ```java
  static void displayShape(Shape shape) {
    if (shape instanceof Square) {
      Square square = (Square) shape;
        System.out.println("Shape type: " + square.getShapeType());
      }
  }
  ```

### Get type

```java
obj.getClass().getName()
```

## Conditions

- `switch`-statements can be used with `byte`, `short`, `char`, `int`, `String` and `enum` values. `break` is used to stop execution of more code and `default` is used to specify some code to run if there is no case match. `case` is used to specify some code to run if there is a match. `switch`-statements can be nested. Example:
  ```java
  int day = 4;
  switch (day) {
    case 1:
      System.out.println("Monday");
      break;
    case 2:
      System.out.println("Tuesday");
      break;
    case 3:
      System.out.println("Wednesday");
      break;
    case 4:
      System.out.println("Thursday");
      break;
    case 5:
      System.out.println("Friday");
      break;
    case 6:
      System.out.println("Saturday");
      break;
    case 7:
      System.out.println("Sunday");
      break;
    default:
      System.out.println("Looking forward to the Weekend");
  }
  ```

## Variables

- **Static Variables**  
  Static variables are associated with the class itself rather than with any instance of the class. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. They are shared among all instances (objects) of the class. They are accessed using the class name, not through an object reference. They are initialized only once when the class is loaded into memory.  
  Example:
  ```java
  public class Counter {
    public static int COUNT=0;  // The COUNT variable will be shared by all objects of the class
    COUNTER() {
      COUNT++;
    }
  }
  ```
- **Non-Static (Instance) Variables**  
  Non-static variables belong to a specific instance (object) of the class. Each instance of the class has its own copy of the non-static variables. They are accessed using object references. They are initialized when an instance of the class is created using the `new` keyword.
- Whether a variable should be static or non-static depends on the intended use and the design of your program. Global variables in Java are typically instance variables, and they are often not declared as static. They belong to an instance of the class and are used to maintain the state of individual objects.  
  However, if you have a variable that needs to be shared among all instances of a class or accessed without instantiating an object of the class, you might consider declaring it as static.

## Methods

- `public static void main(String [] args)`
  `public` = accessibility  
  `static` =
  `void` = return type. Can also be e.g. `int`.  
  `main` = name of function

## Random methods

- `nextLine()` reads the entire line of input, `next()` will read only the first word. `nextInt()` reads the next token as an int. `nextDouble()` reads the next token as a double, `nextBoolean` reads the next token as a boolean.
- Get random number: `ThreadLocalRandom.current().nextInt(<begin>, <end+1>);`

### Print

- `Arrays.toString(<array>)` prints the values of the array. Import `java.utils.Arrays;` at top of file!
- `print` does not append a newline character at the end of the string, `println` does. `printf` is used for formatting output.

### Format

- `format` is used for formatting output: `System.out.format("I have %d cats", 7);`. `%d` is a placeholder for a decimal number. `%s` is a placeholder for a string. `%f` is a placeholder for a floating-point number. `%n` is a platform-independent newline character. `%.2f` is a placeholder for a floating-point number with 2 decimal places. `%.0f`rounds it to an int.

### Comparing

- Comparing strings is done with `equals()`, not with `==` (`"yes".equals(stringVariable).
- `==` compares the references, not the values.
- `equalsIgnoreCase()` ignores case differences.
- `compareTo()` compares two strings lexicographically; the comparison is based on the Unicode value of each character in the strings.

### Working with Strings

- `StringUtils.isEmpty` checks for null and empty String.
- `StringUtils.isBlank` checks for null, empty String and whitespace in String.

## Math

- Absolut value: `Math.abs()`

## Loops

- `for` loop:
  ```java
  for (int i = 0; i < 10; i++) {
    <doSomething>
  }
  ```
  can also be written as an enhanced for loop (foreach loop):
  ```java
  for (int i : intArray) {
    <doSomething>;
  }
  ```
  or:
  ```java
  java.util.Arrays.stream(intArray).forEach(System.out::println);
  ```
- `while` loop:
  ```java
  while (<condition>) {
    <doSomething>
    <change condition>
  }
  ```
  Condition is checked first.
- `break`: stops loop
  ```java
  for (int i = 0; i < 10; i++) {
    <doSomething>
    if (i == 4) {
      break;
    }
  }
  ```
- `continue`: continues loop but omits if-condition
  ```java
  for (int i = 0; i < 10; i++) {
    <doSomething>
    if (i == 4) {
      continue;
    }
  }
  ```
- `do-while` loop:
  ```java
  int i = 0;
  do {
    i++;
  } while (i < 5);
  ```
  Condition is checked last --> will run at least once.
- `for-each` loop:

  ```java
  double[] arr = new double[] { 25.92, 1.14, -75.3, 833.11 };
  for (double  : arr) {
    System.out.println(i);
  }
  ```

  ```java
    int[] numbers = {3, 7, 5, 2, 4};
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    System.out.println("Sum = " + sum);
  ```

  for-each loops are used to iterate over elements of an array/collection. They are faster than the for loop and enhance the readability of the code. There are two types of for-each loop in Java: one for Java arrays and one for Java collections. The syntax of the for-each loop is: `for (type variableName : arrayName/collectionName) { <doSomething> }`

- Loop over 2-dimensional array:
  ```java
  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
  for (int i = 0; i < myNumbers.length; i++) {
    for (int j = 0; j < myNumbers[i].length; j++) {
      System.out.println(myNumbers[i][j]);
    }
  }
  ```

## OOP

- Objects have state and behavior.  
  State means data / the possibility to collect attributes.
- Other definition: Each object has 3 dimensions: identity, attributes and behavior. Attributes describe the object's current state, and what the object is capable of doing is demonstrated through the object's behavior.
- Objects are created from classes. It's possible to create as many objects as needed.
- A class serves as a blueprint for creating objects.
- Classes are written in Pascal case.
- You can instantiate variables and define methods in a class.  
  --> instance variables / fields

  ```java
  public class Main {
    public static void main(String[] args) {
        Door dd = new Door();
        dd.name = "Driver";
        dd.open();
        dd.printStatus();

        Door pd = new Door();
        pd.name = "Passenger";
        pd.printStatus();
    }

  }

  public class Door {
    String name;
    boolean isOpen;

    void open() {
        isOpen = true;
    }

    void close() {
        isOpen = false;
    }

    void printStatus() {
        if (isOpen) {
            System.out.println(name + " door is open.");
        } else {
            System.out.println(name + " door is closed.");
        }
    }
  }
  ```

### Encapsulation

- Idea: Encapsulate code inside classes.
- Encapsulate the functionality for every device in their own class.
- Possible to restrict access to certain parts  
  --> then these parts are more encapsulated than the rest.  
  --> make e.g. variables private: `private int height`  
  --> can't be accessed by another class  
  --> object is in control of its own fields
- Setter or mutator methods call (from another class) a method inside a class and pass it a value.
  Then this method makes the necessary changes to the fields. Method name begins with `set`.
  ```java
  public void setHeight(int h) {
    if (h > 0)
      height = h;
  }
  ```
- Getter or accessor methods. Method name begins with `get`.
  ```java
  public int getHeight() {
    return height;
  }
  ```
- The best way to interact with an object is through its methods, not its variables! Mark all variables as private!
- Methods _can_ be private as well.
- If it is not supposed to be `private`, it can be set to `public`.
- If something isn't specified, it has default accessibility known as `package private`  
  --> accessible from anywhere in the same package.

### Constructors

- A constructor is a method that runs when you create a new object.
- Constructors are used to initialize objects.
- They are not methods, but look and work almost exactly like them.
- 2 defining features:
  - Constructors must have the same name as the class.
  - Constructors do not have a return type
- Constructors run automatically when an object is created.

```java
    public Rectangle(int h, int w) {
      setHeight(h);
      setWidth(w);
    }
```

- Can be created automatically with right-click on "Generate".

  ```java
  public class Book {
    private String isbn;
    private String title;

    public Book(final String isbn, final String title) {
        this.isbn = isbn;
        this.title = title;
    }
  }
  ```

### Composition

- 'has a'-relationship (car has wheels)
- `this` refers to the object itself

  ```java
  public class Employee {
    private String name;
    private String dateOfBirth;
    private boolean hasHousing;

    public void setName(String name) {
      this.name = name;
    }
  }
  ```

  `this.name` refers to `name` in the class (line 2).

- Getters and Setters. Can be generated with one right-click ("Generate").
- One class can get and set another one:

  ```java
  public class Student {
    private Payroll payroll;

    public void setPayroll(Payroll payroll) {
        this.payroll = payroll;
    }

    public Payroll getPayroll() {
        return payroll;
    }
  }
  ```

  ```java
  public class Payroll {
    private String hierarchyLevel;
    private int income;

    public int getYearsInCompany() {
        return yearsInCompany;
    }

    public void setYearsInCompany(final int yearsInCompany) {
        this.yearsInCompany = yearsInCompany;
    }
    ...
  ```

  ```java
  public class Main {

    public static void main(String[] args) {
      Employee emp = new Employee();
      emp.setName("Jeff");
      emp.setAge(32);
      emp.setJob(true);

      emp.setPayroll(new Payroll());
      Payroll p = emp.getPayroll();
      p.setHierarchyLevel("Senior");
      p.setIncome(40000);
      p.setYearsInCompany(3);
    }
  }
  ```

### Inheritance

- Inheritance: If a class inherits all the variables and methods from another class.

  ```java Class A
  package p2;

  public class A {
    public int v1 = 5;
    protected int v2 = 10;
    int v3 = 15;
    private int v4 = 20;
  }
  ```

  ```java Class B
  package p3;

  import p2.A;

  public class B extends A {
    public int v5 = 100;
    public int v6 = 101;

    public void someMethod() {
      v1 = 50;
      v2 = 40;
      v3 = 70;
    }
  }
  ```

  ```java Class Main
  package p1;

  import p3.B;

  public class Main {
    public static void main(String[] args) {
      B b = new B();
      b.v1 = 55;
      b.v2 = 65;
      b.v3 = 75;
    }
  }
  ```

- The inheriting class is the `subclass` (B), the child; the class inherited from the `superclass` (A), the parent.
- Inheritance only works with `public`, not with `private`.  
  `private` is the most restrictive access level. `private` members can only be accessed through their own class.  
  `protected` members are inherited and accessible by the subclass, but not by Main() or any other outside classes.  
  If there is no modifier at all, you have `package-private` access: only classes within the same package can access or inherit.
- When extending a class, you have to call the constructor of that class. You have to do this with `super()`:
  ```java
  public class CheckingAccount extends Account {
    public CheckingAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }
  }
  ```
  But: this can be avoided, if in the superclass there is a constructor with no arguments: `    public Account() {}`. This means that we have two constructors in the parent class. If there is no constructor at all in the parent class, a constructor with no arguments is created by default.
- **Method overriding**: A subclass overrides a method from its superclass (= different implementation for an inherited method). For a method to override another one it must have the same name, same parameters and same return type as the superclass method. You can call the method with `super.<methodName>(<args>)`. You can also annotate it with `@Override` on top of the methode name.

### Polymorphism

- Polymorphism means "many forms" --> an object can take the form of one of its supertypes.  
  `Account account1 = new CheckingAccount(500, 0.025, 1000)`
- Java treats objects based on the variables type, not the objects type. Taking the example above: It has all the methods and variables from `CheckingAccount`, not from `Account`.
- Concept of Dynamic Dispatch: A call to a method will be directed to the underlying object method. In the aforementioned case this would `CheckingAccount`.
- --> It's the variable type that determines what methods can be called, but it's the object type that determines what version of the method is called. If a class overwrites a method, Java will call that one instead of the base one.
- We can store a bunch of different objects in a single collection. E.g.:

  ```java
  import java.util.ArrayList;
  import accounts.SilverCheckingAccount;

  ArrayList<Account> accounts = new ArrayList<>();
  accounts.add(new SilverCheckingAccount(450, 0.015, 957));
  accounts.add(new DiamondCheckingAccount(3200, 0.053, 19504));
  accounts.add(new SavingsAccount(7241, 0.044));
  accounts.add(new GoldCheckingAccount(5527, 0.038, 4823));
  accounts.add(new CheckingAccount(838, 0.026, 7339));
  accounts.add(new SavingsAccount(992, 0.040));
  accounts.add(new Account(340, 0.019));

  for (Account account : accounts) {
      account.status();
      System.out.println();
  }
  ```

### Abstract class

- Class that cannot be instantiated --> no object creation possible. Its main purpose ist to be extended.
  ```java
  public abstract class Account {
   ...
  }
  ```
  Cannot be instantiated with `new Account()`
- An abstract class can also contain abstract methods. Those methods do not have a body, e.g. `abstract void move()`. Because of this, subclasses are forced to override it because they need to provide the body themselves. Abstract methods can only exist in abstract classes.
- If a class extends an abstract class, it must implement any and all of the abstract methods of the abstract class.

### Interface

- Create interface by creating a new file, but not clicking `Class`, but `Interface`. Shows green in IntelliJ.
  ```java
  public class Baz {
    void m1();  // modifier "abstract" not necessary
    boolean m2();
    String m3(int pos, String tag);
  }
  ```
- Like abstract classes, interfaces cannot be instantiated.
- Interfaces typically contain only abstract methods. And they are `public` by default.
- Interfaces are designed to be implemented (not extended!) by classes.

  ```java
  public class Foo implements Baz {
    public void m1() {
    }

    @Override
    public boolean m2() {
      return false;
    }

    @Override
    public String m3(int pos, String tag) {
      return null;
    }
  }
  ```

  The class is required to implement the methods of the interface (= override). Can be easily done with one click.

- An interface and an abstract class can achieve the same thing. The difference is that abstract classes can still contain complex state and behavior utilizing instance variables (e.g. `public int x = 5;`) and non-abstract methods (e.g. `public void m4() {System.out.println();}`). Interfaces are designed for abstract methods only. They can contain static variables, but not instance variables.
- Why use interfaces? Java only allows single inheritance: a class can only extend one other class. But a class can implement multiple interfaces. A class can extend another class und implement several interfaces all at the same time. E.g. `public class Foo extends Bar implements Baz, Buzz, Fuzz {}`


## Difference Abstract Class, Interface and Mixin

### Abstract class
An abstract class is a class that is not designed to be instantiated. Abstract classes can have no implementation, some implementation, or  all implementation. Abstract classes are designed to allow its  subclasses share a common (default) implementation. A (pseudocoded)  example of an abstract class would be something like this

```
abstract class Shape {
    def abstract area();  // abstract (unimplemented method)
    def outline_width() = { return 1; }  // default implementation
}
```

A subclass might look like

```
class Rectangle extends Shape {
    int height = width = 5;
    def override area() = { return height * width; }  // implements abstract method
    // no need to override outline_width(), but may do so if needed
}
```

Possible usage

```
def main() = {
    Shape[] shapes = { new Rectangle(), new Oval() };
    foreach (s in shapes) {
        print("area: " + s.area() + ", outline width: " + s.outline_width());
    }
}
```

If a subclass does not override unimplemented methods, it is also an abstract class.

### Interface

In general computer science terms, an interface is the parts of a  program exposed to a client. Public classes and members are examples of  interfaces.

Java and C# have a special `interface` keyword. These are  more or less an abstract class with no implementation. (There's  trickiness about constants, nested classes, explicit implementation, and access modifiers that I'm not going to get into.) Though the part about "no implementation" doesn't fit any more in Java, they added default  methods. The `interface` keyword can be seen as a reification of the interface concept.

Going back to the Shape example

```
interface Shape {
    def area();  // implicitly abstract so no need for abstract keyword
    def outline_width();  // cannot implement any methods
}

class Rectangle implements Shape {
    int height = width = 5;
    def override area() = { return height * width; }
    def override outline_width() = { return 1; }  // every method in interface must be implemented
}

def main() = {
    Shape[] shapes = { new Rectangle(), new Oval() };
    foreach (s in shapes) {
        print("area: " + s.area() + ", outline width: " + s.outline_width());
    }
}
```

Java and C# do not allow multiple inheritance of classes with  implementation, but they do allow multiple interface implementation. Java and C# use interfaces as a workaround to the [Deadly Diamond of Death Problem](http://en.wikipedia.org/wiki/Diamond_problem#The_diamond_problem) found in languages that allow multiple inheritance (which isn't really that deadly, if properly handled).

### Mixin

A mixin (sometimes called a trait) allows multiple inheritance of  abstract classes. Mixins don't have the scary association that multiple inheritance has (due to C++ craziness), so people are more comfortable  using them. They have the same exact Deadly Diamond of Death Problem,  but languages that support them have more elegant ways of mitigating it  than C++ has, so they're perceived as better.

Mixins are hailed as interfaces with [behavioral reuse](http://www.ibm.com/developerworks/java/library/j-scala04298/index.html#N101E3), [more flexible](http://www.levinotik.com/2012/09/14/scala-abstract-classes-traits-and-self-types/) interfaces, and [more powerful](http://lalitpant.blogspot.com/2008/07/traits-in-scala-powerful-design-tool.html) interfaces. You will notice all these have the term `interface` in them, referring to the Java and C# keyword. **Mixins are not interfaces.** They are multiple inheritance. With a prettier name.

*This is not to say that mixins are bad. Multiple inheritance  isn't bad. The way C++ resolves multiple inheritance is what everyone  gets all worked up about.*

On to the tired, old Shape example

```
mixin Shape {
    def abstract area();
    def outline_width() = { return 1; }
}

class Rectangle with Shape {
    int height = width = 5;
    def override area() = { return height * width; }
}

def main() = {
    Shape[] shapes = { new Rectangle(), new Oval() };
    foreach (s in shapes) {
        print("area: " + s.area() + ", outline width: " + s.outline_width());
    }
}
```

You will notice there is no difference between this and the abstract class example.

To be clear: Mixin\Traits are ways of extending functionality of a class (e.g add methods) without  using inheritance. The answer suggest they are the same thing, but  there are some important differences. 1. Mixins may be stateful, traits are stateless 2. Mixins use implicit conflict resolution, traits use  explicit conflict resolution (more  [stackoverflow.com/questions/925609/mixins-vs-traits](http://stackoverflow.com/questions/925609/mixins-vs-traits))