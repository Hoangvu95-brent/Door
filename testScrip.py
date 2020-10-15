import subprocess
import os
import time
code= "Test.py"
f=open("New.txt",'r')
a=f.read()
if (a!=""):
    subprocess.call(["kill","-9",a])
f=open("New.txt",'w')
f.write("")
f.close()
while 1:
    print (1)
    time.sleep(5)