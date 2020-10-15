'''
UART communication on Raspberry Pi using Pyhton
http://www.electronicwings.com
'''
import serial
from time import sleep
ser = serial.Serial ("/dev/ttyS0", 9600,timeout=0.03)    #Open port with baud rate
import os
f= open("New.txt",'w')
f.write(str(os.getpid()))

f.close()
while True:
    data = ser.read()
    #if (data==command.signature):
#read serial port    
    print("-----------------------------------------------------------")
    #start =time.time()
    sleep(0.01)
    data_left = ser.inWaiting()                                                             #check for remaining byte
    data += ser.read(data_left)
    print(data)
