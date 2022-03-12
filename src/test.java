import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog animal1 = context.getBean("myPet1", Dog.class);
        IAnimal animal2 = context.getBean("myPet2", IAnimal.class);
        System.out.println(animal1.makeSound());
        System.out.println(animal2.makeSound());
        Cat animal3 = new Cat("pisica");
        animal3 = (Cat) context.getBean("myPet3" , IAnimal.class);
        System.out.println(animal3.makeSound());

    }
}
