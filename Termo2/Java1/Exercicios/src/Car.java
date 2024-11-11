public class Car {
    private String model;
    private String mark;
    private int year;

    public Car(String mark, String model, int year){
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public void dados(){
        System.out.printf("Marca: %s\nModelo: %s\nAno: %d\n", mark, model, year);
    }
}
