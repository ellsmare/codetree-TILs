n = int(input());
num=2*n;
for i in range(n):
    for j in range(i):
        print(" ",end=" ");
    for j in range(num-(2*i)-1):
        print("*",end=" ");
    print()