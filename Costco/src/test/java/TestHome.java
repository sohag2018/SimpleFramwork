import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {
    @Test
    public void test1(){

        driver.findElement(By.xpath("//input[@id='footer-search-field']"));
}
    @Test
    public void test2(){

        driver.findElement(By.id("warehouse-savings"));
    }
    @Test
    public void test3(){
        driver.findElement(By.id("warehouse-locations-dropdown")).click();
    }





}
