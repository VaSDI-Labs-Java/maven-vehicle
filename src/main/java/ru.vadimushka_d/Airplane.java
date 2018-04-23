package ru.vadimushka_d;

/** Дочерний класс {@link Vehicle}
 *
 @author Вадим Дунькин
 @version 1.1
 */
public class Airplane extends Vehicle {
    private int maxHeight;

	/** Констуктор для инициализации значений
     * @param maxSpeed Максимальная скорость машины
	 * @param maxHeight Максильная высота полета
     */
    public Airplane(int maxSpeed, int maxHeight) {
        super(3, maxSpeed);
        this.maxHeight = maxHeight;
    }

	/** Сообщение о том чему принадлежит средство
	 * А также сообщение о том какому подклассу средство принадлежит
     */
    public void Message(){
        super.Message();
        System.out.println("Это сообщение хранится в Airplane классе");
    }

	/** Вывод текстового сообщения
	@return Самолет: Тип : type, максимальная скорость: maxSpeed, максимальная высота: maxHeight
     */
    public String toString() {
        return "Самолет: " + super.toString() + ", максимальная высота: " + this.maxHeight;
    }

}