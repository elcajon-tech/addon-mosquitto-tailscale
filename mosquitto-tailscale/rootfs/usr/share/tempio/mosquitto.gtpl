protocol mqtt
user root
log_dest stdout
{{ if .debug }}
log_type all
{{ else }}
log_type error
log_type warning
log_type notice
log_type information
{{ end }}
log_timestamp_format %Y-%m-%d %H:%M:%S
persistence true
persistence_location /data/mosquitto/

# HTTP backend for the authentication plugin
password_file /etc/mosquitto/pw
acl_file /etc/mosquitto/acl

listener 1883
protocol mqtt

listener 1884
protocol websockets
