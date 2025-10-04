package pack1;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Listener - onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Listener - onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Listener - onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Listener - onTestSkipped");
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Listener - onStart");
	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("Listener - onFinish");
	}

}
