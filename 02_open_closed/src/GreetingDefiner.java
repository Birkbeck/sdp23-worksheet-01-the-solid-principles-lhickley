public class GreetingDefiner {

    private String formality;

    public GreetingDefiner(String formality) {
        this.formality = formality;
    }

    String defineGreeting() {
        if (this.formality == "formal") {
            return "Good evening";
        } else if (this.formality == "casual") {
            return "Goodday?";
        } else if (this.formality == "intimate") {
            return "Hello darling!";
        } else {
            return "Hello.";
        }
    }
}
