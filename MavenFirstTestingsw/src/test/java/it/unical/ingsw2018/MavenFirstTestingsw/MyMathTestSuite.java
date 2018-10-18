package it.unical.ingsw2018.MavenFirstTestingsw;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyMathTest.class, MyMathPerformed.class })
public class MyMathTestSuite {

}
