package model;

public class Empregado {
    String nome;
    double salario;
    double imposto;

public Empregado(){
    this("",0.00,1000.00);
}

    public Empregado(String nome, double salario, double imposto) {
        this.nome = nome;
        this.salario = salario;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }


    public double getsalarioLiquido(){
    return getSalario() - getImposto();
    }

    @Override
    public String toString() {
        return "Nome do Funcionario: "+ nome +"\n"
                +"Salario Liquido: "+ getsalarioLiquido();
    }
}
