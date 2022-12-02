package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TiketPesawatPage extends PageObject {
    public void openPage(){
        openAt("/tiket-pesawat");
    }
    private By btnJumlahPenumpang(){
        return By.xpath("//input[@data-testid='passengers-input']");
    }
    private By btnTambahPenumpangDewasa(){
        return By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[3]/div");
    }
    private By textPenumpangDewasa(){
        return By.xpath("//div[@data-testid='passengers-stepper-value-adult']");
    }
    public void ClickBtnJumlahPenumpang(){
        $(btnJumlahPenumpang()).click();
    }
    public void ClickBtnTambahPenumpangDewasa(){
        $(btnTambahPenumpangDewasa()).click();
    }
    public void ValidationTextPenumpangDewasa(){
        $(textPenumpangDewasa()).isDisplayed();
    }
}
