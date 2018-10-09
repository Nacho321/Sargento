package Carla;


import fwk.rivetest.NavigatorDriver;
import fwk.rivetest.Tester;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        test();
    }

    public static void test() {
        Tester.setUp(NavigatorDriver.Chrome, "https://myqa.sargento.com/web/the-block/home");
        Tester.clear("_com_liferay_login_web_portlet_LoginPortlet_login");
        Tester.type("_com_liferay_login_web_portlet_LoginPortlet_login", "rivetadmin@sargento.com");
        Tester.type("_com_liferay_login_web_portlet_LoginPortlet_password", "RLadmin2017");
        Tester.enter("_com_liferay_login_web_portlet_LoginPortlet_password");
        //Tester.tearDown();
    }
}
