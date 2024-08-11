package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTest
{
    @Test
    public void testSelectOption()
    {
        DropdownPage dropdownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOption = dropdownPage.getSelectedOptions();
        assertEquals(selectedOption.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOption.contains(option), "Option not selected");
    }
}
