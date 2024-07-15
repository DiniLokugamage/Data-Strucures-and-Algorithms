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

def hanoiCount(n):
    global count
    if n == 1:
        return 1
    else:
        return 2 * hanoiCount(n-1) + 1

# def hanoiCount(n):
#     return 1 if n == 1 else 2 * hanoiCount(n-1) + 1

def hanoiPuzzlef(n):
    print(f"This is the Hanio {hanoi(n, 'A', 'C', 'B')} with {n} disks")

hanoiPuzzlef(5)