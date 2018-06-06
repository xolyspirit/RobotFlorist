package Flowers;

import Flowers.controller.Florist;
import Flowers.view.Client;
/**Класс для запуска программы
 * @version 1.0
 * @author Xolyspirit */
public class Main {
	/**Метод создающий экземпляры {@link Client} и {@link Florist}
	 * и запускающий метод {@link Client#start(Florist)}*/
    public static void main(String[] args) {
	Client client = new Client();
	Florist florist = new Florist();
	client.start(florist);
    }
}
