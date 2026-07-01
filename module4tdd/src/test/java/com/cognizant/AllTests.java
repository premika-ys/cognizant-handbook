package com.cognizant;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        AdditionTest.class,
        MultiplicationTest.class,
        EvenCheckerTest.class
})
public class AllTests {
}
