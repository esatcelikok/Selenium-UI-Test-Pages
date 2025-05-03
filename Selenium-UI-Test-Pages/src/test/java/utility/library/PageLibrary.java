package utility.library;

import pages.*;

public class PageLibrary {

    HomePage homepage;
    InstructorsPage i̇nstructorsPage;


    public PageLibrary() {
         homepage = new HomePage();

        i̇nstructorsPage = new InstructorsPage();

    }

    public HomePage getHomePage() {
        return homepage;
    }

    public InstructorsPage getInstructorsPage() {
        return i̇nstructorsPage;
    }

}
