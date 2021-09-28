import pigpio

servo = 13

pwm = pigpio.pi()
pwm.set_mode(servo, pigpio.OUTPUT)
pwm.set_PWM_frequency( servo, 25000 )
pwm.set_PWM_range(servo, 100)

#get CPU temp
file = open("/sys/class/thermal/thermal_zone0/temp")
temp = float(file.read()) / 1000.00
temp = float('%.2f' % temp)
file.close()

dutycycle = 0

if(temp > 30):
  dutycycle = 40
elif(temp > 50):
  dutycycle = 50
elif(temp > 55):
  dutycycle = 75
elif(temp > 60):
  dutycycle = 90
elif(temp > 65):
  dutycycle = 100
else:
  dutycycle = 0

pwm.set_PWM_dutycycle(servo, dutycycle)

f = open("/tmp/fan.speed", "w")
f.write(str(dutycycle))
f.close()
