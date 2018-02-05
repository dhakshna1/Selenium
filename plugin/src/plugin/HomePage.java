import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#slick-slide00 button")
    @CacheLookup
    private WebElement 1;

    @FindBy(css = "#mm-5 ul.primary-nav-tools.mm-listview li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement 10;

    @FindBy(css = "#slick-slide01 button")
    @CacheLookup
    private WebElement 2;

    @FindBy(css = "#mm-7 div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement 20;

    @FindBy(css = "#slick-slide02 button")
    @CacheLookup
    private WebElement 3;

    @FindBy(css = "a.utility-nav-tools-alerts.utility-nav-top-level")
    @CacheLookup
    private WebElement 30;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(2) a.primary-nav-tools-alerts.primary-nav-top-level")
    @CacheLookup
    private WebElement 40;

    @FindBy(css = "a.btn.btn-light-blue")
    @CacheLookup
    private WebElement addProduct;

    @FindBy(css = "a.wrapper")
    @CacheLookup
    private WebElement addProduct1;

    @FindBy(css = "#pica div:nth-of-type(2) div:nth-of-type(3) div.cared-products--list-container ul.cared-products--list li:nth-of-type(6) a")
    @CacheLookup
    private WebElement addProduct2;

    @FindBy(css = "#pica div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) div.cared-products--init-hint-text a")
    @CacheLookup
    private WebElement addingProductsFromTheBrocadeProduct;

    @FindBy(css = "#mm-productListID li:nth-of-type(2) a")
    @CacheLookup
    private WebElement brocade300Switch1;

    @FindBy(css = "#productListID li:nth-of-type(2) a")
    @CacheLookup
    private WebElement brocade300Switch2;

    @FindBy(css = "#productFlyoutLeftContent li:nth-of-type(2) a")
    @CacheLookup
    private WebElement brocade300Switch3;

    @FindBy(css = "a[href='/wps/myportal/myb/products/productdetail?pCode=300&pName=Brocade+300+Switch&pType=HW']")
    @CacheLookup
    private WebElement brocade300Switch4;

    @FindBy(css = "#mm-productListID li:nth-of-type(4) a")
    @CacheLookup
    private WebElement brocade5100Switch1;

    @FindBy(css = "#productListID li:nth-of-type(4) a")
    @CacheLookup
    private WebElement brocade5100Switch2;

    @FindBy(css = "#productFlyoutLeftContent li:nth-of-type(4) a")
    @CacheLookup
    private WebElement brocade5100Switch3;

    @FindBy(css = "a[href='/wps/myportal/myb/products/productdetail?pCode=5100&pName=Brocade+5100+Switch&pType=HW']")
    @CacheLookup
    private WebElement brocade5100Switch4;

    @FindBy(css = "#mm-productListID li:nth-of-type(5) a")
    @CacheLookup
    private WebElement brocade6505Switch1;

    @FindBy(css = "#productListID li:nth-of-type(5) a")
    @CacheLookup
    private WebElement brocade6505Switch2;

    @FindBy(css = "#productFlyoutLeftContent li:nth-of-type(5) a")
    @CacheLookup
    private WebElement brocade6505Switch3;

    @FindBy(css = "a[href='/wps/myportal/myb/products/productdetail?pCode=6505&pName=Brocade+6505+Switch&pType=HW']")
    @CacheLookup
    private WebElement brocade6505Switch4;

    @FindBy(css = "#mm-productListID li:nth-of-type(3) a")
    @CacheLookup
    private WebElement brocade6510Switch1;

    @FindBy(css = "#productListID li:nth-of-type(3) a")
    @CacheLookup
    private WebElement brocade6510Switch2;

    @FindBy(css = "#productFlyoutLeftContent li:nth-of-type(3) a")
    @CacheLookup
    private WebElement brocade6510Switch3;

    @FindBy(css = "a[href='/wps/myportal/myb/products/productdetail?pCode=6510&pName=Brocade+6510+Switch&pType=HW']")
    @CacheLookup
    private WebElement brocade6510Switch4;

    @FindBy(css = "#mm-productListID li:nth-of-type(1) a")
    @CacheLookup
    private WebElement brocade6520Switch1;

    @FindBy(css = "#productListID li:nth-of-type(1) a")
    @CacheLookup
    private WebElement brocade6520Switch2;

    @FindBy(css = "#productFlyoutLeftContent li:nth-of-type(1) a")
    @CacheLookup
    private WebElement brocade6520Switch3;

    @FindBy(css = "a[href='/wps/myportal/myb/products/productdetail?pCode=6520&pName=Brocade+6520+Switch&pType=HW']")
    @CacheLookup
    private WebElement brocade6520Switch4;

    @FindBy(css = "#primary-nav div.primary-nav-switch.is-hidden div.nav-switch-label select.nav-switch-select.select2-hidden-accessible")
    @CacheLookup
    private WebElement brocadeCapitalSolutions1;

    @FindBy(id = "brocade-capital-solutions-")
    @CacheLookup
    private WebElement brocadeCapitalSolutions2;

    @FindBy(css = "a[href='https://www.brocade.com']")
    @CacheLookup
    private WebElement brocadeCom;

    @FindBy(css = "a[href='/wps/myportal/myb/products/downloads?prodCode=FLOW_OPTIMIZER&completePath=downloads/Brocade Flow Optimizer/Evaluation/flow_optimizer_2.0.0-distribution.tar']")
    @CacheLookup
    private WebElement brocadeFlowOptimizerV200ForLinux1;

    @FindBy(css = "a[href='/wps/myportal/myb/products/downloads?prodCode=FLOW_OPTIMIZER&completePath=downloads/Brocade Flow Optimizer/BFO 2.0.0_GA/flow_optimizer_2.0.0-distribution.tar']")
    @CacheLookup
    private WebElement brocadeFlowOptimizerV200ForLinux2;

    @FindBy(css = "#mm-productHTMLID ul.featured-links.mm-listview li:nth-of-type(2) a")
    @CacheLookup
    private WebElement brocadeProductCatalog1;

    @FindBy(css = "#productHTMLID ul.featured-links li:nth-of-type(2) a")
    @CacheLookup
    private WebElement brocadeProductCatalog2;

    @FindBy(css = "#productFlyoutRightContent ul.featured-links li:nth-of-type(2) a")
    @CacheLookup
    private WebElement brocadeProductCatalog3;

    @FindBy(css = "a[href='http://www.brocade.com/sanhealth']")
    @CacheLookup
    private WebElement brocadeSanHealth;

    @FindBy(id = "campus-tco-calculator")
    @CacheLookup
    private WebElement campusTcoCalculator;

    @FindBy(css = "#mm-toolsLstID div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement campusTcoCalculatorMakeSmarter1;

    @FindBy(css = "#toolsLstID div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement campusTcoCalculatorMakeSmarter2;

    @FindBy(css = "#toolsFlyoutLeftContent div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement campusTcoCalculatorMakeSmarter3;

    @FindBy(css = "a.cared-products--cancel-edits-btn")
    @CacheLookup
    private WebElement cancel1;

    @FindBy(css = "#ns_Z7_J8IIGBK0M0JPF0AD7OUNF71007_persistPasswordSubmitButton ul li input:nth-of-type(2)")
    @CacheLookup
    private WebElement cancel2;

    @FindBy(css = "#ns_Z7_J8IIGBK0M0JPF0AD7OUNF71007_persistPasswordSubmitDisableButton ul li input:nth-of-type(2)")
    @CacheLookup
    private WebElement cancel3;

    @FindBy(css = "#mm-educationLstID li:nth-of-type(5) a.external-link-icon")
    @CacheLookup
    private WebElement certificationProgram1;

    @FindBy(css = "#educationLstID li:nth-of-type(5) a.external-link-icon")
    @CacheLookup
    private WebElement certificationProgram2;

    @FindBy(css = "#educationFlyoutLeftContent li:nth-of-type(5) a.external-link-icon")
    @CacheLookup
    private WebElement certificationProgram3;

    @FindBy(css = "#dashboard-education-content-block div:nth-of-type(2) ul.leading-arrow-list.dashboard-education--list li:nth-of-type(2) a")
    @CacheLookup
    private WebElement certificationProgram4;

    @FindBy(css = "#mm-toolsLstID div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement cidDemoReservationSystem1;

    @FindBy(css = "#toolsLstID div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement cidDemoReservationSystem2;

    @FindBy(css = "#toolsFlyoutLeftContent div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement cidDemoReservationSystem3;

    @FindBy(css = "#mm-flyout-search-form div:nth-of-type(1) a.flyout-search-clear-mb")
    @CacheLookup
    private WebElement clear1;

    @FindBy(css = "#flyout-search-form div:nth-of-type(1) a.flyout-search-clear-mb")
    @CacheLookup
    private WebElement clear2;

    @FindBy(css = "a[href='http://www.extremenetworks.com/brocade-support-transition/']")
    @CacheLookup
    private WebElement clickHere;

    @FindBy(css = "#ns_Z7_J8IIGBK0M0JPF0AD7OUNF71007_successDivForpersistPassword div:nth-of-type(2) input.btn.btn-light-blue[type='button']")
    @CacheLookup
    private WebElement close;

    @FindBy(id = "community-")
    @CacheLookup
    private WebElement community;

    @FindBy(css = "#mm-7 div:nth-of-type(2) div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(3) p a:nth-of-type(2)")
    @CacheLookup
    private WebElement community1;

    @FindBy(css = "#utility-nav div.utility-nav-links a:nth-of-type(2)")
    @CacheLookup
    private WebElement community1;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(5) a")
    @CacheLookup
    private WebElement community2;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-alerts.is-hidden div.flyout-inner div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(3) p a:nth-of-type(2)")
    @CacheLookup
    private WebElement community2;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(5) a")
    @CacheLookup
    private WebElement community3;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-alerts.is-hidden div.flyout-inner div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(3) p a:nth-of-type(2)")
    @CacheLookup
    private WebElement community3;

    @FindBy(css = "#quick-access-content-block div:nth-of-type(2) ul.quick-access--list.slick li:nth-of-type(5) a")
    @CacheLookup
    private WebElement community4;

    @FindBy(id = "closeSecurityPass")
    @CacheLookup
    private WebElement confirmNewPassword;

    @FindBy(css = "#mm-supportHTMLID p.flyout-blurb-minor a")
    @CacheLookup
    private WebElement contactTechSupport1;

    @FindBy(css = "#supportHTMLID p.flyout-blurb-minor a")
    @CacheLookup
    private WebElement contactTechSupport2;

    @FindBy(css = "#supportFlyoutRightContent p.flyout-blurb-minor a")
    @CacheLookup
    private WebElement contactTechSupport3;

    @FindBy(css = "#footer div.footer-inner ul.footer-links li:nth-of-type(3) a")
    @CacheLookup
    private WebElement contactUs1;

    @FindBy(css = "a.contact-us-btn")
    @CacheLookup
    private WebElement contactUs2;

    @FindBy(css = "#mm-educationLstID li:nth-of-type(1) a.external-link-icon")
    @CacheLookup
    private WebElement courseSchedule1;

    @FindBy(css = "#educationLstID li:nth-of-type(1) a.external-link-icon")
    @CacheLookup
    private WebElement courseSchedule2;

    @FindBy(css = "#educationFlyoutLeftContent li:nth-of-type(1) a.external-link-icon")
    @CacheLookup
    private WebElement courseSchedule3;

    @FindBy(css = "#dashboard-education-content-block div:nth-of-type(2) ul.leading-arrow-list.dashboard-education--list li:nth-of-type(3) a")
    @CacheLookup
    private WebElement courseSchedule4;

    @FindBy(id = "securityQuestionBox")
    @CacheLookup
    private WebElement createAQuestionThatIsUnique1;

    @FindBy(id = "saveSecurityQuestion")
    @CacheLookup
    private WebElement createAQuestionThatIsUnique2;

    @FindBy(css = "#ns_Z7_J8IIGBK0M0JPF0AD7OUNF71007_securityQuestionAnswerSubmitDisableButton ul li input[type='image']")
    @CacheLookup
    private WebElement createAQuestionThatIsUnique3;

    @FindBy(css = "a[href='/wps/myportal/myb/tools/usersearch/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8zijRwtnT2M3A18DQyCTQwcTc2NzX3N_Q3cDQz0wwkpiAJKG-AAjiD9UWAlcBP8fYyAEqahbqGeLmaGBv6GUAV4zCjIjTDIdFRUBACNZdAr/dz/d5/L2dJQSEvUUt3QS80TmxFL1o2XzkxRzAwQzQwTTBRQzUwQUQyOVRLNDQxME0x/']")
    @CacheLookup
    private WebElement customerSupport;

    @FindBy(css = "a.cared-products--save-edits-btn.btn.btn-yellow-orange")
    @CacheLookup
    private WebElement delete;

    @FindBy(id = "document-library")
    @CacheLookup
    private WebElement documentLibrary;

    @FindBy(css = "#mm-supportDtlsID div:nth-of-type(1) ul.leading-arrow-list.mm-listview li:nth-of-type(2) a.external-link-icon")
    @CacheLookup
    private WebElement documentLibrary1;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(3) a")
    @CacheLookup
    private WebElement documentLibrary2;

    @FindBy(css = "#supportDtlsID div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(2) a.external-link-icon")
    @CacheLookup
    private WebElement documentLibrary3;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(3) a")
    @CacheLookup
    private WebElement documentLibrary4;

    @FindBy(css = "#supportFlyoutLeftContent div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(2) a.external-link-icon")
    @CacheLookup
    private WebElement documentLibrary5;

    @FindBy(css = "#quick-access-content-block div:nth-of-type(2) ul.quick-access--list.slick li:nth-of-type(3) a")
    @CacheLookup
    private WebElement documentLibrary6;

    @FindBy(css = "#mm-0 ul.primary-nav-links.mm-listview li:nth-of-type(6) ul.mm-inset.mm-nolistview.mm-nopanel li a")
    @CacheLookup
    private WebElement dropUsAMessage1;

    @FindBy(css = "#primary-nav ul:nth-of-type(1) li:nth-of-type(6) ul.Inset li a")
    @CacheLookup
    private WebElement dropUsAMessage2;

    @FindBy(css = "#mm-6 div:nth-of-type(2) div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(2) p a.quick-access--edit-btn")
    @CacheLookup
    private WebElement editLinks1;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(2) p a.quick-access--edit-btn")
    @CacheLookup
    private WebElement editLinks2;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(2) p a.quick-access--edit-btn")
    @CacheLookup
    private WebElement editLinks3;

    @FindBy(css = "#quick-access-content-block div:nth-of-type(2) div.quick-access--list-empty.is-hidden p a.quick-access--edit-btn")
    @CacheLookup
    private WebElement editLinks4;

    @FindBy(css = "#mm-6 div:nth-of-type(2) div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) a.quick-access--edit-btn")
    @CacheLookup
    private WebElement editList1;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) a.quick-access--edit-btn")
    @CacheLookup
    private WebElement editList2;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) a.quick-access--edit-btn")
    @CacheLookup
    private WebElement editList3;

    @FindBy(css = "a.content-block--heading-link.quick-access--edit-btn")
    @CacheLookup
    private WebElement editList4;

    @FindBy(css = "#mm-0 ul.primary-nav-links.mm-listview li:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement education1;

    @FindBy(css = "#mm-3 div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement education2;

    @FindBy(css = "#primary-nav ul:nth-of-type(1) li:nth-of-type(3) a.primary-nav-top-level")
    @CacheLookup
    private WebElement education3;

    @FindBy(css = "#mm-educationLstID li:nth-of-type(2) a.external-link-icon")
    @CacheLookup
    private WebElement educationCommunity1;

    @FindBy(css = "#educationLstID li:nth-of-type(2) a.external-link-icon")
    @CacheLookup
    private WebElement educationCommunity2;

    @FindBy(css = "#educationFlyoutLeftContent li:nth-of-type(2) a.external-link-icon")
    @CacheLookup
    private WebElement educationCommunity3;

    @FindBy(css = "#mm-educationHTMLID p:nth-of-type(3) a.btn.btn-rounded.btn-wide.btn-yellow-orange")
    @CacheLookup
    private WebElement enrollNow1;

    @FindBy(css = "#educationHTMLID p:nth-of-type(3) a.btn.btn-rounded.btn-wide.btn-yellow-orange")
    @CacheLookup
    private WebElement enrollNow2;

    @FindBy(css = "#educationFlyoutRightContent p:nth-of-type(3) a.btn.btn-rounded.btn-wide.btn-yellow-orange")
    @CacheLookup
    private WebElement enrollNow3;

    @FindBy(css = "#mm-supportDtlsID div:nth-of-type(1) ul.leading-arrow-list.mm-listview li:nth-of-type(5) a.external-link-icon")
    @CacheLookup
    private WebElement eolSchedule1;

    @FindBy(css = "#supportDtlsID div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(5) a.external-link-icon")
    @CacheLookup
    private WebElement eolSchedule2;

    @FindBy(css = "#supportFlyoutLeftContent div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(5) a.external-link-icon")
    @CacheLookup
    private WebElement eolSchedule3;

    @FindBy(css = "a.social-link.social-link-facebook")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "a.utility-nav-tools-favourites.utility-nav-top-level")
    @CacheLookup
    private WebElement favourites;

    @FindBy(css = "#mm-productHTMLID ul.featured-links.mm-listview li:nth-of-type(3) a")
    @CacheLookup
    private WebElement freeSoftwareTrials1;

    @FindBy(css = "#productHTMLID ul.featured-links li:nth-of-type(3) a")
    @CacheLookup
    private WebElement freeSoftwareTrials2;

    @FindBy(css = "#productFlyoutRightContent ul.featured-links li:nth-of-type(3) a")
    @CacheLookup
    private WebElement freeSoftwareTrials3;

    @FindBy(css = "a.utility-nav-account-name")
    @CacheLookup
    private WebElement helloDhakshnaMoorthy;

    @FindBy(css = "#mm-flyout-search-form div:nth-of-type(1) div.flyout-search-suggest-wrapper div.flyout-search-suggest.is-hidden div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement inDocumentLibrary1;

    @FindBy(css = "#flyout-search-form div:nth-of-type(1) div.flyout-search-suggest-wrapper div.flyout-search-suggest.is-hidden div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement inDocumentLibrary2;

    @FindBy(css = "#mm-flyout-search-form div:nth-of-type(1) div.flyout-search-suggest-wrapper div.flyout-search-suggest.is-hidden div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement inKnowledgeBaseDefects1;

    @FindBy(css = "#flyout-search-form div:nth-of-type(1) div.flyout-search-suggest-wrapper div.flyout-search-suggest.is-hidden div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement inKnowledgeBaseDefects2;

    @FindBy(css = "#mm-flyout-search-form div:nth-of-type(1) div.flyout-search-suggest-wrapper div.flyout-search-suggest.is-hidden div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement inMybrocade1;

    @FindBy(css = "#flyout-search-form div:nth-of-type(1) div.flyout-search-suggest-wrapper div.flyout-search-suggest.is-hidden div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement inMybrocade2;

    @FindBy(css = "#mm-flyout-search-form div:nth-of-type(1) div.flyout-search-suggest-wrapper div.flyout-search-suggest.is-hidden div:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement inSoftwareDownloads1;

    @FindBy(css = "#flyout-search-form div:nth-of-type(1) div.flyout-search-suggest-wrapper div.flyout-search-suggest.is-hidden div:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement inSoftwareDownloads2;

    @FindBy(css = "#mm-7 div:nth-of-type(2) div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(3) p a:nth-of-type(1)")
    @CacheLookup
    private WebElement knowledgeBase1;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-alerts.is-hidden div.flyout-inner div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(3) p a:nth-of-type(1)")
    @CacheLookup
    private WebElement knowledgeBase2;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-alerts.is-hidden div.flyout-inner div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(3) p a:nth-of-type(1)")
    @CacheLookup
    private WebElement knowledgeBase3;

    @FindBy(id = "knowledge-base-&-defects")
    @CacheLookup
    private WebElement knowledgeBaseDefects;

    @FindBy(css = "#mm-supportDtlsID div:nth-of-type(1) ul.leading-arrow-list.mm-listview li:nth-of-type(1) a")
    @CacheLookup
    private WebElement knowledgeBaseDefects1;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(2) a")
    @CacheLookup
    private WebElement knowledgeBaseDefects2;

    @FindBy(css = "#supportDtlsID div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(1) a")
    @CacheLookup
    private WebElement knowledgeBaseDefects3;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(2) a")
    @CacheLookup
    private WebElement knowledgeBaseDefects4;

    @FindBy(css = "#supportFlyoutLeftContent div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(1) a")
    @CacheLookup
    private WebElement knowledgeBaseDefects5;

    @FindBy(css = "#quick-access-content-block div:nth-of-type(2) ul.quick-access--list.slick li:nth-of-type(2) a")
    @CacheLookup
    private WebElement knowledgeBaseDefects6;

    @FindBy(css = "a[href='http://www.brocade.com/en/general/announcements/brocade-customers-partners.html']")
    @CacheLookup
    private WebElement learnMore;

    @FindBy(css = "#mm-educationLstID li:nth-of-type(4) a.external-link-icon")
    @CacheLookup
    private WebElement learnMore1;

    @FindBy(css = "#educationLstID li:nth-of-type(4) a.external-link-icon")
    @CacheLookup
    private WebElement learnMore2;

    @FindBy(css = "#educationFlyoutLeftContent li:nth-of-type(4) a.external-link-icon")
    @CacheLookup
    private WebElement learnMore3;

    @FindBy(css = "#layoutContainers div.wpthemeInner div.protlet-main. div:nth-of-type(4) div.portlet-outer div..id-Z7_91G00C40MO9T10ALCQCTOT2003.layoutNode div.protlet-lists div.protlet-list div.component-control.id-Z7_91G00C40M84430ALCN59V328L5 section.ibmPortalControl.wpthemeNoSkin.a11yRegionTarget portal-core:constants div:nth-of-type(2) div.content-block-row.dashboard-promotion div.carousel.product-promotion div:nth-of-type(2) div.slick-list.draggable div.slick-track div:nth-of-type(1) div:nth-of-type(2) div.carousel__col-inner a.trailing-arrow")
    @CacheLookup
    private WebElement learnMore4;

    @FindBy(css = "#layoutContainers div.wpthemeInner div.protlet-main. div:nth-of-type(4) div.portlet-outer div..id-Z7_91G00C40MO9T10ALCQCTOT2003.layoutNode div.protlet-lists div.protlet-list div.component-control.id-Z7_91G00C40M84430ALCN59V328L5 section.ibmPortalControl.wpthemeNoSkin.a11yRegionTarget portal-core:constants div:nth-of-type(2) div.content-block-row.dashboard-promotion div.carousel.product-promotion div:nth-of-type(2) div.slick-list.draggable div.slick-track div:nth-of-type(3) div:nth-of-type(2) div.carousel__col-inner a.trailing-arrow")
    @CacheLookup
    private WebElement learnMore5;

    @FindBy(css = "#layoutContainers div.wpthemeInner div.protlet-main. div:nth-of-type(4) div.portlet-outer div..id-Z7_91G00C40MO9T10ALCQCTOT2003.layoutNode div.protlet-lists div.protlet-list div.component-control.id-Z7_91G00C40M84430ALCN59V328L5 section.ibmPortalControl.wpthemeNoSkin.a11yRegionTarget portal-core:constants div:nth-of-type(2) div.content-block-row.dashboard-promotion div.carousel.product-promotion div:nth-of-type(2) div.slick-list.draggable div.slick-track div:nth-of-type(4) div:nth-of-type(2) div.carousel__col-inner a.trailing-arrow")
    @CacheLookup
    private WebElement learnMore6;

    @FindBy(css = "#dashboard-education-content-block div:nth-of-type(2) ul.leading-arrow-list.dashboard-education--list li:nth-of-type(4) a")
    @CacheLookup
    private WebElement learnMore7;

    @FindBy(css = "#mm-educationLstID li:nth-of-type(3) a.external-link-icon")
    @CacheLookup
    private WebElement learningPortal1;

    @FindBy(css = "#educationLstID li:nth-of-type(3) a.external-link-icon")
    @CacheLookup
    private WebElement learningPortal2;

    @FindBy(css = "#educationFlyoutLeftContent li:nth-of-type(3) a.external-link-icon")
    @CacheLookup
    private WebElement learningPortal3;

    @FindBy(css = "#dashboard-education-content-block div:nth-of-type(2) ul.leading-arrow-list.dashboard-education--list li:nth-of-type(1) a")
    @CacheLookup
    private WebElement learningPortal4;

    @FindBy(css = "a[href='https://www.brocade.com/en/legal.html']")
    @CacheLookup
    private WebElement legal;

    @FindBy(id = "licenses")
    @CacheLookup
    private WebElement licenses;

    @FindBy(css = "#mm-supportDtlsID div:nth-of-type(2) ul.leading-arrow-list.mm-listview li:nth-of-type(2) a")
    @CacheLookup
    private WebElement licenses1;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(4) a")
    @CacheLookup
    private WebElement licenses2;

    @FindBy(css = "#supportDtlsID div:nth-of-type(2) ul.leading-arrow-list li:nth-of-type(2) a")
    @CacheLookup
    private WebElement licenses3;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(4) a")
    @CacheLookup
    private WebElement licenses4;

    @FindBy(css = "#supportFlyoutLeftContent div:nth-of-type(2) ul.leading-arrow-list li:nth-of-type(2) a")
    @CacheLookup
    private WebElement licenses5;

    @FindBy(css = "#quick-access-content-block div:nth-of-type(2) ul.quick-access--list.slick li:nth-of-type(4) a")
    @CacheLookup
    private WebElement licenses6;

    @FindBy(css = "#mm-toolsLstID div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement licensesManageYourLicensesFor1;

    @FindBy(css = "#toolsLstID div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement licensesManageYourLicensesFor2;

    @FindBy(css = "#toolsFlyoutLeftContent div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement licensesManageYourLicensesFor3;

    @FindBy(css = "a.social-link.social-link-linkedin")
    @CacheLookup
    private WebElement linkedin;

    @FindBy(css = "#mm-0 ul.primary-nav-links.mm-listview li:nth-of-type(5) ul.leading-arrow-list.flyout-list-double-col.mm-inset.mm-nolistview.mm-nopanel li:nth-of-type(2) a")
    @CacheLookup
    private WebElement manageAccessPermissions1;

    @FindBy(css = "#utility-nav ul:nth-of-type(1) li.utility-nav-account-signedin div.flyout.flyout-account.is-hidden div.flyout-inner div.flyout-content.flyout-account-content div.account-listing.flyout-account-listing div.account-listing__account ul.leading-arrow-list li:nth-of-type(3) a")
    @CacheLookup
    private WebElement manageAccessPermissions2;

    @FindBy(css = "#primary-nav ul:nth-of-type(1) li:nth-of-type(5) ul.leading-arrow-list.flyout-list-double-col.Inset li:nth-of-type(2) a")
    @CacheLookup
    private WebElement manageAccessPermissions3;

    @FindBy(css = "#mm-0 div.mm-navbar a.mm-title div.nav-switch-label select.nav-switch-select.select2-hidden-accessible")
    @CacheLookup
    private WebElement manageProductsICareAbout1;

    @FindBy(css = "#mm-5 div.mm-navbar a.mm-title div.nav-switch-label select.nav-switch-select.select2-hidden-accessible")
    @CacheLookup
    private WebElement manageProductsICareAbout2;

    @FindBy(css = "#mm-9 div:nth-of-type(1) a.mm-title div.nav-switch-label select.nav-switch-select.select2-hidden-accessible")
    @CacheLookup
    private WebElement manageProductsICareAbout3;

    @FindBy(css = "#mm-9 div:nth-of-type(2) select.nav-switch-select.select2-hidden-accessible")
    @CacheLookup
    private WebElement manageProductsICareAbout4;

    @FindBy(css = "#mm-manageProdDiv a:nth-of-type(1)")
    @CacheLookup
    private WebElement manageProductsICareAbout5;

    @FindBy(name = "query")
    @CacheLookup
    private WebElement manageProductsICareAbout6;

    @FindBy(css = "#manageProdDiv a:nth-of-type(1)")
    @CacheLookup
    private WebElement manageProductsICareAbout7;

    @FindBy(css = "#mm-7 div:nth-of-type(2) div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(1) div.alert-listing__mark-all-read.is-hidden a")
    @CacheLookup
    private WebElement markAllAsRead1;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-alerts.is-hidden div.flyout-inner div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(1) div.alert-listing__mark-all-read.is-hidden a")
    @CacheLookup
    private WebElement markAllAsRead2;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-alerts.is-hidden div.flyout-inner div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(1) div.alert-listing__mark-all-read.is-hidden a")
    @CacheLookup
    private WebElement markAllAsRead3;

    @FindBy(css = "#mm-primary-nav span.mobile-menu-toggle a.mobile-menu-toggle-link")
    @CacheLookup
    private WebElement menu1;

    @FindBy(css = "#primary-nav span.mobile-menu-toggle a.mobile-menu-toggle-link")
    @CacheLookup
    private WebElement menu2;

    @FindBy(css = "#mm-0 ul.primary-nav-links.mm-listview li:nth-of-type(5) ul.leading-arrow-list.flyout-list-double-col.mm-inset.mm-nolistview.mm-nopanel li:nth-of-type(1) a")
    @CacheLookup
    private WebElement myProfile1;

    @FindBy(css = "#utility-nav ul:nth-of-type(1) li.utility-nav-account-signedin div.flyout.flyout-account.is-hidden div.flyout-inner div.flyout-content.flyout-account-content div.account-listing.flyout-account-listing div.account-listing__account ul.leading-arrow-list li:nth-of-type(2) a")
    @CacheLookup
    private WebElement myProfile2;

    @FindBy(css = "#primary-nav ul:nth-of-type(1) li:nth-of-type(5) ul.leading-arrow-list.flyout-list-double-col.Inset li:nth-of-type(1) a")
    @CacheLookup
    private WebElement myProfile3;

    @FindBy(css = "#mm-primary-nav a.primary-nav-logo")
    @CacheLookup
    private WebElement mybrocade1;

    @FindBy(css = "#primary-nav a.primary-nav-logo")
    @CacheLookup
    private WebElement mybrocade2;

    @FindBy(css = "a[href='/wps/myportal/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8zijRwtnT2M3A18DQyCTQwcTc2NzX3N_Q3cDQz0wwkpiAJKG-AAjiD9UWAlcBP8fYyAEqahbqGeLmaGBv6GUAV4zCjIjTDIdFRUBACNZdAr/dz/d5/L2dJQSEvUUt3QS80TmxFL1o2X01ETUMxRTIzMThJNTkwSTlGTFBPUFEzMDA1/']")
    @CacheLookup
    private WebElement mybrocadeAdmin;

    @FindBy(css = "button.slick-next.slick-arrow")
    @CacheLookup
    private WebElement next;

    private final String pageLoadedText = "Attention All Non-Fibre-Channel Customers and Partners";

    private final String pageUrl = "/wps/myportal/myb/home/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8zijRwtnT2M3A18DQyCTQwcTc2NzX3N_Q3cDQz0wwkpiAJKG-AAjiD9UWAlcBP8fYyAEqahbqGeLmaGBv6GUAV4zCjIjTDIdFRUBACNZdAr/dz/d5/L2dBISEvZ0FBIS9nQSEh/";

    @FindBy(id = "partner-locator")
    @CacheLookup
    private WebElement partnerLocator;

    @FindBy(css = "#mm-toolsLstID div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement partnerLocatorConnectWithBrocade1;

    @FindBy(css = "#toolsLstID div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement partnerLocatorConnectWithBrocade2;

    @FindBy(css = "#toolsFlyoutLeftContent div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement partnerLocatorConnectWithBrocade3;

    @FindBy(id = "passwordBox")
    @CacheLookup
    private WebElement passwordsAreRequiredToBeA1;

    @FindBy(id = "persistPassword")
    @CacheLookup
    private WebElement passwordsAreRequiredToBeA2;

    @FindBy(css = "button.slick-prev.slick-arrow")
    @CacheLookup
    private WebElement previous;

    @FindBy(css = "a[href='https://www.brocade.com/en/legal/privacy-policy.html']")
    @CacheLookup
    private WebElement privacy;

    @FindBy(css = "#mm-toolsLstID div:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement productConfiguratorCreateTheIdeal1;

    @FindBy(css = "#toolsLstID div:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement productConfiguratorCreateTheIdeal2;

    @FindBy(css = "#toolsFlyoutLeftContent div:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement productConfiguratorCreateTheIdeal3;

    @FindBy(css = "#mm-0 ul.primary-nav-links.mm-listview li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement products1;

    @FindBy(css = "#mm-1 div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement products2;

    @FindBy(css = "#primary-nav ul:nth-of-type(1) li:nth-of-type(1) a.primary-nav-top-level")
    @CacheLookup
    private WebElement products3;

    @FindBy(id = "securityAnswerBox")
    @CacheLookup
    private WebElement provideTheResponseToYourSecurity1;

    @FindBy(id = "saveSecurityAnswer")
    @CacheLookup
    private WebElement provideTheResponseToYourSecurity2;

    @FindBy(css = "#pica div:nth-of-type(1) div.heading-right-link a.cared-products--remove-products-btn")
    @CacheLookup
    private WebElement removeProducts;

    @FindBy(css = "#pica div:nth-of-type(2) div:nth-of-type(3) div.cared-products--list-container div:nth-of-type(2) div.content-block--inner-footer div:nth-of-type(2) a.cared-products--remove-products-btn")
    @CacheLookup
    private WebElement removeProducts;

    @FindBy(id = "confirmPasswordBox")
    @CacheLookup
    private WebElement retypeYourNewPasswordInThe1;

    @FindBy(id = "persistConfirmPassword")
    @CacheLookup
    private WebElement retypeYourNewPasswordInThe2;

    @FindBy(id = "san-health")
    @CacheLookup
    private WebElement sanHealth;

    @FindBy(css = "#mm-toolsLstID div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement sanHealthGetAnAccurate1;

    @FindBy(css = "#toolsLstID div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement sanHealthGetAnAccurate2;

    @FindBy(css = "#toolsFlyoutLeftContent div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement sanHealthGetAnAccurate3;

    @FindBy(css = "#mm-5 ul.primary-nav-tools.mm-listview li:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement search1;

    @FindBy(css = "#mm-8 div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement search2;

    @FindBy(css = "#mm-flyout-search-form button.btn.flyout-btn-search.btn-light-blue")
    @CacheLookup
    private WebElement search3;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(3) a.primary-nav-top-level")
    @CacheLookup
    private WebElement search4;

    @FindBy(css = "#flyout-search-form button.btn.flyout-btn-search.btn-light-blue")
    @CacheLookup
    private WebElement search5;

    @FindBy(css = "#mm-supportDtlsID div:nth-of-type(1) ul.leading-arrow-list.mm-listview li:nth-of-type(3) a.external-link-icon")
    @CacheLookup
    private WebElement securityAdvisories1;

    @FindBy(css = "#supportDtlsID div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(3) a.external-link-icon")
    @CacheLookup
    private WebElement securityAdvisories2;

    @FindBy(css = "#supportFlyoutLeftContent div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(3) a.external-link-icon")
    @CacheLookup
    private WebElement securityAdvisories3;

    @FindBy(css = "a.cared-products--show-hide-btn")
    @CacheLookup
    private WebElement showAllHide;

    @FindBy(css = "a.site-wide-banner-collapse-toggle")
    @CacheLookup
    private WebElement showDetails;

    @FindBy(css = "#mm-0 ul.primary-nav-links.mm-listview li:nth-of-type(5) ul.leading-arrow-list.flyout-list-double-col.mm-inset.mm-nolistview.mm-nopanel li:nth-of-type(3) a")
    @CacheLookup
    private WebElement signOut1;

    @FindBy(css = "a[href='/wps/myportal/myb/home/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8zijRwtnT2M3A18DQyCTQwcTc2NzX3N_Q3cDQz0wwkpiAJKG-AAjiD9UWAlcBP8fYyAEqahbqGeLmaGBv6GUAV4zCjIjTDIdFRUBACNZdAr/dz/d5/L3dDb1ZJQSEhL3dPb0JKTnNBLzRFS2lqaFVNV0hFIS9yRkYyU29XenpJNWFwVU1UQW04dW5iUVNndXBZWmIwVDZpRG9HT3F3NVZRMjJqQWtBLzMxODMzNC9sbw!!/']")
    @CacheLookup
    private WebElement signOut2;

    @FindBy(css = "#primary-nav ul:nth-of-type(1) li:nth-of-type(5) ul.leading-arrow-list.flyout-list-double-col.Inset li:nth-of-type(3) a")
    @CacheLookup
    private WebElement signOut3;

    @FindBy(id = "software-downloads")
    @CacheLookup
    private WebElement softwareDownloads;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(1) a")
    @CacheLookup
    private WebElement softwareDownloads1;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-quickaccess.is-hidden div.flyout-inner div.flyout-content.flyout-quickaccess-content div.quickaccess-listing.flyout-quickaccess-listing div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(1) a")
    @CacheLookup
    private WebElement softwareDownloads2;

    @FindBy(css = "#quick-access-content-block div:nth-of-type(2) ul.quick-access--list.slick li:nth-of-type(1) a")
    @CacheLookup
    private WebElement softwareDownloads3;

    @FindBy(css = "#mm-supportDtlsID div:nth-of-type(2) ul.leading-arrow-list.mm-listview li:nth-of-type(1) a")
    @CacheLookup
    private WebElement softwareDriverDownloads1;

    @FindBy(css = "#supportDtlsID div:nth-of-type(2) ul.leading-arrow-list li:nth-of-type(1) a")
    @CacheLookup
    private WebElement softwareDriverDownloads2;

    @FindBy(css = "#supportFlyoutLeftContent div:nth-of-type(2) ul.leading-arrow-list li:nth-of-type(1) a")
    @CacheLookup
    private WebElement softwareDriverDownloads3;

    @FindBy(css = "#ns_Z7_J8IIGBK0M0JPF0AD7OUNF71007_securityPasswordSubmitButton ul li input.btn.btn-light-blue[type='button']")
    @CacheLookup
    private WebElement submit1;

    @FindBy(css = "#ns_Z7_J8IIGBK0M0JPF0AD7OUNF71007_securityPasswordSubmitDisableButton ul li input.btn.black[type='button']")
    @CacheLookup
    private WebElement submit2;

    @FindBy(css = "#ns_Z7_J8IIGBK0M0JPF0AD7OUNF71007_persistPasswordSubmitButton ul li input:nth-of-type(1)")
    @CacheLookup
    private WebElement submit3;

    @FindBy(css = "#ns_Z7_J8IIGBK0M0JPF0AD7OUNF71007_persistPasswordSubmitDisableButton ul li input:nth-of-type(1)")
    @CacheLookup
    private WebElement submit4;

    @FindBy(css = "#ns_Z7_J8IIGBK0M0JPF0AD7OUNF71007_securityQuestionAnswerSubmitButton ul li input.btn.btn-light-blue[type='button']")
    @CacheLookup
    private WebElement submit5;

    @FindBy(css = "#mm-0 ul.primary-nav-links.mm-listview li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement support1;

    @FindBy(css = "#mm-2 div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement support2;

    @FindBy(css = "#primary-nav ul:nth-of-type(1) li:nth-of-type(2) a.primary-nav-top-level")
    @CacheLookup
    private WebElement support3;

    @FindBy(css = "#mm-supportDtlsID div:nth-of-type(1) ul.leading-arrow-list.mm-listview li:nth-of-type(6) a.external-link-icon")
    @CacheLookup
    private WebElement supportCommunity1;

    @FindBy(css = "#supportDtlsID div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(6) a.external-link-icon")
    @CacheLookup
    private WebElement supportCommunity2;

    @FindBy(css = "#supportFlyoutLeftContent div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(6) a.external-link-icon")
    @CacheLookup
    private WebElement supportCommunity3;

    @FindBy(css = "#mm-0 ul.primary-nav-links.mm-listview li:nth-of-type(4) a:nth-of-type(2)")
    @CacheLookup
    private WebElement tools1;

    @FindBy(css = "#mm-4 div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement tools2;

    @FindBy(css = "#primary-nav ul:nth-of-type(1) li:nth-of-type(4) a.primary-nav-top-level")
    @CacheLookup
    private WebElement tools3;

    @FindBy(css = "a.social-link.social-link-twitter")
    @CacheLookup
    private WebElement twitter;

    @FindBy(id = "closeSecurityAns")
    @CacheLookup
    private WebElement updateToYourSiteAccessInformation;

    @FindBy(css = "#mm-productHTMLID ul.featured-links.mm-listview li:nth-of-type(1) span div:nth-of-type(2) a")
    @CacheLookup
    private WebElement upgrade1;

    @FindBy(css = "#productHTMLID ul.featured-links li:nth-of-type(1) span div:nth-of-type(2) a")
    @CacheLookup
    private WebElement upgrade2;

    @FindBy(css = "#productFlyoutRightContent ul.featured-links li:nth-of-type(1) span div:nth-of-type(2) a")
    @CacheLookup
    private WebElement upgrade3;

    @FindBy(css = "#pica div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(4) div.content-block--inner-footer a:nth-of-type(1)")
    @CacheLookup
    private WebElement upgrade4;

    @FindBy(css = "#pica div:nth-of-type(2) div:nth-of-type(3) div.cared-products--list-container div:nth-of-type(2) div.content-block--inner-footer a:nth-of-type(1)")
    @CacheLookup
    private WebElement upgrade5;

    @FindBy(css = "#mm-supportHTMLID div a.btn.btn-rounded.btn-wide.btn-yellow-orange")
    @CacheLookup
    private WebElement upgradeAccess1;

    @FindBy(css = "#supportHTMLID div a.btn.btn-rounded.btn-wide.btn-yellow-orange")
    @CacheLookup
    private WebElement upgradeAccess2;

    @FindBy(css = "#supportFlyoutRightContent div a.btn.btn-rounded.btn-wide.btn-yellow-orange")
    @CacheLookup
    private WebElement upgradeAccess3;

    @FindBy(css = "#mm-7 div:nth-of-type(2) div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(4) a.icon-chevron-right")
    @CacheLookup
    private WebElement viewAllAlerts1;

    @FindBy(css = "#utility-nav ul:nth-of-type(2) li:nth-of-type(1) div.flyout.flyout-alerts.is-hidden div.flyout-inner div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(4) a.icon-chevron-right")
    @CacheLookup
    private WebElement viewAllAlerts2;

    @FindBy(css = "#primary-nav ul:nth-of-type(2) li:nth-of-type(2) div.flyout.flyout-alerts.is-hidden div.flyout-inner div.flyout-content.flyout-alerts-content div.alert-listing.flyout-alert-listing div:nth-of-type(4) a.icon-chevron-right")
    @CacheLookup
    private WebElement viewAllAlerts3;

    @FindBy(css = "#mm-manageProdDiv a:nth-of-type(2)")
    @CacheLookup
    private WebElement viewAllBrocadeProducts1;

    @FindBy(css = "#pica div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(4) div.content-block--inner-footer a:nth-of-type(2)")
    @CacheLookup
    private WebElement viewAllBrocadeProducts1;

    @FindBy(id = "ViewAllProducts")
    @CacheLookup
    private WebElement viewAllBrocadeProducts2;

    @FindBy(css = "#manageProdDiv a:nth-of-type(2)")
    @CacheLookup
    private WebElement viewAllBrocadeProducts2;

    @FindBy(css = "#mm-supportDtlsID div:nth-of-type(1) ul.leading-arrow-list.mm-listview li:nth-of-type(4) a.external-link-icon")
    @CacheLookup
    private WebElement warrantiesReturns1;

    @FindBy(css = "#supportDtlsID div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(4) a.external-link-icon")
    @CacheLookup
    private WebElement warrantiesReturns2;

    @FindBy(css = "#supportFlyoutLeftContent div:nth-of-type(1) ul.leading-arrow-list li:nth-of-type(4) a.external-link-icon")
    @CacheLookup
    private WebElement warrantiesReturns3;

    @FindBy(id = "warranty-and-returns")
    @CacheLookup
    private WebElement warrantyAndReturns;

    @FindBy(css = "#layoutContainers div.wpthemeInner div.protlet-main. div:nth-of-type(4) div.portlet-outer div..id-Z7_91G00C40MO9T10ALCQCTOT2003.layoutNode div.protlet-lists div.protlet-list div.component-control.id-Z7_91G00C40M84430ALCN59V328L5 section.ibmPortalControl.wpthemeNoSkin.a11yRegionTarget portal-core:constants div:nth-of-type(2) div.content-block-row.dashboard-promotion div.carousel.product-promotion div:nth-of-type(2) div.slick-list.draggable div.slick-track div:nth-of-type(2) div:nth-of-type(2) div.carousel__col-inner a.video-overlay-btn.yt-link.yt-fullscreen")
    @CacheLookup
    private WebElement watchNow1;

    @FindBy(css = "#layoutContainers div.wpthemeInner div.protlet-main. div:nth-of-type(4) div.portlet-outer div..id-Z7_91G00C40MO9T10ALCQCTOT2003.layoutNode div.protlet-lists div.protlet-list div.component-control.id-Z7_91G00C40M84430ALCN59V328L5 section.ibmPortalControl.wpthemeNoSkin.a11yRegionTarget portal-core:constants div:nth-of-type(2) div.content-block-row.dashboard-promotion div.carousel.product-promotion div:nth-of-type(2) div.slick-list.draggable div.slick-track div:nth-of-type(5) div:nth-of-type(2) div.carousel__col-inner a.video-overlay-btn.yt-link.yt-fullscreen")
    @CacheLookup
    private WebElement watchNow2;

    @FindBy(css = "a[href='/wps/myportal/websupport/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8zijRwtnT2M3A18DQyCTQwcTc2NzX3N_Q3cDQz0wwkpiAJKG-AAjiD9UWAlcBP8fYyAEqahbqGeLmaGBv6GUAV4zCjIjTDIdFRUBACNZdAr/dz/d5/L2dJQSEvUUt3QS80TmxFL1o2XzUyRDQwQzQwTUc0MDcwQVQwTTFVUDIzMDAw/']")
    @CacheLookup
    private WebElement webSupport;

    @FindBy(css = "#mm-0 div.mm-navbar a.mm-title")
    @CacheLookup
    private WebElement youAreOnMybrocadeBrocadeCom1;

    @FindBy(css = "#mm-5 div.mm-navbar a.mm-title")
    @CacheLookup
    private WebElement youAreOnMybrocadeBrocadeCom2;

    @FindBy(css = "#mm-9 div:nth-of-type(1) a.mm-title")
    @CacheLookup
    private WebElement youAreOnMybrocadeBrocadeCom3;

    @FindBy(name = "query")
    @CacheLookup
    private WebElement youHaveNoMybrocadeAlerts;

    @FindBy(css = "a.social-link.social-link-youtube")
    @CacheLookup
    private WebElement youtube;

    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public HomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage click1Link0() {
        10.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage click2Link0() {
        20.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage click3Link0() {
        30.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage click4Link0() {
        40.click();
        return this;
    }

    /**
     * Click on Add Product Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddProduct1Link() {
        addProduct1.click();
        return this;
    }

    /**
     * Click on Add Product Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddProduct2Link() {
        addProduct2.click();
        return this;
    }

    /**
     * Click on Add Product Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddProductLink() {
        addProduct.click();
        return this;
    }

    /**
     * Click on Adding Products From The Brocade Product Catalog. Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddingProductsFromTheBrocadeProductLink() {
        addingProductsFromTheBrocadeProduct.click();
        return this;
    }

    /**
     * Click on Brocade 300 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade300Switch1Link() {
        brocade300Switch1.click();
        return this;
    }

    /**
     * Click on Brocade 300 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade300Switch2Link() {
        brocade300Switch2.click();
        return this;
    }

    /**
     * Click on Brocade 300 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade300Switch3Link() {
        brocade300Switch3.click();
        return this;
    }

    /**
     * Click on Brocade 300 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade300Switch4Link() {
        brocade300Switch4.click();
        return this;
    }

    /**
     * Click on Brocade 5100 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade5100Switch1Link() {
        brocade5100Switch1.click();
        return this;
    }

    /**
     * Click on Brocade 5100 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade5100Switch2Link() {
        brocade5100Switch2.click();
        return this;
    }

    /**
     * Click on Brocade 5100 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade5100Switch3Link() {
        brocade5100Switch3.click();
        return this;
    }

    /**
     * Click on Brocade 5100 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade5100Switch4Link() {
        brocade5100Switch4.click();
        return this;
    }

    /**
     * Click on Brocade 6505 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6505Switch1Link() {
        brocade6505Switch1.click();
        return this;
    }

    /**
     * Click on Brocade 6505 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6505Switch2Link() {
        brocade6505Switch2.click();
        return this;
    }

    /**
     * Click on Brocade 6505 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6505Switch3Link() {
        brocade6505Switch3.click();
        return this;
    }

    /**
     * Click on Brocade 6505 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6505Switch4Link() {
        brocade6505Switch4.click();
        return this;
    }

    /**
     * Click on Brocade 6510 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6510Switch1Link() {
        brocade6510Switch1.click();
        return this;
    }

    /**
     * Click on Brocade 6510 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6510Switch2Link() {
        brocade6510Switch2.click();
        return this;
    }

    /**
     * Click on Brocade 6510 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6510Switch3Link() {
        brocade6510Switch3.click();
        return this;
    }

    /**
     * Click on Brocade 6510 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6510Switch4Link() {
        brocade6510Switch4.click();
        return this;
    }

    /**
     * Click on Brocade 6520 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6520Switch1Link() {
        brocade6520Switch1.click();
        return this;
    }

    /**
     * Click on Brocade 6520 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6520Switch2Link() {
        brocade6520Switch2.click();
        return this;
    }

    /**
     * Click on Brocade 6520 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6520Switch3Link() {
        brocade6520Switch3.click();
        return this;
    }

    /**
     * Click on Brocade 6520 Switch Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocade6520Switch4Link() {
        brocade6520Switch4.click();
        return this;
    }

    /**
     * Click on Brocade.com Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocadeComLink() {
        brocadeCom.click();
        return this;
    }

    /**
     * Click on Brocade Flow Optimizer V2.0.0 For Linux Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocadeFlowOptimizerV200ForLinux1Link() {
        brocadeFlowOptimizerV200ForLinux1.click();
        return this;
    }

    /**
     * Click on Brocade Flow Optimizer V2.0.0 For Linux Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocadeFlowOptimizerV200ForLinux2Link() {
        brocadeFlowOptimizerV200ForLinux2.click();
        return this;
    }

    /**
     * Click on Brocade Product Catalog Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocadeProductCatalog1Link() {
        brocadeProductCatalog1.click();
        return this;
    }

    /**
     * Click on Brocade Product Catalog Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocadeProductCatalog2Link() {
        brocadeProductCatalog2.click();
        return this;
    }

    /**
     * Click on Brocade Product Catalog Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocadeProductCatalog3Link() {
        brocadeProductCatalog3.click();
        return this;
    }

    /**
     * Click on Brocade San Health Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrocadeSanHealthLink() {
        brocadeSanHealth.click();
        return this;
    }

    /**
     * Click on 1 Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickButton1() {
        1.click();
        return this;
    }

    /**
     * Click on 2 Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickButton2() {
        2.click();
        return this;
    }

    /**
     * Click on 3 Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickButton3() {
        3.click();
        return this;
    }

    /**
     * Click on Campus Tco Calculator Make Smarter Purchase Decisions With Our Tco Calculator Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCampusTcoCalculatorMakeSmarter1Link() {
        campusTcoCalculatorMakeSmarter1.click();
        return this;
    }

    /**
     * Click on Campus Tco Calculator Make Smarter Purchase Decisions With Our Tco Calculator Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCampusTcoCalculatorMakeSmarter2Link() {
        campusTcoCalculatorMakeSmarter2.click();
        return this;
    }

    /**
     * Click on Campus Tco Calculator Make Smarter Purchase Decisions With Our Tco Calculator Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCampusTcoCalculatorMakeSmarter3Link() {
        campusTcoCalculatorMakeSmarter3.click();
        return this;
    }

    /**
     * Click on Cancel Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCancel1Button() {
        cancel1.click();
        return this;
    }

    /**
     * Click on Cancel Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCancel2Button() {
        cancel2.click();
        return this;
    }

    /**
     * Click on Cancel Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCancel3Button() {
        cancel3.click();
        return this;
    }

    /**
     * Click on Certification Program Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCertificationProgram1Link() {
        certificationProgram1.click();
        return this;
    }

    /**
     * Click on Certification Program Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCertificationProgram2Link() {
        certificationProgram2.click();
        return this;
    }

    /**
     * Click on Certification Program Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCertificationProgram3Link() {
        certificationProgram3.click();
        return this;
    }

    /**
     * Click on Certification Program Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCertificationProgram4Link() {
        certificationProgram4.click();
        return this;
    }

    /**
     * Click on Cid Demo Reservation System Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCidDemoReservationSystem1Link() {
        cidDemoReservationSystem1.click();
        return this;
    }

    /**
     * Click on Cid Demo Reservation System Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCidDemoReservationSystem2Link() {
        cidDemoReservationSystem2.click();
        return this;
    }

    /**
     * Click on Cid Demo Reservation System Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCidDemoReservationSystem3Link() {
        cidDemoReservationSystem3.click();
        return this;
    }

    /**
     * Click on Clear Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickClear1Link() {
        clear1.click();
        return this;
    }

    /**
     * Click on Clear Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickClear2Link() {
        clear2.click();
        return this;
    }

    /**
     * Click on Click Here Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickClickHereLink() {
        clickHere.click();
        return this;
    }

    /**
     * Click on Close Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCloseButton() {
        close.click();
        return this;
    }

    /**
     * Click on Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCommunity1Link() {
        community1.click();
        return this;
    }

    /**
     * Click on Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCommunity1Link() {
        community1.click();
        return this;
    }

    /**
     * Click on Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCommunity2Link() {
        community2.click();
        return this;
    }

    /**
     * Click on Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCommunity2Link() {
        community2.click();
        return this;
    }

    /**
     * Click on Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCommunity3Link() {
        community3.click();
        return this;
    }

    /**
     * Click on Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCommunity3Link() {
        community3.click();
        return this;
    }

    /**
     * Click on Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCommunity4Link() {
        community4.click();
        return this;
    }

    /**
     * Click on Confirm New Password Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickConfirmNewPasswordButton() {
        confirmNewPassword.click();
        return this;
    }

    /**
     * Click on Contact Tech Support Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickContactTechSupport1Link() {
        contactTechSupport1.click();
        return this;
    }

    /**
     * Click on Contact Tech Support Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickContactTechSupport2Link() {
        contactTechSupport2.click();
        return this;
    }

    /**
     * Click on Contact Tech Support Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickContactTechSupport3Link() {
        contactTechSupport3.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickContactUs1Link() {
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickContactUs2Link() {
        contactUs2.click();
        return this;
    }

    /**
     * Click on Course Schedule Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCourseSchedule1Link() {
        courseSchedule1.click();
        return this;
    }

    /**
     * Click on Course Schedule Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCourseSchedule2Link() {
        courseSchedule2.click();
        return this;
    }

    /**
     * Click on Course Schedule Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCourseSchedule3Link() {
        courseSchedule3.click();
        return this;
    }

    /**
     * Click on Course Schedule Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCourseSchedule4Link() {
        courseSchedule4.click();
        return this;
    }

    /**
     * Click on Create A Question That Is Unique To You Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCreateAQuestionThatIsUnique3Button() {
        createAQuestionThatIsUnique3.click();
        return this;
    }

    /**
     * Click on Customer Support Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCustomerSupportLink() {
        customerSupport.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDeleteLink() {
        delete.click();
        return this;
    }

    /**
     * Click on Document Library Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDocumentLibrary1Link() {
        documentLibrary1.click();
        return this;
    }

    /**
     * Click on Document Library Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDocumentLibrary2Link() {
        documentLibrary2.click();
        return this;
    }

    /**
     * Click on Document Library Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDocumentLibrary3Link() {
        documentLibrary3.click();
        return this;
    }

    /**
     * Click on Document Library Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDocumentLibrary4Link() {
        documentLibrary4.click();
        return this;
    }

    /**
     * Click on Document Library Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDocumentLibrary5Link() {
        documentLibrary5.click();
        return this;
    }

    /**
     * Click on Document Library Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDocumentLibrary6Link() {
        documentLibrary6.click();
        return this;
    }

    /**
     * Click on Drop Us A Message Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDropUsAMessage1Link() {
        dropUsAMessage1.click();
        return this;
    }

    /**
     * Click on Drop Us A Message Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDropUsAMessage2Link() {
        dropUsAMessage2.click();
        return this;
    }

    /**
     * Click on Edit Links Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEditLinks1Link() {
        editLinks1.click();
        return this;
    }

    /**
     * Click on Edit Links Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEditLinks2Link() {
        editLinks2.click();
        return this;
    }

    /**
     * Click on Edit Links Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEditLinks3Link() {
        editLinks3.click();
        return this;
    }

    /**
     * Click on Edit Links Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEditLinks4Link() {
        editLinks4.click();
        return this;
    }

    /**
     * Click on Edit List Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEditList1Link() {
        editList1.click();
        return this;
    }

    /**
     * Click on Edit List Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEditList2Link() {
        editList2.click();
        return this;
    }

    /**
     * Click on Edit List Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEditList3Link() {
        editList3.click();
        return this;
    }

    /**
     * Click on Edit List Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEditList4Link() {
        editList4.click();
        return this;
    }

    /**
     * Click on Education Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEducation1Link() {
        education1.click();
        return this;
    }

    /**
     * Click on Education Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEducation2Link() {
        education2.click();
        return this;
    }

    /**
     * Click on Education Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEducation3Link() {
        education3.click();
        return this;
    }

    /**
     * Click on Education Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEducationCommunity1Link() {
        educationCommunity1.click();
        return this;
    }

    /**
     * Click on Education Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEducationCommunity2Link() {
        educationCommunity2.click();
        return this;
    }

    /**
     * Click on Education Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEducationCommunity3Link() {
        educationCommunity3.click();
        return this;
    }

    /**
     * Click on Enroll Now Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEnrollNow1Link() {
        enrollNow1.click();
        return this;
    }

    /**
     * Click on Enroll Now Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEnrollNow2Link() {
        enrollNow2.click();
        return this;
    }

    /**
     * Click on Enroll Now Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEnrollNow3Link() {
        enrollNow3.click();
        return this;
    }

    /**
     * Click on Eol Schedule Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEolSchedule1Link() {
        eolSchedule1.click();
        return this;
    }

    /**
     * Click on Eol Schedule Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEolSchedule2Link() {
        eolSchedule2.click();
        return this;
    }

    /**
     * Click on Eol Schedule Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEolSchedule3Link() {
        eolSchedule3.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Favourites Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFavouritesLink() {
        favourites.click();
        return this;
    }

    /**
     * Click on Free Software Trials Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFreeSoftwareTrials1Link() {
        freeSoftwareTrials1.click();
        return this;
    }

    /**
     * Click on Free Software Trials Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFreeSoftwareTrials2Link() {
        freeSoftwareTrials2.click();
        return this;
    }

    /**
     * Click on Free Software Trials Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFreeSoftwareTrials3Link() {
        freeSoftwareTrials3.click();
        return this;
    }

    /**
     * Click on Hello Dhakshna Moorthy Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHelloDhakshnaMoorthyLink() {
        helloDhakshnaMoorthy.click();
        return this;
    }

    /**
     * Click on In Document Library Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickInDocumentLibrary1Link() {
        inDocumentLibrary1.click();
        return this;
    }

    /**
     * Click on In Document Library Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickInDocumentLibrary2Link() {
        inDocumentLibrary2.click();
        return this;
    }

    /**
     * Click on In Knowledge Base Defects Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickInKnowledgeBaseDefects1Link() {
        inKnowledgeBaseDefects1.click();
        return this;
    }

    /**
     * Click on In Knowledge Base Defects Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickInKnowledgeBaseDefects2Link() {
        inKnowledgeBaseDefects2.click();
        return this;
    }

    /**
     * Click on In Mybrocade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickInMybrocade1Link() {
        inMybrocade1.click();
        return this;
    }

    /**
     * Click on In Mybrocade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickInMybrocade2Link() {
        inMybrocade2.click();
        return this;
    }

    /**
     * Click on In Software Downloads Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickInSoftwareDownloads1Link() {
        inSoftwareDownloads1.click();
        return this;
    }

    /**
     * Click on In Software Downloads Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickInSoftwareDownloads2Link() {
        inSoftwareDownloads2.click();
        return this;
    }

    /**
     * Click on Knowledge Base Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickKnowledgeBase1Link() {
        knowledgeBase1.click();
        return this;
    }

    /**
     * Click on Knowledge Base Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickKnowledgeBase2Link() {
        knowledgeBase2.click();
        return this;
    }

    /**
     * Click on Knowledge Base Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickKnowledgeBase3Link() {
        knowledgeBase3.click();
        return this;
    }

    /**
     * Click on Knowledge Base Defects Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickKnowledgeBaseDefects1Link() {
        knowledgeBaseDefects1.click();
        return this;
    }

    /**
     * Click on Knowledge Base Defects Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickKnowledgeBaseDefects2Link() {
        knowledgeBaseDefects2.click();
        return this;
    }

    /**
     * Click on Knowledge Base Defects Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickKnowledgeBaseDefects3Link() {
        knowledgeBaseDefects3.click();
        return this;
    }

    /**
     * Click on Knowledge Base Defects Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickKnowledgeBaseDefects4Link() {
        knowledgeBaseDefects4.click();
        return this;
    }

    /**
     * Click on Knowledge Base Defects Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickKnowledgeBaseDefects5Link() {
        knowledgeBaseDefects5.click();
        return this;
    }

    /**
     * Click on Knowledge Base Defects Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickKnowledgeBaseDefects6Link() {
        knowledgeBaseDefects6.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore1Link() {
        learnMore1.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore2Link() {
        learnMore2.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore3Link() {
        learnMore3.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore4Link() {
        learnMore4.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore5Link() {
        learnMore5.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore6Link() {
        learnMore6.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore7Link() {
        learnMore7.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMoreLink() {
        learnMore.click();
        return this;
    }

    /**
     * Click on Learning Portal Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearningPortal1Link() {
        learningPortal1.click();
        return this;
    }

    /**
     * Click on Learning Portal Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearningPortal2Link() {
        learningPortal2.click();
        return this;
    }

    /**
     * Click on Learning Portal Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearningPortal3Link() {
        learningPortal3.click();
        return this;
    }

    /**
     * Click on Learning Portal Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearningPortal4Link() {
        learningPortal4.click();
        return this;
    }

    /**
     * Click on Legal Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLegalLink() {
        legal.click();
        return this;
    }

    /**
     * Click on Licenses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLicenses1Link() {
        licenses1.click();
        return this;
    }

    /**
     * Click on Licenses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLicenses2Link() {
        licenses2.click();
        return this;
    }

    /**
     * Click on Licenses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLicenses3Link() {
        licenses3.click();
        return this;
    }

    /**
     * Click on Licenses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLicenses4Link() {
        licenses4.click();
        return this;
    }

    /**
     * Click on Licenses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLicenses5Link() {
        licenses5.click();
        return this;
    }

    /**
     * Click on Licenses Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLicenses6Link() {
        licenses6.click();
        return this;
    }

    /**
     * Click on Licenses Manage Your Licenses For Brocade Products And Operating Systems Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLicensesManageYourLicensesFor1Link() {
        licensesManageYourLicensesFor1.click();
        return this;
    }

    /**
     * Click on Licenses Manage Your Licenses For Brocade Products And Operating Systems Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLicensesManageYourLicensesFor2Link() {
        licensesManageYourLicensesFor2.click();
        return this;
    }

    /**
     * Click on Licenses Manage Your Licenses For Brocade Products And Operating Systems Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLicensesManageYourLicensesFor3Link() {
        licensesManageYourLicensesFor3.click();
        return this;
    }

    /**
     * Click on Linkedin Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLinkedinLink() {
        linkedin.click();
        return this;
    }

    /**
     * Click on Manage Access Permissions Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickManageAccessPermissions1Link() {
        manageAccessPermissions1.click();
        return this;
    }

    /**
     * Click on Manage Access Permissions Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickManageAccessPermissions2Link() {
        manageAccessPermissions2.click();
        return this;
    }

    /**
     * Click on Manage Access Permissions Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickManageAccessPermissions3Link() {
        manageAccessPermissions3.click();
        return this;
    }

    /**
     * Click on Manage Products I Care About Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickManageProductsICareAbout5Link() {
        manageProductsICareAbout5.click();
        return this;
    }

    /**
     * Click on Manage Products I Care About Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickManageProductsICareAbout7Link() {
        manageProductsICareAbout7.click();
        return this;
    }

    /**
     * Click on Mark All As Read Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMarkAllAsRead1Link() {
        markAllAsRead1.click();
        return this;
    }

    /**
     * Click on Mark All As Read Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMarkAllAsRead2Link() {
        markAllAsRead2.click();
        return this;
    }

    /**
     * Click on Mark All As Read Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMarkAllAsRead3Link() {
        markAllAsRead3.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMenu1Link() {
        menu1.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMenu2Link() {
        menu2.click();
        return this;
    }

    /**
     * Click on My Profile Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyProfile1Link() {
        myProfile1.click();
        return this;
    }

    /**
     * Click on My Profile Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyProfile2Link() {
        myProfile2.click();
        return this;
    }

    /**
     * Click on My Profile Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyProfile3Link() {
        myProfile3.click();
        return this;
    }

    /**
     * Click on Mybrocade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMybrocade1Link() {
        mybrocade1.click();
        return this;
    }

    /**
     * Click on Mybrocade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMybrocade2Link() {
        mybrocade2.click();
        return this;
    }

    /**
     * Click on Mybrocade Admin Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMybrocadeAdminLink() {
        mybrocadeAdmin.click();
        return this;
    }

    /**
     * Click on Next Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickNextButton() {
        next.click();
        return this;
    }

    /**
     * Click on Partner Locator Connect With Brocade Product Resellers And Distributors Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPartnerLocatorConnectWithBrocade1Link() {
        partnerLocatorConnectWithBrocade1.click();
        return this;
    }

    /**
     * Click on Partner Locator Connect With Brocade Product Resellers And Distributors Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPartnerLocatorConnectWithBrocade2Link() {
        partnerLocatorConnectWithBrocade2.click();
        return this;
    }

    /**
     * Click on Partner Locator Connect With Brocade Product Resellers And Distributors Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPartnerLocatorConnectWithBrocade3Link() {
        partnerLocatorConnectWithBrocade3.click();
        return this;
    }

    /**
     * Click on Previous Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPreviousButton() {
        previous.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrivacyLink() {
        privacy.click();
        return this;
    }

    /**
     * Click on Product Configurator Create The Ideal Brocade Solution To Meet Your Business Needs Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickProductConfiguratorCreateTheIdeal1Link() {
        productConfiguratorCreateTheIdeal1.click();
        return this;
    }

    /**
     * Click on Product Configurator Create The Ideal Brocade Solution To Meet Your Business Needs Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickProductConfiguratorCreateTheIdeal2Link() {
        productConfiguratorCreateTheIdeal2.click();
        return this;
    }

    /**
     * Click on Product Configurator Create The Ideal Brocade Solution To Meet Your Business Needs Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickProductConfiguratorCreateTheIdeal3Link() {
        productConfiguratorCreateTheIdeal3.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickProducts1Link() {
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickProducts2Link() {
        products2.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickProducts3Link() {
        products3.click();
        return this;
    }

    /**
     * Click on Remove Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickRemoveProductsLink() {
        removeProducts.click();
        return this;
    }

    /**
     * Click on Remove Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickRemoveProductsLink() {
        removeProducts.click();
        return this;
    }

    /**
     * Click on San Health Get An Accurate View Of Your San Environment Performance Graphs And Topology Diagrams Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSanHealthGetAnAccurate1Link() {
        sanHealthGetAnAccurate1.click();
        return this;
    }

    /**
     * Click on San Health Get An Accurate View Of Your San Environment Performance Graphs And Topology Diagrams Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSanHealthGetAnAccurate2Link() {
        sanHealthGetAnAccurate2.click();
        return this;
    }

    /**
     * Click on San Health Get An Accurate View Of Your San Environment Performance Graphs And Topology Diagrams Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSanHealthGetAnAccurate3Link() {
        sanHealthGetAnAccurate3.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSearch1Link() {
        search1.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSearch2Link() {
        search2.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSearch3Button() {
        search3.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSearch4Link() {
        search4.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSearch5Button() {
        search5.click();
        return this;
    }

    /**
     * Click on Security Advisories Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSecurityAdvisories1Link() {
        securityAdvisories1.click();
        return this;
    }

    /**
     * Click on Security Advisories Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSecurityAdvisories2Link() {
        securityAdvisories2.click();
        return this;
    }

    /**
     * Click on Security Advisories Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSecurityAdvisories3Link() {
        securityAdvisories3.click();
        return this;
    }

    /**
     * Click on Show All Hide Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShowAllHideLink() {
        showAllHide.click();
        return this;
    }

    /**
     * Click on Show Details Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShowDetailsLink() {
        showDetails.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSignOut1Link() {
        signOut1.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSignOut2Link() {
        signOut2.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSignOut3Link() {
        signOut3.click();
        return this;
    }

    /**
     * Click on Software Downloads Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSoftwareDownloads1Link() {
        softwareDownloads1.click();
        return this;
    }

    /**
     * Click on Software Downloads Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSoftwareDownloads2Link() {
        softwareDownloads2.click();
        return this;
    }

    /**
     * Click on Software Downloads Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSoftwareDownloads3Link() {
        softwareDownloads3.click();
        return this;
    }

    /**
     * Click on Software Driver Downloads Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSoftwareDriverDownloads1Link() {
        softwareDriverDownloads1.click();
        return this;
    }

    /**
     * Click on Software Driver Downloads Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSoftwareDriverDownloads2Link() {
        softwareDriverDownloads2.click();
        return this;
    }

    /**
     * Click on Software Driver Downloads Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSoftwareDriverDownloads3Link() {
        softwareDriverDownloads3.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSubmit1Button() {
        submit1.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSubmit2Button() {
        submit2.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSubmit3Button() {
        submit3.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSubmit4Button() {
        submit4.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSubmit5Button() {
        submit5.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupport1Link() {
        support1.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupport2Link() {
        support2.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupport3Link() {
        support3.click();
        return this;
    }

    /**
     * Click on Support Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupportCommunity1Link() {
        supportCommunity1.click();
        return this;
    }

    /**
     * Click on Support Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupportCommunity2Link() {
        supportCommunity2.click();
        return this;
    }

    /**
     * Click on Support Community Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupportCommunity3Link() {
        supportCommunity3.click();
        return this;
    }

    /**
     * Click on Tools Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTools1Link() {
        tools1.click();
        return this;
    }

    /**
     * Click on Tools Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTools2Link() {
        tools2.click();
        return this;
    }

    /**
     * Click on Tools Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTools3Link() {
        tools3.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on Update To Your Site Access Information Is Required Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUpdateToYourSiteAccessInformationButton() {
        updateToYourSiteAccessInformation.click();
        return this;
    }

    /**
     * Click on Upgrade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUpgrade1Link() {
        upgrade1.click();
        return this;
    }

    /**
     * Click on Upgrade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUpgrade2Link() {
        upgrade2.click();
        return this;
    }

    /**
     * Click on Upgrade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUpgrade3Link() {
        upgrade3.click();
        return this;
    }

    /**
     * Click on Upgrade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUpgrade4Link() {
        upgrade4.click();
        return this;
    }

    /**
     * Click on Upgrade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUpgrade5Link() {
        upgrade5.click();
        return this;
    }

    /**
     * Click on Upgrade Access Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUpgradeAccess1Link() {
        upgradeAccess1.click();
        return this;
    }

    /**
     * Click on Upgrade Access Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUpgradeAccess2Link() {
        upgradeAccess2.click();
        return this;
    }

    /**
     * Click on Upgrade Access Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUpgradeAccess3Link() {
        upgradeAccess3.click();
        return this;
    }

    /**
     * Click on View All Alerts Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickViewAllAlerts1Link() {
        viewAllAlerts1.click();
        return this;
    }

    /**
     * Click on View All Alerts Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickViewAllAlerts2Link() {
        viewAllAlerts2.click();
        return this;
    }

    /**
     * Click on View All Alerts Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickViewAllAlerts3Link() {
        viewAllAlerts3.click();
        return this;
    }

    /**
     * Click on View All Brocade Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickViewAllBrocadeProducts1Link() {
        viewAllBrocadeProducts1.click();
        return this;
    }

    /**
     * Click on View All Brocade Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickViewAllBrocadeProducts1Link() {
        viewAllBrocadeProducts1.click();
        return this;
    }

    /**
     * Click on View All Brocade Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickViewAllBrocadeProducts2Link() {
        viewAllBrocadeProducts2.click();
        return this;
    }

    /**
     * Click on View All Brocade Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickViewAllBrocadeProducts2Link() {
        viewAllBrocadeProducts2.click();
        return this;
    }

    /**
     * Click on Warranties Returns Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWarrantiesReturns1Link() {
        warrantiesReturns1.click();
        return this;
    }

    /**
     * Click on Warranties Returns Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWarrantiesReturns2Link() {
        warrantiesReturns2.click();
        return this;
    }

    /**
     * Click on Warranties Returns Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWarrantiesReturns3Link() {
        warrantiesReturns3.click();
        return this;
    }

    /**
     * Click on Watch Now Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWatchNow1Link() {
        watchNow1.click();
        return this;
    }

    /**
     * Click on Watch Now Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWatchNow2Link() {
        watchNow2.click();
        return this;
    }

    /**
     * Click on Web Support Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWebSupportLink() {
        webSupport.click();
        return this;
    }

    /**
     * Click on You Are On Mybrocade Brocade.com Community Mybrocade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickYouAreOnMybrocadeBrocadeCom1Link() {
        youAreOnMybrocadeBrocadeCom1.click();
        return this;
    }

    /**
     * Click on You Are On Mybrocade Brocade.com Community Mybrocade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickYouAreOnMybrocadeBrocadeCom2Link() {
        youAreOnMybrocadeBrocadeCom2.click();
        return this;
    }

    /**
     * Click on You Are On Mybrocade Brocade.com Community Mybrocade Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickYouAreOnMybrocadeBrocadeCom3Link() {
        youAreOnMybrocadeBrocadeCom3.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the HomePage class instance.
     */
    public HomePage fill() {
        setManageProductsICareAbout1DropDownListField();
        setManageProductsICareAbout2DropDownListField();
        setManageProductsICareAbout3DropDownListField();
        setManageProductsICareAbout4DropDownListField();
        setManageProductsICareAbout6TextField();
        setYouHaveNoMybrocadeAlertsTextField();
        setBrocadeCapitalSolutions1CheckboxField();
        setSanHealthCheckboxField();
        setSoftwareDownloadsCheckboxField();
        setPartnerLocatorCheckboxField();
        setKnowledgeBaseDefectsCheckboxField();
        setDocumentLibraryCheckboxField();
        setLicensesCheckboxField();
        setCampusTcoCalculatorCheckboxField();
        setWarrantyAndReturnsCheckboxField();
        setCommunityCheckboxField();
        setBrocadeCapitalSolutions2CheckboxField();
        setCreateAQuestionThatIsUnique1TextField();
        setProvideTheResponseToYourSecurity1TextField();
        setPasswordsAreRequiredToBeA1PasswordField();
        setRetypeYourNewPasswordInThe1PasswordField();
        setPasswordsAreRequiredToBeA2PasswordField();
        setRetypeYourNewPasswordInThe2PasswordField();
        setCreateAQuestionThatIsUnique2TextField();
        setProvideTheResponseToYourSecurity2TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the HomePage class instance.
     */
    public HomePage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Brocade Capital Solutions Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setBrocadeCapitalSolutions1CheckboxField() {
        return setBrocadeCapitalSolutions1CheckboxField(data.get("BROCADE_CAPITAL_SOLUTIONS"));
    }

    /**
     * Set Brocade Capital Solutions Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setBrocadeCapitalSolutions1CheckboxField(String brocadeCapitalSolutionsValue) {
        new Select(brocadeCapitalSolutions1).selectByVisibleText(brocadeCapitalSolutionsValue);
        return this;
    }

    /**
     * Set Brocade Capital Solutions Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setBrocadeCapitalSolutions2CheckboxField() {
        if (!brocadeCapitalSolutions2.isSelected()) {
            brocadeCapitalSolutions2.click();
        }
        return this;
    }

    /**
     * Set Campus Tco Calculator Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setCampusTcoCalculatorCheckboxField() {
        if (!campusTcoCalculator.isSelected()) {
            campusTcoCalculator.click();
        }
        return this;
    }

    /**
     * Set Community Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setCommunityCheckboxField() {
        if (!community.isSelected()) {
            community.click();
        }
        return this;
    }

    /**
     * Set default value to Create A Question That Is Unique To You Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setCreateAQuestionThatIsUnique1TextField() {
        return setCreateAQuestionThatIsUnique1TextField(data.get("CREATE_A_QUESTION_THAT_IS_UNIQUE_1"));
    }

    /**
     * Set value to Create A Question That Is Unique To You Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setCreateAQuestionThatIsUnique1TextField(String createAQuestionThatIsUnique1Value) {
        createAQuestionThatIsUnique1.sendKeys(createAQuestionThatIsUnique1Value);
        return this;
    }

    /**
     * Set default value to Create A Question That Is Unique To You Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setCreateAQuestionThatIsUnique2TextField() {
        return setCreateAQuestionThatIsUnique2TextField(data.get("CREATE_A_QUESTION_THAT_IS_UNIQUE_2"));
    }

    /**
     * Set value to Create A Question That Is Unique To You Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setCreateAQuestionThatIsUnique2TextField(String createAQuestionThatIsUnique2Value) {
        createAQuestionThatIsUnique2.sendKeys(createAQuestionThatIsUnique2Value);
        return this;
    }

    /**
     * Set Document Library Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setDocumentLibraryCheckboxField() {
        if (!documentLibrary.isSelected()) {
            documentLibrary.click();
        }
        return this;
    }

    /**
     * Set Knowledge Base Defects Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setKnowledgeBaseDefectsCheckboxField() {
        if (!knowledgeBaseDefects.isSelected()) {
            knowledgeBaseDefects.click();
        }
        return this;
    }

    /**
     * Set Licenses Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setLicensesCheckboxField() {
        if (!licenses.isSelected()) {
            licenses.click();
        }
        return this;
    }

    /**
     * Set default value to Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setManageProductsICareAbout1DropDownListField() {
        return setManageProductsICareAbout1DropDownListField(data.get("MANAGE_PRODUCTS_I_CARE_ABOUT_1"));
    }

    /**
     * Set value to Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setManageProductsICareAbout1DropDownListField(String manageProductsICareAbout1Value) {
        new Select(manageProductsICareAbout1).selectByVisibleText(manageProductsICareAbout1Value);
        return this;
    }

    /**
     * Set default value to Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setManageProductsICareAbout2DropDownListField() {
        return setManageProductsICareAbout2DropDownListField(data.get("MANAGE_PRODUCTS_I_CARE_ABOUT_2"));
    }

    /**
     * Set value to Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setManageProductsICareAbout2DropDownListField(String manageProductsICareAbout2Value) {
        new Select(manageProductsICareAbout2).selectByVisibleText(manageProductsICareAbout2Value);
        return this;
    }

    /**
     * Set default value to Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setManageProductsICareAbout3DropDownListField() {
        return setManageProductsICareAbout3DropDownListField(data.get("MANAGE_PRODUCTS_I_CARE_ABOUT_3"));
    }

    /**
     * Set value to Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setManageProductsICareAbout3DropDownListField(String manageProductsICareAbout3Value) {
        new Select(manageProductsICareAbout3).selectByVisibleText(manageProductsICareAbout3Value);
        return this;
    }

    /**
     * Set default value to Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setManageProductsICareAbout4DropDownListField() {
        return setManageProductsICareAbout4DropDownListField(data.get("MANAGE_PRODUCTS_I_CARE_ABOUT_4"));
    }

    /**
     * Set value to Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setManageProductsICareAbout4DropDownListField(String manageProductsICareAbout4Value) {
        new Select(manageProductsICareAbout4).selectByVisibleText(manageProductsICareAbout4Value);
        return this;
    }

    /**
     * Set default value to Manage Products I Care About Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setManageProductsICareAbout6TextField() {
        return setManageProductsICareAbout6TextField(data.get("MANAGE_PRODUCTS_I_CARE_ABOUT_6"));
    }

    /**
     * Set value to Manage Products I Care About Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setManageProductsICareAbout6TextField(String manageProductsICareAbout6Value) {
        manageProductsICareAbout6.sendKeys(manageProductsICareAbout6Value);
        return this;
    }

    /**
     * Set Partner Locator Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPartnerLocatorCheckboxField() {
        if (!partnerLocator.isSelected()) {
            partnerLocator.click();
        }
        return this;
    }

    /**
     * Set default value to Passwords Are Required To Be A Combination Of Letters And Numberswith A Minimum Of 8 And Maximum Of 15 Characters Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPasswordsAreRequiredToBeA1PasswordField() {
        return setPasswordsAreRequiredToBeA1PasswordField(data.get("PASSWORDS_ARE_REQUIRED_TO_BE_A_1"));
    }

    /**
     * Set value to Passwords Are Required To Be A Combination Of Letters And Numberswith A Minimum Of 8 And Maximum Of 15 Characters Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPasswordsAreRequiredToBeA1PasswordField(String passwordsAreRequiredToBeA1Value) {
        passwordsAreRequiredToBeA1.sendKeys(passwordsAreRequiredToBeA1Value);
        return this;
    }

    /**
     * Set default value to Passwords Are Required To Be A Combination Of Letters And Numberswith A Minimum Of 8 And Maximum Of 15 Characters Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPasswordsAreRequiredToBeA2PasswordField() {
        return setPasswordsAreRequiredToBeA2PasswordField(data.get("PASSWORDS_ARE_REQUIRED_TO_BE_A_2"));
    }

    /**
     * Set value to Passwords Are Required To Be A Combination Of Letters And Numberswith A Minimum Of 8 And Maximum Of 15 Characters Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPasswordsAreRequiredToBeA2PasswordField(String passwordsAreRequiredToBeA2Value) {
        passwordsAreRequiredToBeA2.sendKeys(passwordsAreRequiredToBeA2Value);
        return this;
    }

    /**
     * Set default value to Provide The Response To Your Security Question Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setProvideTheResponseToYourSecurity1TextField() {
        return setProvideTheResponseToYourSecurity1TextField(data.get("PROVIDE_THE_RESPONSE_TO_YOUR_SECURITY_1"));
    }

    /**
     * Set value to Provide The Response To Your Security Question Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setProvideTheResponseToYourSecurity1TextField(String provideTheResponseToYourSecurity1Value) {
        provideTheResponseToYourSecurity1.sendKeys(provideTheResponseToYourSecurity1Value);
        return this;
    }

    /**
     * Set default value to Provide The Response To Your Security Question Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setProvideTheResponseToYourSecurity2TextField() {
        return setProvideTheResponseToYourSecurity2TextField(data.get("PROVIDE_THE_RESPONSE_TO_YOUR_SECURITY_2"));
    }

    /**
     * Set value to Provide The Response To Your Security Question Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setProvideTheResponseToYourSecurity2TextField(String provideTheResponseToYourSecurity2Value) {
        provideTheResponseToYourSecurity2.sendKeys(provideTheResponseToYourSecurity2Value);
        return this;
    }

    /**
     * Set default value to Retype Your New Password In The Above Field Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setRetypeYourNewPasswordInThe1PasswordField() {
        return setRetypeYourNewPasswordInThe1PasswordField(data.get("RETYPE_YOUR_NEW_PASSWORD_IN_THE_1"));
    }

    /**
     * Set value to Retype Your New Password In The Above Field Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setRetypeYourNewPasswordInThe1PasswordField(String retypeYourNewPasswordInThe1Value) {
        retypeYourNewPasswordInThe1.sendKeys(retypeYourNewPasswordInThe1Value);
        return this;
    }

    /**
     * Set default value to Retype Your New Password In The Above Field Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setRetypeYourNewPasswordInThe2PasswordField() {
        return setRetypeYourNewPasswordInThe2PasswordField(data.get("RETYPE_YOUR_NEW_PASSWORD_IN_THE_2"));
    }

    /**
     * Set value to Retype Your New Password In The Above Field Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setRetypeYourNewPasswordInThe2PasswordField(String retypeYourNewPasswordInThe2Value) {
        retypeYourNewPasswordInThe2.sendKeys(retypeYourNewPasswordInThe2Value);
        return this;
    }

    /**
     * Set San Health Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setSanHealthCheckboxField() {
        if (!sanHealth.isSelected()) {
            sanHealth.click();
        }
        return this;
    }

    /**
     * Set Software Downloads Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setSoftwareDownloadsCheckboxField() {
        if (!softwareDownloads.isSelected()) {
            softwareDownloads.click();
        }
        return this;
    }

    /**
     * Set Warranty And Returns Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setWarrantyAndReturnsCheckboxField() {
        if (!warrantyAndReturns.isSelected()) {
            warrantyAndReturns.click();
        }
        return this;
    }

    /**
     * Set default value to You Have No Mybrocade Alerts Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setYouHaveNoMybrocadeAlertsTextField() {
        return setYouHaveNoMybrocadeAlertsTextField(data.get("YOU_HAVE_NO_MYBROCADE_ALERTS"));
    }

    /**
     * Set value to You Have No Mybrocade Alerts Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setYouHaveNoMybrocadeAlertsTextField(String youHaveNoMybrocadeAlertsValue) {
        youHaveNoMybrocadeAlerts.sendKeys(youHaveNoMybrocadeAlertsValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the HomePage class instance.
     */
    public HomePage submit() {
        clickSearchButton();
        return this;
    }

    /**
     * Unset default value from Brocade Capital Solutions Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetBrocadeCapitalSolutions1CheckboxField() {
        return unsetBrocadeCapitalSolutions1CheckboxField(data.get("BROCADE_CAPITAL_SOLUTIONS"));
    }

    /**
     * Unset Brocade Capital Solutions Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetBrocadeCapitalSolutions1CheckboxField(String brocadeCapitalSolutionsValue) {
        new Select(brocadeCapitalSolutions1).deselectByVisibleText(brocadeCapitalSolutionsValue);
        return this;
    }

    /**
     * Unset Brocade Capital Solutions Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetBrocadeCapitalSolutions2CheckboxField() {
        if (brocadeCapitalSolutions2.isSelected()) {
            brocadeCapitalSolutions2.click();
        }
        return this;
    }

    /**
     * Unset Campus Tco Calculator Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetCampusTcoCalculatorCheckboxField() {
        if (campusTcoCalculator.isSelected()) {
            campusTcoCalculator.click();
        }
        return this;
    }

    /**
     * Unset Community Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetCommunityCheckboxField() {
        if (community.isSelected()) {
            community.click();
        }
        return this;
    }

    /**
     * Unset Document Library Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetDocumentLibraryCheckboxField() {
        if (documentLibrary.isSelected()) {
            documentLibrary.click();
        }
        return this;
    }

    /**
     * Unset Knowledge Base Defects Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetKnowledgeBaseDefectsCheckboxField() {
        if (knowledgeBaseDefects.isSelected()) {
            knowledgeBaseDefects.click();
        }
        return this;
    }

    /**
     * Unset Licenses Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetLicensesCheckboxField() {
        if (licenses.isSelected()) {
            licenses.click();
        }
        return this;
    }

    /**
     * Unset default value from Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetManageProductsICareAbout1DropDownListField() {
        return unsetManageProductsICareAbout1DropDownListField(data.get("MANAGE_PRODUCTS_I_CARE_ABOUT_1"));
    }

    /**
     * Unset value from Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetManageProductsICareAbout1DropDownListField(String manageProductsICareAbout1Value) {
        new Select(manageProductsICareAbout1).deselectByVisibleText(manageProductsICareAbout1Value);
        return this;
    }

    /**
     * Unset default value from Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetManageProductsICareAbout2DropDownListField() {
        return unsetManageProductsICareAbout2DropDownListField(data.get("MANAGE_PRODUCTS_I_CARE_ABOUT_2"));
    }

    /**
     * Unset value from Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetManageProductsICareAbout2DropDownListField(String manageProductsICareAbout2Value) {
        new Select(manageProductsICareAbout2).deselectByVisibleText(manageProductsICareAbout2Value);
        return this;
    }

    /**
     * Unset default value from Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetManageProductsICareAbout3DropDownListField() {
        return unsetManageProductsICareAbout3DropDownListField(data.get("MANAGE_PRODUCTS_I_CARE_ABOUT_3"));
    }

    /**
     * Unset value from Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetManageProductsICareAbout3DropDownListField(String manageProductsICareAbout3Value) {
        new Select(manageProductsICareAbout3).deselectByVisibleText(manageProductsICareAbout3Value);
        return this;
    }

    /**
     * Unset default value from Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetManageProductsICareAbout4DropDownListField() {
        return unsetManageProductsICareAbout4DropDownListField(data.get("MANAGE_PRODUCTS_I_CARE_ABOUT_4"));
    }

    /**
     * Unset value from Manage Products I Care About Drop Down List field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetManageProductsICareAbout4DropDownListField(String manageProductsICareAbout4Value) {
        new Select(manageProductsICareAbout4).deselectByVisibleText(manageProductsICareAbout4Value);
        return this;
    }

    /**
     * Unset Partner Locator Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetPartnerLocatorCheckboxField() {
        if (partnerLocator.isSelected()) {
            partnerLocator.click();
        }
        return this;
    }

    /**
     * Unset San Health Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetSanHealthCheckboxField() {
        if (sanHealth.isSelected()) {
            sanHealth.click();
        }
        return this;
    }

    /**
     * Unset Software Downloads Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetSoftwareDownloadsCheckboxField() {
        if (softwareDownloads.isSelected()) {
            softwareDownloads.click();
        }
        return this;
    }

    /**
     * Unset Warranty And Returns Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetWarrantyAndReturnsCheckboxField() {
        if (warrantyAndReturns.isSelected()) {
            warrantyAndReturns.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageLoaded() {
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
     * @return the HomePage class instance.
     */
    public HomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
