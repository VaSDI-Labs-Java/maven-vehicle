package ru.vadimushka_d;

/** Дочерний класс {@link Car}
 *
 @author Вадим Дунькин
 @version 1.1
 */
public class Truck extends Car {
    private int carrying;

	/** Констуктор для инициализации значений
     * @param carrying Максимальная грузоподъемность машины
     */
    public Truck(int carrying) {
        super(200, 4);
        this.carrying = carrying;
    }

	/** Сообщение о том чему принадлежит средство
	 * А также сообщение о том какому подклассу средство принадлежит
     */
    public void Message() {
        super.Message();
        System.out.println("Это сообщение хранится в Truck классе");
    }

	/** Вывод текстового сообщения
	@return Грузовик: Тип : type, максимальная скорость: maxSpeed, грузоподъемность: carrying
     */
    public String toString() {
        return "Грузовик: " + super.toString() + ", грузоподъемность: " + this.carrying;
    }

}