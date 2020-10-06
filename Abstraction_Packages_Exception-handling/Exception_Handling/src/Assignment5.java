

public class Assignment5 {
        public static void main(String[] args) throws InvalidAgeException {
            try {
                String name = args[0];
                int age = Integer.parseInt(args[1]);
                if (age < 18 || age >= 60){
                    throw(new InvalidAgeException());
                }
                System.out.println("name " + name + ", age " + age);
            } catch (Exception e) {

            }
        }


        @SuppressWarnings("serial")
        public static class InvalidAgeException extends Exception {
            public InvalidAgeException() {
                super();
                System.out.println("InvalidAgeException occurred");
                System.out.println("age cannot be out of range");
            }
        }
}
