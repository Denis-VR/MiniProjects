package project_9_StringList;

//Исключение вызывается в том случае, если произошло обращение к несуществующему индексу.
public class OwnIndexOutOfBoundsException extends Exception {

	//переопределяем метод, который будет добавлять к выводу наше сообщение
	@Override
	public String getMessage() {
		return "Обращение к несуществующему элементу.";
	}


}
