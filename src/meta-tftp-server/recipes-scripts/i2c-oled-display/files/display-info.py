import argparse
from board import SCL, SDA
from oled_text import OledText, BigLine, SmallLine
import busio
import subprocess
import time

CMD_IP="hostname -I | cut -d' ' -f1"
CMD_MAC_ADDRESS="ip -brief link show | grep -v \"LOOPBACK\" | grep -v \"DOWN\" | awk '{print $3;}'"
CMD_TEMPERATURE="cat /sys/class/thermal/thermal_zone0/temp"

def service_status_icon(statusArg):
    result = '\uf00d'

    if ( statusArg == "active" ):
       result = '\uf00c'

    return result


def layout_service():
    return {
                1: BigLine(0, 0),
                2: BigLine(0, 22, font="FontAwesomeSolid.ttf", size=16),
                3: SmallLine(24, 22, font="Arimo.ttf", size=16),
                4: BigLine(0, 44, font="FontAwesomeSolid.ttf", size=16),
                5: SmallLine(24, 44, font="Arimo.ttf", size=16),
    }


def layout_software():
    return {
                1: BigLine(0, 0),
                2: SmallLine(0, 22, font="Arimo.ttf", size=16),
                3: SmallLine(0, 44, font="Arimo.ttf", size=16),
    }


def layout_network():
    return {
                1: BigLine(0, 0),
                2: BigLine(0, 22, font="FontAwesomeSolid.ttf", size=16),
                3: SmallLine(24, 22, font="Arimo.ttf", size=16),
                4: SmallLine(0, 44, font="Arimo.ttf", size=16),
    }


def layout_temperature():
    return {
                1: BigLine(0, 0),
                2: BigLine(0, 22, font="FontAwesomeSolid.ttf", size=16),
                3: SmallLine(24, 22, font="Arimo.ttf", size=16),
                4: BigLine(64, 44, font="FontAwesomeSolid.ttf", size=16),
                5: SmallLine(64, 44, font="Arimo.ttf", size=16),
    }



def display_docker_and_openvpn(dockerStatusArg, openvpnStatusArg):
    oled.layout = layout_service()
    oled.auto_show = False
    oled.text("SERVICES", 1)
    oled.text(service_status_icon(dockerStatusArg), 2)
    oled.text("Docker",3)
    oled.text(service_status_icon(openvpnStatusArg), 4)
    oled.text("OpenVPN",5)
    oled.show()



def display_network(ipArg, macAddressArg):
    oled.layout = layout_network()
    oled.auto_show = False
    oled.text("NETWORK", 1)
    oled.text('\uf6ff', 2)
    oled.text(ipArg, 3)
    oled.text(macAddressArg, 4)
    oled.show()



def display_temperature():
    temperature_string = subprocess.check_output(CMD_TEMPERATURE, shell=True).decode("utf-8")
    temperature = int(float(temperature_string) / 1000)

    if ( temperature <= 0 ):
       temperature_icon ='\uf2cb'
    elif ( temperature <= 25 ):
       temperature_icon ='\uf2ca'
    elif ( temperature <= 50 ):
       temperature_icon ='\uf2c9'
    elif ( temperature <= 75 ):
       temperature_icon ='\uf2c8'
    else:
       temperature_icon ='\uf2c7'

    oled.layout = layout_temperature()
    oled.auto_show = False
    oled.text("ENVIRONMENT", 1)
    oled.text(temperature_icon, 2)
    oled.text(str(temperature) + "°C", 3)
    oled.show()



def display_software():
    oled.layout = layout_software()
    oled.auto_show = False
    oled.text("OS", 1)
    oled.text("#-DISTRO-#", 2)
    oled.text("#-DISTRO_VERSION-#",3)
    oled.show()


i2c = busio.I2C(SCL, SDA)

# Create the display, pass its pixel dimensions
oled = OledText(i2c, 128, 64)

# Manage arguments of the command lines
parser = argparse.ArgumentParser()
parser.add_argument("--ip", help="IP address of the machine")
parser.add_argument("--mac", help="Mac address of the machine")
parser.add_argument("--docker", help="Status of the service Docker")
parser.add_argument("--openvpn", help="Status of the service OpenVPN")
args = parser.parse_args()

display_network(args.ip, args.mac)
time.sleep(3)
display_software()
time.sleep(3)
display_docker_and_openvpn(args.docker, args.openvpn)
time.sleep(3)
display_temperature()
time.sleep(3)
display_network(args.ip, args.mac)
