public class Test {

    public String makeHalfOfName(String name){
        int halfName = name.length();
        String clearName = name.substring(0, halfName/2);
        return clearName;
    }
    public static void main(String[] args) {
        Test names = new Test();


        String halfOfName = names.makeHalfOfName("Gurk");
        System.out.println("names.makeHalfOfName(\"Gurk\") = " + names.makeHalfOfName("Gurk"));
    }
}

