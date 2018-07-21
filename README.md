# Junit-Hamcrest-Matchers-Example

Hamcrest is a framework for software tests. 

Hamcrest allows checking for conditions in your code via existing matchers classes. It also allows you to define your custom matcher implementations.  To use Hamcrest matchers in JUnit you use the assertThat statement followed by one or several matchers.  

Hamcrest is typically viewed as a third generation matcher framework. The first generation used assert(logical statement) but such tests were not easily readable. The second generation introduced special methods for assertions, e.g., assertEquals(). This approach leads to lots of assert methods. 

Hamcrest uses assertThat method with a matcher expression to determine if the test was succesful. See Wiki on Hamcrest for more details.
