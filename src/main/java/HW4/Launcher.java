package HW4;

//task 33. Напиши класс Spaceport - это будет основа. У этого класса
//        опиши метод public void launch(), который не
//        делает ничего. Это заглушка, дальше этот код
//        будем расширять.
//task 34. Опиши класс GasStation. В этом классе напиши метод
//        public void refuel(). Этот метод должен выводить в консоль
//        текст "Refuel done!".
//
//        Добавь в класс Spaceport приватное поле типа GasStation,
//        назови его gasStation. Сразу проинициализируй это поле
//        (используй выражение new GasStation()).
//
//        Добавь в метод launch() класса Spaceport вызов метода
//        refuel() поля gasStation.

class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();
    private Radar radar = new Radar();
    private CommandPost commandPost = new CommandPost();
    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
        commandPost.command();
    }
}
class GasStation {
    public void refuel(){
        System.out.println("Refuel done!");
    }
}
//task 35. Опиши класс ServiceTower. В этом классе напиши метод
//        public void service(). Этот метод должен выводить в консоль
//        текст "Service done!".
//
//        Добавь в класс Spaceport приватное поле типа ServiceTower,
//        назови его serviceTower. Сразу проинициализируй это поле
//        (используй выражение new ServiceTower()).
//
//        Добавь в метод launch() класса Spaceport
//        вызов метода service() поля serviceTower.
class ServiceTower {
    public void service(){
        System.out.println("Service done!");
    }
}
//task 36. Опиши класс CompressorStation. В этом классе напиши метод
//        public void compress(). Этот метод должен выводить в консоль текст
//        "Compress done!".
//
//        Добавь в класс Spaceport приватное поле типа CompressorStation,
//        назови его compressorStation. Сразу проинициализируй это поле
//        (используй выражение new CompressorStation()).
//
//        Добавь в метод launch() класса Spaceport вызов метода
//        compress() поля compressorStation.
class CompressorStation {
    public void compress(){
        System.out.println("Compress done!");
    }
}
//task 37. Опиши класс Radar. В этом классе напиши метод public void scan().
//        Этот метод должен выводить в консоль текст "Scan done!".
//
//        Добавь в класс Spaceport приватное поле типа Radar, назови его radar.
//        Сразу проинициализируй это поле.
//
//        Добавь в метод launch() класса Spaceport вызов метода scan() поля radar.
class Radar {
    public void scan(){
        System.out.println("Scan done!");
    }
}

//task 38. Опиши класс CommandPost. В этом классе напиши
//        метод public void command(). Этот метод должен
//        выводить в консоль текст "Fire!".
//
//        Добавь в класс Spaceport приватное поле типа
//        CommandPost, назови его commandPost.
//        Сразу проинициализируй это поле.
//
//        Добавь в метод launch() класса Spaceport
//        вызов метода command() поля commandPost.
class CommandPost {
    public void command(){
        System.out.println("Fire!");
    }
}