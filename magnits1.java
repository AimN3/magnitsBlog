class DrumKit {                            // два класса основной и для тестирования
	boolean topHat = true;             // создаем переменную типа boolean и присваиваем ей значение true 
	boolean snare = true;
	void playTopHat() {
		System.out.println("динь динь ди-динь");
	}
	void playSnare() {
		System.out.println("бах бах ба-бах");
        } 
}



class DrumKitTestDrive {
	public static void main (String[] args {
		DrumKit d = new DrumKit();    // создается новый объект d типа DrumKit, i.e в переменной с именем d лежит ссылка на объект
		d.playSnare();  //используя объект на который ссылается переменная d запусткаем метод
		d.snare = false;    // меняем переменную snare для объекта 
		d.playTopHat();    // запустили метод
// на этом проверили что все что нужно напечаталось в консоль и проверим верно ли выполнится условие. Далее уже ничего не должно печататься

		if(d.snare == true) {             
			d.playSnare();
		}	
	 }
}	 
