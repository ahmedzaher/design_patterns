package designpatterns.example.builder;

public class Demo {
    public static void main(String args[]) {
        Computer computer = new Computer.ComputerBuilder("1 TB", "16 GB")
                .setBluetoothEnabled(true).build();
        System.out.println(computer);
    }
}

