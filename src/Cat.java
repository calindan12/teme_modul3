 public class Cat implements IAnimal{
        public String AnimalName;
        @Override
        public String makeSound(){
            return "meaw-meaw";
        }
        public Cat(String AnimalName) {
            this.AnimalName = AnimalName;
        }
    }


