n= int(input())


for i in range(1, n+1):
    for j in range(i):
        print("*",end="")   
    print("\n");
for i in range(1,2*n):
    for j in range(n-i):
        print("*",end="");
    print("\n");