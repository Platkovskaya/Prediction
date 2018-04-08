
// Создать приложение «Гадание на ромашке». 
// Клиент обращается к гадалке за магической помощью. Если гадалка в «настроении» (у неё ещё остались целые ромашки) 
// и клиент гадает первый раз (в течении суток)  - то она может предсказать клиенту результат 
// в зависимости от выбранного клиентом типа гадания.
// В приложении обязательно должны быть реализованы следующие классы:
// цветок (ромашка) с коллекцией лепестков. При создании ромашки количество лепестков генерируется случайным образом.
// гадалка, у которой есть: коллекция ромашек, коллекция клиентов, коллекция гаданий. 
// Для каждого из гаданий (работа, любовь, удача и т.д.) существует набор вариантов ответа.
// Гадалка может погадать одному клиенту не более одного раза в сутки.

package by.htp.runner;

import java.util.Arrays;

import by.htp.bean.Client;
import by.htp.bean.FortuneTeller;
import by.htp.logic.DivinationService;

public class MainApp {

	public static void main(String[] args) {

		Client client1 = new Client("John", "Smith");
		Client client2 = new Client("Aliya", "Jay");
		Client client3 = new Client("Oleg", "Orlov");

		FortuneTeller fortuneTeller = new FortuneTeller("Anna", Arrays.asList(client1, client2, client1, client3));

		DivinationService service = new DivinationService(fortuneTeller);
		service.useService();
	}

}
