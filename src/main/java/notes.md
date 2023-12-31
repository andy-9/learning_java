# Java

## conventions
* Class names are capitalized (`MyClass`)
* method names are lowercase (`main()`)
* package names are lowercase and with dots or underscores (`com.example.myapp_1`). Dots indicate a hierarchy of packages (package `com` contains package example which contains package `myapp_1`).

## variables
* A literal is data that has been typed directly in the code (hardcoded, e.g. `String s = "Hello World!";`)
* int x = 10; (int is a primitive type)  
* Integer x = 10; (Integer is a class)  

## data types
### primitive types
* **byte**: `byte a = 10;` 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.
* **short**: `short b = 2000;` 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.
* **int**: `int c = 42;` 32-bit signed two's complement integer. It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive). For integral values, this data type is generally the default choice unless there is a reason (like the above) to choose something else. This data type will most likely be large enough for the numbers your program will use, but if you need a wider range of values, use long instead.
* **long**: `long d = 123456789123L;` 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int.
* **float**: `float e = 3.5f;` single-precision 32-bit IEEE 754 floating point. Use a float (instead of double) if you need to save memory in large arrays of floating point numbers. This data type should never be used for precise values, such as currency. For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.
* **double**: `double f = 3.5;` double-precision 64-bit IEEE 754 floating point. This data type is generally the default choice for decimal values. As mentioned above, this data type should never be used for precise values, such as currency.
* **boolean**: `boolean g = true;` the boolean data type has only two possible values: true and false. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.
* **char**: `char h = 'A'`, `char newLineChar = '\n';`, `char unicodeChar = '\u03A9'` (Greek capital letter omega), `char unicodeLiteral = 65` (= 'A') The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive). Important: single quotes!

### non-primitive types
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
    ```
* **ArrayList**: The ArrayList class extends AbstractList and implements the List interface. ArrayList supports dynamic arrays that can grow as needed.
    ```java
    ArrayList<String> al = new ArrayList<String>();
    al.add("A");
    al.add("B");
    al.add("C");
    al.add("D");
    al.add("E");
  
    ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));

    ```
* **HashMap**: A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String). One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values.
    ```java
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    ```

### type casting
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


## Methods
* `nextline()` reads the entire line of input, `next()` will read only the first word. `nextInt()` reads the next token as an int. `nextDouble()` reads the next token as a double.
