echo ...
echo javacc..
cd lpl/parser
call javacc LPL.jj
cd../../
echo compiling...
javac lpl/parser/*.java
javac lpl/ast/*.java
echo finishing..
cmd /k