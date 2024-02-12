# Java

## Conventions
* Class names are capitalized (`MyClass`)
* method names are lowercase (`main()`)
* package names are lowercase and with dots or underscores (`com.example.myapp_1`). Dots indicate a hierarchy of packages (package `com` contains package example which contains package `myapp_1`).

## Variables
* A literal is data that has been typed directly in the code (hardcoded, e.g. `String s = "Hello World!";`)
* int x = 10; (int is a primitive type)  
* Integer x = 10; (Integer is a class)  

## Data types
### Primitive types
* Variables of primitive types contain their value directly.
* **byte**: `byte a = 10;` 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.
* **short**: `short b = 2000;` 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.
* **int**: `int c = 42;` 32-bit signed two's complement integer. It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive). For integral values, this data type is generally the default choice unless there is a reason (like the above) to choose something else. This data type will most likely be large enough for the numbers your program will use, but if you need a wider range of values, use long instead.
* **long**: `long d = 123456789123L;` 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int.
* **float**: `float e = 3.5f;` single-precision 32-bit IEEE 754 floating point. Use a float (instead of double) if you need to save memory in large arrays of floating point numbers. This data type should never be used for precise values, such as currency. For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.
* **double**: `double f = 3.5;` double-precision 64-bit IEEE 754 floating point. This data type is generally the default choice for decimal values. As mentioned above, this data type should never be used for precise values, such as currency.
* **boolean**: `boolean g = true;` the boolean data type has only two possible values: true and false. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.
* **char**: `char h = 'A'`, `char newLineChar = '\n'`; `char backspace = '\b'`, `char unicodeChar = '\u03A9'` (Greek capital letter omega), `char unicodeLiteral = 65` (= 'A') The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive). Important: single quotes!

### Non-primitive/reference types
* Variables of reference types contain references (and not the values directly).
* **String**: Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. Because String objects are immutable they can be shared. For example:
    ```java
    String str = "abc";
    ```
* **Array**: An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.
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
* **ArrayList**: The ArrayList class extends AbstractList and implements the List interface. ArrayList supports dynamic arrays that can grow as needed. Only values of a single type are possible.
    ```java
    ArrayList<String> al = new ArrayList<String>();
    al.add("A");
    al.add("B");
    al.add("C");
    al.add("D");
    al.add("E");
  
    ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
  
  size() is a method provided by collections in Java (myArrayList.size()).
    ```
* **HashMap**: A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String). One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values.
    ```java
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    ```

### Type casting
* **implicit type casting**: byte -> short -> int -> long -> float -> double
* **explicit type casting**: double -> float -> long -> int -> short -> byte
* ```java
    double d = 100.04; (100.04)
    long l = (long) d; (100)
    int i = (int) l; (100)
  ```
* ```java
    int num1 = 10;
    int num2 = 3;
    double division = (double) num1 / num2; (3.3333333333333333)
  ```
* **type casting with wrapper classes**: `Integer.parseInt("123")` converts a String to an int, `Integer.toString(123)` converts an int to a String


## Conditions
* `switch`-statements can be used with `byte`, `short`, `char`, `int`, `String` and `enum` values. `break` is used to stop execution of more code and `default` is used to specify some code to run if there is no case match. `case` is used to specify some code to run if there is a match. `switch`-statements can be nested. Example: 
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
* **Static Variables**  
  Static variables are associated with the class itself rather than with any instance of the class. They are shared among all instances (objects) of the class. They are accessed using the class name, not through an object reference. They are initialized only once when the class is loaded into memory.
* **Non-Static (Instance) Variables**  
  Non-static variables belong to a specific instance (object) of the class. Each instance of the class has its own copy of the non-static variables. They are accessed using object references. They are initialized when an instance of the class is created using the `new` keyword.
* Whether a variable should be static or non-static depends on the intended use and the design of your program. Global variables in Java are typically instance variables, and they are often not declared as static. They belong to an instance of the class and are used to maintain the state of individual objects.  
However, if you have a variable that needs to be shared among all instances of a class or accessed without instantiating an object of the class, you might consider declaring it as static.


## Methods
* `public static void main(String [] args)`  
  `void` = return type. Can also be e.g. `int`.


## Random methods
* `nextLine()` reads the entire line of input, `next()` will read only the first word. `nextInt()` reads the next token as an int. `nextDouble()` reads the next token as a double, `nextBoolean` reads the next token as a boolean.
* `print` does not append a newline character at the end of the string, `println` does. `printf` is used for formatting output.
* `format` is used for formatting output: `System.out.format("I have %d cats", 7);`. `%d` is a placeholder for a decimal number. `%s` is a placeholder for a string. `%f` is a placeholder for a floating-point number. `%n` is a platform-independent newline character. `%.2f` is a placeholder for a floating-point number with 2 decimal places. `%.0f`rounds it to an int.
* Comparing strings is done with `equals()`, not with `==` (`stringVariable.equals("yes")`). `==` compares the references, not the values. `equalsIgnoreCase()` ignores case differences. `compareTo()` compares two strings lexicographically; the comparison is based on the Unicode value of each character in the strings.
* Get random number: `ThreadLocalRandom.current().nextInt(<begin>, <end+1>);`
* `Arrays.toString(<array>)` prints the values of the array. Import `java.utils.Arrays;` at top of file!

## Math
* Absolut value: `Math.abs()`

## Loops
* `for` loop:
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
* `while` loop:
  ```java
  while (<condition>) {
    <doSomething>
    <change condition>
  }
  ```
  Condition is checked first.
* `break`: stops loop
  ```java
  for (int i = 0; i < 10; i++) {
    <doSomething>
    if (i == 4) {
      break;
    }
  }
  ```
* `continue`: continues loop but omits if-condition
  ```java
  for (int i = 0; i < 10; i++) {
    <doSomething>
    if (i == 4) {
      continue;
    }
  }
  ```
* `do-while` loop:
  ```java
  int i = 0;
  do {
    i++;
  } while (i < 5);
  ```
  Condition is checked last --> will run at least once.
* `for-each` loop:
  ```java
  double[] arr = new double[] { 25.92, 1.14, -75.3, 833.11 };
  for (double  : arr) {
    System.out.println(i);
  }
  ```
  for-each loops are used to iterate over elements of an array/collection. They are faster than the for loop and enhance the readability of the code. There are two types of for-each loop in Java: one for Java arrays and one for Java collections. The syntax of the for-each loop is: `for (type variableName : arrayName/collectionName) { <doSomething> }`  