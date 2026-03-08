// Abstraction
abstract class Animal {
    protected String nama;
    protected String warna;
    private int umur;

    public Animal(String nama, String warna, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }

    abstract void suara();
    abstract void gerak();
    
    // Encapsulation
    public int getUmur() {return umur;}
    public void setUmur(int umurNew) {
        if (umurNew < 0) {
            System.out.println("Umur tidak bisa kurang dari 0");
        } else {
            this.umur = umurNew;
        }
    }

    public void info() {
        System.out.println("Nama : " + nama);
        System.out.println("Warna : " + warna);
        System.out.println("Umur : " + umur);
    }
}

// Inheritance
class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String nama, String warna, int umur, boolean isIndoor) {
        super(nama, warna, umur);
        this.isIndoor = isIndoor;
    }

// Polymorphism
@Override
void suara() {
    System.out.println(nama + " mengeong meong meong");
}

@Override
void gerak() {
    System.out.println(nama + " berjalan");
}

public boolean getisIndoor() {return isIndoor;}
public void setisIndoor(boolean isIndoor) {this.isIndoor = isIndoor;}

@Override
public void info() {
    super.info();
    System.out.println("Tipe : " + (isIndoor ? "Kucing rumahan" : "Kucing liar"));
}
}

// Inheritance
class Dog extends Animal {
    private String ras;

    public Dog(String nama, String warna, int umur, String ras) {
        super(nama, warna, umur);
        this.ras = ras;
    }

// Polymorphism
@Override
void suara() {
    System.out.println(nama + " menggonggong guk guk");
}

@Override
void gerak() {
    System.out.println(nama + " berjalan");
}

public String getRas() {return ras;}
public void setRas(String ras) {this.ras = ras;}

@Override
public void info() {
    super.info();
    System.out.println("Ras : " + ras);
}
}

public class OOP {
    public static void main(String[] args) {

        System.out.println("Cat");
        Cat myCat = new Cat("Tom", "Abu", 2, true);

        // Encapsulation
        System.out.println("Umur : " + myCat.getUmur());
        myCat.setUmur(-5);
        myCat.setUmur(3);
        System.out.println("Umur baru : " + myCat.getUmur());

        myCat.suara();
        myCat.gerak();
        myCat.info();

        System.out.println("Dog");
        Dog myDog = new Dog("Snoopy", "Hitam", 4, "Chihuahua");
        myDog.suara();
        myDog.gerak();
        myDog.info();
    }
}