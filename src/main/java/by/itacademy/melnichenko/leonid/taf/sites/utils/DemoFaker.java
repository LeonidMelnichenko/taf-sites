package by.itacademy.melnichenko.leonid.taf.sites.utils;
import com.github.javafaker.Faker;
public class DemoFaker {
    private Faker faker;
    public DemoFaker(Faker faker) {
        this.faker = faker;
    }
    public String generateFakerEmail(){
        faker = new Faker();
        String emailFaker = faker.internet().emailAddress();
        return emailFaker;
    }
    public String generateFakerPassword(){
        faker = new Faker();
        String passwordFaker = faker.internet().password();
        return passwordFaker;
    }
}
