# Java-RMI-Chatroom

This project is a demonstration of chatroom development using Java RMI. Java RMI has been replaced with other better alternatives like RESTful APIs. The primary purpose of this project was to explore the working of distributed environment.

### Development Environment and Structure

I used Eclipse IDE for developing this project. The both directories, SMF_ChatServer and SMF_ChatClient, should be imported in Eclipse IDE. SMF_ChatServer should be executed before SMF_ChatClient. In order to add more participants, the SMF_ChatClient should be executed according to the desired number of participants in chatroom.

### Configuration Details

IP address for joining the chatroom: 192.168.122.131

Port: 1099

### Troubleshooting

If the port 1099 is already reserved by other process then /SMF_ChatServer/src/StartServer.java file should be modified with other port number. Replace 1099 with other port number that does not seem to be busy in other process.


### Snapshot
![alt text](https://github.com/smfarjad/Java-RMI-Chatroom/snap.jpg?raw=true)

