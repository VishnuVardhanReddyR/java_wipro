public class Assignment4 {
    public static void main(String[] args) throws Exception {
        Assignment4 regis = new Assignment4();
        try {
            regis.registerUser("mini", "us");
        } catch (Exception e) {

        }
    }

    public void registerUser(String userName, String userCountry) throws Exception {
        if (userCountry.equals("India")) {
            System.out.println("User registration done successfully");
        } else {
            throw (new InvalidCountryException());
        }
    }

    @SuppressWarnings("serial")
    public class InvalidCountryException extends Exception {
        public InvalidCountryException() {
            super();
            System.out.println("InvalidCountryException occured");
            System.out.println("User Outside India  cannot be registered");
        }
    }

}