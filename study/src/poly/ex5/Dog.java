package poly.ex5;

public class Dog implements InterfaceAnimal{

        @Override
        public void sound() {
            System.out.println("멍멍");
        }

        @Override
        public void move() {
            System.out.println("개가 네 발로 걷습니다.");
        }
}
