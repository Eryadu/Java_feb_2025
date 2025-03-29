
## permission on file 
-rwx r-- r--
r - read
w - write
x - execute

rw- owner permission
r-- group permission
r-- other permission 

chmod ---- to change the permission on file
chmod 777 file_name
7 - rwx to owner
7 - rwx to group
7 - rwx to other

## change permission

0 - no permission
1 - execute permission
2 - write permission
3 - write and execute permission
4 - read permission
5 - read and execute permission
6 - read and write permission
7 - all permission

## grep command

search for any expression in the file without opening file
syntax -- grep keyword_to_search file_name. i.e grep java file

1. grep -v file_name       -->  which does not match the keyword
2. grep keyword file_name  -->  which match the keyword
3. grep -n file_name       -->  to print the line numbers
4. grep -i file_name       -->  to rule out uppercase and lower case
5. grep -c file_name       -->  count the number of matching lines for the specific keyword

## sort command

sort file_name    --> in natural sorted order
sort -r file_name --> reverse order

## Shell scripting ?

1. create a file with .sh extension i.e. touch file.sh
2. change the permission of the file to execute
chmod +x file.sh // to add execute permission
3. echo "hello world" // echo used to print the output as it is.
4.  ./file.sh --> to execute the shell script file
5. name="yadav" --> variable , echo "$name" $ sign is used to print variable

#!/bin/bash // practice to write this in every file.
## !/bin/bash when used in scripts is used to instruct the operating system to use bash as a command interpreter. 
Each of the systems has its own shells which the system will use to execute its own system scripts. 
This system shell can vary from OS to OS(most of the time it will be bash).

## Example :
#!/bin/bash
name="Yadav"
echo "$name"
