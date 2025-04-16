
import base.BaseTest;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import po.SearchPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.AssertJUnit.assertEquals;

public class SearchTest extends BaseTest {

    SearchPage search = new SearchPage();

    @Test
    public void shouldBeVisibleResultSearch() {
//        search.clickOnTabHistory();
        search.fillText("Czerkasy");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        search.clickOnTabSzukaj();


        SoftAssertions softy = new SoftAssertions();
        softy.assertThat(search.getTitle())
                .as("The result of test is appeared")
                .isEqualTo("Smila");

        softy.assertThat(search.getTitle())
                .as("The result of test is appeared")
                .isEqualTo("Czerkasy");

    }





}
