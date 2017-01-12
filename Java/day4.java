// Day 4 - Class vs. Instance

public class Person {
private int age;

public Person(int initialAge) {
        if (initialAge >= 0) {
                age = initialAge;
        } else {
                System.out.println("Age is not valid, setting age to 0.");
                age = 0;
        }
}

public void amIOld() {
        String ageFactor = "";
        if (age < 13) {
                ageFactor = "You are young.";
        } else if (age >= 18) {
                ageFactor = "You are old.";
        } else {
                ageFactor = "You are a teenager.";
        }
        System.out.println(ageFactor);
}

public void yearPasses() {
        age++;
}
}
