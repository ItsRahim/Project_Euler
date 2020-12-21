def fibonacci(max_num):
    current, prev = 1, 1
    while current <= max_num:
        yield current
        current, prev = current + prev, current

total = sum(n for n in fibonacci(4000000) if (n % 2 == 0))

print(total)