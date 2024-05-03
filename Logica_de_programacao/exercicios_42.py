def main():
    for num in range(0, 1000):
        count = 0
        for i in range(1, num + 1):
            if num % i == 0:
                count += 1
        if count == 2:
            print(num, end=' ')

if __name__ == "__main__":
    main()