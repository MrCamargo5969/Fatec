public class Main {
    public static void main(String[] args) throws Exception {
        Horista horista = new Horista();
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();

        float maior;

        if (gerente.salary_value() >= horista.salary_value() && gerente.salary_value() >= vendedor.wageResult()) {
            System.out.printf("O maior valor é %f, do gerente %s ",gerente.salary_value(), gerente.getName());
        } else if (horista.salary_value() >= gerente.salary_value() && horista.salary_value() >= vendedor.wageResult()) {
            System.out.printf("O maior valor é %f, do horista %s ", horista.salary_value(), horista.getName());
        } else {
            System.out.printf("O maior valor é %f, do vendedor %s ", vendedor.wageResult(), vendedor.getName());
        }
    }
}
