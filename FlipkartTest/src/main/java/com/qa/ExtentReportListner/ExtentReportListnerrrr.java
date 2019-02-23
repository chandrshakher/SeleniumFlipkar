package com.qa.ExtentReportListner;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.flip.qa.Base.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportListnerrrr extends TestBase implements IReporter {
	private ExtentReports extent;

	// crtl+shif+f (satandad formste)
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {

		ExtentReports extent = new ExtentReports(outputDirectory
				+ File.separator + "extent.html", true); // he will read file
															// name each charter
		for (ISuite ya : suites) {
			Map<String, ISuiteResult> ya1_result = ya.getResults();
			for (ISuiteResult y1 : ya1_result.values()) {
				ITestContext context = y1.getTestContext();
				buildTestNode(context.getPassedTests(), LogStatus.PASS);
				buildTestNode(context.getFailedTests(), LogStatus.FAIL);
				buildTestNode(context.getSkippedTests(), LogStatus.SKIP);
			}
		}
		extent.flush();
		extent.close();
	}

	private void buildTestNode(IResultMap testss, LogStatus statuuu) {
		ExtentTest testw;
		if (testss.size() > 0) {
			for (ITestResult resulteee : testss.getAllResults()) {
				testw = extent.startTest(resulteee.getMethod().getMethodName());
				testw.setStartedTime(getTime(resulteee.getStartMillis()));
				testw.setStartedTime(getTime(resulteee.getEndMillis()));
				for (String group : resulteee.getMethod().getGroups()) {
					testw.assignCategory(group);
					if (resulteee.getThrowable() != null) {
						testw.log(statuuu, resulteee.getThrowable());
					} else {
						testw.log(statuuu, "testw"
								+ statuuu.toString().toLowerCase() + "ed");
					}
					extent.endTest(testw);
				}
			}

		}

	}

	private Date getTime(long Millis) {
		Calendar cld = Calendar.getInstance();
		cld.setTimeInMillis(Millis);
		return cld.getTime();

	}

}
