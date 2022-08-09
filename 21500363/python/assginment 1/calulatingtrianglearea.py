sideone=int(input("enter the side one "))
sidetow=int(input("enter the side tow "))
sidethree=int(input("enter the side three "))
total=(sideone+sidetow+sidethree)/2
result=(total*(total-sideone)*(total-sidetow)*(total-sidethree))** 0.5
print("the area of tringel is ",result)
