n=int(input());
for i in range(n):
    for j in range(1,n-i):
        print(" ",end=" ");
    for j in range(2*i+1):
        print("*",end=" ");
    print();