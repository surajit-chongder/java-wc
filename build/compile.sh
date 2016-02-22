rm out/*.class
javac -cp src:lib/junit-4.12.jar -d out test/WcTest.java
javac -cp src:lib/junit-4.12.jar -d out test/WcOperationTest.java
