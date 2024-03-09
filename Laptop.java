package Shop;

public class Laptop {
    // поля(всегда private)
    private String name;
    private int RAM;
    private int HDD;
    private String OS;
    private String color;

    // создаем пользовательский конструктор (если без конструктора, то данные
    // добавлять через геторы и сеторы), это при создании экземпляра класса можно
    // задавать значения по умолчанию (если не создавать конструктор то он будет
    // пустой)
    public Laptop(String name, int RAM, int HDD, String OS, String color) { // передаем те параметры полей, которые
                                                                            // хотим инициализировать
        // (присвоить
        // значения)
        this.name = name;
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }

    // методы гетторы (для доступа к полям)
    private String getName() {
        return name;
    }

    private int getRAM() {
        return RAM;
    }

    private int getHDD() {
        return HDD;
    }

    private String getOS() {
        return OS;
    }

    private String getColor() {
        return color;
    }

    // методы сеторы, добавляют значения(без возврата)
    private void setName(String name) {
        this.name = name; // this. означает что берем это поле из этого класса
    }

    private void setRAM(int RAM) {
        this.RAM = RAM;

    }

    private void setHDD(int HDD) {
        this.HDD = HDD;
    }

    private void setOS(String OS) {
        this.OS = OS;
    }

    private void setColor(String color) {
        this.color = color;
    }

    // переопределяем метод
    @Override
    public String toString() {
        return "Название ноутбука: " + name + ", " +
                "Оперативная память (ОЗУ): " + RAM + ", " +
                "Размер жесткого диска: " + HDD + ", " +
                "Операционная система: " + OS + ", " +
                "Цвет: " + color;
    }

}
