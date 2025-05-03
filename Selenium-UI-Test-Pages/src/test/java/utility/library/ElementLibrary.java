package utility.library;


import elements.*;


public class ElementLibrary {

    HomePageElements homepageElements;
    InstructorsPageElements instructorsPageElements ;

    public ElementLibrary() {
        homepageElements = new  HomePageElements();
        instructorsPageElements = new InstructorsPageElements();
    }

    public HomePageElements getHomepageElements() {
        return homepageElements ;
    }

    public InstructorsPageElements getInstructorsPageElements() {
        return instructorsPageElements;
    }

}
