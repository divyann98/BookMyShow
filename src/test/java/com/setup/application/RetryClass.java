package com.setup.application;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer {
    int count = 2;
    int start = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (start < count) {
            start++;
            return true;
        }
        return false;
    }
}
