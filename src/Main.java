//1
//
//        2
//
//        Project: SuperMarket
//        Deadline:20.11.2023
//        Cиз супермаркетке келип сатып алып жатканыңызды элестетип
//        көрсөңүз, карта менен төлөйсүз, Эгер азык-түлүктүн суммасы 100
//        сомдон ашса, сизден пароль талап кылынат, киргизүүдө пароль
//        текшерилет жана эгер ал туура эмес болсо, консолго "туура эмес
//        пароль" чыгарылат, эгер ал туура болсо, сиз операцияны уланта
//        аласыз. эгерде сизде жетиштүү каражат болсо, Сиз төлөйсүз жана
//        консолдон сиз чекти көрө аласыз (азык-түлүктүн аталыштары жана
//        баалары жана алардын жалпы суммасы менен), ал эми
//        консолдо жок болсо "сизде каражат жетишпейт".
//        Card  деген класс тузунуз  (firstname, lastname, card number,
//        balance, password).
//        Product деген класс тузунуз   (productname, price).
//        Basket деген класс тузунуз  (products[] ).
//        Client  деген класс тузунуз  полялары (firstname, lastname, age,
//        card, basket).
//        cardInterface интерфейс  түзүңүз жана paywithcard(double money)
//        абстракттуу метод түзүңүз, ал метод сатылып алынган продуктынын
//        квитанциясын кайтарат, жана getcardbalance() методу картадагы
//        балансты кайтарат.
//        Client классы cardInterface мурасталып, анын методорун
//        реализация кылат.
//        *******************************************************************************
//        Представьте что вы пришли в супермаркет и совершаете

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Product product1 = new Product("Банан",120);
       Product product2 = new Product("Алма",70);
       Product product3 = new Product("Киви",120);
       Product product4 = new Product("Фасоль",100);
       Product product5 = new Product("Жангак",150);
       Product[] products = {product1, product2, product3, product4, product5};
       Basket basket = new Basket(products);
       double summ = 0;
        for (Product product : products) {
            summ += product.getPrice();
        }
       Client client = new Client("Nurtaazim", "Mukanov", 18,
               new Card("Nurtaazim", "Mukanov", "1111111111111111", 1000, 2005), basket);
        System.out.println(Arrays.toString(products));
        System.out.println("Общая сумма покупка : " +summ );
       if (summ > 100){
           System.out.println("Ввыедите пароль карты: ");
           int consolPin = scanner.nextInt();
           if (consolPin == client.getCard().getPin()){
               System.out.println("Покупка прошла успешно !");
               client.getCard().setBalance(client.getCard().getBalance() - summ);
               client.getcardbalance(client.getCard().getBalance());
           }
           else System.err.println("Не правильный пароль !");
       }
    }
}