package ex1;

public class Singers {
    // 5 instance variables that would store the following singer data
    public int singerId;
    public String singerName;
    public String singerAddress;
    public String dateOfBirth;
    public int numberOfAlbums;

    // No-argument constructor
    public Singers() {
        this.singerId = 100;
        this.singerName = "Michael Jackson";
        this.singerAddress = "Indiana USA";
        this.dateOfBirth = "08-29-1958";
        this.numberOfAlbums = 72;
    }

    // 5 arguments constructor
    public Singers(int singerId, String singerName, String singerAddress, String dateOfBirth, int numberOfAlbums) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbums = numberOfAlbums;
    }

    // Setters for each individual instance variables
    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }
    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }
    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setNumberOfAlbums(int numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
    }

    // Setter to set all the values of the instance variables at once
    public void setAllValues(int singerId, String singerName, String singerAddress, String dateOfBirth, int numberOfAlbums) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbums = numberOfAlbums;
    }

    // Getters for each individual instance variables
    public int getSingerId() {
        return singerId;
    }
    public String getSingerName() {
        return singerName;
    }
    public String getSingerAddress() {
        return singerAddress;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public int getNumberOfAlbums() {
        return numberOfAlbums;
    }

}
