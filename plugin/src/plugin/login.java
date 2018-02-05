import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://www.brocade.com/en/about-us.html']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(1) a")
    @CacheLookup
    private WebElement afghanistan;

    @FindBy(name = "fname")
    @CacheLookup
    private WebElement afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean1;

    @FindBy(name = "lname")
    @CacheLookup
    private WebElement afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean2;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean3;

    @FindBy(name = "country")
    @CacheLookup
    private WebElement afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4;

    @FindBy(name = "postcode")
    @CacheLookup
    private WebElement afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean5;

    @FindBy(name = "phone")
    @CacheLookup
    private WebElement afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean6;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(2) a")
    @CacheLookup
    private WebElement albania;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(3) a")
    @CacheLookup
    private WebElement algeria;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(4) a")
    @CacheLookup
    private WebElement andorra;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(5) a")
    @CacheLookup
    private WebElement angola;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(6) a")
    @CacheLookup
    private WebElement anguilla;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(7) a")
    @CacheLookup
    private WebElement antiguaAndBarbuda;

    @FindBy(css = "a[href='/products/application-delivery-controller']")
    @CacheLookup
    private WebElement applicationDeliveryController;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(8) a")
    @CacheLookup
    private WebElement argentina;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(9) a")
    @CacheLookup
    private WebElement armenia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(10) a")
    @CacheLookup
    private WebElement aruba;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(11) a")
    @CacheLookup
    private WebElement australia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(12) a")
    @CacheLookup
    private WebElement austria;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(13) a")
    @CacheLookup
    private WebElement azerbaijan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(14) a")
    @CacheLookup
    private WebElement bahamas;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(15) a")
    @CacheLookup
    private WebElement bahrain;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(16) a")
    @CacheLookup
    private WebElement bangladesh;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(17) a")
    @CacheLookup
    private WebElement barbados;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(18) a")
    @CacheLookup
    private WebElement belarus;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(19) a")
    @CacheLookup
    private WebElement belgium;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(20) a")
    @CacheLookup
    private WebElement belize;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(21) a")
    @CacheLookup
    private WebElement benin;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(22) a")
    @CacheLookup
    private WebElement bermuda;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(23) a")
    @CacheLookup
    private WebElement bhutan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(24) a")
    @CacheLookup
    private WebElement bolivia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(25) a")
    @CacheLookup
    private WebElement bosniaherzegovina;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(26) a")
    @CacheLookup
    private WebElement botswana;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(27) a")
    @CacheLookup
    private WebElement bouvetIsland;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(28) a")
    @CacheLookup
    private WebElement brazil;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(29) a")
    @CacheLookup
    private WebElement britishIndianOceanTerritory;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(30) a")
    @CacheLookup
    private WebElement britishVirginIslands;

    @FindBy(css = "#Login span:nth-of-type(3) div.dropdown-face.dd.dd-portal ul.dropdown li:nth-of-type(4) a")
    @CacheLookup
    private WebElement brocadeCommunities1;

    @FindBy(css = "#Login2 span:nth-of-type(3) div.dropdown-face.dd.dd-portal ul.dropdown li:nth-of-type(4) a")
    @CacheLookup
    private WebElement brocadeCommunities2;

    @FindBy(css = "#header div:nth-of-type(2) div.sso div:nth-of-type(2) ul.portal li:nth-of-type(4) a")
    @CacheLookup
    private WebElement brocadeCommunities3;

    @FindBy(css = "a[href='http://www.brocade.com/en/how-to-buy/network-subscription.html']")
    @CacheLookup
    private WebElement brocadeNetworkSubscription;

    @FindBy(css = "#Login span:nth-of-type(3) div.dropdown-face.dd.dd-portal ul.dropdown li:nth-of-type(2) a")
    @CacheLookup
    private WebElement brocadeTraining1;

    @FindBy(css = "#Login2 span:nth-of-type(3) div.dropdown-face.dd.dd-portal ul.dropdown li:nth-of-type(2) a")
    @CacheLookup
    private WebElement brocadeTraining2;

    @FindBy(css = "#header div:nth-of-type(2) div.sso div:nth-of-type(2) ul.portal li:nth-of-type(2) a")
    @CacheLookup
    private WebElement brocadeTraining3;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(31) a")
    @CacheLookup
    private WebElement bruneiDarussalam;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(32) a")
    @CacheLookup
    private WebElement bulgaria;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(33) a")
    @CacheLookup
    private WebElement burkinaFaso;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(34) a")
    @CacheLookup
    private WebElement burma;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(35) a")
    @CacheLookup
    private WebElement burundi;

    @FindBy(css = "#form-contact div.row div:nth-of-type(3) div.form-column-outer-wrapper.wrapper-right div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-topic ul.dropdown li:nth-of-type(3) a")
    @CacheLookup
    private WebElement businessInquiry;

    @FindBy(name = "topic")
    @CacheLookup
    private WebElement byProvidingUsWithYourEmail1;

    @FindBy(name = "message")
    @CacheLookup
    private WebElement byProvidingUsWithYourEmail2;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(36) a")
    @CacheLookup
    private WebElement cambodia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(37) a")
    @CacheLookup
    private WebElement cameroon;

    @FindBy(css = "a[href='/products/campus-lan-switches.html']")
    @CacheLookup
    private WebElement campusLanSwitches;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(38) a")
    @CacheLookup
    private WebElement canada;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(39) a")
    @CacheLookup
    private WebElement capeVerde;

    @FindBy(css = "a[href='http://careers.brocade.com/']")
    @CacheLookup
    private WebElement careers;

    @FindBy(css = "a[href='/products/carrier-ethernet.html']")
    @CacheLookup
    private WebElement carrierEthernet;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(40) a")
    @CacheLookup
    private WebElement caymanIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(41) a")
    @CacheLookup
    private WebElement centralAfricanRepublic;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(42) a")
    @CacheLookup
    private WebElement chad;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(43) a")
    @CacheLookup
    private WebElement chile;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(44) a")
    @CacheLookup
    private WebElement china;

    @FindBy(css = "a[href='http://www.brocadechina.com/ ']")
    @CacheLookup
    private WebElement chinese;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(45) a")
    @CacheLookup
    private WebElement christmasIsland;

    @FindBy(css = "a[href='http://www.extremenetworks.com/brocade-support-transition/']")
    @CacheLookup
    private WebElement clickHere;

    @FindBy(css = "a[href='http://my.brocade.com/wps/portal/sendactivationemail']")
    @CacheLookup
    private WebElement clickHere;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(46) a")
    @CacheLookup
    private WebElement cocosKeelingIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(47) a")
    @CacheLookup
    private WebElement colombia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(48) a")
    @CacheLookup
    private WebElement comoros;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(49) a")
    @CacheLookup
    private WebElement congoRepublicOfBrazzaville;

    @FindBy(css = "#form-contact div.row div:nth-of-type(4) input.button.orange.expand[type='submit']")
    @CacheLookup
    private WebElement contactMe;

    @FindBy(css = "#footer div:nth-of-type(1) div.sticky.white.button a")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a.button.white.expand.btn-contact")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "#form-contact div.row div:nth-of-type(1) div.contact-header a")
    @CacheLookup
    private WebElement contactWorldwideOffice;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(50) a")
    @CacheLookup
    private WebElement cookIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(51) a")
    @CacheLookup
    private WebElement costaRica;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(52) a")
    @CacheLookup
    private WebElement coteDlvoire;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(53) a")
    @CacheLookup
    private WebElement croatia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(54) a")
    @CacheLookup
    private WebElement cyprus;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(55) a")
    @CacheLookup
    private WebElement czechRepublic;

    @FindBy(css = "a[href='/products/data-center-switches.html']")
    @CacheLookup
    private WebElement dataCenterSwitches;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(56) a")
    @CacheLookup
    private WebElement democraticRepublicOfTheCongo;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(57) a")
    @CacheLookup
    private WebElement denmark;

    @FindBy(css = "a[href='http://www.brocade.com/en/international/germany.html']")
    @CacheLookup
    private WebElement deutschDeutschland;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(58) a")
    @CacheLookup
    private WebElement djibouti;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(59) a")
    @CacheLookup
    private WebElement dominica;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(60) a")
    @CacheLookup
    private WebElement dominicanRepublic;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(61) a")
    @CacheLookup
    private WebElement eastTimor;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(62) a")
    @CacheLookup
    private WebElement ecuador;

    @FindBy(css = "#header div:nth-of-type(2) div.sso div:nth-of-type(2) div.info.padding div:nth-of-type(2) div.details-inner a:nth-of-type(1)")
    @CacheLookup
    private WebElement editProfile;

    @FindBy(css = "a[href='http://www.brocade.com/en/education.html']")
    @CacheLookup
    private WebElement education;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(63) a")
    @CacheLookup
    private WebElement egypt;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(64) a")
    @CacheLookup
    private WebElement elSalvador;

    @FindBy(css = "#footer div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(3) ul.block-grid.small-block-grid-1.others li:nth-of-type(2) ul:nth-of-type(2) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement englishUs;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(65) a")
    @CacheLookup
    private WebElement equitorialGuinea;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(66) a")
    @CacheLookup
    private WebElement eritrea;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(67) a")
    @CacheLookup
    private WebElement estonia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(68) a")
    @CacheLookup
    private WebElement ethiopia;

    @FindBy(css = "#contact-us-form div:nth-of-type(3) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) a.button.wide")
    @CacheLookup
    private WebElement explore1;

    @FindBy(css = "#contact-us-form div:nth-of-type(3) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) a.button.wide")
    @CacheLookup
    private WebElement explore2;

    @FindBy(css = "#contact-us-form div:nth-of-type(3) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(3) div:nth-of-type(2) a.button.wide")
    @CacheLookup
    private WebElement explore3;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(69) a")
    @CacheLookup
    private WebElement falklandIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(70) a")
    @CacheLookup
    private WebElement faroeIslands;

    @FindBy(css = "a[href='/products/fibre-channel.html']")
    @CacheLookup
    private WebElement fibreChannel;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(71) a")
    @CacheLookup
    private WebElement fiji;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(72) a")
    @CacheLookup
    private WebElement finland;

    @FindBy(id = "userid")
    @CacheLookup
    private WebElement forgotYourIdOrPassword1;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement forgotYourIdOrPassword2;

    @FindBy(css = "#Login div.row.login-btn div:nth-of-type(2) ul.list-arrow.orange li:nth-of-type(2) a")
    @CacheLookup
    private WebElement forgotYourIdOrPassword3;

    @FindBy(css = "a.btn-forget-password.header-item")
    @CacheLookup
    private WebElement forgotYourIdOrPassword4;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(73) a")
    @CacheLookup
    private WebElement france;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(74) a")
    @CacheLookup
    private WebElement frenchGuiana;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(75) a")
    @CacheLookup
    private WebElement frenchMetropolitan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(76) a")
    @CacheLookup
    private WebElement frenchPolynesia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(77) a")
    @CacheLookup
    private WebElement frenchSouthernTerritories;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(78) a")
    @CacheLookup
    private WebElement gabon;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(79) a")
    @CacheLookup
    private WebElement gambia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(80) a")
    @CacheLookup
    private WebElement georgia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(81) a")
    @CacheLookup
    private WebElement germany;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(82) a")
    @CacheLookup
    private WebElement ghana;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(83) a")
    @CacheLookup
    private WebElement gibraltar;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(84) a")
    @CacheLookup
    private WebElement greece;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(85) a")
    @CacheLookup
    private WebElement greenland;

    @FindBy(css = "a.greetings.header-item")
    @CacheLookup
    private WebElement greetings;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(86) a")
    @CacheLookup
    private WebElement grenada;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(87) a")
    @CacheLookup
    private WebElement guadeloupe;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(88) a")
    @CacheLookup
    private WebElement guam;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(89) a")
    @CacheLookup
    private WebElement guatemala;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(90) a")
    @CacheLookup
    private WebElement guernsey;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(91) a")
    @CacheLookup
    private WebElement guinea;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(92) a")
    @CacheLookup
    private WebElement guineaBissau;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(93) a")
    @CacheLookup
    private WebElement guyana;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(94) a")
    @CacheLookup
    private WebElement haiti;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(95) a")
    @CacheLookup
    private WebElement heardAndMcdonaldIslands;

    @FindBy(css = "a[href='https://login.brocade.com/bc_pn/help.html']")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(96) a")
    @CacheLookup
    private WebElement honduras;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(97) a")
    @CacheLookup
    private WebElement hongKongChina;

    @FindBy(css = "#menu-lvl-1 ul li:nth-of-type(7) a")
    @CacheLookup
    private WebElement howToBuy;

    @FindBy(css = "#container div:nth-of-type(3) div.wrapper.wrapper-content.active div.content-container div.row div:nth-of-type(2) div:nth-of-type(2) ul.list-arrow.aside li:nth-of-type(1) a")
    @CacheLookup
    private WebElement howToBuy;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(98) a")
    @CacheLookup
    private WebElement hungary;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(99) a")
    @CacheLookup
    private WebElement iceland;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(100) a")
    @CacheLookup
    private WebElement india;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(101) a")
    @CacheLookup
    private WebElement indonesia;

    @FindBy(css = "a[href='http://www.brcd.com/']")
    @CacheLookup
    private WebElement investorRelations;

    @FindBy(css = "a[href='/products/ip-storage.html']")
    @CacheLookup
    private WebElement ipStorage;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(102) a")
    @CacheLookup
    private WebElement iraq;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(103) a")
    @CacheLookup
    private WebElement ireland;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(104) a")
    @CacheLookup
    private WebElement isleOfMan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(105) a")
    @CacheLookup
    private WebElement israel;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(106) a")
    @CacheLookup
    private WebElement italy;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(107) a")
    @CacheLookup
    private WebElement jamaica;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(108) a")
    @CacheLookup
    private WebElement japan;

    @FindBy(css = "a[href='http://www.brocadejapan.com/']")
    @CacheLookup
    private WebElement japanese;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(109) a")
    @CacheLookup
    private WebElement jersey;

    @FindBy(css = "a.button.expand.white.btn-join-community")
    @CacheLookup
    private WebElement joinTheCommunity;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(110) a")
    @CacheLookup
    private WebElement jordan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(112) a")
    @CacheLookup
    private WebElement kazakhstan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(113) a")
    @CacheLookup
    private WebElement kenya;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(114) a")
    @CacheLookup
    private WebElement kiribati;

    @FindBy(css = "#Login span:nth-of-type(3) div.dropdown-face.dd.dd-portal ul.dropdown li:nth-of-type(5) a")
    @CacheLookup
    private WebElement knowledgeBase1;

    @FindBy(css = "#Login2 span:nth-of-type(3) div.dropdown-face.dd.dd-portal ul.dropdown li:nth-of-type(5) a")
    @CacheLookup
    private WebElement knowledgeBase2;

    @FindBy(css = "#header div:nth-of-type(2) div.sso div:nth-of-type(2) ul.portal li:nth-of-type(5) a")
    @CacheLookup
    private WebElement knowledgeBase3;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(115) a")
    @CacheLookup
    private WebElement koreaSouth;

    @FindBy(css = "a[href='http://www.brocadekorea.com/']")
    @CacheLookup
    private WebElement korean;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(111) a")
    @CacheLookup
    private WebElement kosovo;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(116) a")
    @CacheLookup
    private WebElement kuwait;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(117) a")
    @CacheLookup
    private WebElement kyrgyzstan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(118) a")
    @CacheLookup
    private WebElement laosPeoplesDemocraticRepublic;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(119) a")
    @CacheLookup
    private WebElement latvia;

    @FindBy(css = "a[href='http://www.brocade.com/en/general/announcements/brocade-customers-partners.html']")
    @CacheLookup
    private WebElement learnMore;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(120) a")
    @CacheLookup
    private WebElement lebanon;

    @FindBy(css = "a[href='http://www.brocade.com/en/legal.html']")
    @CacheLookup
    private WebElement legal;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(121) a")
    @CacheLookup
    private WebElement lesotho;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(122) a")
    @CacheLookup
    private WebElement liberia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(123) a")
    @CacheLookup
    private WebElement libya;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(124) a")
    @CacheLookup
    private WebElement liechtenstein;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(125) a")
    @CacheLookup
    private WebElement lithuania;

    @FindBy(id = "sso-btn-login")
    @CacheLookup
    private WebElement login1;

    @FindBy(id = "sso-btn-login")
    @CacheLookup
    private WebElement login2;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(126) a")
    @CacheLookup
    private WebElement luxembourg;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(127) a")
    @CacheLookup
    private WebElement macauChina;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(128) a")
    @CacheLookup
    private WebElement macedonia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(129) a")
    @CacheLookup
    private WebElement madagascar;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(130) a")
    @CacheLookup
    private WebElement malawi;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(131) a")
    @CacheLookup
    private WebElement malaysia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(132) a")
    @CacheLookup
    private WebElement maldives;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(133) a")
    @CacheLookup
    private WebElement mali;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(134) a")
    @CacheLookup
    private WebElement malta;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(135) a")
    @CacheLookup
    private WebElement marshallIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(136) a")
    @CacheLookup
    private WebElement martinique;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(137) a")
    @CacheLookup
    private WebElement mauritania;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(138) a")
    @CacheLookup
    private WebElement mauritius;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(139) a")
    @CacheLookup
    private WebElement mayotte;

    @FindBy(css = "#header div:nth-of-type(2) ul.header-list li:nth-of-type(4) a.header-item")
    @CacheLookup
    private WebElement menu;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(140) a")
    @CacheLookup
    private WebElement mexico;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(141) a")
    @CacheLookup
    private WebElement micronesiaFedSt;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(142) a")
    @CacheLookup
    private WebElement moldovaRepublicOf;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(143) a")
    @CacheLookup
    private WebElement monaco;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(144) a")
    @CacheLookup
    private WebElement mongolia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(145) a")
    @CacheLookup
    private WebElement montenegro;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(146) a")
    @CacheLookup
    private WebElement montserrat;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(147) a")
    @CacheLookup
    private WebElement morocco;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(148) a")
    @CacheLookup
    private WebElement mozambique;

    @FindBy(css = "#Login span:nth-of-type(3) div.dropdown-face.dd.dd-portal ul.dropdown li:nth-of-type(1) a")
    @CacheLookup
    private WebElement mybrocade1;

    @FindBy(css = "#Login2 span:nth-of-type(3) div.dropdown-face.dd.dd-portal ul.dropdown li:nth-of-type(1) a")
    @CacheLookup
    private WebElement mybrocade2;

    @FindBy(css = "#header div:nth-of-type(2) div.sso div:nth-of-type(2) ul.portal li:nth-of-type(1) a")
    @CacheLookup
    private WebElement mybrocade3;

    @FindBy(id = "takemeto")
    @CacheLookup
    private WebElement mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase1;

    @FindBy(id = "qt")
    @CacheLookup
    private WebElement mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase2;

    @FindBy(id = "userid")
    @CacheLookup
    private WebElement mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase3;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase4;

    @FindBy(id = "takemeto")
    @CacheLookup
    private WebElement mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(149) a")
    @CacheLookup
    private WebElement namibia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(150) a")
    @CacheLookup
    private WebElement nauru;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(151) a")
    @CacheLookup
    private WebElement nepal;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(152) a")
    @CacheLookup
    private WebElement netherlands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(153) a")
    @CacheLookup
    private WebElement netherlandsAntilles;

    @FindBy(css = "a[href='/products/network-functions-virtualization.html']")
    @CacheLookup
    private WebElement networkFunctionsVirtualization;

    @FindBy(css = "a[href='/products/network-management.html']")
    @CacheLookup
    private WebElement networkManagement;

    @FindBy(css = "a[href='/products/network-monitoring-sevices.html']")
    @CacheLookup
    private WebElement networkMonitoringServices;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(154) a")
    @CacheLookup
    private WebElement newCaledonia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(155) a")
    @CacheLookup
    private WebElement newZealand;

    @FindBy(css = "a[href='http://newsroom.brocade.com/']")
    @CacheLookup
    private WebElement newsroom;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(156) a")
    @CacheLookup
    private WebElement nicaragua;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(157) a")
    @CacheLookup
    private WebElement niger;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(158) a")
    @CacheLookup
    private WebElement nigeria;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(159) a")
    @CacheLookup
    private WebElement niue;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(160) a")
    @CacheLookup
    private WebElement norfolkIsland;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(161) a")
    @CacheLookup
    private WebElement northernMarianaIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(162) a")
    @CacheLookup
    private WebElement norway;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(163) a")
    @CacheLookup
    private WebElement oman;

    @FindBy(css = "a[href='/products/orchestration.html']")
    @CacheLookup
    private WebElement orchestration;

    private final String pageLoadedText = "By providing us with your email address and/or work phone and clicking the 'Contact Me' button, you grant brocade and/or its partners permission to contact you";

    private final String pageUrl = "/?TAM_OP=login&AUTH_CODE=0x00000000&URL=%2Fwps%2Fmyportal%2F&HOSTNAME=my.brocade.com&PROTOCOL=http";

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(164) a")
    @CacheLookup
    private WebElement pakistan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(165) a")
    @CacheLookup
    private WebElement palau;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(166) a")
    @CacheLookup
    private WebElement palestinianNationalAuthority;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(167) a")
    @CacheLookup
    private WebElement panama;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(168) a")
    @CacheLookup
    private WebElement papuaNewGuinea;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(169) a")
    @CacheLookup
    private WebElement paraguay;

    @FindBy(css = "a[href='http://brocade.force.com/partnersearch']")
    @CacheLookup
    private WebElement partnerLocation;

    @FindBy(css = "a[href='http://www.brocade.com/en/partners.html']")
    @CacheLookup
    private WebElement partners;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(170) a")
    @CacheLookup
    private WebElement peru;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(171) a")
    @CacheLookup
    private WebElement philippines;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(172) a")
    @CacheLookup
    private WebElement pitcairnIsland;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(173) a")
    @CacheLookup
    private WebElement poland;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(174) a")
    @CacheLookup
    private WebElement portugal;

    @FindBy(css = "a[href='http://www.brocade.com/en/possibilities.html']")
    @CacheLookup
    private WebElement possibilities;

    @FindBy(css = "a[href='http://www.brocade.com/en/legal/privacy-policy.html']")
    @CacheLookup
    private WebElement privacy;

    @FindBy(css = "a[href='http://www.brocade.com/en/products-services.html']")
    @CacheLookup
    private WebElement productsServices;

    @FindBy(css = "a[href='http://brocade.pwwasia.com/products-level-1.html']")
    @CacheLookup
    private WebElement productsServices;

    @FindBy(css = "a[href='/products/professional-services.html']")
    @CacheLookup
    private WebElement professionalServices;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(175) a")
    @CacheLookup
    private WebElement puertoRico;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(176) a")
    @CacheLookup
    private WebElement qatar;

    @FindBy(css = "a[href='https://my.brocade.com/wps/portal/registration']")
    @CacheLookup
    private WebElement register;

    @FindBy(css = "#header div:nth-of-type(2) div.sso div:nth-of-type(1) div.padding div.alternate-content a:nth-of-type(2)")
    @CacheLookup
    private WebElement registerNow;

    @FindBy(css = "a.button.orange.expand")
    @CacheLookup
    private WebElement registerNowdocumentWritea;

    @FindBy(css = "a[href='/products/residency-services.html']")
    @CacheLookup
    private WebElement residencyServices;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(177) a")
    @CacheLookup
    private WebElement reunionIsland;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(178) a")
    @CacheLookup
    private WebElement romania;

    @FindBy(css = "a[href='/products/routers.html']")
    @CacheLookup
    private WebElement routers;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(179) a")
    @CacheLookup
    private WebElement russia;

    @FindBy(css = "a[href='http://www.brocade.com/en/international/russia.html']")
    @CacheLookup
    private WebElement russian;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(180) a")
    @CacheLookup
    private WebElement rwanda;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(181) a")
    @CacheLookup
    private WebElement saintHelena;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(182) a")
    @CacheLookup
    private WebElement saintKittsAndNevis;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(183) a")
    @CacheLookup
    private WebElement saintLucia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(184) a")
    @CacheLookup
    private WebElement saintVincentAndTheGrenadines;

    @FindBy(css = "#form-contact div.row div:nth-of-type(3) div.form-column-outer-wrapper.wrapper-right div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-topic ul.dropdown li:nth-of-type(1) a")
    @CacheLookup
    private WebElement salesInquiry;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(185) a")
    @CacheLookup
    private WebElement samoaAmerican;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(186) a")
    @CacheLookup
    private WebElement sanMarino;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(187) a")
    @CacheLookup
    private WebElement saoTomeAndPrincipe;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(188) a")
    @CacheLookup
    private WebElement saudiArabia;

    @FindBy(css = "a[href='/products/sdn-controllers-applications.html']")
    @CacheLookup
    private WebElement sdnControllersApplications;

    @FindBy(css = "#header div:nth-of-type(2) ul.header-list li:nth-of-type(3) a.header-item")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(189) a")
    @CacheLookup
    private WebElement senegal;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(190) a")
    @CacheLookup
    private WebElement serbia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(191) a")
    @CacheLookup
    private WebElement seychelles;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(192) a")
    @CacheLookup
    private WebElement sierraLeone;

    @FindBy(css = "a.btn-signin.header-item")
    @CacheLookup
    private WebElement signIn;

    @FindBy(css = "#header div:nth-of-type(2) div.sso div:nth-of-type(2) div.info.padding div:nth-of-type(2) div.details-inner a:nth-of-type(2)")
    @CacheLookup
    private WebElement signout;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(193) a")
    @CacheLookup
    private WebElement singapore;

    @FindBy(css = "a[href='http://www.brocade.com/en/sitemap.html']")
    @CacheLookup
    private WebElement siteMap;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(194) a")
    @CacheLookup
    private WebElement slovakia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(195) a")
    @CacheLookup
    private WebElement slovenia;

    @FindBy(css = "#Login span:nth-of-type(3) div.dropdown-face.dd.dd-portal ul.dropdown li:nth-of-type(3) a")
    @CacheLookup
    private WebElement softwareLicensing1;

    @FindBy(css = "#Login2 span:nth-of-type(3) div.dropdown-face.dd.dd-portal ul.dropdown li:nth-of-type(3) a")
    @CacheLookup
    private WebElement softwareLicensing2;

    @FindBy(css = "#header div:nth-of-type(2) div.sso div:nth-of-type(2) ul.portal li:nth-of-type(3) a")
    @CacheLookup
    private WebElement softwareLicensing3;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(196) a")
    @CacheLookup
    private WebElement solomonIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(197) a")
    @CacheLookup
    private WebElement somalia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(198) a")
    @CacheLookup
    private WebElement southAfrica;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(199) a")
    @CacheLookup
    private WebElement southGeorgiaAndSouthSandwichIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(200) a")
    @CacheLookup
    private WebElement spain;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(201) a")
    @CacheLookup
    private WebElement sriLanka;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(202) a")
    @CacheLookup
    private WebElement stPierreAndMiquelon;

    @FindBy(css = "a[href='http://www.brocade.com/en/support.html']")
    @CacheLookup
    private WebElement support;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(203) a")
    @CacheLookup
    private WebElement suriname;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(204) a")
    @CacheLookup
    private WebElement svalbardAndJanMayenIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(205) a")
    @CacheLookup
    private WebElement swaziland;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(206) a")
    @CacheLookup
    private WebElement sweden;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(207) a")
    @CacheLookup
    private WebElement switzerland;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(208) a")
    @CacheLookup
    private WebElement taiwan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(209) a")
    @CacheLookup
    private WebElement tajikstan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(210) a")
    @CacheLookup
    private WebElement tanzania;

    @FindBy(css = "#form-contact div.row div:nth-of-type(3) div.form-column-outer-wrapper.wrapper-right div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-topic ul.dropdown li:nth-of-type(2) a")
    @CacheLookup
    private WebElement technicalInquiry;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(211) a")
    @CacheLookup
    private WebElement thailand;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(212) a")
    @CacheLookup
    private WebElement timorleste;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(213) a")
    @CacheLookup
    private WebElement togo;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(214) a")
    @CacheLookup
    private WebElement tokelau;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(215) a")
    @CacheLookup
    private WebElement tonga;

    @FindBy(css = "a[href='/products/tranceivers.html']")
    @CacheLookup
    private WebElement tranceivers;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(216) a")
    @CacheLookup
    private WebElement trinidadTobago;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(217) a")
    @CacheLookup
    private WebElement tunisia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(218) a")
    @CacheLookup
    private WebElement turkey;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(219) a")
    @CacheLookup
    private WebElement turkmenistan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(220) a")
    @CacheLookup
    private WebElement turksAndCaicosIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(221) a")
    @CacheLookup
    private WebElement tuvalu;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(222) a")
    @CacheLookup
    private WebElement uSMinorOutlyingIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(223) a")
    @CacheLookup
    private WebElement uganda;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(224) a")
    @CacheLookup
    private WebElement ukraine;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(225) a")
    @CacheLookup
    private WebElement unitedArabEmirates;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(226) a")
    @CacheLookup
    private WebElement unitedKingdom;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(227) a")
    @CacheLookup
    private WebElement unitedStates;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(228) a")
    @CacheLookup
    private WebElement uruguay;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(229) a")
    @CacheLookup
    private WebElement uzbekistan;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(231) a")
    @CacheLookup
    private WebElement vanuatu;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(232) a")
    @CacheLookup
    private WebElement vaticanCityStateHolySee;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(233) a")
    @CacheLookup
    private WebElement venezuela;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(234) a")
    @CacheLookup
    private WebElement vietnam;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(230) a")
    @CacheLookup
    private WebElement virginIslandsUS;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(236) a")
    @CacheLookup
    private WebElement wallisAndFutunaIslands;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(237) a")
    @CacheLookup
    private WebElement westernSahara;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(235) a")
    @CacheLookup
    private WebElement westernSamoa;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(238) a")
    @CacheLookup
    private WebElement yemen;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(239) a")
    @CacheLookup
    private WebElement zambia;

    @FindBy(css = "#form-contact div.row div:nth-of-type(2) div.form-column-outer-wrapper.wrapper-left div.dropdown-wrapper.form-input-wrapper div.dropdown-face.dd.dd-country ul.dropdown li:nth-of-type(240) a")
    @CacheLookup
    private WebElement zimbabwe;

    public login() {
    }

    public login(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public login(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public login(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the login class instance.
     */
    public login clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Afghanistan Link.
     *
     * @return the login class instance.
     */
    public login clickAfghanistanLink() {
        afghanistan.click();
        return this;
    }

    /**
     * Click on Albania Link.
     *
     * @return the login class instance.
     */
    public login clickAlbaniaLink() {
        albania.click();
        return this;
    }

    /**
     * Click on Algeria Link.
     *
     * @return the login class instance.
     */
    public login clickAlgeriaLink() {
        algeria.click();
        return this;
    }

    /**
     * Click on Andorra Link.
     *
     * @return the login class instance.
     */
    public login clickAndorraLink() {
        andorra.click();
        return this;
    }

    /**
     * Click on Angola Link.
     *
     * @return the login class instance.
     */
    public login clickAngolaLink() {
        angola.click();
        return this;
    }

    /**
     * Click on Anguilla Link.
     *
     * @return the login class instance.
     */
    public login clickAnguillaLink() {
        anguilla.click();
        return this;
    }

    /**
     * Click on Antigua And Barbuda Link.
     *
     * @return the login class instance.
     */
    public login clickAntiguaAndBarbudaLink() {
        antiguaAndBarbuda.click();
        return this;
    }

    /**
     * Click on Application Delivery Controller Link.
     *
     * @return the login class instance.
     */
    public login clickApplicationDeliveryControllerLink() {
        applicationDeliveryController.click();
        return this;
    }

    /**
     * Click on Argentina Link.
     *
     * @return the login class instance.
     */
    public login clickArgentinaLink() {
        argentina.click();
        return this;
    }

    /**
     * Click on Armenia Link.
     *
     * @return the login class instance.
     */
    public login clickArmeniaLink() {
        armenia.click();
        return this;
    }

    /**
     * Click on Aruba Link.
     *
     * @return the login class instance.
     */
    public login clickArubaLink() {
        aruba.click();
        return this;
    }

    /**
     * Click on Australia Link.
     *
     * @return the login class instance.
     */
    public login clickAustraliaLink() {
        australia.click();
        return this;
    }

    /**
     * Click on Austria Link.
     *
     * @return the login class instance.
     */
    public login clickAustriaLink() {
        austria.click();
        return this;
    }

    /**
     * Click on Azerbaijan Link.
     *
     * @return the login class instance.
     */
    public login clickAzerbaijanLink() {
        azerbaijan.click();
        return this;
    }

    /**
     * Click on Bahamas Link.
     *
     * @return the login class instance.
     */
    public login clickBahamasLink() {
        bahamas.click();
        return this;
    }

    /**
     * Click on Bahrain Link.
     *
     * @return the login class instance.
     */
    public login clickBahrainLink() {
        bahrain.click();
        return this;
    }

    /**
     * Click on Bangladesh Link.
     *
     * @return the login class instance.
     */
    public login clickBangladeshLink() {
        bangladesh.click();
        return this;
    }

    /**
     * Click on Barbados Link.
     *
     * @return the login class instance.
     */
    public login clickBarbadosLink() {
        barbados.click();
        return this;
    }

    /**
     * Click on Belarus Link.
     *
     * @return the login class instance.
     */
    public login clickBelarusLink() {
        belarus.click();
        return this;
    }

    /**
     * Click on Belgium Link.
     *
     * @return the login class instance.
     */
    public login clickBelgiumLink() {
        belgium.click();
        return this;
    }

    /**
     * Click on Belize Link.
     *
     * @return the login class instance.
     */
    public login clickBelizeLink() {
        belize.click();
        return this;
    }

    /**
     * Click on Benin Link.
     *
     * @return the login class instance.
     */
    public login clickBeninLink() {
        benin.click();
        return this;
    }

    /**
     * Click on Bermuda Link.
     *
     * @return the login class instance.
     */
    public login clickBermudaLink() {
        bermuda.click();
        return this;
    }

    /**
     * Click on Bhutan Link.
     *
     * @return the login class instance.
     */
    public login clickBhutanLink() {
        bhutan.click();
        return this;
    }

    /**
     * Click on Bolivia Link.
     *
     * @return the login class instance.
     */
    public login clickBoliviaLink() {
        bolivia.click();
        return this;
    }

    /**
     * Click on Bosniaherzegovina Link.
     *
     * @return the login class instance.
     */
    public login clickBosniaherzegovinaLink() {
        bosniaherzegovina.click();
        return this;
    }

    /**
     * Click on Botswana Link.
     *
     * @return the login class instance.
     */
    public login clickBotswanaLink() {
        botswana.click();
        return this;
    }

    /**
     * Click on Bouvet Island Link.
     *
     * @return the login class instance.
     */
    public login clickBouvetIslandLink() {
        bouvetIsland.click();
        return this;
    }

    /**
     * Click on Brazil Link.
     *
     * @return the login class instance.
     */
    public login clickBrazilLink() {
        brazil.click();
        return this;
    }

    /**
     * Click on British Indian Ocean Territory Link.
     *
     * @return the login class instance.
     */
    public login clickBritishIndianOceanTerritoryLink() {
        britishIndianOceanTerritory.click();
        return this;
    }

    /**
     * Click on British Virgin Islands Link.
     *
     * @return the login class instance.
     */
    public login clickBritishVirginIslandsLink() {
        britishVirginIslands.click();
        return this;
    }

    /**
     * Click on Brocade Communities Link.
     *
     * @return the login class instance.
     */
    public login clickBrocadeCommunities1Link() {
        brocadeCommunities1.click();
        return this;
    }

    /**
     * Click on Brocade Communities Link.
     *
     * @return the login class instance.
     */
    public login clickBrocadeCommunities2Link() {
        brocadeCommunities2.click();
        return this;
    }

    /**
     * Click on Brocade Communities Link.
     *
     * @return the login class instance.
     */
    public login clickBrocadeCommunities3Link() {
        brocadeCommunities3.click();
        return this;
    }

    /**
     * Click on Brocade Network Subscription Link.
     *
     * @return the login class instance.
     */
    public login clickBrocadeNetworkSubscriptionLink() {
        brocadeNetworkSubscription.click();
        return this;
    }

    /**
     * Click on Brocade Training Link.
     *
     * @return the login class instance.
     */
    public login clickBrocadeTraining1Link() {
        brocadeTraining1.click();
        return this;
    }

    /**
     * Click on Brocade Training Link.
     *
     * @return the login class instance.
     */
    public login clickBrocadeTraining2Link() {
        brocadeTraining2.click();
        return this;
    }

    /**
     * Click on Brocade Training Link.
     *
     * @return the login class instance.
     */
    public login clickBrocadeTraining3Link() {
        brocadeTraining3.click();
        return this;
    }

    /**
     * Click on Brunei Darussalam Link.
     *
     * @return the login class instance.
     */
    public login clickBruneiDarussalamLink() {
        bruneiDarussalam.click();
        return this;
    }

    /**
     * Click on Bulgaria Link.
     *
     * @return the login class instance.
     */
    public login clickBulgariaLink() {
        bulgaria.click();
        return this;
    }

    /**
     * Click on Burkina Faso Link.
     *
     * @return the login class instance.
     */
    public login clickBurkinaFasoLink() {
        burkinaFaso.click();
        return this;
    }

    /**
     * Click on Burma Link.
     *
     * @return the login class instance.
     */
    public login clickBurmaLink() {
        burma.click();
        return this;
    }

    /**
     * Click on Burundi Link.
     *
     * @return the login class instance.
     */
    public login clickBurundiLink() {
        burundi.click();
        return this;
    }

    /**
     * Click on Business Inquiry Link.
     *
     * @return the login class instance.
     */
    public login clickBusinessInquiryLink() {
        businessInquiry.click();
        return this;
    }

    /**
     * Click on Cambodia Link.
     *
     * @return the login class instance.
     */
    public login clickCambodiaLink() {
        cambodia.click();
        return this;
    }

    /**
     * Click on Cameroon Link.
     *
     * @return the login class instance.
     */
    public login clickCameroonLink() {
        cameroon.click();
        return this;
    }

    /**
     * Click on Campus Lan Switches Link.
     *
     * @return the login class instance.
     */
    public login clickCampusLanSwitchesLink() {
        campusLanSwitches.click();
        return this;
    }

    /**
     * Click on Canada Link.
     *
     * @return the login class instance.
     */
    public login clickCanadaLink() {
        canada.click();
        return this;
    }

    /**
     * Click on Cape Verde Link.
     *
     * @return the login class instance.
     */
    public login clickCapeVerdeLink() {
        capeVerde.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the login class instance.
     */
    public login clickCareersLink() {
        careers.click();
        return this;
    }

    /**
     * Click on Carrier Ethernet Link.
     *
     * @return the login class instance.
     */
    public login clickCarrierEthernetLink() {
        carrierEthernet.click();
        return this;
    }

    /**
     * Click on Cayman Islands Link.
     *
     * @return the login class instance.
     */
    public login clickCaymanIslandsLink() {
        caymanIslands.click();
        return this;
    }

    /**
     * Click on Central African Republic Link.
     *
     * @return the login class instance.
     */
    public login clickCentralAfricanRepublicLink() {
        centralAfricanRepublic.click();
        return this;
    }

    /**
     * Click on Chad Link.
     *
     * @return the login class instance.
     */
    public login clickChadLink() {
        chad.click();
        return this;
    }

    /**
     * Click on Chile Link.
     *
     * @return the login class instance.
     */
    public login clickChileLink() {
        chile.click();
        return this;
    }

    /**
     * Click on China Link.
     *
     * @return the login class instance.
     */
    public login clickChinaLink() {
        china.click();
        return this;
    }

    /**
     * Click on Chinese Link.
     *
     * @return the login class instance.
     */
    public login clickChineseLink() {
        chinese.click();
        return this;
    }

    /**
     * Click on Christmas Island Link.
     *
     * @return the login class instance.
     */
    public login clickChristmasIslandLink() {
        christmasIsland.click();
        return this;
    }

    /**
     * Click on Click Here Link.
     *
     * @return the login class instance.
     */
    public login clickClickHereLink() {
        clickHere.click();
        return this;
    }

    /**
     * Click on Click Here Link.
     *
     * @return the login class instance.
     */
    public login clickClickHereLink() {
        clickHere.click();
        return this;
    }

    /**
     * Click on Cocos Keeling Islands Link.
     *
     * @return the login class instance.
     */
    public login clickCocosKeelingIslandsLink() {
        cocosKeelingIslands.click();
        return this;
    }

    /**
     * Click on Colombia Link.
     *
     * @return the login class instance.
     */
    public login clickColombiaLink() {
        colombia.click();
        return this;
    }

    /**
     * Click on Comoros Link.
     *
     * @return the login class instance.
     */
    public login clickComorosLink() {
        comoros.click();
        return this;
    }

    /**
     * Click on Congo Republic Of Brazzaville Link.
     *
     * @return the login class instance.
     */
    public login clickCongoRepublicOfBrazzavilleLink() {
        congoRepublicOfBrazzaville.click();
        return this;
    }

    /**
     * Click on Contact Me Button.
     *
     * @return the login class instance.
     */
    public login clickContactMeButton() {
        contactMe.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the login class instance.
     */
    public login clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the login class instance.
     */
    public login clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Contact Worldwide Office Link.
     *
     * @return the login class instance.
     */
    public login clickContactWorldwideOfficeLink() {
        contactWorldwideOffice.click();
        return this;
    }

    /**
     * Click on Cook Islands Link.
     *
     * @return the login class instance.
     */
    public login clickCookIslandsLink() {
        cookIslands.click();
        return this;
    }

    /**
     * Click on Costa Rica Link.
     *
     * @return the login class instance.
     */
    public login clickCostaRicaLink() {
        costaRica.click();
        return this;
    }

    /**
     * Click on Cote Dlvoire Link.
     *
     * @return the login class instance.
     */
    public login clickCoteDlvoireLink() {
        coteDlvoire.click();
        return this;
    }

    /**
     * Click on Croatia Link.
     *
     * @return the login class instance.
     */
    public login clickCroatiaLink() {
        croatia.click();
        return this;
    }

    /**
     * Click on Cyprus Link.
     *
     * @return the login class instance.
     */
    public login clickCyprusLink() {
        cyprus.click();
        return this;
    }

    /**
     * Click on Czech Republic Link.
     *
     * @return the login class instance.
     */
    public login clickCzechRepublicLink() {
        czechRepublic.click();
        return this;
    }

    /**
     * Click on Data Center Switches Link.
     *
     * @return the login class instance.
     */
    public login clickDataCenterSwitchesLink() {
        dataCenterSwitches.click();
        return this;
    }

    /**
     * Click on Democratic Republic Of The Congo Link.
     *
     * @return the login class instance.
     */
    public login clickDemocraticRepublicOfTheCongoLink() {
        democraticRepublicOfTheCongo.click();
        return this;
    }

    /**
     * Click on Denmark Link.
     *
     * @return the login class instance.
     */
    public login clickDenmarkLink() {
        denmark.click();
        return this;
    }

    /**
     * Click on Deutsch Deutschland Link.
     *
     * @return the login class instance.
     */
    public login clickDeutschDeutschlandLink() {
        deutschDeutschland.click();
        return this;
    }

    /**
     * Click on Djibouti Link.
     *
     * @return the login class instance.
     */
    public login clickDjiboutiLink() {
        djibouti.click();
        return this;
    }

    /**
     * Click on Dominica Link.
     *
     * @return the login class instance.
     */
    public login clickDominicaLink() {
        dominica.click();
        return this;
    }

    /**
     * Click on Dominican Republic Link.
     *
     * @return the login class instance.
     */
    public login clickDominicanRepublicLink() {
        dominicanRepublic.click();
        return this;
    }

    /**
     * Click on East Timor Link.
     *
     * @return the login class instance.
     */
    public login clickEastTimorLink() {
        eastTimor.click();
        return this;
    }

    /**
     * Click on Ecuador Link.
     *
     * @return the login class instance.
     */
    public login clickEcuadorLink() {
        ecuador.click();
        return this;
    }

    /**
     * Click on Edit Profile Link.
     *
     * @return the login class instance.
     */
    public login clickEditProfileLink() {
        editProfile.click();
        return this;
    }

    /**
     * Click on Education Link.
     *
     * @return the login class instance.
     */
    public login clickEducationLink() {
        education.click();
        return this;
    }

    /**
     * Click on Egypt Link.
     *
     * @return the login class instance.
     */
    public login clickEgyptLink() {
        egypt.click();
        return this;
    }

    /**
     * Click on El Salvador Link.
     *
     * @return the login class instance.
     */
    public login clickElSalvadorLink() {
        elSalvador.click();
        return this;
    }

    /**
     * Click on English Us Link.
     *
     * @return the login class instance.
     */
    public login clickEnglishUsLink() {
        englishUs.click();
        return this;
    }

    /**
     * Click on Equitorial Guinea Link.
     *
     * @return the login class instance.
     */
    public login clickEquitorialGuineaLink() {
        equitorialGuinea.click();
        return this;
    }

    /**
     * Click on Eritrea Link.
     *
     * @return the login class instance.
     */
    public login clickEritreaLink() {
        eritrea.click();
        return this;
    }

    /**
     * Click on Estonia Link.
     *
     * @return the login class instance.
     */
    public login clickEstoniaLink() {
        estonia.click();
        return this;
    }

    /**
     * Click on Ethiopia Link.
     *
     * @return the login class instance.
     */
    public login clickEthiopiaLink() {
        ethiopia.click();
        return this;
    }

    /**
     * Click on Explore Link.
     *
     * @return the login class instance.
     */
    public login clickExplore1Link() {
        explore1.click();
        return this;
    }

    /**
     * Click on Explore Link.
     *
     * @return the login class instance.
     */
    public login clickExplore2Link() {
        explore2.click();
        return this;
    }

    /**
     * Click on Explore Link.
     *
     * @return the login class instance.
     */
    public login clickExplore3Link() {
        explore3.click();
        return this;
    }

    /**
     * Click on Falkland Islands Link.
     *
     * @return the login class instance.
     */
    public login clickFalklandIslandsLink() {
        falklandIslands.click();
        return this;
    }

    /**
     * Click on Faroe Islands Link.
     *
     * @return the login class instance.
     */
    public login clickFaroeIslandsLink() {
        faroeIslands.click();
        return this;
    }

    /**
     * Click on Fibre Channel Link.
     *
     * @return the login class instance.
     */
    public login clickFibreChannelLink() {
        fibreChannel.click();
        return this;
    }

    /**
     * Click on Fiji Link.
     *
     * @return the login class instance.
     */
    public login clickFijiLink() {
        fiji.click();
        return this;
    }

    /**
     * Click on Finland Link.
     *
     * @return the login class instance.
     */
    public login clickFinlandLink() {
        finland.click();
        return this;
    }

    /**
     * Click on Forgot Your Id Or Password Link.
     *
     * @return the login class instance.
     */
    public login clickForgotYourIdOrPassword3Link() {
        forgotYourIdOrPassword3.click();
        return this;
    }

    /**
     * Click on Forgot Your Id Or Password Link.
     *
     * @return the login class instance.
     */
    public login clickForgotYourIdOrPassword4Link() {
        forgotYourIdOrPassword4.click();
        return this;
    }

    /**
     * Click on France Link.
     *
     * @return the login class instance.
     */
    public login clickFranceLink() {
        france.click();
        return this;
    }

    /**
     * Click on French Guiana Link.
     *
     * @return the login class instance.
     */
    public login clickFrenchGuianaLink() {
        frenchGuiana.click();
        return this;
    }

    /**
     * Click on French Metropolitan Link.
     *
     * @return the login class instance.
     */
    public login clickFrenchMetropolitanLink() {
        frenchMetropolitan.click();
        return this;
    }

    /**
     * Click on French Polynesia Link.
     *
     * @return the login class instance.
     */
    public login clickFrenchPolynesiaLink() {
        frenchPolynesia.click();
        return this;
    }

    /**
     * Click on French Southern Territories Link.
     *
     * @return the login class instance.
     */
    public login clickFrenchSouthernTerritoriesLink() {
        frenchSouthernTerritories.click();
        return this;
    }

    /**
     * Click on Gabon Link.
     *
     * @return the login class instance.
     */
    public login clickGabonLink() {
        gabon.click();
        return this;
    }

    /**
     * Click on Gambia Link.
     *
     * @return the login class instance.
     */
    public login clickGambiaLink() {
        gambia.click();
        return this;
    }

    /**
     * Click on Georgia Link.
     *
     * @return the login class instance.
     */
    public login clickGeorgiaLink() {
        georgia.click();
        return this;
    }

    /**
     * Click on Germany Link.
     *
     * @return the login class instance.
     */
    public login clickGermanyLink() {
        germany.click();
        return this;
    }

    /**
     * Click on Ghana Link.
     *
     * @return the login class instance.
     */
    public login clickGhanaLink() {
        ghana.click();
        return this;
    }

    /**
     * Click on Gibraltar Link.
     *
     * @return the login class instance.
     */
    public login clickGibraltarLink() {
        gibraltar.click();
        return this;
    }

    /**
     * Click on Greece Link.
     *
     * @return the login class instance.
     */
    public login clickGreeceLink() {
        greece.click();
        return this;
    }

    /**
     * Click on Greenland Link.
     *
     * @return the login class instance.
     */
    public login clickGreenlandLink() {
        greenland.click();
        return this;
    }

    /**
     * Click on Greetings Link.
     *
     * @return the login class instance.
     */
    public login clickGreetingsLink() {
        greetings.click();
        return this;
    }

    /**
     * Click on Grenada Link.
     *
     * @return the login class instance.
     */
    public login clickGrenadaLink() {
        grenada.click();
        return this;
    }

    /**
     * Click on Guadeloupe Link.
     *
     * @return the login class instance.
     */
    public login clickGuadeloupeLink() {
        guadeloupe.click();
        return this;
    }

    /**
     * Click on Guam Link.
     *
     * @return the login class instance.
     */
    public login clickGuamLink() {
        guam.click();
        return this;
    }

    /**
     * Click on Guatemala Link.
     *
     * @return the login class instance.
     */
    public login clickGuatemalaLink() {
        guatemala.click();
        return this;
    }

    /**
     * Click on Guernsey Link.
     *
     * @return the login class instance.
     */
    public login clickGuernseyLink() {
        guernsey.click();
        return this;
    }

    /**
     * Click on Guinea Bissau Link.
     *
     * @return the login class instance.
     */
    public login clickGuineaBissauLink() {
        guineaBissau.click();
        return this;
    }

    /**
     * Click on Guinea Link.
     *
     * @return the login class instance.
     */
    public login clickGuineaLink() {
        guinea.click();
        return this;
    }

    /**
     * Click on Guyana Link.
     *
     * @return the login class instance.
     */
    public login clickGuyanaLink() {
        guyana.click();
        return this;
    }

    /**
     * Click on Haiti Link.
     *
     * @return the login class instance.
     */
    public login clickHaitiLink() {
        haiti.click();
        return this;
    }

    /**
     * Click on Heard And Mcdonald Islands Link.
     *
     * @return the login class instance.
     */
    public login clickHeardAndMcdonaldIslandsLink() {
        heardAndMcdonaldIslands.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the login class instance.
     */
    public login clickHelpLink() {
        help.click();
        return this;
    }

    /**
     * Click on Honduras Link.
     *
     * @return the login class instance.
     */
    public login clickHondurasLink() {
        honduras.click();
        return this;
    }

    /**
     * Click on Hong Kong China Link.
     *
     * @return the login class instance.
     */
    public login clickHongKongChinaLink() {
        hongKongChina.click();
        return this;
    }

    /**
     * Click on How To Buy Link.
     *
     * @return the login class instance.
     */
    public login clickHowToBuyLink() {
        howToBuy.click();
        return this;
    }

    /**
     * Click on How To Buy Link.
     *
     * @return the login class instance.
     */
    public login clickHowToBuyLink() {
        howToBuy.click();
        return this;
    }

    /**
     * Click on Hungary Link.
     *
     * @return the login class instance.
     */
    public login clickHungaryLink() {
        hungary.click();
        return this;
    }

    /**
     * Click on Iceland Link.
     *
     * @return the login class instance.
     */
    public login clickIcelandLink() {
        iceland.click();
        return this;
    }

    /**
     * Click on India Link.
     *
     * @return the login class instance.
     */
    public login clickIndiaLink() {
        india.click();
        return this;
    }

    /**
     * Click on Indonesia Link.
     *
     * @return the login class instance.
     */
    public login clickIndonesiaLink() {
        indonesia.click();
        return this;
    }

    /**
     * Click on Investor Relations Link.
     *
     * @return the login class instance.
     */
    public login clickInvestorRelationsLink() {
        investorRelations.click();
        return this;
    }

    /**
     * Click on Ip Storage Link.
     *
     * @return the login class instance.
     */
    public login clickIpStorageLink() {
        ipStorage.click();
        return this;
    }

    /**
     * Click on Iraq Link.
     *
     * @return the login class instance.
     */
    public login clickIraqLink() {
        iraq.click();
        return this;
    }

    /**
     * Click on Ireland Link.
     *
     * @return the login class instance.
     */
    public login clickIrelandLink() {
        ireland.click();
        return this;
    }

    /**
     * Click on Isle Of Man Link.
     *
     * @return the login class instance.
     */
    public login clickIsleOfManLink() {
        isleOfMan.click();
        return this;
    }

    /**
     * Click on Israel Link.
     *
     * @return the login class instance.
     */
    public login clickIsraelLink() {
        israel.click();
        return this;
    }

    /**
     * Click on Italy Link.
     *
     * @return the login class instance.
     */
    public login clickItalyLink() {
        italy.click();
        return this;
    }

    /**
     * Click on Jamaica Link.
     *
     * @return the login class instance.
     */
    public login clickJamaicaLink() {
        jamaica.click();
        return this;
    }

    /**
     * Click on Japan Link.
     *
     * @return the login class instance.
     */
    public login clickJapanLink() {
        japan.click();
        return this;
    }

    /**
     * Click on Japanese Link.
     *
     * @return the login class instance.
     */
    public login clickJapaneseLink() {
        japanese.click();
        return this;
    }

    /**
     * Click on Jersey Link.
     *
     * @return the login class instance.
     */
    public login clickJerseyLink() {
        jersey.click();
        return this;
    }

    /**
     * Click on Join The Community Link.
     *
     * @return the login class instance.
     */
    public login clickJoinTheCommunityLink() {
        joinTheCommunity.click();
        return this;
    }

    /**
     * Click on Jordan Link.
     *
     * @return the login class instance.
     */
    public login clickJordanLink() {
        jordan.click();
        return this;
    }

    /**
     * Click on Kazakhstan Link.
     *
     * @return the login class instance.
     */
    public login clickKazakhstanLink() {
        kazakhstan.click();
        return this;
    }

    /**
     * Click on Kenya Link.
     *
     * @return the login class instance.
     */
    public login clickKenyaLink() {
        kenya.click();
        return this;
    }

    /**
     * Click on Kiribati Link.
     *
     * @return the login class instance.
     */
    public login clickKiribatiLink() {
        kiribati.click();
        return this;
    }

    /**
     * Click on Knowledge Base Link.
     *
     * @return the login class instance.
     */
    public login clickKnowledgeBase1Link() {
        knowledgeBase1.click();
        return this;
    }

    /**
     * Click on Knowledge Base Link.
     *
     * @return the login class instance.
     */
    public login clickKnowledgeBase2Link() {
        knowledgeBase2.click();
        return this;
    }

    /**
     * Click on Knowledge Base Link.
     *
     * @return the login class instance.
     */
    public login clickKnowledgeBase3Link() {
        knowledgeBase3.click();
        return this;
    }

    /**
     * Click on Korea South Link.
     *
     * @return the login class instance.
     */
    public login clickKoreaSouthLink() {
        koreaSouth.click();
        return this;
    }

    /**
     * Click on Korean Link.
     *
     * @return the login class instance.
     */
    public login clickKoreanLink() {
        korean.click();
        return this;
    }

    /**
     * Click on Kosovo Link.
     *
     * @return the login class instance.
     */
    public login clickKosovoLink() {
        kosovo.click();
        return this;
    }

    /**
     * Click on Kuwait Link.
     *
     * @return the login class instance.
     */
    public login clickKuwaitLink() {
        kuwait.click();
        return this;
    }

    /**
     * Click on Kyrgyzstan Link.
     *
     * @return the login class instance.
     */
    public login clickKyrgyzstanLink() {
        kyrgyzstan.click();
        return this;
    }

    /**
     * Click on Laos Peoples Democratic Republic Link.
     *
     * @return the login class instance.
     */
    public login clickLaosPeoplesDemocraticRepublicLink() {
        laosPeoplesDemocraticRepublic.click();
        return this;
    }

    /**
     * Click on Latvia Link.
     *
     * @return the login class instance.
     */
    public login clickLatviaLink() {
        latvia.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the login class instance.
     */
    public login clickLearnMoreLink() {
        learnMore.click();
        return this;
    }

    /**
     * Click on Lebanon Link.
     *
     * @return the login class instance.
     */
    public login clickLebanonLink() {
        lebanon.click();
        return this;
    }

    /**
     * Click on Legal Link.
     *
     * @return the login class instance.
     */
    public login clickLegalLink() {
        legal.click();
        return this;
    }

    /**
     * Click on Lesotho Link.
     *
     * @return the login class instance.
     */
    public login clickLesothoLink() {
        lesotho.click();
        return this;
    }

    /**
     * Click on Liberia Link.
     *
     * @return the login class instance.
     */
    public login clickLiberiaLink() {
        liberia.click();
        return this;
    }

    /**
     * Click on Libya Link.
     *
     * @return the login class instance.
     */
    public login clickLibyaLink() {
        libya.click();
        return this;
    }

    /**
     * Click on Liechtenstein Link.
     *
     * @return the login class instance.
     */
    public login clickLiechtensteinLink() {
        liechtenstein.click();
        return this;
    }

    /**
     * Click on Lithuania Link.
     *
     * @return the login class instance.
     */
    public login clickLithuaniaLink() {
        lithuania.click();
        return this;
    }

    /**
     * Click on Login Button.
     *
     * @return the login class instance.
     */
    public login clickLogin1Button() {
        login1.click();
        return this;
    }

    /**
     * Click on Login Button.
     *
     * @return the login class instance.
     */
    public login clickLogin2Button() {
        login2.click();
        return this;
    }

    /**
     * Click on Luxembourg Link.
     *
     * @return the login class instance.
     */
    public login clickLuxembourgLink() {
        luxembourg.click();
        return this;
    }

    /**
     * Click on Macau China Link.
     *
     * @return the login class instance.
     */
    public login clickMacauChinaLink() {
        macauChina.click();
        return this;
    }

    /**
     * Click on Macedonia Link.
     *
     * @return the login class instance.
     */
    public login clickMacedoniaLink() {
        macedonia.click();
        return this;
    }

    /**
     * Click on Madagascar Link.
     *
     * @return the login class instance.
     */
    public login clickMadagascarLink() {
        madagascar.click();
        return this;
    }

    /**
     * Click on Malawi Link.
     *
     * @return the login class instance.
     */
    public login clickMalawiLink() {
        malawi.click();
        return this;
    }

    /**
     * Click on Malaysia Link.
     *
     * @return the login class instance.
     */
    public login clickMalaysiaLink() {
        malaysia.click();
        return this;
    }

    /**
     * Click on Maldives Link.
     *
     * @return the login class instance.
     */
    public login clickMaldivesLink() {
        maldives.click();
        return this;
    }

    /**
     * Click on Mali Link.
     *
     * @return the login class instance.
     */
    public login clickMaliLink() {
        mali.click();
        return this;
    }

    /**
     * Click on Malta Link.
     *
     * @return the login class instance.
     */
    public login clickMaltaLink() {
        malta.click();
        return this;
    }

    /**
     * Click on Marshall Islands Link.
     *
     * @return the login class instance.
     */
    public login clickMarshallIslandsLink() {
        marshallIslands.click();
        return this;
    }

    /**
     * Click on Martinique Link.
     *
     * @return the login class instance.
     */
    public login clickMartiniqueLink() {
        martinique.click();
        return this;
    }

    /**
     * Click on Mauritania Link.
     *
     * @return the login class instance.
     */
    public login clickMauritaniaLink() {
        mauritania.click();
        return this;
    }

    /**
     * Click on Mauritius Link.
     *
     * @return the login class instance.
     */
    public login clickMauritiusLink() {
        mauritius.click();
        return this;
    }

    /**
     * Click on Mayotte Link.
     *
     * @return the login class instance.
     */
    public login clickMayotteLink() {
        mayotte.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the login class instance.
     */
    public login clickMenuLink() {
        menu.click();
        return this;
    }

    /**
     * Click on Mexico Link.
     *
     * @return the login class instance.
     */
    public login clickMexicoLink() {
        mexico.click();
        return this;
    }

    /**
     * Click on Micronesia Fed St Link.
     *
     * @return the login class instance.
     */
    public login clickMicronesiaFedStLink() {
        micronesiaFedSt.click();
        return this;
    }

    /**
     * Click on Moldova Republic Of Link.
     *
     * @return the login class instance.
     */
    public login clickMoldovaRepublicOfLink() {
        moldovaRepublicOf.click();
        return this;
    }

    /**
     * Click on Monaco Link.
     *
     * @return the login class instance.
     */
    public login clickMonacoLink() {
        monaco.click();
        return this;
    }

    /**
     * Click on Mongolia Link.
     *
     * @return the login class instance.
     */
    public login clickMongoliaLink() {
        mongolia.click();
        return this;
    }

    /**
     * Click on Montenegro Link.
     *
     * @return the login class instance.
     */
    public login clickMontenegroLink() {
        montenegro.click();
        return this;
    }

    /**
     * Click on Montserrat Link.
     *
     * @return the login class instance.
     */
    public login clickMontserratLink() {
        montserrat.click();
        return this;
    }

    /**
     * Click on Morocco Link.
     *
     * @return the login class instance.
     */
    public login clickMoroccoLink() {
        morocco.click();
        return this;
    }

    /**
     * Click on Mozambique Link.
     *
     * @return the login class instance.
     */
    public login clickMozambiqueLink() {
        mozambique.click();
        return this;
    }

    /**
     * Click on Mybrocade Link.
     *
     * @return the login class instance.
     */
    public login clickMybrocade1Link() {
        mybrocade1.click();
        return this;
    }

    /**
     * Click on Mybrocade Link.
     *
     * @return the login class instance.
     */
    public login clickMybrocade2Link() {
        mybrocade2.click();
        return this;
    }

    /**
     * Click on Mybrocade Link.
     *
     * @return the login class instance.
     */
    public login clickMybrocade3Link() {
        mybrocade3.click();
        return this;
    }

    /**
     * Click on Namibia Link.
     *
     * @return the login class instance.
     */
    public login clickNamibiaLink() {
        namibia.click();
        return this;
    }

    /**
     * Click on Nauru Link.
     *
     * @return the login class instance.
     */
    public login clickNauruLink() {
        nauru.click();
        return this;
    }

    /**
     * Click on Nepal Link.
     *
     * @return the login class instance.
     */
    public login clickNepalLink() {
        nepal.click();
        return this;
    }

    /**
     * Click on Netherlands Antilles Link.
     *
     * @return the login class instance.
     */
    public login clickNetherlandsAntillesLink() {
        netherlandsAntilles.click();
        return this;
    }

    /**
     * Click on Netherlands Link.
     *
     * @return the login class instance.
     */
    public login clickNetherlandsLink() {
        netherlands.click();
        return this;
    }

    /**
     * Click on Network Functions Virtualization Link.
     *
     * @return the login class instance.
     */
    public login clickNetworkFunctionsVirtualizationLink() {
        networkFunctionsVirtualization.click();
        return this;
    }

    /**
     * Click on Network Management Link.
     *
     * @return the login class instance.
     */
    public login clickNetworkManagementLink() {
        networkManagement.click();
        return this;
    }

    /**
     * Click on Network Monitoring Services Link.
     *
     * @return the login class instance.
     */
    public login clickNetworkMonitoringServicesLink() {
        networkMonitoringServices.click();
        return this;
    }

    /**
     * Click on New Caledonia Link.
     *
     * @return the login class instance.
     */
    public login clickNewCaledoniaLink() {
        newCaledonia.click();
        return this;
    }

    /**
     * Click on New Zealand Link.
     *
     * @return the login class instance.
     */
    public login clickNewZealandLink() {
        newZealand.click();
        return this;
    }

    /**
     * Click on Newsroom Link.
     *
     * @return the login class instance.
     */
    public login clickNewsroomLink() {
        newsroom.click();
        return this;
    }

    /**
     * Click on Nicaragua Link.
     *
     * @return the login class instance.
     */
    public login clickNicaraguaLink() {
        nicaragua.click();
        return this;
    }

    /**
     * Click on Niger Link.
     *
     * @return the login class instance.
     */
    public login clickNigerLink() {
        niger.click();
        return this;
    }

    /**
     * Click on Nigeria Link.
     *
     * @return the login class instance.
     */
    public login clickNigeriaLink() {
        nigeria.click();
        return this;
    }

    /**
     * Click on Niue Link.
     *
     * @return the login class instance.
     */
    public login clickNiueLink() {
        niue.click();
        return this;
    }

    /**
     * Click on Norfolk Island Link.
     *
     * @return the login class instance.
     */
    public login clickNorfolkIslandLink() {
        norfolkIsland.click();
        return this;
    }

    /**
     * Click on Northern Mariana Islands Link.
     *
     * @return the login class instance.
     */
    public login clickNorthernMarianaIslandsLink() {
        northernMarianaIslands.click();
        return this;
    }

    /**
     * Click on Norway Link.
     *
     * @return the login class instance.
     */
    public login clickNorwayLink() {
        norway.click();
        return this;
    }

    /**
     * Click on Oman Link.
     *
     * @return the login class instance.
     */
    public login clickOmanLink() {
        oman.click();
        return this;
    }

    /**
     * Click on Orchestration Link.
     *
     * @return the login class instance.
     */
    public login clickOrchestrationLink() {
        orchestration.click();
        return this;
    }

    /**
     * Click on Pakistan Link.
     *
     * @return the login class instance.
     */
    public login clickPakistanLink() {
        pakistan.click();
        return this;
    }

    /**
     * Click on Palau Link.
     *
     * @return the login class instance.
     */
    public login clickPalauLink() {
        palau.click();
        return this;
    }

    /**
     * Click on Palestinian National Authority Link.
     *
     * @return the login class instance.
     */
    public login clickPalestinianNationalAuthorityLink() {
        palestinianNationalAuthority.click();
        return this;
    }

    /**
     * Click on Panama Link.
     *
     * @return the login class instance.
     */
    public login clickPanamaLink() {
        panama.click();
        return this;
    }

    /**
     * Click on Papua New Guinea Link.
     *
     * @return the login class instance.
     */
    public login clickPapuaNewGuineaLink() {
        papuaNewGuinea.click();
        return this;
    }

    /**
     * Click on Paraguay Link.
     *
     * @return the login class instance.
     */
    public login clickParaguayLink() {
        paraguay.click();
        return this;
    }

    /**
     * Click on Partner Location Link.
     *
     * @return the login class instance.
     */
    public login clickPartnerLocationLink() {
        partnerLocation.click();
        return this;
    }

    /**
     * Click on Partners Link.
     *
     * @return the login class instance.
     */
    public login clickPartnersLink() {
        partners.click();
        return this;
    }

    /**
     * Click on Peru Link.
     *
     * @return the login class instance.
     */
    public login clickPeruLink() {
        peru.click();
        return this;
    }

    /**
     * Click on Philippines Link.
     *
     * @return the login class instance.
     */
    public login clickPhilippinesLink() {
        philippines.click();
        return this;
    }

    /**
     * Click on Pitcairn Island Link.
     *
     * @return the login class instance.
     */
    public login clickPitcairnIslandLink() {
        pitcairnIsland.click();
        return this;
    }

    /**
     * Click on Poland Link.
     *
     * @return the login class instance.
     */
    public login clickPolandLink() {
        poland.click();
        return this;
    }

    /**
     * Click on Portugal Link.
     *
     * @return the login class instance.
     */
    public login clickPortugalLink() {
        portugal.click();
        return this;
    }

    /**
     * Click on Possibilities Link.
     *
     * @return the login class instance.
     */
    public login clickPossibilitiesLink() {
        possibilities.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the login class instance.
     */
    public login clickPrivacyLink() {
        privacy.click();
        return this;
    }

    /**
     * Click on Products Services Link.
     *
     * @return the login class instance.
     */
    public login clickProductsServicesLink() {
        productsServices.click();
        return this;
    }

    /**
     * Click on Products Services Link.
     *
     * @return the login class instance.
     */
    public login clickProductsServicesLink() {
        productsServices.click();
        return this;
    }

    /**
     * Click on Professional Services Link.
     *
     * @return the login class instance.
     */
    public login clickProfessionalServicesLink() {
        professionalServices.click();
        return this;
    }

    /**
     * Click on Puerto Rico Link.
     *
     * @return the login class instance.
     */
    public login clickPuertoRicoLink() {
        puertoRico.click();
        return this;
    }

    /**
     * Click on Qatar Link.
     *
     * @return the login class instance.
     */
    public login clickQatarLink() {
        qatar.click();
        return this;
    }

    /**
     * Click on Register Link.
     *
     * @return the login class instance.
     */
    public login clickRegisterLink() {
        register.click();
        return this;
    }

    /**
     * Click on Register Now Link.
     *
     * @return the login class instance.
     */
    public login clickRegisterNowLink() {
        registerNow.click();
        return this;
    }

    /**
     * Click on Register Nowdocument.writea Link.
     *
     * @return the login class instance.
     */
    public login clickRegisterNowdocumentWriteaLink() {
        registerNowdocumentWritea.click();
        return this;
    }

    /**
     * Click on Residency Services Link.
     *
     * @return the login class instance.
     */
    public login clickResidencyServicesLink() {
        residencyServices.click();
        return this;
    }

    /**
     * Click on Reunion Island Link.
     *
     * @return the login class instance.
     */
    public login clickReunionIslandLink() {
        reunionIsland.click();
        return this;
    }

    /**
     * Click on Romania Link.
     *
     * @return the login class instance.
     */
    public login clickRomaniaLink() {
        romania.click();
        return this;
    }

    /**
     * Click on Routers Link.
     *
     * @return the login class instance.
     */
    public login clickRoutersLink() {
        routers.click();
        return this;
    }

    /**
     * Click on Russia Link.
     *
     * @return the login class instance.
     */
    public login clickRussiaLink() {
        russia.click();
        return this;
    }

    /**
     * Click on Russian Link.
     *
     * @return the login class instance.
     */
    public login clickRussianLink() {
        russian.click();
        return this;
    }

    /**
     * Click on Rwanda Link.
     *
     * @return the login class instance.
     */
    public login clickRwandaLink() {
        rwanda.click();
        return this;
    }

    /**
     * Click on Saint Helena Link.
     *
     * @return the login class instance.
     */
    public login clickSaintHelenaLink() {
        saintHelena.click();
        return this;
    }

    /**
     * Click on Saint Kitts And Nevis Link.
     *
     * @return the login class instance.
     */
    public login clickSaintKittsAndNevisLink() {
        saintKittsAndNevis.click();
        return this;
    }

    /**
     * Click on Saint Lucia Link.
     *
     * @return the login class instance.
     */
    public login clickSaintLuciaLink() {
        saintLucia.click();
        return this;
    }

    /**
     * Click on Saint Vincent And The Grenadines Link.
     *
     * @return the login class instance.
     */
    public login clickSaintVincentAndTheGrenadinesLink() {
        saintVincentAndTheGrenadines.click();
        return this;
    }

    /**
     * Click on Sales Inquiry Link.
     *
     * @return the login class instance.
     */
    public login clickSalesInquiryLink() {
        salesInquiry.click();
        return this;
    }

    /**
     * Click on Samoa American Link.
     *
     * @return the login class instance.
     */
    public login clickSamoaAmericanLink() {
        samoaAmerican.click();
        return this;
    }

    /**
     * Click on San Marino Link.
     *
     * @return the login class instance.
     */
    public login clickSanMarinoLink() {
        sanMarino.click();
        return this;
    }

    /**
     * Click on Sao Tome And Principe Link.
     *
     * @return the login class instance.
     */
    public login clickSaoTomeAndPrincipeLink() {
        saoTomeAndPrincipe.click();
        return this;
    }

    /**
     * Click on Saudi Arabia Link.
     *
     * @return the login class instance.
     */
    public login clickSaudiArabiaLink() {
        saudiArabia.click();
        return this;
    }

    /**
     * Click on Sdn Controllers Applications Link.
     *
     * @return the login class instance.
     */
    public login clickSdnControllersApplicationsLink() {
        sdnControllersApplications.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the login class instance.
     */
    public login clickSearchLink() {
        search.click();
        return this;
    }

    /**
     * Click on Senegal Link.
     *
     * @return the login class instance.
     */
    public login clickSenegalLink() {
        senegal.click();
        return this;
    }

    /**
     * Click on Serbia Link.
     *
     * @return the login class instance.
     */
    public login clickSerbiaLink() {
        serbia.click();
        return this;
    }

    /**
     * Click on Seychelles Link.
     *
     * @return the login class instance.
     */
    public login clickSeychellesLink() {
        seychelles.click();
        return this;
    }

    /**
     * Click on Sierra Leone Link.
     *
     * @return the login class instance.
     */
    public login clickSierraLeoneLink() {
        sierraLeone.click();
        return this;
    }

    /**
     * Click on Sign In Link.
     *
     * @return the login class instance.
     */
    public login clickSignInLink() {
        signIn.click();
        return this;
    }

    /**
     * Click on Signout Link.
     *
     * @return the login class instance.
     */
    public login clickSignoutLink() {
        signout.click();
        return this;
    }

    /**
     * Click on Singapore Link.
     *
     * @return the login class instance.
     */
    public login clickSingaporeLink() {
        singapore.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the login class instance.
     */
    public login clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Slovakia Link.
     *
     * @return the login class instance.
     */
    public login clickSlovakiaLink() {
        slovakia.click();
        return this;
    }

    /**
     * Click on Slovenia Link.
     *
     * @return the login class instance.
     */
    public login clickSloveniaLink() {
        slovenia.click();
        return this;
    }

    /**
     * Click on Software Licensing Link.
     *
     * @return the login class instance.
     */
    public login clickSoftwareLicensing1Link() {
        softwareLicensing1.click();
        return this;
    }

    /**
     * Click on Software Licensing Link.
     *
     * @return the login class instance.
     */
    public login clickSoftwareLicensing2Link() {
        softwareLicensing2.click();
        return this;
    }

    /**
     * Click on Software Licensing Link.
     *
     * @return the login class instance.
     */
    public login clickSoftwareLicensing3Link() {
        softwareLicensing3.click();
        return this;
    }

    /**
     * Click on Solomon Islands Link.
     *
     * @return the login class instance.
     */
    public login clickSolomonIslandsLink() {
        solomonIslands.click();
        return this;
    }

    /**
     * Click on Somalia Link.
     *
     * @return the login class instance.
     */
    public login clickSomaliaLink() {
        somalia.click();
        return this;
    }

    /**
     * Click on South Africa Link.
     *
     * @return the login class instance.
     */
    public login clickSouthAfricaLink() {
        southAfrica.click();
        return this;
    }

    /**
     * Click on South Georgia And South Sandwich Islands Link.
     *
     * @return the login class instance.
     */
    public login clickSouthGeorgiaAndSouthSandwichIslandsLink() {
        southGeorgiaAndSouthSandwichIslands.click();
        return this;
    }

    /**
     * Click on Spain Link.
     *
     * @return the login class instance.
     */
    public login clickSpainLink() {
        spain.click();
        return this;
    }

    /**
     * Click on Sri Lanka Link.
     *
     * @return the login class instance.
     */
    public login clickSriLankaLink() {
        sriLanka.click();
        return this;
    }

    /**
     * Click on St. Pierre And Miquelon Link.
     *
     * @return the login class instance.
     */
    public login clickStPierreAndMiquelonLink() {
        stPierreAndMiquelon.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the login class instance.
     */
    public login clickSupportLink() {
        support.click();
        return this;
    }

    /**
     * Click on Suriname Link.
     *
     * @return the login class instance.
     */
    public login clickSurinameLink() {
        suriname.click();
        return this;
    }

    /**
     * Click on Svalbard And Jan Mayen Islands Link.
     *
     * @return the login class instance.
     */
    public login clickSvalbardAndJanMayenIslandsLink() {
        svalbardAndJanMayenIslands.click();
        return this;
    }

    /**
     * Click on Swaziland Link.
     *
     * @return the login class instance.
     */
    public login clickSwazilandLink() {
        swaziland.click();
        return this;
    }

    /**
     * Click on Sweden Link.
     *
     * @return the login class instance.
     */
    public login clickSwedenLink() {
        sweden.click();
        return this;
    }

    /**
     * Click on Switzerland Link.
     *
     * @return the login class instance.
     */
    public login clickSwitzerlandLink() {
        switzerland.click();
        return this;
    }

    /**
     * Click on Taiwan Link.
     *
     * @return the login class instance.
     */
    public login clickTaiwanLink() {
        taiwan.click();
        return this;
    }

    /**
     * Click on Tajikstan Link.
     *
     * @return the login class instance.
     */
    public login clickTajikstanLink() {
        tajikstan.click();
        return this;
    }

    /**
     * Click on Tanzania Link.
     *
     * @return the login class instance.
     */
    public login clickTanzaniaLink() {
        tanzania.click();
        return this;
    }

    /**
     * Click on Technical Inquiry Link.
     *
     * @return the login class instance.
     */
    public login clickTechnicalInquiryLink() {
        technicalInquiry.click();
        return this;
    }

    /**
     * Click on Thailand Link.
     *
     * @return the login class instance.
     */
    public login clickThailandLink() {
        thailand.click();
        return this;
    }

    /**
     * Click on Timorleste Link.
     *
     * @return the login class instance.
     */
    public login clickTimorlesteLink() {
        timorleste.click();
        return this;
    }

    /**
     * Click on Togo Link.
     *
     * @return the login class instance.
     */
    public login clickTogoLink() {
        togo.click();
        return this;
    }

    /**
     * Click on Tokelau Link.
     *
     * @return the login class instance.
     */
    public login clickTokelauLink() {
        tokelau.click();
        return this;
    }

    /**
     * Click on Tonga Link.
     *
     * @return the login class instance.
     */
    public login clickTongaLink() {
        tonga.click();
        return this;
    }

    /**
     * Click on Tranceivers Link.
     *
     * @return the login class instance.
     */
    public login clickTranceiversLink() {
        tranceivers.click();
        return this;
    }

    /**
     * Click on Trinidad Tobago Link.
     *
     * @return the login class instance.
     */
    public login clickTrinidadTobagoLink() {
        trinidadTobago.click();
        return this;
    }

    /**
     * Click on Tunisia Link.
     *
     * @return the login class instance.
     */
    public login clickTunisiaLink() {
        tunisia.click();
        return this;
    }

    /**
     * Click on Turkey Link.
     *
     * @return the login class instance.
     */
    public login clickTurkeyLink() {
        turkey.click();
        return this;
    }

    /**
     * Click on Turkmenistan Link.
     *
     * @return the login class instance.
     */
    public login clickTurkmenistanLink() {
        turkmenistan.click();
        return this;
    }

    /**
     * Click on Turks And Caicos Islands Link.
     *
     * @return the login class instance.
     */
    public login clickTurksAndCaicosIslandsLink() {
        turksAndCaicosIslands.click();
        return this;
    }

    /**
     * Click on Tuvalu Link.
     *
     * @return the login class instance.
     */
    public login clickTuvaluLink() {
        tuvalu.click();
        return this;
    }

    /**
     * Click on U.s. Minor Outlying Islands Link.
     *
     * @return the login class instance.
     */
    public login clickUSMinorOutlyingIslandsLink() {
        uSMinorOutlyingIslands.click();
        return this;
    }

    /**
     * Click on Uganda Link.
     *
     * @return the login class instance.
     */
    public login clickUgandaLink() {
        uganda.click();
        return this;
    }

    /**
     * Click on Ukraine Link.
     *
     * @return the login class instance.
     */
    public login clickUkraineLink() {
        ukraine.click();
        return this;
    }

    /**
     * Click on United Arab Emirates Link.
     *
     * @return the login class instance.
     */
    public login clickUnitedArabEmiratesLink() {
        unitedArabEmirates.click();
        return this;
    }

    /**
     * Click on United Kingdom Link.
     *
     * @return the login class instance.
     */
    public login clickUnitedKingdomLink() {
        unitedKingdom.click();
        return this;
    }

    /**
     * Click on United States Link.
     *
     * @return the login class instance.
     */
    public login clickUnitedStatesLink() {
        unitedStates.click();
        return this;
    }

    /**
     * Click on Uruguay Link.
     *
     * @return the login class instance.
     */
    public login clickUruguayLink() {
        uruguay.click();
        return this;
    }

    /**
     * Click on Uzbekistan Link.
     *
     * @return the login class instance.
     */
    public login clickUzbekistanLink() {
        uzbekistan.click();
        return this;
    }

    /**
     * Click on Vanuatu Link.
     *
     * @return the login class instance.
     */
    public login clickVanuatuLink() {
        vanuatu.click();
        return this;
    }

    /**
     * Click on Vatican City State Holy See Link.
     *
     * @return the login class instance.
     */
    public login clickVaticanCityStateHolySeeLink() {
        vaticanCityStateHolySee.click();
        return this;
    }

    /**
     * Click on Venezuela Link.
     *
     * @return the login class instance.
     */
    public login clickVenezuelaLink() {
        venezuela.click();
        return this;
    }

    /**
     * Click on Vietnam Link.
     *
     * @return the login class instance.
     */
    public login clickVietnamLink() {
        vietnam.click();
        return this;
    }

    /**
     * Click on Virgin Islands U.s. Link.
     *
     * @return the login class instance.
     */
    public login clickVirginIslandsUSLink() {
        virginIslandsUS.click();
        return this;
    }

    /**
     * Click on Wallis And Futuna Islands Link.
     *
     * @return the login class instance.
     */
    public login clickWallisAndFutunaIslandsLink() {
        wallisAndFutunaIslands.click();
        return this;
    }

    /**
     * Click on Western Sahara Link.
     *
     * @return the login class instance.
     */
    public login clickWesternSaharaLink() {
        westernSahara.click();
        return this;
    }

    /**
     * Click on Western Samoa Link.
     *
     * @return the login class instance.
     */
    public login clickWesternSamoaLink() {
        westernSamoa.click();
        return this;
    }

    /**
     * Click on Yemen Link.
     *
     * @return the login class instance.
     */
    public login clickYemenLink() {
        yemen.click();
        return this;
    }

    /**
     * Click on Zambia Link.
     *
     * @return the login class instance.
     */
    public login clickZambiaLink() {
        zambia.click();
        return this;
    }

    /**
     * Click on Zimbabwe Link.
     *
     * @return the login class instance.
     */
    public login clickZimbabweLink() {
        zimbabwe.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the login class instance.
     */
    public login fill() {
        setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean1TextField();
        setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean2TextField();
        setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean3EmailField();
        setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4DropDownListField();
        setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean5TextField();
        setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean6TextField();
        setByProvidingUsWithYourEmail1TextareaField();
        setByProvidingUsWithYourEmail2TextareaField();
        setForgotYourIdOrPassword1PasswordField();
        setForgotYourIdOrPassword2PasswordField();
        setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase1TextField();
        setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase2TextField();
        setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase3TextField();
        setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase4PasswordField();
        setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5DropDownListField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the login class instance.
     */
    public login fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Text field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean1TextField() {
        return setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean1TextField(data.get("AFGHANISTANALBANIAALGERIAANDORRAANGOLAANGUILLAANTIGUA_AND_BARBUDAARGENTINAARMENIAARUBAAUSTRALIAAUSTRIAAZERBAIJANBAHAMASBAHRAINBANGLADESHBARBADOSBELARUSBELGIUMBELIZEBENINBERMUDABHUTANBOLIVIABOSNIAHERZEGOVINABOTSWANABOUVET_ISLANDBRAZILBRITISH_INDIAN_OCEAN_1"));
    }

    /**
     * Set value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Text field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean1TextField(String afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean1Value) {
        afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean1.sendKeys(afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean1Value);
        return this;
    }

    /**
     * Set default value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Text field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean2TextField() {
        return setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean2TextField(data.get("AFGHANISTANALBANIAALGERIAANDORRAANGOLAANGUILLAANTIGUA_AND_BARBUDAARGENTINAARMENIAARUBAAUSTRALIAAUSTRIAAZERBAIJANBAHAMASBAHRAINBANGLADESHBARBADOSBELARUSBELGIUMBELIZEBENINBERMUDABHUTANBOLIVIABOSNIAHERZEGOVINABOTSWANABOUVET_ISLANDBRAZILBRITISH_INDIAN_OCEAN_2"));
    }

    /**
     * Set value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Text field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean2TextField(String afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean2Value) {
        afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean2.sendKeys(afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean2Value);
        return this;
    }

    /**
     * Set default value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Email field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean3EmailField() {
        return setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean3EmailField(data.get("AFGHANISTANALBANIAALGERIAANDORRAANGOLAANGUILLAANTIGUA_AND_BARBUDAARGENTINAARMENIAARUBAAUSTRALIAAUSTRIAAZERBAIJANBAHAMASBAHRAINBANGLADESHBARBADOSBELARUSBELGIUMBELIZEBENINBERMUDABHUTANBOLIVIABOSNIAHERZEGOVINABOTSWANABOUVET_ISLANDBRAZILBRITISH_INDIAN_OCEAN_3"));
    }

    /**
     * Set value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Email field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean3EmailField(String afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean3Value) {
        afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean3.sendKeys(afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean3Value);
        return this;
    }

    /**
     * Set default value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Drop Down List field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4DropDownListField() {
        return setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4DropDownListField(data.get("AFGHANISTANALBANIAALGERIAANDORRAANGOLAANGUILLAANTIGUA_AND_BARBUDAARGENTINAARMENIAARUBAAUSTRALIAAUSTRIAAZERBAIJANBAHAMASBAHRAINBANGLADESHBARBADOSBELARUSBELGIUMBELIZEBENINBERMUDABHUTANBOLIVIABOSNIAHERZEGOVINABOTSWANABOUVET_ISLANDBRAZILBRITISH_INDIAN_OCEAN_4"));
    }

    /**
     * Set value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Drop Down List field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4DropDownListField(String afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4Value) {
        new Select(afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4).selectByVisibleText(afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4Value);
        return this;
    }

    /**
     * Set default value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Text field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean5TextField() {
        return setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean5TextField(data.get("AFGHANISTANALBANIAALGERIAANDORRAANGOLAANGUILLAANTIGUA_AND_BARBUDAARGENTINAARMENIAARUBAAUSTRALIAAUSTRIAAZERBAIJANBAHAMASBAHRAINBANGLADESHBARBADOSBELARUSBELGIUMBELIZEBENINBERMUDABHUTANBOLIVIABOSNIAHERZEGOVINABOTSWANABOUVET_ISLANDBRAZILBRITISH_INDIAN_OCEAN_5"));
    }

    /**
     * Set value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Text field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean5TextField(String afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean5Value) {
        afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean5.sendKeys(afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean5Value);
        return this;
    }

    /**
     * Set default value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Text field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean6TextField() {
        return setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean6TextField(data.get("AFGHANISTANALBANIAALGERIAANDORRAANGOLAANGUILLAANTIGUA_AND_BARBUDAARGENTINAARMENIAARUBAAUSTRALIAAUSTRIAAZERBAIJANBAHAMASBAHRAINBANGLADESHBARBADOSBELARUSBELGIUMBELIZEBENINBERMUDABHUTANBOLIVIABOSNIAHERZEGOVINABOTSWANABOUVET_ISLANDBRAZILBRITISH_INDIAN_OCEAN_6"));
    }

    /**
     * Set value to Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Text field.
     *
     * @return the login class instance.
     */
    public login setAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean6TextField(String afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean6Value) {
        afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean6.sendKeys(afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean6Value);
        return this;
    }

    /**
     * Set default value to By Providing Us With Your Email Address Andor Work Phone And Clicking The Contact Me Button You Grant Brocade Andor Its Partners Permission To Contact You Textarea field.
     *
     * @return the login class instance.
     */
    public login setByProvidingUsWithYourEmail1TextareaField() {
        return setByProvidingUsWithYourEmail1TextareaField(data.get("BY_PROVIDING_US_WITH_YOUR_EMAIL_1"));
    }

    /**
     * Set value to By Providing Us With Your Email Address Andor Work Phone And Clicking The Contact Me Button You Grant Brocade Andor Its Partners Permission To Contact You Textarea field.
     *
     * @return the login class instance.
     */
    public login setByProvidingUsWithYourEmail1TextareaField(String byProvidingUsWithYourEmail1Value) {
        new Select(byProvidingUsWithYourEmail1).selectByVisibleText(byProvidingUsWithYourEmail1Value);
        return this;
    }

    /**
     * Set default value to By Providing Us With Your Email Address Andor Work Phone And Clicking The Contact Me Button You Grant Brocade Andor Its Partners Permission To Contact You Textarea field.
     *
     * @return the login class instance.
     */
    public login setByProvidingUsWithYourEmail2TextareaField() {
        return setByProvidingUsWithYourEmail2TextareaField(data.get("BY_PROVIDING_US_WITH_YOUR_EMAIL_2"));
    }

    /**
     * Set value to By Providing Us With Your Email Address Andor Work Phone And Clicking The Contact Me Button You Grant Brocade Andor Its Partners Permission To Contact You Textarea field.
     *
     * @return the login class instance.
     */
    public login setByProvidingUsWithYourEmail2TextareaField(String byProvidingUsWithYourEmail2Value) {
        byProvidingUsWithYourEmail2.sendKeys(byProvidingUsWithYourEmail2Value);
        return this;
    }

    /**
     * Set default value to Forgot Your Id Or Password Password field.
     *
     * @return the login class instance.
     */
    public login setForgotYourIdOrPassword1PasswordField() {
        return setForgotYourIdOrPassword1PasswordField(data.get("FORGOT_YOUR_ID_OR_PASSWORD_1"));
    }

    /**
     * Set value to Forgot Your Id Or Password Password field.
     *
     * @return the login class instance.
     */
    public login setForgotYourIdOrPassword1PasswordField(String forgotYourIdOrPassword1Value) {
        forgotYourIdOrPassword1.sendKeys(forgotYourIdOrPassword1Value);
        return this;
    }

    /**
     * Set default value to Forgot Your Id Or Password Password field.
     *
     * @return the login class instance.
     */
    public login setForgotYourIdOrPassword2PasswordField() {
        return setForgotYourIdOrPassword2PasswordField(data.get("FORGOT_YOUR_ID_OR_PASSWORD_2"));
    }

    /**
     * Set value to Forgot Your Id Or Password Password field.
     *
     * @return the login class instance.
     */
    public login setForgotYourIdOrPassword2PasswordField(String forgotYourIdOrPassword2Value) {
        forgotYourIdOrPassword2.sendKeys(forgotYourIdOrPassword2Value);
        return this;
    }

    /**
     * Set default value to Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Text field.
     *
     * @return the login class instance.
     */
    public login setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase1TextField() {
        return setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase1TextField(data.get("MYBROCADEBROCADE_TRAININGSOFTWARE_LICENSINGBROCADE_COMMUNITIESKNOWLEDGE_BASE_1"));
    }

    /**
     * Set value to Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Text field.
     *
     * @return the login class instance.
     */
    public login setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase1TextField(String mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase1Value) {
        new Select(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase1).selectByVisibleText(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase1Value);
        return this;
    }

    /**
     * Set default value to Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Text field.
     *
     * @return the login class instance.
     */
    public login setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase2TextField() {
        return setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase2TextField(data.get("MYBROCADEBROCADE_TRAININGSOFTWARE_LICENSINGBROCADE_COMMUNITIESKNOWLEDGE_BASE_2"));
    }

    /**
     * Set value to Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Text field.
     *
     * @return the login class instance.
     */
    public login setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase2TextField(String mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase2Value) {
        mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase2.sendKeys(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase2Value);
        return this;
    }

    /**
     * Set default value to Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Text field.
     *
     * @return the login class instance.
     */
    public login setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase3TextField() {
        return setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase3TextField(data.get("MYBROCADEBROCADE_TRAININGSOFTWARE_LICENSINGBROCADE_COMMUNITIESKNOWLEDGE_BASE_3"));
    }

    /**
     * Set value to Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Text field.
     *
     * @return the login class instance.
     */
    public login setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase3TextField(String mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase3Value) {
        mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase3.sendKeys(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase3Value);
        return this;
    }

    /**
     * Set default value to Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Password field.
     *
     * @return the login class instance.
     */
    public login setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase4PasswordField() {
        return setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase4PasswordField(data.get("MYBROCADEBROCADE_TRAININGSOFTWARE_LICENSINGBROCADE_COMMUNITIESKNOWLEDGE_BASE_4"));
    }

    /**
     * Set value to Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Password field.
     *
     * @return the login class instance.
     */
    public login setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase4PasswordField(String mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase4Value) {
        mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase4.sendKeys(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase4Value);
        return this;
    }

    /**
     * Set default value to Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Drop Down List field.
     *
     * @return the login class instance.
     */
    public login setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5DropDownListField() {
        return setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5DropDownListField(data.get("MYBROCADEBROCADE_TRAININGSOFTWARE_LICENSINGBROCADE_COMMUNITIESKNOWLEDGE_BASE_5"));
    }

    /**
     * Set value to Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Drop Down List field.
     *
     * @return the login class instance.
     */
    public login setMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5DropDownListField(String mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5Value) {
        new Select(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5).selectByVisibleText(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the login class instance.
     */
    public login submit() {
        clickLoginButton();
        return this;
    }

    /**
     * Unset default value from Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Drop Down List field.
     *
     * @return the login class instance.
     */
    public login unsetAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4DropDownListField() {
        return unsetAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4DropDownListField(data.get("AFGHANISTANALBANIAALGERIAANDORRAANGOLAANGUILLAANTIGUA_AND_BARBUDAARGENTINAARMENIAARUBAAUSTRALIAAUSTRIAAZERBAIJANBAHAMASBAHRAINBANGLADESHBARBADOSBELARUSBELGIUMBELIZEBENINBERMUDABHUTANBOLIVIABOSNIAHERZEGOVINABOTSWANABOUVET_ISLANDBRAZILBRITISH_INDIAN_OCEAN_4"));
    }

    /**
     * Unset value from Afghanistanalbaniaalgeriaandorraangolaanguillaantigua And Barbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvet Islandbrazilbritish Indian Ocean Territorybritish Virgin Islandsbrunei Darussalambulgariaburkina Fasoburmaburundicambodiacamerooncanadacape Verdecayman Islandscentral African Republicchadchilechinachristmas Islandcocos Keeling Islandscolombiacomoroscongo Republic Of Brazzavillecook Islandscosta Ricacote Dlvoirecroatiacyprusczech Republicdemocratic Republic Of The Congodenmarkdjiboutidominicadominican Republiceast Timorecuadoregyptel Salvadorequitorial Guineaeritreaestoniaethiopiafalkland Islandsfaroe Islandsfijifinlandfrancefrench Guianafrench Metropolitanfrench Polynesiafrench Southern Territoriesgabongambiageorgiagermanyghanagibraltargreecegreenlandgrenadaguadeloupeguamguatemalaguernseyguineaguinea Bissauguyanahaitiheard And Mcdonald Islandshondurashong Kong Chinahungaryicelandindiaindonesiairaqirelandisle Of Manisraelitalyjamaicajapanjerseyjordankosovokazakhstankenyakiribatikorea Southkuwaitkyrgyzstanlaos Peoples Democratic Republiclatvialebanonlesotholiberialibyaliechtensteinlithuanialuxembourgmacau Chinamacedoniamadagascarmalawimalaysiamaldivesmalimaltamarshall Islandsmartiniquemauritaniamauritiusmayottemexicomicronesia Fed Stmoldova Republic Ofmonacomongoliamontenegromontserratmoroccomozambiquenamibianaurunepalnetherlandsnetherlands Antillesnew Caledonianew Zealandnicaraguanigernigerianiuenorfolk Islandnorthern Mariana Islandsnorwayomanpakistanpalaupalestinian National Authoritypanamapapua New Guineaparaguayperuphilippinespitcairn Islandpolandportugalpuerto Ricoqatarreunion Islandromaniarussiarwandasaint Helenasaint Kitts And Nevissaint Luciasaint Vincent And The Grenadinessamoa Americansan Marinosao Tome And Principesaudi Arabiasenegalserbiaseychellessierra Leonesingaporeslovakiasloveniasolomon Islandssomaliasouth Africasouth Georgia And South Sandwich Islandsspainsri Lankast Drop Down List field.
     *
     * @return the login class instance.
     */
    public login unsetAfghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4DropDownListField(String afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4Value) {
        new Select(afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4).deselectByVisibleText(afghanistanalbaniaalgeriaandorraangolaanguillaantiguaAndBarbudaargentinaarmeniaarubaaustraliaaustriaazerbaijanbahamasbahrainbangladeshbarbadosbelarusbelgiumbelizebeninbermudabhutanboliviabosniaherzegovinabotswanabouvetIslandbrazilbritishIndianOcean4Value);
        return this;
    }

    /**
     * Unset default value from By Providing Us With Your Email Address Andor Work Phone And Clicking The Contact Me Button You Grant Brocade Andor Its Partners Permission To Contact You Drop Down List field.
     *
     * @return the login class instance.
     */
    public login unsetByProvidingUsWithYourEmailDropDownListField() {
        return unsetByProvidingUsWithYourEmailDropDownListField(data.get("BY_PROVIDING_US_WITH_YOUR_EMAIL"));
    }

    /**
     * Unset value from By Providing Us With Your Email Address Andor Work Phone And Clicking The Contact Me Button You Grant Brocade Andor Its Partners Permission To Contact You Drop Down List field.
     *
     * @return the login class instance.
     */
    public login unsetByProvidingUsWithYourEmailDropDownListField(String byProvidingUsWithYourEmailValue) {
        new Select(byProvidingUsWithYourEmail).deselectByVisibleText(byProvidingUsWithYourEmailValue);
        return this;
    }

    /**
     * Unset default value from Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Drop Down List field.
     *
     * @return the login class instance.
     */
    public login unsetMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5DropDownListField() {
        return unsetMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5DropDownListField(data.get("MYBROCADEBROCADE_TRAININGSOFTWARE_LICENSINGBROCADE_COMMUNITIESKNOWLEDGE_BASE_5"));
    }

    /**
     * Unset value from Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Drop Down List field.
     *
     * @return the login class instance.
     */
    public login unsetMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5DropDownListField(String mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5Value) {
        new Select(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5).deselectByVisibleText(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase5Value);
        return this;
    }

    /**
     * Unset default value from Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Drop Down List field.
     *
     * @return the login class instance.
     */
    public login unsetMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBaseDropDownListField() {
        return unsetMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBaseDropDownListField(data.get("MYBROCADEBROCADE_TRAININGSOFTWARE_LICENSINGBROCADE_COMMUNITIESKNOWLEDGE_BASE"));
    }

    /**
     * Unset value from Mybrocadebrocade Trainingsoftware Licensingbrocade Communitiesknowledge Base Drop Down List field.
     *
     * @return the login class instance.
     */
    public login unsetMybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBaseDropDownListField(String mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBaseValue) {
        new Select(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBase).deselectByVisibleText(mybrocadebrocadeTrainingsoftwareLicensingbrocadeCommunitiesknowledgeBaseValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the login class instance.
     */
    public login verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the login class instance.
     */
    public login verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
