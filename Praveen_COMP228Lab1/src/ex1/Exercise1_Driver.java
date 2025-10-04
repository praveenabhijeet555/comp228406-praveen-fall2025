package ex1;

public class Exercise1_Driver {
    public static void main(String[] args) {
        // Create singer1 using no-argument constructor
        Singers singer1 = new Singers();

        // Display the default values of the instance variables
        System.out.printf("Default values:\n"
                + "Singer ID: " + singer1.singerId
                + "\nSinger Name: "  + singer1.singerName
                + "\nSinger Address: "  + singer1.singerAddress
                + "\nSinger DOB: "  + singer1.dateOfBirth
                + "\nNumber of Albums: "  + singer1.numberOfAlbums);

        // Set the values of each instance variables with the help of the setter that sets all the values
        singer1.setAllValues(101,
                "Elvis Presley",
                "Mississippi, USA",
                "01-08-1935",
                220);

        // Display the values
        System.out.printf("\n\nNew values using setAllValues:\n"
                + "Singer ID: " + singer1.singerId
                + "\nSinger Name: "  + singer1.singerName
                + "\nSinger Address: "  + singer1.singerAddress
                + "\nSinger DOB: "  + singer1.dateOfBirth
                + "\nNumber of Albums: "  + singer1.numberOfAlbums);

        // change the value of each instance variable using setter for each instance variable
        singer1.setSingerId(102);
        singer1.setSingerName("Madonna Louise");
        singer1.setSingerAddress("Michigan, USA");
        singer1.setDateOfBirth("16-08-1958");
        singer1.setNumberOfAlbums(216);

        // Display current values using getters for each instance variable
        System.out.printf("\n\nNew values using getters:\n"
                + "Singer ID: " + singer1.getSingerId()
                + "\nSinger Name: "  + singer1.getSingerName()
                + "\nSinger Address: "  + singer1.getSingerAddress()
                + "\nSinger DOB: "  + singer1.getDateOfBirth()
                + "\nNumber of Albums: "  + singer1.getNumberOfAlbums());


    }
}

