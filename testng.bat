set myProjectpath=C:\Users\User\Desktop\JavaLearn1
cd %myProjectpath%
set classpath=%myProjectpath%\bin;%myProjectpath%\lib\*
java -cp "C:\ExtenalJar\testng-6.8.5.jar;C:\ExtenalJar\jcommander-1.48.jar" org.testng.TestNG %myProjectpath%\src\main\java\testng.xml
pause