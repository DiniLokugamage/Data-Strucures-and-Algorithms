# Stack implementation

This is a simple implementation of a stack data structure in Java.

## Usage

To use the `Stack` class, follow these steps:

1. Create an instance of the `Stack` class:
    ```java
    Stack st1 = new Stack();
    ```

2. Push elements onto the stack using the `push` method:
    ```java
    st1.push(10);
    st1.push(20);
    st1.push(30);
    ```

3. Retrieve the top element of the stack using the `getTop` method:
    ```java
    st1.getTop(); // Output: 30
    ```

4. Pop elements from the stack using the `pop` method:
    ```java
    st1.pop();
    ```

5. Retrieve the new top element of the stack:
    ```java
    st1.getTop(); // Output: 20
    ```

## Customizing the Stack

You can create a stack of a specific size by providing the desired size as a parameter when creating an instance of the `Stack` class:
```java
Stack st1 = new Stack(10);
```

## Error Handling

The `Stack` class provides error handling for the following scenarios:

- If the stack is full and you try to push an element, it will display the message "Stack is full."
- If the stack is empty and you try to pop an element, it will display the message "Stack is empty."
- If you try to retrieve the top element of an empty stack, it will display the message "Stack is empty."


######

# Prefix to Infix Converter

This Java program converts a prefix expression into its corresponding infix expression. The class `PrefixToInfixConverter` reads the prefix expression from right to left and uses a stack to manage operands and operators.

## Features

- Converts a given prefix expression into an infix expression.
- Handles invalid prefix expressions and returns an appropriate error message.


## Example

Given the prefix expression `+*AB/CD`, the program will output the infix expression `((A*B)+(C/D))`.

## How It Works

1. **Operator Check**: The program checks each character to see if it's an operator (e.g., `+`, `-`, `*`, `/`, `^`, `%`).
2. **Stack Operations**: If it's an operator, it pops two operands from the stack, creates a new infix string, and pushes it back onto the stack. If it's an operand, it gets pushed onto the stack as-is.
3. **Validation**: The program checks for potential stack underflow during the process and validates that only one element remains in the stack after processing, which should be the final infix expression.

## Usage

To run the program, compile and execute the `PrefixToInfixConverter` class.

```java
String exp = "+*AB/CD";  
System.out.println("Infix : " + convert(exp));

