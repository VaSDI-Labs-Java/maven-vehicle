package ru.vadimushka_d;

/** Родительский класс по типам машинам
 *
 @author Вадим Дунькин
 @version 1.1
 */
public class Vehicle {
    private int type;
    private int maxSpeed;

    /**
     * @param type 1 - Земля, 2 - Вода, 3 - Воздушный.
     * @param maxSpeed Максимальная скорость машины
     */
    public Vehicle(int type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
	/** Сообщение о том чему принадлежит автомобиль
     */
    public void Message(){
        System.out.println("Это сообщение хранится в Vehicle классе");
    }
	/** Геттер типа
     @return Возращает тип автомобиля
     */
    public int getType() {
        return this.type;
    }
	/** Выбор типа атомобиля
     @return Возращает тип автомобиля
     */
    public String getTypeAsString(){
        switch (getType()) {
            case 1:
                return "Земля";
            case 2:
                return "Вода";
            case 3:
                return "Воздух";
        }
        return "";
    }
	/** Геттер максимальной скорости
     @return Возращает максимальную скорость автомобиля
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
	/** Сеттер типа автомобиля
     @param type Задает тип автомобиля
     */
    public void setType(int type) {
        this.type = type;
    }
	/** Сеттер максимальной скорости
     @param maxSpeed Задает скорость автомобиля
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
	/** Вывод текстового сообщения
	@return Тип : type, максимальная скорость: maxSpeed
     */
    public String toString() {
        return "Тип: " + this.getTypeAsString() + ", максимальная скорость: " + this.maxSpeed;
    }
}
