cd target
java -classpath ../lib/javacc-7.0.13.jar javacc ../Calc.jj && javac *.java && java Calc
