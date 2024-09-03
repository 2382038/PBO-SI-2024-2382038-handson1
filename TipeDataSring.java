public class TipeDataSring {
    public static void main(String[] args) {
        //non Primitive
        String fullName = "Kayla Simbolon"; //" namanya double quotes
        //bisa pakai null
        String firstName = "Kayla";
        String lastName = "Simbolon";

        //concatenation
        String fullName1 = firstName + " " + lastName;
        String fullName2 = firstName.concat("").concat(lastName);


        //primitive
        int tipeDataInteger = 10;
        //tipeDataInteger = null; //tidak akan bisa pakai null
    }
}
