class Animal {
   int age;
   String color;
   public Animal() {
   }
   public Animal(int age, String color) {
      this.age = age;
      this.color = color;
   }
   void eat(String something) {

   }
}
class Cat extends Animal {
   void catchMouse() {
      System.out.println("the "+color+" cat is catching mouse. ");
   };
   void eat(String something) {
      System.out.println("the cat is eating fish. ");
   }
   public Cat() {
      super();
   }
   public Cat(int age, String color) {
      super(age, color);
   }
}
class Dog extends Animal {
   void lookHome() {
      System.out.println("the "+color+" dog is guarding home. ");
   }
   void eat(String somrthing) {
      System.out.println("the dog is licking bone");
   }
   public Dog() {
      super();
   }
   public Dog(int age, String color) {
      super(age, color);
   }
}
class Person {
   String name;
   int age;
   void keepPet(Animal pet, String something){
      pet.eat(something);
   }
}
public class Practice {
   public static void main(String[]args) {
      Person p = new Person();
      Animal dog = new Dog(19, "angry");
      Animal cat = new Cat(18, "calm");
      p.keepPet(dog, null);
      p.keepPet(cat, null);
   }
}
