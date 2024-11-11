public class People {
    private String name;
    private String age;

    public void Pessoa(String name_, String age_){
        name = name_;
        age = age_;

    }
    public void dados(){
        System.out.printf("Nome: %s\nIdade: %s\n", name, age);
    }
}
