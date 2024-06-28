# Stack

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
