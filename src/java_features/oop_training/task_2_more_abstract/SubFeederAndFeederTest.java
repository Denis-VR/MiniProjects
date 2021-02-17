package java_features.oop_training.task_2_more_abstract;

import org.junit.Before;
import org.junit.Test;

public class SubFeederAndFeederTest {
    private Feeader feader;
    private SubFeeder subFeeder;
    private Dog dog;
    private Cat cat;

    @Before
    public void setUp() throws Exception {
        feader = new Feeader();
        subFeeder = new SubFeeder();
        dog = new Dog();
        cat = new Cat();
    }

    @Test
    public void ThenFeederFeedCat() {
        feader.feed(cat);

    }

    @Test
    public void ThenSubFeederFeed() {
    }
}