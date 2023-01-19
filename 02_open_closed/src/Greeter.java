public class Greeter {
    String formality;

    public String greet() {
        GreetingDefiner greetingDefiner = new GreetingDefiner(formality);
        return greetingDefiner.defineGreeting();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
