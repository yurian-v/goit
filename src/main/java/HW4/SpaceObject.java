package HW4;
//        Создай абстрактный класс SpaceObject.
//
//        Создай абстрактный класс Planet, который унаследуется от SpaceObject.
//
//        Создай класс Mars, который унаследуется от Planet.
//
//        Создай класс Moon, который унаследуется от SpaceObject.
//
//        Создай класс PlanetTester. У этого класса должен быть метод
//                String test(SpaceObject object), который принимает
//                небесное тело, и возвращает "planet", если переданное
//                тело является планетой (в иерархии классов объекта есть
//                класс Planet). В противном случае метод возвращает "not planet".

abstract class SpaceObject {
}
abstract class Planet extends SpaceObject {
}
class Mars extends Planet{
}
class Moon extends SpaceObject{
}
class PlanetTester {

    public String test(SpaceObject object){
        //System.out.println(object instanceof SpaceObject);
        if(object instanceof Planet){
            return "planet";
        };
        return "not planet";
    }
}

