package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

@Data
public class AlbumDetailsPage extends BasePage{ // example of using inheritance in the framework


    @FindBy(tagName = "h2")
    private WebElement albumName;
    @FindBy(xpath = "//p[@onclick=\"openPage('artist.php?id=$artistId')\"]")
    private WebElement author;
    @FindBy(xpath = "//p[@onclick=\"openPage('artist.php?id=$artistId')\"]//following-sibling::p")
    private WebElement songCount;
}
