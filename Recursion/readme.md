
## Recursion

The `Recursion` folder contains implementations of recursive algorithms, including the Tower of Hanoi puzzle and the Fibonacci sequence.

### Tower of Hanoi

The Tower of Hanoi is a mathematical puzzle that involves moving a stack of disks from one peg to another, following certain rules. The `hanoi` function in the code demonstrates how to solve the Tower of Hanoi puzzle recursively. It takes the number of disks, source peg, destination peg, and auxiliary peg as parameters.

```python
step_count = 1

def hanoi(n, src, des, aux):
    global step_count
    if n == 1:
        print(f"Step {step_count} {src} -> {des}")
        step_count += 1	
    else:
        hanoi(n-1, src, aux, des)
        hanoi(1, src, des, aux)
        hanoi(n-1, aux, des, src)

hanoi(5, 'A', 'C', 'B')
```

The `hanoiCount` function calculates the minimum number of moves required to solve the Tower of Hanoi puzzle with `n` disks. It uses a recursive approach and returns the count.

```python
def hanoiCount(n):
    if n == 1:
        return 1
    else:
        return 2 * hanoiCount(n-1) + 1

print(hanoiCount(5))
```

### Fibonacci Sequence

The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones. The `fibonacci` function in the code calculates the Fibonacci number at position `t` using recursion.

```python
def fibonacci(t):
    if t == 0 or t == 1:
        return 1
    else:
        return fibonacci(t-1) + fibonacci(t-2)

num = str(fibonacci(36))
formatted_num = "{:,}".format(int(num))
print(formatted_num)
```

Feel free to explore the code and modify it according to your needs.
