n=int(input());
num=n-1;
for i in range(n):
    for j in range(i):
        print(" ",end=" ");
    for j in range(2*n-(2*i+1)):
        print("*",end=" ");
    print();

for i in range(num):
    for j in range(num-(i+1)):
        print(" ",end=" ");
    for j in range(2*(i+1)+1):
        print("*",end=" ");
    print();