package HW4;

class ControlPanelTest {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.control();
    }
}
class ControlPanel{
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();
    public void control(){
        altimeter.toString();
        airGauge.toString();
    }
}
class Altimeter {
    @Override
    public String toString() {
        System.out.println("Measure height");
        return null;
    }
}
class AirGauge{
    @Override
    public String toString() {
        System.out.println("Measure air pressure");
        return null;
    }
}
//    task 39. Объяви класс для измерения высоты, назови его Altimeter.
//            Переопредели у этого класса метод toString(),
//            чтобы он возвращал текст "Measure height".
//
//        Объяви класс для измерения давления атмосферы, назови его AirGauge.
//            Переопредели у этого класса метод toString(),
//            чтобы он возвращал текст "Measure air pressure".
//
//        Объяви класс ControlPanel. У этого класса объяви следующие приватные поля:
//
//        поле с именем altimeter типа Altimeter;
//        поле с именем airGauge типа AirGauge;
//
//        Сразу проиницализируй эти поля при объявлении.
//
//        Создай метод public void control() у класса ControlPanel.
//        Он должен выводить в консоль поля altimeter и airGauge.
//
//        Запусти программу, и убедись, что исполнение метода main() у
//        класса ControlPanelTest выводит в консоль правильный результат.
