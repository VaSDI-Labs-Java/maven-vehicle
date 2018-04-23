package ru.vadimushka_d;

/** Дочерний класс {@link Vehicle}
 *
 @author Вадим Дунькин
 @version 1.1
 */
 
public class Car extends Vehicle {
    private int wheels;

	/** Констуктор для инициализации значений
     * @param maxSpeed Максимальная скорость машины
	 * @param wheels Максимальое количество колес
     */
    public Car(int maxSpeed, int wheels) {
        super(1, maxSpeed);
        this.wheels = wheels;
    }
	/** Сообщение о том чему принадлежит средство
	 * А также сообщение о том какому подклассу средство принадлежит
     */
    public void Message() {
        super.Message();
        System.out.println("Это сообщение хранится в Car классе");
    }

	/** Вывод текстового сообщения
	@return Машина: Тип : type, максимальная скорость: maxSpeed, колес: wheels
     */
    public String toString() {
        return "Машина: " + super.toString() + ", колес: " + this.wheels;
    }

}