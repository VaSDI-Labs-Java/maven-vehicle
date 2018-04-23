package ru.vadimushka_d;

/** Дочерний класс {@link Car}
 *
 @author Вадим Дунькин
 @version 1.1
 */
public class Taxi extends Car {
    private int passengers;

	/** Констуктор для инициализации значений
     * @param passengers Максимальное количство пассажиров
     */
    public Taxi(int passengers) {
        super(200, 4);
        this.passengers = passengers;
    }

	/** Сообщение о том чему принадлежит средство
	 * А также сообщение о том какому подклассу средство принадлежит
     */
    public void Message() {
        super.Message();
        System.out.println("Это сообщение хранится в Taxi классе");
    }

	/** Вывод текстового сообщения
	@return Taxi: Тип : type, максимальная скорость: maxSpeed, пассажиры: passengers
     */
    public String toString() {
        return "Такси: " + super.toString() + ", пассажиры: " + this.passengers;
    }

}