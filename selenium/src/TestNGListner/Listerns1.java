package TestNGListner;




import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerns1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTeststart result:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Result:"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure result:"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped result:"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButwithinSuccessPercentage result:"+result.getName());

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout result:"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart TC result:"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish TC result:"+context.getName());
	}


		
	

}
