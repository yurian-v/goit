public class Questions {
    public static void main(String[] args) {
        boolean value = (8 > 5) ^ (3 < 5);
        System.out.println(value);
        System.out.println("(true ^ true) = " + (true ^ true));
        System.out.println("(true ^ false) = " + (true ^ false));

        String result =
                "Javada"
                        .replace("a", "")
        .toLowerCase();
        System.out.println(result);
        System.out.println("\"jvd\".toUpperCase() = " + "jvd".toUpperCase());

        String s = 5 + "7";
        System.out.println("s = " + s);

        boolean res = true == true != false;
        System.out.println(res);

    }
}

