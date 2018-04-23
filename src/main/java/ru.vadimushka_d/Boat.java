package ru.vadimushka_d;

/**Дочерний класс {@link Vehicle}
 *
 @author Вадим Дунькин
 @version 1.1
 */
public class Boat extends Vehicle {
	
	/** Констуктор для инициализации значений
     * @param maxSpeed Максимальная скорость машины
     */
    public Boat(int maxSpeed) {
        super(2, maxSpeed);
    }

	/** Сообщение о том чему принадлежит средство
	 * А также сообщение о том какому подклассу средство принадлежит
     */
    public void Message() {
        super.Message();
        System.out.println("Это сообщение хранится в Boat классе");
    }

	/** Вывод текстового сообщения
	@return Лодка: Тип : type, максимальная скорость: maxSpeed
     */
    public String toString() {
        return "Boat: " + super.toString();
    }

}