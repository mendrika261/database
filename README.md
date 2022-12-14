# Java DBMS project

This is the server CLI-Based Application of a database management system (DBMS) implemented in Java.
Client can be found <a href='https://github.com/mendrika261/databaseClient'>here</a>.

> Remember that it is just for educational use!


https://user-images.githubusercontent.com/97053149/208431552-cf58065b-30b5-4713-a7bb-a632c6f1d4ec.mp4


## How to use

### Requirements
* Java Runtime Environment
* Command Line Interface - CLI
* Whatever Operating System

### Using the compiled .jar released
You can download the latest version on <a href='https://github.com/mendrika261/database/releases'>release section</a>.<br>
**Run:** `java -jar database.jar [port]`<br>
**Args:** The port to listen

### About Log
Database log can be found on `datafile/`.
There are error, login, logout and trace of all query based on ip and time.

### Working commands
**Be Aware !** <br>
- Syntax are <b>STRICTLY</b> case-sensitive
- Don't use comma or any operators with space
- No semicolon at the end of a query

#### Management
- `STATUS` to see online client and processed client
- `STOP` to stop the server but wait for all clients to exit
- `FORCE STOP` to stop the server without waiting clients
