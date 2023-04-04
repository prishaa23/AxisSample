public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kidUser = new KidUser();
        kidUser.registerAccount(10);
        kidUser.requestBook("Kids");

        AdultUser adultUser = new AdultUser();
        adultUser.registerAccount(20);
        adultUser.requestBook("Fiction");
    }
}

