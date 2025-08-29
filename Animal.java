class Animal {
    public void makeSound() {
        System.out.println("The animal is making the Sound");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1=new Cat();
        a1.makeSound();
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The Dog is making the sound ");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat is making the sound");
    }
}
