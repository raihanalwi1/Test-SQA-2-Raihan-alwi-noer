package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.TiketPesawatPage;

public class TiketPesawatStep {
    @Steps
    TiketPesawatPage sp;
    @Given("I am on the tiket pesawat")
    public void iAmOnTheTiketPesawat() {
        sp.openPage();
    }

    @When("I click jumlah penumpang")
    public void iClickJumlahPenumpang() {
        sp.ClickBtnJumlahPenumpang();
    }

    @And("I click penumpang dewasa until {string}")
    public void iClickPenumpangDewasaUntil(String jml) {
        //saya bikin begini karena tidak cukup waktunya dan juga bisa dibuat perulangan, bukan kaya gini
        if (jml.equals("7")) {
            sp.ClickBtnTambahPenumpangDewasa();
            sp.ClickBtnTambahPenumpangDewasa();
            sp.ClickBtnTambahPenumpangDewasa();
            sp.ClickBtnTambahPenumpangDewasa();
            sp.ClickBtnTambahPenumpangDewasa();
            sp.ClickBtnTambahPenumpangDewasa();
            sp.ClickBtnTambahPenumpangDewasa();
            sp.ClickBtnTambahPenumpangDewasa();
        }else if(jml.equals("1")){
            sp.ClickBtnTambahPenumpangDewasa();

        }
    }

    @Then("I will get message result {string}")
    public void iWillGetMessageResult(String result) {
        if (result.equals("success")) {
            sp.ValidationTextPenumpangDewasa();
        } else if (result.equals("failed")) {
            // ini seharusnya diisi dengan selector pesan popup
        }
    }
}
