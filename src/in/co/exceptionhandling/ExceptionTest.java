package in.co.exceptionhandling;

class MyException extends Throwable {
}

class MyException1 extends MyException {
}

class MyException2 extends MyException {
}

class MyException3 extends MyException2 {
}

public class ExceptionTest  {
	void myMethod() throws MyException {
		throw new MyException3();
	}

	public static void main(String[] args) throws MyException3 {
		ExceptionTest et = new ExceptionTest();
		try {
			et.myMethod();
		} catch (MyException me) {
			System.out.println("MyException thrown");
		} finally {
			System.out.println(" Done");
		}
	}
}
