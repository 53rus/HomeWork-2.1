import java.util.SortedMap;

public class Main {
    public static void changeValue (int value) {
        value = 22;
    }

    public static void changeValue1 (Integer value) {
        value = 55;
    }

    public static void changeValue2(Integer[] value3) {
        value3 = new Integer[] {1, 2};
    }

    public static void changeValue3(Integer[] value3) {
        value3[0] = 99;
    }

    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    public static void changePerson1(Person person) {
       person.setName("Iliya");
       person.setSurname("Lagutenko");
    }

    public static void main(String[] args) {
        int value = 33;
        Integer value1 = 33;
        Integer[] value3 = {3, 4};
        changeValue(value);
        changeValue1(value1);
        changeValue2(value3);
        System.out.println(value);
        System.out.println(value1);
        for (int i = 0; i < value3.length; i++) {
            System.out.print(value3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < value3.length; i++) {
            System.out.print(value3[i] + " ");
        }
        System.out.println();
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
        changePerson1(person);
        System.out.println(person);
        System.out.println();
        System.out.println("Задание №5. Если распечатать переменную в методе main, ее значение будет 33. Метот changeValue только принимет значение переменной value объявленой в методе main, проводит измения внутри метода, результат не возвращается");
        System.out.println("Задание №6. сли распечатать переменную в методе main, ее значение будет 33. Метот changeValue только принимет значение переменной value объявленой в методе main, проводит измения внутри метода, результат не возвращается. Результаты задачь 5 и 6 одинаковы, различие только в том, насколько я смог самостоятельно вычитать, что в первом случае мы передаем примитив, то есть конкретное значение, во втором случае передается ссылка на объект");
        System.out.println("Задание №7. Если распечатать массив в методе main, то значение у него будут {3,4}. Метод changeValue только принимает значение, внутри себя создает новый массив с новыми значниями, результат не передается");
        System.out.println("Задание №8. Если распечатать массив в методе main, то значение у него будут {3,4}. Метот только принимает значения массива и меняет значение первого элемента внутри себя, результат не передается. Результаты задач 7 и 8, одинаковы, так как в обоих случаях методы работают с масиивом только внутри себя, конечный результат их работ не куда не передается");
        System.out.println("Задание №9.Если распечатать переменную person в методе main, то ее  значение будет Имя Lyapis Фамилия Trubetskoy, в методе chagePersone создается новый объект, данные о котором остаются только в этом методе, не куда не передаются ");
        System.out.println("Задание №10. Результатом будет Имя Ilya Фамилия Lagutenko, т.к. метод changePersone меняяет значение полей name, surname c помощью метода setName, setSurname. Результаты задач 9 и 10 разыне, т.к в первом случае мы создаем новый объект с помощью метода и только внутри него, во втором меняем значения полей объекта");


    }
}
