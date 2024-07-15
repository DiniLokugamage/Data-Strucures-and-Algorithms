def fibonacci(t):
    if t == 0 or t == 1:
        return 1
    else:
        return fibonacci(t-1) + fibonacci(t-2)

num = str(fibonacci(36))
formatted_num = "{:,}".format(int(num))
print(formatted_num)